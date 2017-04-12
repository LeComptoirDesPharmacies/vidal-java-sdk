package fr.lecomptoirdespharmacies.entities;

import fr.lecomptoirdespharmacies.entities.subentities.*;
import java.math.BigDecimal;

/**
 * Java class for Vidal XML Package
 * There isn't all xml field here, add attribute if you want more
 */
public class Package extends BaseEntity {

    /**
     * Package identifier
     * XML attribute : vidal:id
     */
    public Long vidalId = null;

    /**
     * Package name
     * XML attribute : vidal:name
     */
    public String name = null;

    /**
     * Place where package is dispensed
     * XML attribute : vidal:dispensationPlace
     */
    public DispensationPlace dispensationPlace = null;

    /**
     * Package type
     * XML attribute : vidal:itemType
     */
    public ItemType itemType = null;

    /**
     * Code "Club Inter Pharmaceutique" 7 numbers
     * XML attribute : vidal:cip
     */
    public String cip = null;

    /**
     * Code "Club Inter Pharmaceutique" 13 numbers
     * XML attribute : vidal:cip13
     */
    public String cip13 = null;

    /**
     * Code EAN 13 numbers = CIP13 for NON_PHARMACEUTICAL
     * XML attribute : vidal:ean
     */
    public String ean = null;

    /**
     * Public price
     * XML attribute : vidal:publicPrice
     */
    public BigDecimal publicPrice = null;

    /**
     * Package vat
     * XML attribute : vidal:vatRate
     */
    public Float vatRate = null;

    /**
     * Drugstore price
     * XML attribute : vidal:pharmacistPrice
     */
    public BigDecimal pharmacistPrice = null;


    /**
     * If Product is a Over The Counter
     * XML attribute : vidal:otc
     */
    public Boolean otc = null;

    /**
     * short name
     * XML attribute : vidal:shortLabel
     */
    public String shortLabel = null;

    /**
     * If is a drug in sport
     * XML attribute : vidal:drugInSport
     */
    public Boolean drugInSport = null;

    /**
     * If is a narcotic
     * XML attribute : vidal:narcoticPrescription
     */
    public Boolean narcoticPrescription = null;

    /**
     * International common name
     * XML attribute : vidal:vmp
     */
    public String vmp = null;

    /**
     * Code "Unité Commune de Dispensation"
     * XML attribute : vidal:ucd
     */
    public String ucd = null;

    /**
     * Market status if package always marketed
     * XML attribute : vidal:marketStatus
     */
    public MarketStatus marketStatus = null;

    /**
     * Laboratory
     * XML attribute : vidal:company
     */
    public Company company = null;

    /**
     * Refund rate
     * XML attribute : vidal:refundRate
     */
    public String refundRate = null;


    /**
     * XML attribute : vidal:lppr
     */
    public String lppr = null;

}
