package heroes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;
import app.heroes.classes.Barbarian;

public class BarbarianTest {

    @Test
    public void testBarbarianCreation() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        HeroAttribute expectedAttributes = new HeroAttribute(5, 2, 1);
        HeroAttribute actualAttributes = barbarian.totalAttributes();

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

    @Test
    public void testBarbarianCorrectDamage() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        double expectedDamage = 1.05;
        double actualDamage = barbarian.calculateDamage();

        assertTrue(expectedDamage == actualDamage);

    }

    @Test
    public void testBarbarianIncreasedLevelCorrectDamage() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        double expectedDamage = 1.08;

        barbarian.levelUp();
        double actualDamage = barbarian.calculateDamage();

        assertTrue(expectedDamage == actualDamage);

    }

    @Test
    public void testBarbarianIncreasedLevelCorrectAttributes() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        barbarian.levelUp();

        HeroAttribute actualAttributes = barbarian.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(8, 4, 2);

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

}
