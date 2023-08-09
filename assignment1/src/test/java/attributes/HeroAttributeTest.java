package attributes;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import app.heroAttributes.HeroAttribute;

public class HeroAttributeTest {

    @Test
    public void hero_Attribute_Creation() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        assertTrue(heroAttribute != null);
    }

    @Test
    public void hero_Attribute_Constructor_Correct_Strength() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        assertTrue(1 == heroAttribute.getStrength());
    }

    @Test
    public void hero_Attribute_Constructor_Correct_Dexterity() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        assertTrue(12 == heroAttribute.getDexterity());
    }

    @Test
    public void hero_Attribute_Constructor_Correct_Intelligence() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        assertTrue(5 == heroAttribute.getIntelligence());
    }

    @Test
    public void hero_Attribute_Increase_Correct_Strength() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        heroAttribute.addAttributes(5, 0, 0);
        assertTrue(6 == heroAttribute.getStrength());
    }

    @Test
    public void hero_Attribute_Increase_Correct_Dexterity() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        heroAttribute.addAttributes(0, 10, 0);
        assertTrue(22 == heroAttribute.getDexterity());
    }

    @Test
    public void hero_Attribute_Correct_Increase_Intelligence() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        heroAttribute.addAttributes(0, 0, 10);
        assertTrue(15 == heroAttribute.getIntelligence());
    }

}
