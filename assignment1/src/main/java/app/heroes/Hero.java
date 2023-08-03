package app.heroes;

import java.util.ArrayList;
import java.util.List;

import app.heroAttributes.HeroAttribute;
import app.items.Armor;
import app.items.Equipment;
import app.items.Weapon;
import app.types.ArmorType;
import app.types.WeaponType;

public abstract class Hero {

    private String name;
    private int level;
    private Equipment equipment;
    protected HeroAttribute levelAttributes;
    protected List<WeaponType> validWeaponTypes;
    protected List<ArmorType> validArmorTypes;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
        this.equipment = new Equipment();
        this.validArmorTypes = new ArrayList<>();
        this.validWeaponTypes = new ArrayList<>();
    }

    public void levelUp() {
        this.level++;
    }

    public void equipArmor(Armor armor) {

    }

    public void equipWeapon(Weapon weapon) {

    }

    public int calculateDamage() {
        return 0;
    }

    public HeroAttribute calculateTotalAttributes() {
        return levelAttributes;
    }

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
