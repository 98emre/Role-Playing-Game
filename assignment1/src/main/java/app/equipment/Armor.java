package app.equipment;

import app.Items.ArmorType;
import app.Items.Item;
import app.Items.Slot;
import app.heroAttributes.HeroAttribute;

public class Armor extends Item {

    private ArmorType armorType;
    private HeroAttribute armorAttribute;

    public Armor(String name, int requiredLevel, ArmorType armorType, HeroAttribute armorAttribute) {
        super(name, requiredLevel, getArmorSlot(armorType));
        this.armorType = armorType;
        this.armorAttribute = armorAttribute;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }

    public HeroAttribute getArmorAttribute() {
        return armorAttribute;
    }

    public void setArmorAttribute(HeroAttribute armorAttribute) {
        this.armorAttribute = armorAttribute;
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
