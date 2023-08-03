package app;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;
import app.heroes.classes.Archer;
import app.heroes.classes.Barbarian;
import app.heroes.classes.Swashbuckler;
import app.heroes.classes.Wizard;
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

        Armor armor1 = new Armor("Cloth", 1, ArmorType.CLOTH, Slot.HEAD, new HeroAttribute(10, 10, 10));
        Armor armor2 = new Armor("Mail", 2, ArmorType.CLOTH, Slot.LEGS, new HeroAttribute(20, 20, 20));

        Hero wizard = new Wizard("Emre Merlin");
        wizard.equipArmor(armor1);
        wizard.levelUp();
        wizard.equipArmor(armor2);
        wizard.equipArmor(armor2);

        System.out.println(wizard.display());

    }
}
