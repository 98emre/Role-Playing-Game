package app.heroes;

import java.util.ArrayList;

import app.equipment.Equipment;
import app.heroAttributes.HeroAttributes;

public abstract class Hero {

    protected String name;
    protected int level;
    protected Equipment equipment;
    protected HeroAttributes levelAttributes;
    protected ArrayList<String> validWeaponTypes;
    protected ArrayList<String> validArmorTypes;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
        this.equipment = new Equipment();
        this.levelAttributes = new HeroAttributes(0, 0, 0);
    }

    public abstract void levelUp();

    public void equipArmor(String armorType) {
        if (validArmorTypes.contains(armorType)) {

        }
    }

    public void equipWeapon(String weaponType) {
        if (validWeaponTypes.contains(weaponType)) {

        }
    }

    public abstract void damage(int damage);

    public HeroAttributes getTotalAttributes() {
        return this.levelAttributes;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Level: ").append(level).append("\n");
        sb.append("Class: ").append(getClass().getSimpleName()).append("\n");

        sb.append("Total strength: ").append(levelAttributes.getStrength()).append("\n");
        sb.append("Total dexterity: ").append(levelAttributes.getDexterity()).append("\n");
        sb.append("Total intelligence: ").append(levelAttributes.getIntelligence()).append("\n");
        sb.append("Equipment: ").append(equipment);
        return sb.toString();
    }
}
