package app.heroes;

import java.util.ArrayList;
import java.util.Arrays;

import app.Items.ArmorType;
import app.Items.WeaponType;
import app.equipment.Armor;
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
    public void equipArmor(String armorType) {
        ArmorType type = ArmorType.valueOf(armorType.toUpperCase());
        Armor armor = new Armor(armorType, 1, type, levelAttributes);

        System.out.println(armor);
    }

    @Override
    public void equipWeapon(String weaponType) {
        WeaponType type = WeaponType.valueOf(weaponType.toUpperCase());
        Weapon weapon = new Weapon(weaponType, 1, type, 0);

        System.out.println(weapon);
    }

    @Override
    public int calculateDamage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateDamage'");
    }

    @Override
    public HeroAttribute calculateTotalAttributes() {
        int totalStrength = this.levelAttributes.getStrength();
        int totalDexterity = this.levelAttributes.getDexterity();
        int totalIntelligence = this.levelAttributes.getIntelligence();

        return new HeroAttribute(totalStrength, totalDexterity, totalIntelligence);
    }

}
