package fr.lecomptoirdespharmacies.core.helpers;

import fr.lecomptoirdespharmacies.entities.BaseEntity;
import fr.lecomptoirdespharmacies.entities.parsers.SaxPackageHandler;
import fr.lecomptoirdespharmacies.entities.Package;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class XmlHelper {

    private SAXParserFactory factory = SAXParserFactory.newInstance();

    public <T extends BaseEntity> List<T> xmlToObjects(String xml, Class<T> cls) throws Exception{

        InputStream stream = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));

        SAXParser saxParser = factory.newSAXParser();

        return castResponseToEntities(cls, stream, saxParser);
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
            try {
                SaxPackageHandler handler = new SaxPackageHandler();
                saxParser.parse(stream, handler);
                return (List<T>) handler.packages;
            } catch (Exception e){
                return new ArrayList<T>();
            }
        }
        return null;
    }

}
