package fr.lecomptoirdespharmacies.core.helpers.ressources;

public class FakeXml {

    public final static String FAKE_SEARCH_BY_CODE_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<feed xmlns=\"http://www.w3.org/2005/Atom\">\n" +
            "    <title>Search by codes: 3584410030248</title>\n" +
            "    <link rel=\"self\" type=\"application/atom+xml\" href=\"/rest/api/search?code=3584410030248\"/>\n" +
            "    <id>/rest/api/search?code=3584410030248</id>\n" +
            "    <updated>2018-06-19T00:00:00Z</updated>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOCTEUR VALNET ALG ESSENCES Bain la thalasso à domicile 3Sach</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/289483\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/289483/larger-packs\" title=\"LARGER_PACKS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/289483/affiliation-centers\" title=\"AFFILIATION_CENTER\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/289483/pds\" title=\"PDS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/289483/pricing-schedule\" title=\"PRICING_SCHEDULE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/289483/units\" title=\"UNITS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/289483/routes\" title=\"ROUTES\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/289483/indicators\" title=\"INDICATORS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/289483/indications\" title=\"INDICATIONS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/289483/side-effects\" title=\"SIDE_EFFECTS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/289483/lppr\" title=\"LPPR\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/289483/saumon-classification\" title=\"SAUMON_CLASSIFICATION\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/289483</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <summary type=\"text\">DOCTEUR VALNET ALG ESSENCES Bain la thalasso à domicile 3Sach</summary>\n" +
            "        <content/>\n" +
            "        <vidal:id>289483</vidal:id>\n" +
            "        <vidal:name>DOCTEUR VALNET ALG ESSENCES Bain la thalasso à domicile 3Sach</vidal:name>\n" +
            "        <vidal:dispensationPlace name=\"PHARMACY\">PHARMACY</vidal:dispensationPlace>\n" +
            "        <vidal:exceptional>false</vidal:exceptional>\n" +
            "        <vidal:horsGHS>false</vidal:horsGHS>\n" +
            "        <vidal:itemType name=\"NON_PHARMACEUTICAL\">NON_PHARMACEUTICAL</vidal:itemType>\n" +
            "        <vidal:cip>9731917</vidal:cip>\n" +
            "        <vidal:ean>3584410030248</vidal:ean>\n" +
            "        <vidal:vatRate name=\"HIGH\">20.0</vidal:vatRate>\n" +
            "        <vidal:pharmacistPrice>9.4</vidal:pharmacistPrice>\n" +
            "        <vidal:drugId>22058</vidal:drugId>\n" +
            "        <vidal:productId>22058</vidal:productId>\n" +
            "        <vidal:onMarketDate format=\"yyyy-MM-dd\">2010-05-28</vidal:onMarketDate>\n" +
            "        <vidal:otc>false</vidal:otc>\n" +
            "        <vidal:cip13>3401397319176</vidal:cip13>\n" +
            "        <vidal:shortLabel>DOCTEUR VALNET ALG ESSENCES Bain thalas 3Sach</vidal:shortLabel>\n" +
            "        <vidal:tfr>false</vidal:tfr>\n" +
            "        <vidal:marketStatus name=\"AVAILABLE\">Commercialisé</vidal:marketStatus>\n" +
            "        <vidal:company type=\"DISTRIBUTOR\" vidalId=\"1614\">Cosbionat</vidal:company>\n" +
            "        <vidal:company type=\"HOLDER\" vidalId=\"1614\">Cosbionat</vidal:company>\n" +
            "        <vidal:drugInSport>false</vidal:drugInSport>\n" +
            "        <vidal:narcoticPrescription>false</vidal:narcoticPrescription>\n" +
            "        <vidal:safetyAlert>false</vidal:safetyAlert>\n" +
            "        <vidal:withoutPrescription>true</vidal:withoutPrescription>\n" +
            "        <vidal:isCeps>false</vidal:isCeps>\n" +
            "        <vidal:galenicForm vidalId=\"694\">bain</vidal:galenicForm>\n" +
            "    </entry>\n" +
            "</feed>";

    public final static String FAKE_GET_PACKAGE_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<feed xmlns=\"http://www.w3.org/2005/Atom\">\n" +
            "    <title>Package 203459</title>\n" +
            "    <link rel=\"self\" type=\"application/atom+xml\" href=\"/rest/api/package/203459?aggregate=STORAGE&amp;aggregate=PRODUCTS\"/>\n" +
            "    <id>vidal://package/203459</id>\n" +
            "    <updated>2018-06-19T00:00:00Z</updated>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>BECLOSPIN 800 µg/2 ml Susp p inh/nébulis en récipient unidose Unid/20</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/203459\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/203459/larger-packs\" title=\"LARGER_PACKS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/203459/affiliation-centers\" title=\"AFFILIATION_CENTER\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/203459/pds\" title=\"PDS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/203459/pricing-schedule\" title=\"PRICING_SCHEDULE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/203459/units\" title=\"UNITS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/203459/routes\" title=\"ROUTES\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/203459/indicators\" title=\"INDICATORS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/203459/indications\" title=\"INDICATIONS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/203459/side-effects\" title=\"SIDE_EFFECTS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/203459/ephmras\" title=\"EPHMRA\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/978\" title=\"VMP\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/203459/documents/opt?patient=false\" title=\"OPT_DOCUMENT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/package/203459/documents\" title=\"DOCUMENT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/atc-classification\" title=\"ATC_CLASSIFICATION\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/ucd/12541\" title=\"UCD\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/203459</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <summary type=\"text\">BECLOMETASONE DIPROPIONATE 800 µg/2 ml susp p inhal p nébulis récip unidose (BECLOSPIN 800 µg/2 ml Susp p inh/nébulis en récipient unidose Unid/20)</summary>\n" +
            "        <content/>\n" +
            "        <vidal:id>203459</vidal:id>\n" +
            "        <vidal:name>BECLOSPIN 800 µg/2 ml Susp p inh/nébulis en récipient unidose Unid/20</vidal:name>\n" +
            "        <vidal:dispensationPlace name=\"PHARMACY\">PHARMACY</vidal:dispensationPlace>\n" +
            "        <vidal:exceptional>false</vidal:exceptional>\n" +
            "        <vidal:horsGHS>false</vidal:horsGHS>\n" +
            "        <vidal:refundingBase>30.5</vidal:refundingBase>\n" +
            "        <vidal:itemType name=\"VIDAL\">VIDAL</vidal:itemType>\n" +
            "        <vidal:cip>3696350</vidal:cip>\n" +
            "        <vidal:publicPrice>30.5</vidal:publicPrice>\n" +
            "        <vidal:vatRate name=\"SUPER_REDUCED\">2.1</vidal:vatRate>\n" +
            "        <vidal:pharmacistPrice>25.13</vidal:pharmacistPrice>\n" +
            "        <vidal:drugId>73173</vidal:drugId>\n" +
            "        <vidal:productId>73173</vidal:productId>\n" +
            "        <vidal:onMarketDate format=\"yyyy-MM-dd\">2006-11-30</vidal:onMarketDate>\n" +
            "        <vidal:otc>false</vidal:otc>\n" +
            "        <vidal:cis>60003620</vidal:cis>\n" +
            "        <vidal:cip13>3400936963504</vidal:cip13>\n" +
            "        <vidal:shortLabel>BECLOSPIN 800µg/2ml Susp iné unidose Unid/20</vidal:shortLabel>\n" +
            "        <vidal:manufacturerPrice>23.56</vidal:manufacturerPrice>\n" +
            "        <vidal:tfr>false</vidal:tfr>\n" +
            "        <vidal:actCode name=\"PH7\">médicament remboursé à 65%</vidal:actCode>\n" +
            "        <vidal:actCodeFee name=\"HD7\">Conditionnement normal pour PH7 avec un taux à 65%</vidal:actCodeFee>\n" +
            "        <vidal:doseUnit vidalId=\"598\">unidose</vidal:doseUnit>\n" +
            "        <vidal:dose>20</vidal:dose>\n" +
            "        <vidal:marketStatus name=\"AVAILABLE\">Commercialisé</vidal:marketStatus>\n" +
            "        <vidal:company type=\"HOLDER\" vidalId=\"182\">Chiesi</vidal:company>\n" +
            "        <vidal:refundRate name=\"_65\">65%</vidal:refundRate>\n" +
            "        <vidal:genericType name=\"REFERENT\">Référent</vidal:genericType>\n" +
            "        <vidal:list name=\"I\">Liste 1</vidal:list>\n" +
            "        <vidal:drugInSport>false</vidal:drugInSport>\n" +
            "        <vidal:narcoticPrescription>false</vidal:narcoticPrescription>\n" +
            "        <vidal:pricePerDose>1.525</vidal:pricePerDose>\n" +
            "        <vidal:safetyAlert>true</vidal:safetyAlert>\n" +
            "        <vidal:ucdPrice>1.525</vidal:ucdPrice>\n" +
            "        <vidal:perVolume>800µg/2ml</vidal:perVolume>\n" +
            "        <vidal:withoutPrescription>false</vidal:withoutPrescription>\n" +
            "        <vidal:isCeps>true</vidal:isCeps>\n" +
            "        <vidal:galenicForm vidalId=\"578\">suspension pour inhalation par nébuliseur</vidal:galenicForm>\n" +
            "        <vidal:atc name=\"R03BA01\" vidalId=\"1834\">BECLOMETASONE</vidal:atc>\n" +
            "        <vidal:communityAgreement>true</vidal:communityAgreement>\n" +
            "        <vidal:vmp vidalId=\"978\">béclométasone dipropionate * 800 µg/2 ml ; voie inhalée ; susp p inhal p nébulis récip unidose</vidal:vmp>\n" +
            "        <vidal:ucd id=\"12541\">BECLOSPIN 800Y/2ML INH DOS</vidal:ucd>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>BECLOSPIN 800 µg/2 ml susp p inhal p nébulis</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/73173\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/packages\" title=\"PACKAGES\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/molecules\" title=\"MOLECULES\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/molecules/active-excipients\" title=\"ACTIVE_EXCIPIENTS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/recos\" title=\"RECOS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/foreign-products\" title=\"FOREIGN_PRODUCTS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/indications\" title=\"INDICATIONS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/contraindications\" title=\"CONTRAINDICATION\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/restricted-prescriptions\" title=\"RESTRICTED_PRESCRIPTIONS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/pds\" title=\"PDS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/ucds\" title=\"UCDS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/units\" title=\"UNITS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/food-interactions\" title=\"FOOD_INTERACTIONS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/physico-chemical-interactions\" title=\"PHYSICO_CHEMICAL_INTERACTIONS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/routes\" title=\"ROUTES\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/indicators\" title=\"INDICATORS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/side-effects\" title=\"SIDE_EFFECTS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/patient-monitoring\" title=\"PATIENT_MONITORING\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/documents\" title=\"DOCUMENTS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/documents/opt\" title=\"OPT_DOCUMENT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"http://eurekasante.vidal.fr/medicaments/fromwidget.html?idvdf=GP2742.htm\" title=\"EUREKA_SANTE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/atc-classification\" title=\"ATC_CLASSIFICATION\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/smr-asmr\" title=\"SMR_ASMR\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/smr-asmr.htm\" title=\"SMR_ASMR_HTML\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/ald\" title=\"ALD_DETAIL\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/generic-groups\" title=\"GENERIC_GROUPS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product/73173/vidal-classification\" title=\"VIDAL_CLASSIFICATION\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product-range/28723\" title=\"PRODUCT_RANGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/product-range/28723/products\" title=\"PRODUCTS\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/978\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/73173</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <summary type=\"text\">BECLOMETASONE DIPROPIONATE 800 µg/2 ml susp p inhal p nébulis récip unidose (BECLOSPIN Unidose)</summary>\n" +
            "        <content/>\n" +
            "        <vidal:id>73173</vidal:id>\n" +
            "        <vidal:name>BECLOSPIN 800 µg/2 ml susp p inhal p nébulis</vidal:name>\n" +
            "        <vidal:dispensationPlace name=\"PHARMACY\">PHARMACY</vidal:dispensationPlace>\n" +
            "        <vidal:horsGHS>false</vidal:horsGHS>\n" +
            "        <vidal:genericType name=\"REFERENT\">Référent</vidal:genericType>\n" +
            "        <vidal:midwife>false</vidal:midwife>\n" +
            "        <vidal:drugInSport>false</vidal:drugInSport>\n" +
            "        <vidal:beCareful>false</vidal:beCareful>\n" +
            "        <vidal:retrocession>false</vidal:retrocession>\n" +
            "        <vidal:list name=\"I\">Liste 1</vidal:list>\n" +
            "        <vidal:refundRate name=\"_65\">65%</vidal:refundRate>\n" +
            "        <vidal:itemType name=\"VIDAL\">VIDAL</vidal:itemType>\n" +
            "        <vidal:marketStatus name=\"AVAILABLE\">Commercialisé</vidal:marketStatus>\n" +
            "        <vidal:exceptional>false</vidal:exceptional>\n" +
            "        <vidal:bestDocType name=\"MONO\">MONO</vidal:bestDocType>\n" +
            "        <vidal:hasPublishedDoc>true</vidal:hasPublishedDoc>\n" +
            "        <vidal:perVolume>800µg/2ml</vidal:perVolume>\n" +
            "        <vidal:safetyAlert>true</vidal:safetyAlert>\n" +
            "        <vidal:activePrinciples>béclométasone dipropionate</vidal:activePrinciples>\n" +
            "        <vidal:ammType vidalId=\"20\">AMM Française</vidal:ammType>\n" +
            "        <vidal:onMarketDate format=\"yyyy-MM-dd\">2006-11-30</vidal:onMarketDate>\n" +
            "        <vidal:withoutPrescription>false</vidal:withoutPrescription>\n" +
            "        <vidal:cis>60003620</vidal:cis>\n" +
            "        <vidal:minUcdRangePrice>1.525</vidal:minUcdRangePrice>\n" +
            "        <vidal:maxUcdRangePrice>1.525</vidal:maxUcdRangePrice>\n" +
            "        <vidal:company type=\"OWNER\" vidalId=\"182\">Chiesi</vidal:company>\n" +
            "        <vidal:vmp vidalId=\"978\">béclométasone dipropionate * 800 µg/2 ml ; voie inhalée ; susp p inhal p nébulis récip unidose</vidal:vmp>\n" +
            "        <vidal:galenicForm vidalId=\"578\">suspension pour inhalation par nébuliseur</vidal:galenicForm>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"STORAGE\">\n" +
            "        <title>Storage and Shelf life : </title>\n" +
            "        <link rel=\"alternate\" type=\"STORAGE\" href=\"vidal://storage/20345900002400062\"/>\n" +
            "        <category term=\"STORAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://storage/20345900002400062</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "        <vidal:id>20345900002400062</vidal:id>\n" +
            "        <vidal:unpacked>false</vidal:unpacked>\n" +
            "        <vidal:storageDuration>24 mois</vidal:storageDuration>\n" +
            "        <vidal:storagePrecaution>Conserver à l'abri de la lumière</vidal:storagePrecaution>\n" +
            "        <vidal:storagePrecaution>Conserver dans son emballage</vidal:storagePrecaution>\n" +
            "        <vidal:storagePrecaution>Maintenir en position verticale</vidal:storagePrecaution>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"STORAGE\">\n" +
            "        <title>Storage and Shelf life : </title>\n" +
            "        <link rel=\"alternate\" type=\"STORAGE\" href=\"vidal://storage/20345910001200041\"/>\n" +
            "        <category term=\"STORAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://storage/20345910001200041</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "        <vidal:id>20345910001200041</vidal:id>\n" +
            "        <vidal:storageMaxTemperature>8</vidal:storageMaxTemperature>\n" +
            "        <vidal:storageMinTemperature>2</vidal:storageMinTemperature>\n" +
            "        <vidal:storageType name=\"FRIDGE\">Conservation au réfrigérateur</vidal:storageType>\n" +
            "        <vidal:unpacked>true</vidal:unpacked>\n" +
            "        <vidal:storageDuration>12 heures</vidal:storageDuration>\n" +
            "    </entry>\n" +
            "</feed>";

    public static final String FAKE_SEARCH_BY_NAME_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<feed xmlns=\"http://www.w3.org/2005/Atom\">\n" +
            "    <title>Search by name Doliprane</title>\n" +
            "    <link rel=\"self\" type=\"application/atom+xml\" href=\"/rest/api/search?q=Doliprane\"/>\n" +
            "    <id>Link{rel=self, type='application/atom+xml', href='/rest/api/search?q=Doliprane', title='null'}</id>\n" +
            "    <updated>2018-06-19T00:00:00Z</updated>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 100 mg Pdr sol buv en sachet-dose B/12</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11064\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/1859\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11064</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 100 mg Suppos sécable 2Plq/5 (10)</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11100\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3160\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11100</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 1000 mg Cpr eff séc T/8</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11042\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3450\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11042</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 1000 mg Suppos adulte 2Plq/4 (8)</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11084\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/4237\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11084</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 1000 mg Cpr eff séc B/100</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/37939\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3450\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/37939</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 1000 mg Cpr Plq/8</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/41928\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3170\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/41928</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 1000 mg Cpr Plq/100</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/41929\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3170\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/41929</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 1000 mg Pdr sol buv en sachet-dose B/8</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/45992\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3820\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/45992</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 1000 mg Gél Plq/8</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/319839\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/9222\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/319839</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 150 mg Pdr sol buv en sachet-dose B/12</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11068\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/1024\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11068</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 150 mg Suppos 2Plq/5 (10)</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11088\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2152\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11088</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 2,4 % Susp buv sans sucre Fl/100ml</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11077\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2505\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11077</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 200 mg Pdr sol buv en sachet-dose B/12</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11072\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2962\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11072</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 200 mg Suppos 2Plq/5 (10)</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11092\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2742\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11092</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 300 mg Pdr sol buv en sachet-dose B/12</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11076\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/1415\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11076</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 300 mg Suppos 2Plq/5 (10)</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11096\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/150\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11096</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 500 mg Cpr 10Plq/10 (100)</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11038\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3031\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11038</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 500 mg Cpr 2plq/8 (16)</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11039\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3031\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11039</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 500 mg Cpr eff 2T/8</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11041\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/393\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11041</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 500 mg Gél B/16</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11055\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/707\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11055</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 500 mg Gél B/100</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11056\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/707\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11056</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE 500 mg Pdr sol buv en sachet-dose B/12</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11060\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2910\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11060</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANE CODEINE 400 mg/20 mg Cpr séc 2plq/8 (16)</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/8520\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3861\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/8520</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANECAPS 1000 mg Gél Plq/8</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/319899\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/9222\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/319899</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANELIB 500 mg Cpr B/12</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/26977\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3031\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/26977</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANELIQUIZ 200 mg Susp buv en sachet sans sucre édulcorée au maltitol liquide et au sorbitol B/12</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/619344\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/13495\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/619344</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANELIQUIZ 300 mg Susp buv en sachet sans sucre édulcorée au maltitol liquide et au sorbitol B/12</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/618701\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/13486\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/618701</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANEORODOZ 500 mg Cpr orodisp Plq/12</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/11112\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2049\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/11112</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANETABS 1000 mg Cpr pell Plq/8</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/341659\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3170\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/341659</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANETABS 500 mg Cpr pell Plq/16</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/341650\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3031\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/341650</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PACKAGE\">\n" +
            "        <title>DOLIPRANEVITAMINEC 500 mg/150 mg Cpr eff 1T/16</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/package/212464\" title=\"PACKAGE\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/685\" title=\"VMP\"/>\n" +
            "        <category term=\"PACKAGE\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://package/212464</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 100 mg pdre p sol buv en sachet-dose</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5485\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/1859\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5485</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 100 mg suppos sécable</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5497\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3160\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5497</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 1000 mg cp efferv séc</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5478\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3450\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5478</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 1000 mg suppos adulte</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5493\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/4237\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5493</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 1000 mg cp</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/19649\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3170\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/19649</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 1000 mg pdre p sol buv en sachet-dose</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/20804\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3820\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/20804</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 1000 mg gél</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/106232\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/9222\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/106232</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 150 mg pdre p sol buv en sachet-dose</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5486\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/1024\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5486</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 150 mg suppos</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5494\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2152\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5494</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 2,4 % susp buv sans sucre</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5489\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2505\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5489</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 200 mg pdre p sol buv en sachet-dose</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5487\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2962\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5487</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 200 mg suppos</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5495\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2742\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5495</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 300 mg pdre p sol buv en sachet-dose</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5488\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/1415\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5488</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 300 mg suppos</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5496\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/150\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5496</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 500 mg cp</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5476\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3031\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5476</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 500 mg cp efferv</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5477\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/393\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5477</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 500 mg gél</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5480\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/707\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5480</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE 500 mg pdre p sol buv en sachet-dose</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/5484\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2910\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/5484</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANE CODEINE 400 mg/20 mg cp séc</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/162766\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3861\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/162766</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANECAPS 1000 mg gél</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/106245\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/9222\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/106245</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANELIB 500 mg cp</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/12710\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3031\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/12710</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANELIQUIZ 200 mg susp buv en sachet sans sucre édulcorée au maltitol liquide et au sorbitol</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/162747\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/13495\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/162747</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANELIQUIZ 300 mg susp buv en sachet sans sucre édulcorée au maltitol liquide et au sorbitol</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/162473\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/13486\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/162473</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANEORODOZ 500 mg cp orodispers</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/161767\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2049\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/161767</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANETABS 1000 mg cp pellic</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/109285\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3170\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/109285</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANETABS 500 mg cp pellic</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/148854\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3031\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/148854</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"PRODUCT\">\n" +
            "        <title>DOLIPRANEVITAMINEC 500 mg/150 mg cp efferv</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/product/75846\" title=\"PRODUCT\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/685\" title=\"VMP\"/>\n" +
            "        <category term=\"PRODUCT\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://product/75846</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 1000MG BUV SACH</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/8804\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3820\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/8804</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 1000MG CPR</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/8070\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3170\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/8070</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 1000MG CPR EFFV</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/6720\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3450\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/6720</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 1000MG GELU</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/18684\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/9222\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/18684</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 100MG PDR SACH</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/6219\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/1859\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/6219</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 100MG SUP</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/5898\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3160\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/5898</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 150MG PDR SACH</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/6220\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/1024\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/6220</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 150MG SUP</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/5899\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2152\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/5899</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 2,4% S/SUC BUV 100ML</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/5698\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2505\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/5698</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 200MG PDR SACH</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/6221\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2962\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/6221</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 200MG SUP</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/5900\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2742\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/5900</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 300MG PDR SACH</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/6222\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/1415\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/6222</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 300MG SUP</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/5901\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/150\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/5901</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 500MG CPR</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/2080\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3031\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/2080</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 500MG CPR EFFV</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/3142\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/393\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/3142</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 500MG GELU</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/5561\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/707\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/5561</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE 500MG PDR SACH</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/2098\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2910\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/2098</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANE AD. SUP</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/3110\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/4237\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/3110</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANECAPS 1000MG GELU</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/27377\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/9222\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/27377</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANELIB 500MG CPR</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/17166\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3031\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/17166</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANELIQUIZ 200MG S/S S.</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/27406\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/13495\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/27406</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANELIQUIZ 300MG S/S S.</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/27407\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/13486\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/27407</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANEORODOZ 500MG C.DISP</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/6535\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/2049\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/6535</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANETABS 1000MG CPR</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/27363\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3170\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/27363</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANETABS 500MG CPR</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/19643\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/3031\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/19643</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "    <entry xmlns:vidal=\"http://api.vidal.net/-/spec/vidal-api/1.0/\" vidal:categories=\"UCD\">\n" +
            "        <title>DOLIPRANEVITAMINEC CPR EFFV</title>\n" +
            "        <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/rest/api/ucd/15449\" title=\"UCD\"/>\n" +
            "        <link rel=\"related\" type=\"application/atom+xml\" href=\"/rest/api/vmp/685\" title=\"VMP\"/>\n" +
            "        <category term=\"UCD\"/>\n" +
            "        <author>\n" +
            "            <name>VIDAL</name>\n" +
            "        </author>\n" +
            "        <id>vidal://ucd/15449</id>\n" +
            "        <updated>2018-06-19T00:00:00Z</updated>\n" +
            "        <content/>\n" +
            "    </entry>\n" +
            "</feed>";
}

