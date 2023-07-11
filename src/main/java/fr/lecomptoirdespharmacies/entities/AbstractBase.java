package fr.lecomptoirdespharmacies.entities;


import java.time.Instant;

/**
 * Here we have common attribute between entities
 */
public abstract class AbstractBase {

    /**
     * Identifier
     * XML attribute : id
     */
    public String id = null;

    /**
     * Title
     * XML attribute : title
     */
    public String title = null;

    /**
     *  Vidal identifier
     * XML attribute : vidal:id
     */
    public Long vidalId = null;


    /**
     * Updated date
     * XML attribute : updated
     */
    public Instant updated = null;

}
