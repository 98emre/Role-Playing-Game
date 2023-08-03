package app;

import app.Items.ArmorType;
import app.Items.Item;
import app.Items.WeaponType;
import app.equipment.Armor;
import app.equipment.Equipment;
import app.equipment.Weapon;
import app.heroAttributes.HeroAttribute;
import app.heroes.Archer;
import app.heroes.Barbarian;
import app.heroes.Hero;
import app.heroes.Swashbuckler;
import app.heroes.Wizard;

public class App {
    public static void main(String[] args) {
        System.out.println();

        Item weapon1 = new Weapon("Wand", 1, WeaponType.WANDS, 10);
        Item weapon2 = new Weapon("Bows", 1, WeaponType.BOWS, 20);

        Item armor1 = new Armor("Cloth", 2, ArmorType.CLOTH, new HeroAttribute(10, 10, 10));
        Item armor2 = new Armor("Mail", 1, ArmorType.MAIL, new HeroAttribute(20, 20, 20));

        Equipment equipments = new Equipment();
        equipments.equipItem(weapon1);
        equipments.equipItem(weapon2);
        equipments.equipItem(armor1);
        equipments.equipItem(armor2);

        System.out.println(equipments.getEquippedItem());

        Hero wizard = new Wizard("Wizard");
        wizard.display();
        wizard.levelUp();

        System.out.println(wizard.display());
        System.out.println();

    }
}
