package app.items;

import app.heroAttributes.HeroAttribute;
import app.types.ArmorType;
import app.types.Slot;

public class Armor extends Item {

    private ArmorType armorType;
    private HeroAttribute armorAttribute;

    public Armor(String name, int requiredLevel, ArmorType armorType, Slot slot, HeroAttribute armorAttribute) {
        super(name, requiredLevel, slot);
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

    @Override
    public String toString() {
        return "Armor [armorType=" + armorType + ", armorAttribute=" + armorAttribute + "]";
    }

}
