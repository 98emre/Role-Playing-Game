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
import app.items.Item;
import app.items.Weapon;
import app.types.ArmorType;
import app.types.Slot;
import app.types.WeaponType;

public class WizardTest {

    @Test
    public void testWizardCreation() {
        Hero wizard = new Wizard("Emre Wizard");
        HeroAttribute expectedAttributes = new HeroAttribute(1, 1, 8);
        HeroAttribute actualAttributes = wizard.totalAttributes();

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

    @Test
    public void testWizardIncreaseLevelUp() {
        Hero wizard = new Wizard("Emre Wizard");
        wizard.levelUp();

        int expectedLevel = 2;
        int currentLevel = wizard.getLevel();

        assertEquals(expectedLevel, currentLevel);
    }

    @Test
    public void testWizardLevelUpIncreaseDamage() {
        Hero wizard = new Wizard("Emre Wizard");
        double originalDamage = wizard.calculateDamage();

        wizard.levelUp();

        double newDamage = wizard.calculateDamage();

        assertTrue(newDamage > originalDamage);

    }

    @Test
    public void testWizardArmorIncreaseDamage() {
        Hero wizard = new Wizard("Emre Wizard");
        Armor armor = new Armor("Common", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 1, 10));
        double originalDamage = wizard.calculateDamage();

        wizard.equip(armor);
        double newDamage = (double) wizard.calculateDamage();

        assertTrue(newDamage > originalDamage);

    }

    @Test
    public void testWizardWeaponIncreaseDamage() {
        Hero wizard = new Wizard("Emre Wizard");
        Weapon weapon = new Weapon("Common fire wand", 1, WeaponType.WANDS, 10);
        double originalDamage = wizard.calculateDamage();

        wizard.equip(weapon);
        double newDamage = (double) wizard.calculateDamage();

        assertTrue(newDamage > originalDamage);

    }

    @Test
    public void testWizardWeaponAndArmorIncreaseDamage() {
        Hero wizard = new Wizard("Emre Wizard");
        Weapon weapon = new Weapon("Common fire wand", 1, WeaponType.WANDS, 10);
        Armor armor = new Armor("Common", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 1, 10));

        wizard.equip(weapon);
        wizard.equip(armor);

        double damage = wizard.calculateDamage();

        assertTrue(11.8 == damage);

    }

    @Test
    public void testWizardWeaponAndArmorAndLevelIncreaseDamage() {
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
    public void testWizardValidEquipArmor() {
        Hero wizard = new Wizard("Emre Wizard");
        Armor armor = new Armor("Common", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 1, 10));

        wizard.equip(armor);

        assertTrue(wizard.isEquipped(armor));

    }

    @Test
    public void testWizardValidEquipWeapon() {
        Hero wizard = new Wizard("Emre Wizard");
        Weapon weapon = new Weapon("Common Staff", 1, WeaponType.STAFFS, 10);

        wizard.equip(weapon);

        assertTrue(wizard.isEquipped(weapon));

    }

    @Test(expected = InvalidArmorException.class)
    public void testWizardInValidEquipArmor() {
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

}
