package app.heroes;

import java.util.ArrayList;

import app.heroAttributes.HeroAttributes;

public class Wizard extends Hero {

    public Wizard(String name) {
        super(name);
        this.validArmorTypes = new ArrayList<>();
        this.validWeaponTypes = new ArrayList<>();

        this.levelAttributes = new HeroAttributes(1, 1, 8);
    }

    @Override
    public void levelUp() {
        this.level += 1;
        this.levelAttributes.increaseAttributes(1, 1, 5);
    }

    @Override
    public void damage(int damage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'damage'");
    }

}
