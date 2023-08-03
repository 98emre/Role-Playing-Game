package app.heroes;

import java.util.ArrayList;
import java.util.Arrays;

import app.heroAttributes.HeroAttribute;
import app.items.Armor;
import app.items.Equipment;
import app.items.Weapon;
import app.types.ArmorType;
import app.types.WeaponType;

public class Wizard extends Hero {

    public Wizard(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(1, 1, 8);
        this.validWeaponTypes.addAll(Arrays.asList(WeaponType.STAFFS, WeaponType.WANDS));
        this.validArmorTypes.addAll(Arrays.asList(ArmorType.CLOTH));
    }

    @Override
    public void levelUp() {
        this.level += 1;
        this.levelAttributes.addAttributes(new HeroAttribute(1, 1, 5));
    }

    @Override
    public int calculateDamage() {
        return 0;
    }

    @Override
    public HeroAttribute calculateTotalAttributes() {
        int totalStrength = this.levelAttributes.getStrength();
        int totalDexterity = this.levelAttributes.getDexterity();
        int totalIntelligence = this.levelAttributes.getIntelligence();

        return new HeroAttribute(totalStrength, totalDexterity, totalIntelligence);
    }

    @Override
    public void equipArmor(Armor armor) {
        if (validArmorTypes.contains(armor.getArmorType())) {
            equipment.equipItem(armor);
            return;
        }

        System.out.println("Error armor");
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        if (validWeaponTypes.contains(weapon.getWeaponType())) {
            System.out.println("Add weapon");
            return;
        }

        System.out.println("Error weapon");
    }

}
