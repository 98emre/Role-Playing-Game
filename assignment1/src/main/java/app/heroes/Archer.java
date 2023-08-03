package app.heroes;

import app.equipment.Armor;
import app.equipment.Weapon;
import app.heroAttributes.HeroAttribute;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
        this.level = 1;
        this.levelAttributes = new HeroAttribute(1, 7, 1);
    }

    @Override
    public void levelUp() {
        this.level += 1;
        this.levelAttributes.addAttributes(new HeroAttribute(1, 5, 1));
    }

    @Override
    public int calculateDamage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateDamage'");
    }

    @Override
    public HeroAttribute calculateTotalAttributes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateTotalAttributes'");
    }

    @Override
    public void equipArmor(Armor armor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'equipArmor'");
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'equipWeapon'");
    }

}
