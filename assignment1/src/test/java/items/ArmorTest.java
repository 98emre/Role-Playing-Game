package items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.heroAttributes.HeroAttribute;
import app.items.Armor;
import app.items.Item;
import app.types.ArmorType;
import app.types.Slot;

public class ArmorTest {

    @Test
    public void test_Armor_Constructor() {
        Item armor = new Armor("ArmorTest", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 2, 3));
        assertTrue(armor != null);
    }

    @Test
    public void test_Armor_Constructor_Get_Name() {
        Item armor = new Armor("ArmorTest", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 2, 3));
        String exceptedName = "ArmorTest";
        assertEquals(exceptedName, armor.getName());
    }

    @Test
    public void test_Armor_Constructor_Required_Level() {
        Item armor = new Armor("ArmorTest", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 2, 3));
        int exceptedRequiredLevel = 1;
        assertEquals(exceptedRequiredLevel, armor.getRequiredLevel());
    }

    @Test
    public void test_Armor_Constructor_Armor_Type() {
        Item armor = new Armor("ArmorTest", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 2, 3));
        ArmorType expectedArmorType = ArmorType.CLOTH;
        ArmorType actualArmorType = ((Armor) armor).getArmorType();

        assertEquals(expectedArmorType, actualArmorType);
    }

    @Test
    public void test_Armor_Constructor_Slot_Type() {
        Item armor = new Armor("ArmorTest", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 2, 3));
        Slot expectedSlotType = Slot.BODY;
        Slot actualSlotType = armor.getSlot();

        assertEquals(expectedSlotType, actualSlotType);
    }

    @Test
    public void test_Armor_Constructor_Attribute_Strength() {
        Item armor = new Armor("ArmorTest", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 2, 3));
        HeroAttribute expectedAttributes = new HeroAttribute(1, 2, 3);
        HeroAttribute actualAttributes = ((Armor) armor).getArmorAttribute();

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
    }

    @Test
    public void test_Armor_Constructor_Attribute_Dexterity() {
        Item armor = new Armor("ArmorTest", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 2, 3));
        HeroAttribute expectedAttributes = new HeroAttribute(1, 2, 3);
        HeroAttribute actualAttributes = ((Armor) armor).getArmorAttribute();

        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
    }

    @Test
    public void test_Armor_Constructor_Attribute_Intelligence() {
        Item armor = new Armor("ArmorTest", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 2, 3));
        HeroAttribute expectedAttributes = new HeroAttribute(1, 2, 3);
        HeroAttribute actualAttributes = ((Armor) armor).getArmorAttribute();

        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

}
