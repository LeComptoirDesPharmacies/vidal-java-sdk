package fr.lecomptoirdespharmacies.entities;


/**
 * Here we have common attribute between entities
 */
public abstract class BaseEntity {

    /**
     * Package identifier
     * XML attribute : id
     */
    public String id = null;

    /**
     * Package title
     * XML attribute : title
     */
    public String title = null;

}
