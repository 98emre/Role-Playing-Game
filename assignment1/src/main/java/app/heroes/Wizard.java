package app.heroes;

import java.util.ArrayList;
import java.util.Arrays;

import app.Items.ArmorType;
import app.Items.WeaponType;
import app.equipment.Armor;
import app.equipment.Equipment;
import app.equipment.Weapon;
import app.heroAttributes.HeroAttribute;

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
    public void equipArmor(String armor) {
        System.out.println(armor);
    }

    @Override
    public void equipWeapon(String weapon) {
        System.out.println(weapon);
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

}
