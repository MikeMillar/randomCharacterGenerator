package com.mikemillar.races;

import com.mikemillar.dataModels.Attribute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Used to create instances of Dwarf race.
 * Extends from PlayableRace
 */
public class Dwarf extends PlayableRace {
    
    /**
     * Creates instance of Dwarf
     */
    public Dwarf() {
        super("Medium", 25);
    }
    
    /**
     * Returns Map of default dwarf attributes.
     * @return attributeMap - Map of default dwarf attributes.
     */
    public Map<String, Attribute> addDefaultAttributes() {
        Map<String, Attribute> attributeMap = new HashMap<>();
        attributeMap.put("Darkvision", new Attribute("Darkvision", "You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray."));
        attributeMap.put("Dwarven Resilience", new Attribute("Dwarven Resilience", "You have advantage on saving throws against poison, and you have resistance against poison damage."));
        attributeMap.put("Stonecunning", new Attribute("Stonecunning", "Whenever you make an Intelligence(History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus."));
        return attributeMap;
    }
    
    /**
     * Returns ArrayList of default dwarf proficiencies
     * @return prof - ArrayList of default dwarf proficiencies.
     */
    public ArrayList<String> addDefaultProficiencies() {
        ArrayList<String> prof = new ArrayList<>();
        prof.add("Battleaxe");
        prof.add("Handaxe");
        prof.add("Throwing Hammer");
        prof.add("Warhammer");
        prof.add("Artisan's Tools");
        Random random = new Random();
        int num = random.nextInt(3);
        switch (num) {
            case 0:
                prof.add("Smith's Tools");
                break;
            case 1:
                prof.add("Brewer's Tools");
                break;
            case 2:
                prof.add("Mason's Tools");
                break;
        }
        return prof;
    }
    
    /**
     * Adds default Dwarf ability score bonus
     */
    public void addBonusAbilityScore() {
        // ADD CODE HERE -- +2 Constitution
    }
    
}
