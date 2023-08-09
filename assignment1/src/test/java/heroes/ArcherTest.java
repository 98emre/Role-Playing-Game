package heroes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;
import app.heroes.classes.Archer;

public class ArcherTest {

    @Test
    public void testArcherCreation() {
        Hero archer = new Archer("Emre Archer");
        HeroAttribute expectedAttributes = new HeroAttribute(1, 7, 1);
        HeroAttribute actualAttributes = archer.totalAttributes();

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

    @Test
    public void testArcherCorrectDamage() {
        Hero archer = new Archer("Emre Archer");
        double expectedDamage = 1.07;
        double actualDamage = archer.calculateDamage();

        assertTrue(expectedDamage == actualDamage);

    }

    @Test
    public void testArcherIncreasedLevelCorrectDamage() {
        Hero archer = new Archer("Emre Archer");
        double expectedDamage = 1.12;

        archer.levelUp();
        double actualDamage = archer.calculateDamage();

        assertTrue(expectedDamage == actualDamage);

    }

    @Test
    public void testArcherIncreasedLevelCorrectAttributesForStrength() {
        Hero archer = new Archer("Emre Archer");
        archer.levelUp();

        HeroAttribute actualAttributes = archer.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(2, 12, 2);

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
    }

    @Test
    public void testArcherIncreasedLevelCorrectAttributesForDexterity() {
        Hero archer = new Archer("Emre Archer");
        archer.levelUp();

        HeroAttribute actualAttributes = archer.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(2, 12, 2);

        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
    }

    @Test
    public void testArcherIncreasedLevelCorrectAttributesForIntelligence() {
        Hero archer = new Archer("Emre Archer");
        archer.levelUp();

        HeroAttribute actualAttributes = archer.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(2, 12, 2);

        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }
}
