package com.mikemillar.races;

import java.util.ArrayList;

/**
 * Used to create instances of DwarfMountain race.
 * Extends from PlayableRace, Dwarf
 */
public class DwarfMountain extends Dwarf {
    
    /**
     * Creates an instance of DwarfMountain
     */
    public DwarfMountain() {
        super();
    }
    
    /**
     * Returns ArrayList of default proficiencies.
     * @return prof - default list of proficiencies.
     */
    @Override
    public ArrayList<String> addDefaultProficiencies() {
        ArrayList<String> prof = super.addDefaultProficiencies();
        prof.add("Light Armor");
        prof.add("Medium Armor");
        return prof;
    }
    
    /**
     * Adds default DwarfMountain ability scores to
     * Character.
     */
    @Override
    public void addBonusAbilityScore() {
        // IMPLEMENT LATER - +2 Strength
    }
}
