package app.heroes;

import app.heroAttributes.HeroAttribute;

public class Barbarian extends Hero {

    public Barbarian(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(5, 2, 1);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.levelAttributes.addAttributes(new HeroAttribute(1, 1, 5));
    }
}
