package app.heroes;

import java.util.ArrayList;

import app.heroAttributes.HeroAttribute;

public class Wizard extends Hero {

    public Wizard(String name) {
        super(name);
        this.level = 1;
        this.levelAttributes = new HeroAttribute(1, 1, 8);
    }

    @Override
    public void levelUp() {
        this.level += 1;
        this.levelAttributes.increaseAttributes(1, 1, 5);
    }

    @Override
    public void equipArmor(String armorType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'equipArmor'");
    }

    @Override
    public void equipWeapon(String weaponType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'equipWeapon'");
    }

    @Override
    public int calculateDamage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateDamage'");
    }

    @Override
    public HeroAttribute calculateTotalAttributes() {
        int totalStrength = this.levelAttributes.getStrength();
        int totalDexterity = this.levelAttributes.getDexterity();
        int totalIntelligence = this.levelAttributes.getIntelligence();

        return new HeroAttribute(totalStrength, totalDexterity, totalIntelligence);
    }

}
