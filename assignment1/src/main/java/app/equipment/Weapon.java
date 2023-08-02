package app.equipment;

import app.Items.Item;
import app.Items.Slot;
import app.Items.WeaponType;
import app.heroes.Hero;

public class Weapon extends Item {

    private WeaponType weaponType;
    private int weaponDamage;

    public Weapon(String name, int requiredLevel, WeaponType weaponType, int weaponDamage) {
        super(name, requiredLevel, Slot.WEAPON);
        this.weaponType = weaponType;
        this.weaponDamage = weaponDamage;
    }

    @Override
    public void checkHeroCanEquip(Hero hero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkHeroCanEquip'");
    }

}
