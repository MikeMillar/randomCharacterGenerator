package com.mikemillar.races;

import com.mikemillar.dataModels.Attribute;
import com.mikemillar.dataModels.PlayerCharacter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * Generic Base Race Class
 */
public class PlayableRace {
    
    /**
     * Member Variables
     */
    String size;
    int speed;
    Map<String, Attribute> attributes;
    ArrayList<String> proficiencies;
    
    /**
     * Generates base PlayableRace instance will null stats.
     */
    public PlayableRace() {
        this(null,0);
    }
    
    /**
     * Generates base PlayableRace instance with set size/speed.
     */
    public PlayableRace(String size, int speed) {
        this.size = size;
        this.speed = speed;
        this.attributes = new HashMap<>();
        this.proficiencies = new ArrayList<>();
    }
    
    /**
     * Returns instance size.
     * @return size
     */
    public String getSize() {
        return size;
    }
    
    /**
     * Takes a String variable and sets size.
     * @param size String value to set member variable.
     */
    public void setSize(String size) {
        this.size = size;
    }
    
    /**
     * Returns instance speed.
     * @return speed
     */
    public int getSpeed() {
        return speed;
    }
    
    /**
     * Takes an int variable and sets speed.
     * @param speed int variable to set member variable.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
    /**
     * Returns Map of attributes
     * @return attributes
     */
    public Map<String, Attribute> getAttributes() {
        return attributes;
    }
    
    /**
     * Takes a map param of attributes and sets reference to
     * supplied Map reference.
     * @param attributes Attribute variable to set member Map to.
     */
    public void setAttributes(Map<String, Attribute> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * Takes an Attribute param and adds it to existing Map
     * of Attributes.
     * @param attribute Attribute variable to add to Map.
     */
    public void addAttribute(Attribute attribute) {
        this.attributes.put(attribute.getName(), attribute);
    }
    
    /**
     * Takes an Attribute param and removes it from existing
     * Map of Attributes.
     * @param attribute Attribute variable to remove from Map.
     */
    public void removeAttribute(Attribute attribute) {
        this.attributes.remove(attribute);
    }
    
    /**
     * Takes an Attribute param and updates an existing
     * reference inside an Attribute Map with the new
     * Attribute param.
     * @param attribute Attribute variable to update.
     */
    public void updateAttribute(Attribute attribute) {
        Attribute current = this.attributes.get(attribute.getName());
        this.attributes.replace(attribute.getName(), current, attribute);
    }
    
    
    /**
     * Returns an ArrayList of proficiencies.
     * @return proficiencies
     */
    public ArrayList<String> getProficiencies() {
        return proficiencies;
    }
    
    /**
     * Takes an ArrayList param of proficiencies and sets
     * the reference of member variable proficiencies to
     * the param reference.
     * @param proficiencies Arraylist to set member list to.
     */
    public void setProficiencies(ArrayList<String> proficiencies) {
        this.proficiencies = proficiencies;
    }
    
    /**
     * Takes a String param and adds it to existing
     * Arraylist of proficiencies.
     * @param name String to add to ArrayList
     */
    public void addProficiency(String name) {
        this.proficiencies.add(name);
    }
    
    /**
     * Takes a String param and searches existing ArrayList
     * of proficiencies for a match. If match is found, it
     * removes that from proficiencies list and breaks loop.
     * @param name String to remove from ArrayList
     */
    public void removeProficiency(String name) {
        for (int i = 0; i < proficiencies.size(); i++) {
            if (proficiencies.get(i).equals(name)) {
                proficiencies.remove(i);
                break;
            }
        }
    }
}
