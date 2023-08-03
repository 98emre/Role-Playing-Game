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
        this.validWeaponTypes = Arrays.asList(WeaponType.STAFFS, WeaponType.WANDS);
        this.validArmorTypes = Arrays.asList(ArmorType.CLOTH);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.levelAttributes.addAttributes(new HeroAttribute(1, 1, 5));
    }
}
