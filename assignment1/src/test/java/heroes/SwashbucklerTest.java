package heroes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;
import app.heroes.classes.Swashbuckler;

public class SwashbucklerTest {

    @Test
    public void testSwashbucklerCreation() {
        Hero swashbuckler = new Swashbuckler("Emre Swashbuckler");
        HeroAttribute expectedAttributes = new HeroAttribute(2, 6, 1);
        HeroAttribute actualAttributes = swashbuckler.totalAttributes();

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

    @Test
    public void testSwashbucklerCorrectDamage() {
        Hero swashbuckler = new Swashbuckler("Emre Swashbuckler");
        double expectedDamage = 1.06;
        double actualDamage = swashbuckler.calculateDamage();

        assertTrue(expectedDamage == actualDamage);

    }

    @Test
    public void testSwashbucklerIncreasedLevelCorrectDamage() {
        Hero swashbuckler = new Swashbuckler("Emre Swashbuckler");
        double expectedDamage = 1.1;

        swashbuckler.levelUp();
        double actualDamage = swashbuckler.calculateDamage();

        assertTrue(expectedDamage == actualDamage);

    }

    @Test
    public void testSwashbucklerIncreasedLevelCorrectAttributes() {
        Hero swashbuckler = new Swashbuckler("Emre Archer");
        swashbuckler.levelUp();

        HeroAttribute actualAttributes = swashbuckler.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(3, 10, 2);

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

}
