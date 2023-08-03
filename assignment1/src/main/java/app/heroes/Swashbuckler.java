package app.heroes;

import app.heroAttributes.HeroAttribute;

public class Swashbuckler extends Hero {

    public Swashbuckler(String name) {
        super(name);
        this.levelAttributes = new HeroAttribute(2, 6, 1);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.levelAttributes.addAttributes(new HeroAttribute(1, 1, 5));
    }
}
