package items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.items.Item;
import app.items.Weapon;
import app.types.Slot;
import app.types.WeaponType;

public class WeaponTest {

    @Test
    public void test_Weapon_Constructor() {
        Item weapon = new Weapon("TestWeapon", 21, WeaponType.STAFFS, 10);
        assertTrue(weapon != null);
    }

    @Test
    public void test_Weapon_Constructor_Get_Name() {
        Item weapon = new Weapon("TestWeapon", 21, WeaponType.STAFFS, 10);
        String exceptedName = "TestWeapon";

        assertEquals(exceptedName, weapon.getName());
    }

    @Test
    public void test_Weapon_Constructor_Required_Level() {
        Item weapon = new Weapon("TestWeapon", 21, WeaponType.STAFFS, 10);
        int exceptedRequiredLevel = 21;

        assertEquals(exceptedRequiredLevel, weapon.getRequiredLevel());
    }

    @Test
    public void test_Weapon_Constructor_Weapon_Type() {
        Item weapon = new Weapon("TestWeapon", 21, WeaponType.STAFFS, 10);
        WeaponType exceptedWeaponType = WeaponType.STAFFS;

        assertEquals(exceptedWeaponType, ((Weapon) weapon).getWeaponType());
    }

    @Test
    public void test_Weapon_Constructor_Slot_Type() {
        Item weapon = new Weapon("TestWeapon", 21, WeaponType.STAFFS, 10);
        Slot exceptedSlotType = Slot.WEAPON;
        assertEquals(exceptedSlotType, weapon.getSlot());
    }

    @Test
    public void test_Weapon_Constructor_Weapon_Damage() {
        Item weapon = new Weapon("TestWeapon", 21, WeaponType.STAFFS, 10);
        int exceptedDamage = 10;
        assertEquals(exceptedDamage, ((Weapon) weapon).getWeaponDamage());
    }

}
