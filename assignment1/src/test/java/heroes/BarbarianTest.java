package heroes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;
import app.heroes.classes.Barbarian;

public class BarbarianTest {

    @Test
    public void testBarbarianCreationCheckStrengthAttribute() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        HeroAttribute expectedAttributes = new HeroAttribute(5, 2, 1);
        HeroAttribute actualAttributes = barbarian.totalAttributes();

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
    }

    @Test
    public void testBarbarianCreationCheckDexterityAttribute() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        HeroAttribute expectedAttributes = new HeroAttribute(5, 2, 1);
        HeroAttribute actualAttributes = barbarian.totalAttributes();

        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
    }

    @Test
    public void testBarbarianCreationCheckIntelligenceAttribute() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        HeroAttribute expectedAttributes = new HeroAttribute(5, 2, 1);
        HeroAttribute actualAttributes = barbarian.totalAttributes();

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
    public void testBarbarianIncreasedLevelStrengthCorrectAttribute() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        barbarian.levelUp();

        HeroAttribute actualAttributes = barbarian.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(8, 4, 2);

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
    }

    @Test
    public void testBarbarianIncreasedLevelDexterityCorrectAttribute() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        barbarian.levelUp();

        HeroAttribute actualAttributes = barbarian.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(8, 4, 2);

        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
    }

    @Test
    public void testBarbarianIncreasedLevelIntelligenceCorrectAttribute() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        barbarian.levelUp();

        HeroAttribute actualAttributes = barbarian.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(8, 4, 2);

        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

}
