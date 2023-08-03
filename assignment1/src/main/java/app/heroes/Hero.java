package app.heroes;

import java.util.ArrayList;

import app.heroAttributes.HeroAttribute;
import app.items.Armor;
import app.items.Equipment;
import app.items.Weapon;
import app.types.ArmorType;
import app.types.WeaponType;

public abstract class Hero {

    protected String name;
    protected int level;
    protected Equipment equipment;
    protected HeroAttribute levelAttributes;
    protected ArrayList<WeaponType> validWeaponTypes;
    protected ArrayList<ArmorType> validArmorTypes;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
        this.equipment = new Equipment();
        this.levelAttributes = new HeroAttribute(0, 0, 0);
        this.validWeaponTypes = new ArrayList<>();
        this.validArmorTypes = new ArrayList<>();
    }

    public abstract void levelUp();

    public abstract void equipArmor(Armor armor);

    public abstract void equipWeapon(Weapon weapon);

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
