package app.heroes.classes;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;

public class Swashbuckler extends Hero {

    public Swashbuckler(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(2, 6, 1);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.levelAttributes.addAttributes(new HeroAttribute(1, 4, 1));
    }
}
