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
     * @throws VidalResponseException if the answer could not be read
     */
    public <T extends AbstractBase> List<T> xmlToObjects(String xml, Class<T> cls) {

        InputStream stream = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));

        try {
            SAXParser saxParser = factory.newSAXParser();

            return castResponseToEntities(cls, stream, saxParser);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new VidalResponseException("Could not read the answer Vidal gave", e);
        }
    }

    /**
     * Find instance of cls and parse xml to this class
     * @param cls           Real type of returned class
     * @param stream        XML input stream file
     * @param saxParser     Sax parser
     * @param <T>           Class who extend of BaseEntity class
     * @return
     * @throws Exception
     */
    private <T> List<T> castResponseToEntities(Class<T> cls, InputStream stream, SAXParser saxParser) throws Exception{
        if(cls.isInstance(Package.class.newInstance())){
            SaxPackageHandler handler = new SaxPackageHandler();
            saxParser.parse(stream, handler);
            return (List<T>) handler.packages;
        } else if (cls.isInstance(Base.class.newInstance())){
            SaxBaseHandler handler = new SaxBaseHandler();
            saxParser.parse(stream, handler);
            return (List<T>) handler.baseEntities;
        }
        throw new IllegalArgumentException("Cannot parse a Vidal answer into " + cls.getName());
    }

}
