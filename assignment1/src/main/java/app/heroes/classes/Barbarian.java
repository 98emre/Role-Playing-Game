package app.heroes.classes;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;

public class Barbarian extends Hero {

    public Barbarian(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(5, 2, 1);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.levelAttributes.addAttributes(new HeroAttribute(3, 2, 1));
    }
}
