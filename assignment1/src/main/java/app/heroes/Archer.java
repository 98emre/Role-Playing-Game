package app.heroes;

import app.heroAttributes.HeroAttribute;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(1, 7, 1);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.levelAttributes.addAttributes(new HeroAttribute(1, 1, 5));
    }

}
