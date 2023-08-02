package app.Items;

import app.heroes.Hero;

public abstract class Item {

    protected String name;
    protected int requiredLevel;
    protected Slot slot;

    public Item(String name, int requiredLevel, Slot slot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

    public abstract void checkHeroCanEquip(Hero hero);

}
