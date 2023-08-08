package app;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;
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
        Armor armor1 = new Armor("Cloth Helmet", 1, ArmorType.CLOTH, Slot.HEAD, new HeroAttribute(10, 10, 10));
        Hero wizard = new Wizard("Emre Merlin");

        wizard.equip(weapon1);
        wizard.equip(armor1);
        wizard.levelUp();

        System.out.println(wizard.display());

    }
}
