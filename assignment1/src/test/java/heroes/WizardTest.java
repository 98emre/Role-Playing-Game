package heroes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.customExceptions.InvalidArmorException;
import app.customExceptions.InvalidWeaponException;
import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;
import app.heroes.classes.Wizard;
import app.items.Armor;
import app.items.Weapon;
import app.types.ArmorType;
import app.types.Slot;
import app.types.WeaponType;

public class WizardTest {

    @Test
    public void test_Wizard_Creation_Check_Strength_Attribute() {
        Hero wizard = new Wizard("Emre Wizard");
        HeroAttribute expectedAttributes = new HeroAttribute(1, 1, 8);
        HeroAttribute actualAttributes = wizard.totalAttributes();

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
    }

    @Test
    public void test_Wizard_Creation_Check_Dexterity_Attribute() {
        Hero wizard = new Wizard("Emre Wizard");
        HeroAttribute expectedAttributes = new HeroAttribute(1, 1, 8);
        HeroAttribute actualAttributes = wizard.totalAttributes();

        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
    }

    @Test
    public void test_Wizard_Creation_Check_Intelligence_Attribute() {
        Hero wizard = new Wizard("Emre Wizard");
        HeroAttribute expectedAttributes = new HeroAttribute(1, 1, 8);
        HeroAttribute actualAttributes = wizard.totalAttributes();

        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

    @Test
    public void test_Wizard_Get_Name() {
        Hero wizard = new Wizard("Emre Wizard");
        assertEquals("Emre Wizard", wizard.getName());
    }

    @Test
    public void test_Wizard_Get_Correct_Damage_In_Creation() {
        Hero wizard = new Wizard("Emre Wizard");

        double expectedDamage = 1 * (1 + 8 / 100.0);
        double actualDamage = wizard.calculateDamage();

        assertTrue(expectedDamage == actualDamage);
    }

    @Test
    public void test_Wizard_Increase_Level_Up() {
        Hero wizard = new Wizard("Emre Wizard");
        wizard.levelUp();

        int expectedLevel = 2;
        int currentLevel = wizard.getLevel();

        assertEquals(expectedLevel, currentLevel);
    }

    @Test
    public void test_Wizard_Increase_Level_Up_With_Correct_Strength_Attribute() {
        Hero wizard = new Wizard("Emre Wizard");
        HeroAttribute expectedAttribute = new HeroAttribute(2, 2, 13);

        wizard.levelUp();
        HeroAttribute getHeroAttribute = wizard.totalAttributes();

        assertEquals(expectedAttribute.getStrength(), getHeroAttribute.getStrength());
    }

    @Test
    public void test_Wizard_Increase_Level_Up_With_Correct_Dexterity_Attribute() {
        Hero wizard = new Wizard("Emre Wizard");
        HeroAttribute expectedAttribute = new HeroAttribute(2, 2, 13);

        wizard.levelUp();
        HeroAttribute getHeroAttribute = wizard.totalAttributes();

        assertEquals(expectedAttribute.getDexterity(), getHeroAttribute.getDexterity());
    }

    @Test
    public void test_Wizard_Increase_Level_Up_With_Correct_Intelligence_Attribute() {
        Hero wizard = new Wizard("Emre Wizard");
        HeroAttribute expectedAttribute = new HeroAttribute(2, 2, 13);

        wizard.levelUp();
        HeroAttribute getHeroAttribute = wizard.totalAttributes();

        assertEquals(expectedAttribute.getIntelligence(), getHeroAttribute.getIntelligence());
    }

    @Test
    public void test_Wizard_Level_Up_Increase_Damage() {
        Hero wizard = new Wizard("Emre Wizard");
        double originalDamage = wizard.calculateDamage();

        wizard.levelUp();

        double newDamage = wizard.calculateDamage();

        assertTrue(newDamage > originalDamage);

    }

    @Test
    public void test_Wizard_Armor_Increase_Damage() {
        Hero wizard = new Wizard("Emre Wizard");
        Armor armor = new Armor("Common", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 1, 10));
        double originalDamage = wizard.calculateDamage();

        wizard.equip(armor);
        double newDamage = (double) wizard.calculateDamage();

        assertTrue(newDamage > originalDamage);

    }

    @Test
    public void test_Wizard_Weapon_Increase_Damage() {
        Hero wizard = new Wizard("Emre Wizard");
        Weapon weapon = new Weapon("Common fire wand", 1, WeaponType.WANDS, 10);
        double originalDamage = wizard.calculateDamage();

        wizard.equip(weapon);
        double newDamage = (double) wizard.calculateDamage();

        assertTrue(newDamage > originalDamage);

    }

    @Test
    public void test_Wizard_Weapon_And_Armor_Increase_Damage() {
        Hero wizard = new Wizard("Emre Wizard");
        Weapon weapon = new Weapon("Common fire wand", 1, WeaponType.WANDS, 10);
        Armor armor = new Armor("Common", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 1, 10));

        wizard.equip(weapon);
        wizard.equip(armor);

        double damage = wizard.calculateDamage();

        assertTrue(11.8 == damage);

    }

    @Test
    public void test_Wizard_Weapon_And_Armor_And_Level_Increase_Damage() {
        Hero wizard = new Wizard("Emre Wizard");
        Weapon weapon = new Weapon("Common fire wand", 1, WeaponType.WANDS, 10);
        Armor armor = new Armor("Common", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 1, 10));

        wizard.equip(weapon);
        wizard.levelUp();
        wizard.equip(armor);

        double damage = wizard.calculateDamage();

        assertTrue(12.3 == damage);

    }

    @Test
    public void test_Wizard_Valid_Equip_Armor() {
        Hero wizard = new Wizard("Emre Wizard");
        Armor armor = new Armor("Common", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 1, 10));

        wizard.equip(armor);

        assertTrue(wizard.isEquipped(armor));

    }

    @Test
    public void test_Wizard_Valid_Equip_Weapon() {
        Hero wizard = new Wizard("Emre Wizard");
        Weapon weapon = new Weapon("Common Staff", 1, WeaponType.STAFFS, 10);

        wizard.equip(weapon);

        assertTrue(wizard.isEquipped(weapon));

    }

    @Test(expected = InvalidArmorException.class)
    public void test_Wizard_Invalid_Equip_Armor() {
        Hero wizard = new Wizard("Emre Wizard");
        Armor armor = new Armor("Common", 1, ArmorType.LEATHER, Slot.BODY, new HeroAttribute(1, 1, 10));
        wizard.equip(armor);
    }

    @Test(expected = InvalidWeaponException.class)
    public void testWizardInValidEquipWeapon() {
        Hero wizard = new Wizard("Emre Wizard");
        Weapon weapon = new Weapon("Common Staff", 1, WeaponType.DAGGERS, 10);
        wizard.equip(weapon);
    }

    @Test(expected = InvalidArmorException.class)
    public void test_Wizard_Invalid_Level_Equip_Armor() {
        Hero wizard = new Wizard("Emre Wizard");
        Armor armor = new Armor("Common", 2, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 1, 10));
        wizard.equip(armor);
    }

    @Test(expected = InvalidWeaponException.class)
    public void test_Wizard_Invalid_Level_Equip_Weapon() {
        Hero wizard = new Wizard("Emre Wizard");
        Weapon weapon = new Weapon("Common Staff", 2, WeaponType.STAFFS, 10);
        wizard.equip(weapon);
    }

    @Test
    public void test_Wizard_Replace_Valid_Equip_Armor() {
        Hero wizard = new Wizard("Emre Wizard");
        Armor armor = new Armor("Common body armor", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 1, 10));
        wizard.equip(armor);

        Armor replaceArmor = new Armor("Rare body armor", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 1, 20));
        wizard.equip(replaceArmor);

        assertTrue(wizard.isEquipped(replaceArmor));
    }

    @Test
    public void test_Wizard_Replace_Valid_Equip_Weapon() {
        Hero wizard = new Wizard("Emre Wizard");
        Weapon weapon = new Weapon("Common Staff", 1, WeaponType.STAFFS, 10);
        wizard.equip(weapon);

        Weapon replaceWeapon = new Weapon("Rare Wand", 1, WeaponType.WANDS, 20);
        wizard.equip(replaceWeapon);

        assertTrue(wizard.isEquipped(replaceWeapon));
    }

    @Test
    public void test_Wizard_Armor_Increase_Damage_Correctly() {
        Hero wizard = new Wizard("Emre Wizard");
        Armor validArmor = new Armor("Common body", 1, ArmorType.CLOTH, Slot.LEGS, new HeroAttribute(1, 1, 10));
        wizard.equip(validArmor);

        double expectedDamage = 1 * (1 + 18 / 100.d);
        double actualDamage = wizard.calculateDamage();

        assertTrue(expectedDamage == actualDamage);
    }

    @Test
    public void test_Wizard_Weapon_Increase_Damage_Correctly() {
        Hero wizard = new Wizard("Emre Wizard");
        Weapon weapon = new Weapon("Rare wand", 1, WeaponType.WANDS, 10);
        wizard.equip(weapon);

        double expectedDamage = weapon.getWeaponDamage() * (1 + 8 / 100.d);
        double actualDamage = wizard.calculateDamage();

        assertTrue(expectedDamage == actualDamage);
    }

}
