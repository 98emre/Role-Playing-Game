package app.equipment;

import app.Items.ArmorType;
import app.Items.Item;
import app.Items.Slot;
import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;

public class Armor extends Item {

    private ArmorType armorType;
    private HeroAttribute armorAttribute;

    public Armor(String name, int requiredLevel, ArmorType armorType, HeroAttribute armorAttribute) {
        super(name, requiredLevel, getArmorSlot(armorType));
        this.armorType = armorType;
        this.armorAttribute = armorAttribute;
    }

    @Override
    public void checkHeroCanEquip(Hero hero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkHeroCanEquip'");
    }

    private static Slot getArmorSlot(ArmorType armorType) {
        switch (armorType) {
            case CLOTH:
                return Slot.BODY;
            case LEATHER:
                return Slot.BODY;
            case MAIL:
                return Slot.BODY;
            case PLATE:
                return Slot.BODY;
            default:
                return null;
        }
    }

}
