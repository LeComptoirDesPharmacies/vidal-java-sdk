package fr.lecomptoirdespharmacies.entities.parsers;

import fr.lecomptoirdespharmacies.entities.AbstractBase;
import fr.lecomptoirdespharmacies.entities.Base;
import fr.lecomptoirdespharmacies.entities.Package;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Parse xml to Base class
 * For more information : http://www.saxproject.org/quickstart.html
 */
public class SaxBaseHandler extends DefaultHandler {

    public List<Base> baseEntities = new ArrayList<>();

    private Stack<String> elementStack = new Stack<String>();
    private Stack<Object> objectStack = new Stack<Object>();

    public void startElement(String uri, String localName,
                             String qName, Attributes attributes) throws SAXException {

        this.elementStack.push(qName);

        // Get all entries in xml file create a base object for each
        if("entry".equals(qName)){
            Base _base = new Base();
            this.objectStack.push(_base);
            this.baseEntities.add(_base);
        }
    }

    public void endElement(String uri, String localName,
                           String qName) throws SAXException {
        this.elementStack.pop();
    }

    public void characters(char ch[], int start, int length) throws SAXException {
        try {
            String value = new String(ch, start, length).trim();
            if (value.length() == 0) return; // ignore white space

            String currentElement = currentElement();
            String currentParent = currentElementParent();

            /* Bind xml value to base object
             * There isn't all xml field here, add field if you want more
             */
            if("entry".equals(currentParent)) {
                if ("vidal:id".equals(currentElement)) {
                    Base _base = (Base) this.objectStack.peek();
                    _base.vidalId = (_base.vidalId != null ?
                            _base.vidalId : Long.decode(value));
                }
            }
        } catch (Exception e){
            //TODO: do somethings or not
            System.out.print(e);
        }
    }

    private String currentElement() {
        return this.elementStack.peek();
    }

    private String currentElementParent() {
        if(this.elementStack.size() < 2) return null;
        return this.elementStack.get(this.elementStack.size()-2);
    }
}
