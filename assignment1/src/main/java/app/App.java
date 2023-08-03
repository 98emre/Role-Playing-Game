package app;

import app.heroAttributes.HeroAttribute;
import app.heroes.Archer;
import app.heroes.Barbarian;
import app.heroes.Hero;
import app.heroes.Swashbuckler;
import app.heroes.Wizard;
import app.items.Armor;
import app.items.Equipment;
import app.items.Weapon;
import app.types.ArmorType;
import app.types.Slot;
import app.types.WeaponType;

public class App {
    public static void main(String[] args) {
        System.out.println();

        Weapon weapon1 = new Weapon("Wand", 1, WeaponType.WANDS, 10);
        Weapon weapon2 = new Weapon("Bows", 1, WeaponType.BOWS, 20);

        Armor armor1 = new Armor("Cloth", 2, ArmorType.CLOTH, Slot.HEAD, new HeroAttribute(10, 10, 10));
        Armor armor2 = new Armor("Mail", 1, ArmorType.MAIL, Slot.LEGS, new HeroAttribute(20, 20, 20));

        Hero wizard = new Wizard("Emre Merlin");
        wizard.display();
        wizard.levelUp();
        System.out.println(wizard.display());

        System.out.println();

    }
}
