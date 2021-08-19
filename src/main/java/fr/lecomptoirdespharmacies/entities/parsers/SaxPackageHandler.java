package fr.lecomptoirdespharmacies.entities.parsers;

import fr.lecomptoirdespharmacies.core.enums.CompanyTypes;
import fr.lecomptoirdespharmacies.core.enums.EntryCategories;
import fr.lecomptoirdespharmacies.entities.subentities.*;
import fr.lecomptoirdespharmacies.entities.Package;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Parse xml to package class
 * For more information : http://www.saxproject.org/quickstart.html
 */
public class SaxPackageHandler extends DefaultHandler {

    // Should contain only one package
    public List<Package> packages = new ArrayList<>();

    private Stack<String> elementStack = new Stack<String>();
    private Stack<Object> objectStack = new Stack<Object>();

    private String category;


    public void startElement(String uri, String localName,
                             String qName, Attributes attributes) throws SAXException {

        // Want only holder company
        if("vidal:company".equals(qName)){
            String type = attributes.getValue("type") != null ?  attributes.getValue("type") : "";
            if(type.equals(CompanyTypes.HOLDER.name())){
                this.elementStack.push(qName);
            } else {
                this.elementStack.push("");
            }
        } else {
            this.elementStack.push(qName);
        }

        if("entry".equals(qName)) {
            if (attributes.getValue("vidal:categories") != null) {
                this.category = attributes.getValue("vidal:categories");
                if(this.category.equals(EntryCategories.STORAGE.name())){
                    Package _package = (Package) this.objectStack.peek();
                    Storage _storage = new Storage();
                    _package.storages.add(_storage);
                }
            }
        }

        // Get all entries in xml file create a package object for each
        if("feed".equals(qName)){
            Package _package = new Package();
            this.objectStack.push(_package);
            this.packages.add(_package);
        }
        // Get attribute value and add subentities to package object
        else if("vidal:company".equals(qName)){
            Company _company = new Company();
            try {
                _company.type = attributes.getValue("type") != null ?  attributes.getValue("type") : "";
                if(_company.type.equals(CompanyTypes.HOLDER.name())) {
                    _company.vidalId = attributes.getValue("vidalId") != null ? Long.parseLong(attributes.getValue("vidalId")) : 0;
                    Package _package = (Package) this.objectStack.peek();
                    _package.company = _company;
                }
            } catch (NumberFormatException e){
             //TODO: do somethings or not
            }
        } else if("vidal:marketStatus".equals(qName)){
            if (this.category.equals(EntryCategories.PACKAGE.name())){
                MarketStatus _marketStatus = new MarketStatus();
                _marketStatus.name = attributes.getValue("name") != null ?  attributes.getValue("name") : "";
                Package _package = (Package) this.objectStack.peek();
                _package.marketStatus = _marketStatus;
            }
        } else if("vidal:refundRate".equals(qName)){
            if (this.category.equals(EntryCategories.PACKAGE.name())){
                RefundRate _refundRate = new RefundRate();
                _refundRate.name = attributes.getValue("name") != null ?  attributes.getValue("name") : "";
                _refundRate.rate = Integer.parseInt(attributes.getValue("rate") != null ?  attributes.getValue("rate") : "");
                Package _package = (Package) this.objectStack.peek();
                _package.refundRate = _refundRate;
            }
        } else if ("vidal:itemType".equals(qName)){
            ItemType _itemType = new ItemType();
            _itemType.name = attributes.getValue("name") != null ?  attributes.getValue("name") : "";
            Package _package = (Package) this.objectStack.peek();
            _package.itemType = _itemType;
        } else if ("vidal:dispensationPlace".equals(qName)){
            DispensationPlace _dispensationPlace = new DispensationPlace();
            _dispensationPlace.name = attributes.getValue("name") != null ?  attributes.getValue("name") : "";
            Package _package = (Package) this.objectStack.peek();
            _package.dispensationPlace = _dispensationPlace;
        } else if ("vidal:storageType".equals(qName)){
            if(attributes.getValue("name") != null) {
                StorageType _storageType = new StorageType();
                _storageType.name = attributes.getValue("name") != null ?  attributes.getValue("name") : "";
                Package _package = (Package) this.objectStack.peek();
                Storage lastStorage = _package.storages.get(_package.storages.size() -1);
                lastStorage.type = _storageType;
            }
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

            /* Bind xml value to package object
             * There isn't all xml field here, add field if you want more
             */

            // Get current package
            Package _package = (Package) this.objectStack.peek();

            if("entry".equals(currentParent)) {
                if(this.category.equals(EntryCategories.PACKAGE.name())) {
                    if ("id".equals(currentElement)) {
                        _package.id = (_package.id != null ?
                                _package.id : value);

                    } else if ("title".equals(currentElement)) {
                        _package.title = (_package.title != null ?
                                _package.title +" "+ value: value);
                    } else if ("vidal:id".equals(currentElement)) {
                        _package.vidalId = (_package.vidalId != null ?
                                _package.vidalId : Long.decode(value));
                    } else if ("vidal:name".equals(currentElement)) {
                        _package.name = (_package.name != null ?
                                _package.name + " " + value : value);
                    } else if ("vidal:dispensationPlace".equals(currentElement)) {
                        _package.dispensationPlace.value = (_package.dispensationPlace.value != null ?
                                _package.dispensationPlace.value : value);
                    } else if ("vidal:itemType".equals(currentElement)) {
                        _package.itemType.value = (_package.itemType.value != null ?
                                _package.itemType.value : value);
                    } else if ("vidal:cip".equals(currentElement)) {
                        _package.cip = (_package.cip != null ?
                                _package.cip : value);
                    } else if ("vidal:publicPrice".equals(currentElement)) {
                        _package.publicPrice = (_package.publicPrice != null ?
                                _package.publicPrice : new BigDecimal(value));
                    } else if ("vidal:vatRate".equals(currentElement)) {
                        _package.vatRate = (_package.vatRate != null ?
                                _package.vatRate : Float.parseFloat(value));
                    } else if ("vidal:pharmacistPrice".equals(currentElement)) {
                        _package.pharmacistPrice = (_package.pharmacistPrice != null ?
                                _package.pharmacistPrice : new BigDecimal(value));
                    } else if ("vidal:otc".equals(currentElement)) {
                        _package.otc = (_package.otc != null ?
                                _package.otc : Boolean.valueOf(value));
                    } else if ("vidal:cip13".equals(currentElement)) {
                        _package.cip13 = (_package.cip13 != null ?
                                _package.cip13 : value);
                    } else if ("vidal:ean".equals(currentElement)) {
                        _package.ean = (_package.ean != null ?
                                _package.ean : value);
                    } else if ("vidal:shortLabel".equals(currentElement)) {
                        _package.shortLabel = (_package.shortLabel != null ?
                                _package.shortLabel + " " + value : value);
                    } else if ("vidal:marketStatus".equals(currentElement)) {
                        _package.marketStatus.value = (_package.marketStatus.value != null ?
                                _package.marketStatus.value : value);
                    } else if ("vidal:company".equals(currentElement)) {
                        _package.company.name = (_package.company.name != null ?
                                _package.company.name + " " + value : value);
                    } else if ("vidal:refundRate".equals(currentElement)) {
                        _package.refundRate.value = (_package.refundRate.value != null ?
                                _package.refundRate.value : value);
                    } else if ("vidal:drugInSport".equals(currentElement)) {
                        _package.drugInSport = (_package.drugInSport != null ?
                                _package.drugInSport : Boolean.valueOf(value));
                    } else if ("vidal:narcoticPrescription".equals(currentElement)) {
                        _package.narcoticPrescription = (_package.narcoticPrescription != null ?
                                _package.narcoticPrescription : Boolean.valueOf(value));
                    } else if ("vidal:vmp".equals(currentElement)) {
                        _package.vmp = (_package.vmp != null ?
                                _package.vmp + " " + value : value);
                    } else if ("vidal:ucd".equals(currentElement)) {
                        _package.ucd = (_package.ucd != null ?
                                _package.ucd + " " + value : value);
                    } else if ("vidal:lppr".equals(currentElement)) {
                        _package.lppr = (_package.lppr != null ?
                                _package.lppr : value);
                    } else if ("vidal:manufacturerPrice".equals(currentElement)) {
                        _package.manufacturerPrice = (_package.manufacturerPrice != null ?
                                _package.manufacturerPrice : new BigDecimal(value));
                    }
                } else if(this.category.equals(EntryCategories.STORAGE.name())) {
                    Storage lastStorage = _package.storages.get(_package.storages.size() -1);
                    if ("vidal:storageType".equals(currentElement)) {
                        lastStorage.type.value = (lastStorage.type.value != null ?
                                lastStorage.type.value : value);
                    }
                    if ("vidal:unpacked".equals(currentElement)) {
                        lastStorage.unpacked = (lastStorage.unpacked != null ?
                                lastStorage.unpacked : Boolean.valueOf(value));
                    }
                    if ("vidal:storageDuration".equals(currentElement)) {
                        lastStorage.duration = (lastStorage.duration != null ?
                                lastStorage.duration : value);
                    }
                } else if(this.category.equals(EntryCategories.PRODUCT.name())){
                    if("vidal:ammType".equals(currentElement)){
                        _package.ammType = (_package.ammType != null ? _package.ammType : value);
                    }
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
