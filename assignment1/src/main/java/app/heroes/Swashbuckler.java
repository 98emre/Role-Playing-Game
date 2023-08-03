package app.heroes;

import java.util.ArrayList;

import app.heroAttributes.HeroAttribute;

public class Swashbuckler extends Hero {

    public Swashbuckler(String name) {
        super(name);

        this.level = 1;
        this.validArmorTypes = new ArrayList<>();
        this.validWeaponTypes = new ArrayList<>();

        this.levelAttributes = new HeroAttribute(2, 6, 1);
    }

    @Override
    public void levelUp() {
        this.level += 1;
        this.levelAttributes.increaseAttributes(1, 4, 1);
    }

    @Override
    public void damage(int damage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'damage'");
    }

}
