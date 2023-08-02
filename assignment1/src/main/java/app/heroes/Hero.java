package app.heroes;

import java.util.ArrayList;

import app.equipment.Equipment;
import app.heroAttributes.HeroAttributes;

public abstract class Hero {

    private String name;
    private int level;
    private Equipment equipment;
    private HeroAttributes heroAttributes;
    private ArrayList<String> validWeaponTypes;
    private ArrayList<String> validArmorTypes;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
        this.equipment = new Equipment();
        this.heroAttributes = new HeroAttributes(0, 0, 0);
        this.validWeaponTypes = new ArrayList<String>();
        this.validArmorTypes = new ArrayList<String>();
    }

    public abstract void levelUp();

    public abstract void equipArmor(String armorType);

    public abstract void equipWeapon(String weaponType);

    public abstract void damage(int damage);

    public abstract HeroAttributes getTotalAttributes();

    public abstract void display();
}
