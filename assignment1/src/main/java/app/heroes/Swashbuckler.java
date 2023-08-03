package app.heroes;

import app.heroAttributes.HeroAttribute;
import app.items.Armor;
import app.items.Weapon;

public class Swashbuckler extends Hero {

    public Swashbuckler(String name) {
        super(name);
        this.level = 1;
        this.levelAttributes = new HeroAttribute(2, 6, 1);
    }

    @Override
    public void levelUp() {
        this.level += 1;
        this.levelAttributes.addAttributes(new HeroAttribute(1, 4, 1));
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
