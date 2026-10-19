package fr.lecomptoirdespharmacies.core.helpers;

import fr.lecomptoirdespharmacies.core.exceptions.VidalResponseException;
import fr.lecomptoirdespharmacies.entities.AbstractBase;
import fr.lecomptoirdespharmacies.entities.Base;
import fr.lecomptoirdespharmacies.entities.Package;
import fr.lecomptoirdespharmacies.entities.parsers.SaxBaseHandler;
import fr.lecomptoirdespharmacies.entities.parsers.SaxPackageHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class XmlHelper {

    private SAXParserFactory factory = SAXParserFactory.newInstance();

    /**
     * Turns an answer from Vidal into entities.
     *
     * @throws VidalResponseException   if the answer could not be read
     * @throws IllegalArgumentException if {@code cls} is not an entity this SDK can parse into
     */
    public <T extends AbstractBase> List<T> xmlToObjects(String xml, Class<T> cls) {

        // Chosen before parsing: asking for an unsupported entity is a defect of the caller, not
        // something wrong with the answer Vidal gave.
        if (!Package.class.equals(cls) && !Base.class.equals(cls)) {
            throw new IllegalArgumentException("Cannot parse a Vidal answer into " + cls.getName());
        }

        InputStream stream = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));

        try {
            SAXParser saxParser = factory.newSAXParser();

            return parse(cls, stream, saxParser);
        } catch (Exception e) {
            // Unchecked ones included: whatever the parser lets escape means an answer we could not
            // read, and must not reach callers as an unclassified RuntimeException. (The handlers
            // themselves still swallow a value they cannot convert and leave that field unset.)
            throw new VidalResponseException("Could not read the answer Vidal gave", e);
        }
    }

    private <T> List<T> parse(Class<T> cls, InputStream stream, SAXParser saxParser) throws Exception {
        if (Package.class.equals(cls)) {
            SaxPackageHandler handler = new SaxPackageHandler();
            saxParser.parse(stream, handler);
            return (List<T>) handler.packages;
        }

        SaxBaseHandler handler = new SaxBaseHandler();
        saxParser.parse(stream, handler);
        return (List<T>) handler.baseEntities;
    }

}
