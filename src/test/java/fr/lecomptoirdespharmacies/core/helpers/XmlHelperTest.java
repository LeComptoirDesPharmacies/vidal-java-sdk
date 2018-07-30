package fr.lecomptoirdespharmacies.core.helpers;

import fr.lecomptoirdespharmacies.entities.Base;
import fr.lecomptoirdespharmacies.entities.Package;
import fr.lecomptoirdespharmacies.entities.subentities.Storage;
import fr.lecomptoirdespharmacies.entities.subentities.StorageType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static fr.lecomptoirdespharmacies.core.helpers.ressources.FakeXml.FAKE_GET_PACKAGE_XML;
import static fr.lecomptoirdespharmacies.core.helpers.ressources.FakeXml.FAKE_SEARCH_BY_CODE_XML;
import static fr.lecomptoirdespharmacies.core.helpers.ressources.FakeXml.FAKE_SEARCH_BY_NAME_XML;
import static org.junit.jupiter.api.Assertions.*;

class XmlHelperTest {

    private XmlHelper xmlHelper;

    @BeforeEach
    void setUp() {
        xmlHelper = new XmlHelper();
    }

    @Test
    void parseXMLToBase_ShouldReturnBase() throws Exception{

        final Long vidalId = Long.valueOf("289483");

        List<Base> bases = (List<Base>) xmlHelper.xmlToObjects(FAKE_SEARCH_BY_CODE_XML, Base.class);

        Base base = ListHelper.getObject(bases);

        assertEquals(base.vidalId, vidalId);
    }

    @Test
    void parseXMLToPackage_ShouldReturnPackage() throws Exception{

        final String cip = "3696350";

        List<Package> packages = (List<Package>) xmlHelper.xmlToObjects(FAKE_GET_PACKAGE_XML, Package.class);

        Package aPackage = ListHelper.getObject(packages);

        assertEquals(aPackage.cip, cip);
    }

    @Test
    void fridgeStorageUnpacked_ShouldReturnTrue() throws Exception{
        List<Package> packages = (List<Package>) xmlHelper.xmlToObjects(FAKE_GET_PACKAGE_XML, Package.class);

        Package aPackage = ListHelper.getObject(packages);
        Optional<Storage> storage = aPackage.storages.stream()
                .filter(s -> s.type != null && s.type.name.equals("FRIDGE"))
                .findFirst();

        assertTrue(storage.get().unpacked);
    }

    @Test
    void parseXMLToMultipleBase_ShouldReturnBases() throws Exception{

        final int size = 84;

        List<Base> bases = (List<Base>) xmlHelper.xmlToObjects(FAKE_SEARCH_BY_NAME_XML, Base.class);

        assertEquals(bases.size(), size);
    }


}