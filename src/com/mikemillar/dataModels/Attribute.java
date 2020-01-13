package com.mikemillar.dataModels;


/**
 * Creates Instances of Character Attributes
 */
public class Attribute {
    
    /**
     * Member Variables
     */
    String name;
    String description;
    
    /**
     * Takes a String @name and String @description and
     * sets the member variables equal to them.
     * @param name Name of attribute
     * @param description Description of attribute
     */
    public Attribute(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    /**
     * Returns name of attribute
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Takes String @name param to set attribute name
     * equal to.
     * @param name Name of attribute
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Returns description of attribute
     * @return description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Takes String @description to set attribute
     * description equal to.
     * @param description Description of attribute.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
