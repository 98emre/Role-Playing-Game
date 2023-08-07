package items;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import app.heroAttributes.HeroAttribute;
import app.items.Armor;
import app.items.Item;
import app.types.ArmorType;
import app.types.Slot;

public class ArmorTest {

    @Test
    public void testArmorConstructor() {
        Item armor = new Armor("ArmorTest", 1, ArmorType.CLOTH, Slot.BODY, new HeroAttribute(1, 2, 3));

        String exceptedName = "ArmorTest";
        int exceptedRequiredLevel = 1;
        ArmorType exceptedArmorType = ArmorType.CLOTH;
        Slot exceptedSlotType = Slot.BODY;
        HeroAttribute exceptedAttributes = new HeroAttribute(1, 2, 3);

        assertEquals(exceptedName, armor.getName());
        assertEquals(exceptedRequiredLevel, armor.getRequiredLevel());
        assertEquals(exceptedArmorType, ((Armor) armor).getArmorType());
        assertEquals(exceptedSlotType, armor.getSlot());

        assertEquals(exceptedAttributes.getStrength(), ((Armor) armor).getArmorAttribute().getStrength());
        assertEquals(exceptedAttributes.getDexterity(), ((Armor) armor).getArmorAttribute().getDexterity());
        assertEquals(exceptedAttributes.getIntelligence(), ((Armor) armor).getArmorAttribute().getIntelligence());

    }

}
