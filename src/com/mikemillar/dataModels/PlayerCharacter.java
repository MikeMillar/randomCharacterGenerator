package com.mikemillar.dataModels;

import com.mikemillar.Classes.PlayableClass;
import com.mikemillar.races.PlayableRace;
import java.util.ArrayList;
import java.util.Map;

/** Main Class Element - Stores all generated character data.
 */
public class PlayerCharacter {
    
    /**
     * Member variables
     */
    private String playerName;
    private String characterName;
    private short age;
    private String alignment;
    private PlayableRace race;
    private PlayableClass playerClass;
    private long experience;
    private Background background;
    private Map<String, Integer> abilityScores;
    private ArrayList<String> savingThrows;
    private ArrayList<String> skills;
    private Map<String, Attribute> attributes;
    private ArrayList<String> proficiencies;
    private Map<String, Item> equipment;
    private Map<String, Weapon> weapons;
    private Map<String, Ability> abilities;
    private int proficiencyBonus;
    private int passivePerception;
    private int armor;
    private int initiative;
    private int hitPoints;
    private int maxHitPoints;
    private int tempHitPoints;
    private int totalHitDice;
    private int hitDice;
    
    
    
    
}
