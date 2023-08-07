package app;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;
import app.heroes.classes.Archer;
import app.heroes.classes.Barbarian;
import app.heroes.classes.Swashbuckler;
import app.heroes.classes.Wizard;
import app.items.Armor;
import app.items.Weapon;
import app.types.ArmorType;
import app.types.Slot;
import app.types.WeaponType;

public class App {
    public static void main(String[] args) {
        System.out.println();

        Weapon weapon1 = new Weapon("Wand", 1, WeaponType.WANDS, 10);
        Weapon weapon2 = new Weapon("Bows", 1, WeaponType.BOWS, 20);

        Armor armor1 = new Armor("Cloth Helmet", 1, ArmorType.CLOTH, Slot.HEAD, new HeroAttribute(10, 10, 10));
        Armor armor2 = new Armor("Cloth Boots", 2, ArmorType.CLOTH, Slot.LEGS, new HeroAttribute(20, 20, 20));
        Armor armor3 = new Armor("Cloot Chest", 2, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(20, 20, 20));

        Hero wizard = new Wizard("Emre Merlin");
        Weapon weapon = new Weapon("Common fire wand", 1, WeaponType.DAGGERS, 10);
        Armor armor = new Armor("Common", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 1, 10));

        wizard.equip(weapon);
        wizard.equip(armor);
        wizard.levelUp();

        double damage = wizard.calculateDamage();

        System.out.println(damage);

    }
}
