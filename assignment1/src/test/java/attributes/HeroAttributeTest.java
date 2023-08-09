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
        int exceptedStrength = 1;

        assertTrue(exceptedStrength == heroAttribute.getStrength());
    }

    @Test
    public void hero_Attribute_Constructor_Correct_Dexterity() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        int exceptedDexterity = 12;

        assertTrue(exceptedDexterity == heroAttribute.getDexterity());
    }

    @Test
    public void hero_Attribute_Constructor_Correct_Intelligence() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        int exceptedIntelligence = 5;

        assertTrue(exceptedIntelligence == heroAttribute.getIntelligence());
    }

    @Test
    public void hero_Attribute_Increase_Correct_Strength() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        heroAttribute.addAttributes(5, 0, 0);
        int exceptedStrength = 6;

        assertTrue(exceptedStrength == heroAttribute.getStrength());
    }

    @Test
    public void hero_Attribute_Increase_Correct_Dexterity() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        heroAttribute.addAttributes(0, 10, 0);
        int exceptedDexterity = 22;

        assertTrue(exceptedDexterity == heroAttribute.getDexterity());
    }

    @Test
    public void hero_Attribute_Correct_Increase_Intelligence() {
        HeroAttribute heroAttribute = new HeroAttribute(1, 12, 5);
        heroAttribute.addAttributes(0, 0, 10);
        int exceptedIntelligence = 15;

        assertTrue(exceptedIntelligence == heroAttribute.getIntelligence());
    }

}
