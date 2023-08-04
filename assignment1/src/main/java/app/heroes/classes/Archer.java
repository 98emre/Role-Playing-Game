package app.heroes.classes;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(1, 7, 1);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.levelAttributes.addAttributes(new HeroAttribute(1, 5, 1));
    }

    @Override
    protected int getDamageAttribute(HeroAttribute totalAttributes) {
        return totalAttributes.getDexterity();
    }

}
