package items;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import app.items.Item;
import app.items.Weapon;
import app.types.Slot;
import app.types.WeaponType;

public class WeaponTest {

    @Test
    public void testArmorConstructor() {
        Item weapon = new Weapon("TestWeapon", 21, WeaponType.STAFFS, 10);

        String exceptedName = "TestWeapon";
        int exceptedRequiredLevel = 21;
        WeaponType exceptedWeaponType = WeaponType.STAFFS;
        Slot exceptedSlotType = Slot.WEAPON;
        int exceptedDamage = 10;

        assertEquals(exceptedName, weapon.getName());
        assertEquals(exceptedRequiredLevel, weapon.getRequiredLevel());
        assertEquals(exceptedWeaponType, ((Weapon) weapon).getWeaponType());
        assertEquals(exceptedSlotType, weapon.getSlot());
        assertEquals(exceptedDamage, ((Weapon) weapon).getWeaponDamage());

    }

}
