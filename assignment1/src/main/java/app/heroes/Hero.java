package app.heroes;

import java.util.ArrayList;
import java.util.List;

import app.customExceptions.InvalidArmorException;
import app.customExceptions.InvalidWeaponException;
import app.heroAttributes.HeroAttribute;
import app.items.Armor;
import app.items.Equipment;
import app.items.Item;
import app.items.Weapon;
import app.types.ArmorType;
import app.types.WeaponType;

public abstract class Hero {

    private String name;
    private int level;
    private Equipment equipments;
    protected HeroAttribute levelAttributes;
    protected List<WeaponType> validWeaponTypes;
    protected List<ArmorType> validArmorTypes;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
        this.equipments = new Equipment();
        this.validArmorTypes = new ArrayList<>();
        this.validWeaponTypes = new ArrayList<>();
    }

    public void levelUp() {
        this.level++;
    }

    public void equip(Armor armor) {
        if (armor.getRequiredLevel() > this.level) {
            throw new InvalidWeaponException("You are low level for using this armor (" + armor.getName() + ")");
        }

        if (!validArmorTypes.contains(armor.getArmorType())) {
            throw new InvalidArmorException("You can't use this " + armor.getName() + " has a armor");
        }

        equipments.equipItem(armor);
    }

    public void equip(Weapon weapon) {
        if (weapon.getRequiredLevel() > this.level) {
            throw new InvalidWeaponException("You are low level for using this weapon");
        }

        if (!validWeaponTypes.contains(weapon.getWeaponType())) {
            throw new InvalidArmorException("You can't use this " + weapon.getName() + " has a weapon");
        }

        equipments.equipItem(weapon);
    }

    public int damage() {
        return 0;
    }

    public HeroAttribute totalAttributes() {

        HeroAttribute total = levelAttributes;

        for (Item item : equipments.getEquippedItem().values()) {
            if (item != null) {
                if (item instanceof Armor) {
                    Armor armor = (Armor) item;
                    total.addAttributes(armor.getArmorAttribute());
                }
            }
        }

        return total;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        HeroAttribute totalAttributes = totalAttributes();

        sb.append("Name: ").append(name).append("\n");
        sb.append("Level: ").append(level).append("\n");
        sb.append("Class: ").append(getClass().getSimpleName()).append("\n");

        sb.append("Total strength: ").append(totalAttributes.getStrength()).append("\n");
        sb.append("Total dexterity: ").append(totalAttributes.getDexterity()).append("\n");
        sb.append("Total intelligence: ").append(totalAttributes.getIntelligence()).append("\n");
        sb.append("\nEquipments: ").append(equipments.toString());

        return sb.toString();
    }
}
