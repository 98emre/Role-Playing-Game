package app.heroes;

import java.util.ArrayList;

import app.equipment.Equipment;
import app.heroAttributes.HeroAttribute;

public abstract class Hero {

    protected String name;
    protected int level;
    protected Equipment equipment;
    protected HeroAttribute levelAttributes;
    protected ArrayList<String> validWeaponTypes;
    protected ArrayList<String> validArmorTypes;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
        this.equipment = new Equipment();
        this.levelAttributes = new HeroAttribute(0, 0, 0);
        this.validWeaponTypes = new ArrayList<>();
        this.validArmorTypes = new ArrayList<>();
    }

    public abstract void levelUp();

    public abstract void equipArmor(String armorType);

    public abstract void equipWeapon(String weaponType);

    public abstract int calculateDamage();

    public abstract HeroAttribute calculateTotalAttributes();

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Level: ").append(level).append("\n");
        sb.append("Class: ").append(getClass().getSimpleName()).append("\n");

        sb.append("Total strength: ").append(levelAttributes.getStrength()).append("\n");
        sb.append("Total dexterity: ").append(levelAttributes.getDexterity()).append("\n");
        sb.append("Total intelligence: ").append(levelAttributes.getIntelligence()).append("\n");
        sb.append("Equipment: ").append(equipment.getEquippedItem());
        return sb.toString();
    }
}
