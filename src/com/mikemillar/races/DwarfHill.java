package com.mikemillar.races;

import com.mikemillar.dataModels.Attribute;

import java.util.Map;

/**
 * Used to create instances of DwarfHill race.
 * Extends from PlayableRace, Dwarf
 */
public class DwarfHill extends Dwarf {
    
    /**
     * Creates instance of DwarfHill
     */
    public DwarfHill() {
        super();
    }
    
    /**
     * Returns default map of DwarfHill Attributes.
     * @return attributeMap - Default map of DwarfHill Attributes.
     */
    @Override
    public Map<String, Attribute> addDefaultAttributes() {
        Map<String, Attribute> attributeMap = super.addDefaultAttributes();
        attributeMap.put("Dwarven Toughness", new Attribute("Dwarven Toughness", "Your hit point maximum increases by 1, and it increases by 1 every time you gain a level."));
        return attributeMap;
    }
    
    /**
     * Adds Default DwarfHill Abilities Scores to the
     * character.
     */
    @Override
    public void addBonusAbilityScore() {
        // IMPLEMENT LATER -- +1 Wisdom
    }
}
