package attributes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.heroAttributes.HeroAttribute;

public class HeroAttributeTest {

    @Test
    public void heroAttributeCreation() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        assertTrue(heroAttribute != null);
    }

    @Test
    public void heroAttributeConstructorCorrectStrength() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        assertTrue(1 == heroAttribute.getStrength());
    }

    @Test
    public void heroAttributeConstructorCorrectDexterity() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        assertTrue(12 == heroAttribute.getDexterity());
    }

    @Test
    public void heroAttributeConstructorCorrectIntelligence() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        assertTrue(5 == heroAttribute.getIntelligence());
    }

    @Test
    public void heroAttributeIncreaseCorrectStrength() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        heroAttribute.addAttributes(5, 0, 0);

        assertTrue(6 == heroAttribute.getStrength());
    }

    @Test
    public void heroAttributeIncreaseCorrectDexterity() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        heroAttribute.addAttributes(0, 10, 0);

        assertTrue(22 == heroAttribute.getDexterity());
    }

    @Test
    public void heroAttributeCorrectIncreaseIntelligence() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        heroAttribute.addAttributes(0, 0, 10);

        assertTrue(15 == heroAttribute.getIntelligence());
    }

}
