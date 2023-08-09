package heroes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;
import app.heroes.classes.Barbarian;

public class BarbarianTest {

    @Test
    public void test_Barbarian_Creation_Check_Strength_Attribute() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        HeroAttribute expectedAttributes = new HeroAttribute(5, 2, 1);
        HeroAttribute actualAttributes = barbarian.totalAttributes();

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
    }

    @Test
    public void test_Barbarian_Creation_Check_Dexterity_Attribute() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        HeroAttribute expectedAttributes = new HeroAttribute(5, 2, 1);
        HeroAttribute actualAttributes = barbarian.totalAttributes();

        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
    }

    @Test
    public void test_Barbarian_Creation_Check_Intelligence_Attribute() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        HeroAttribute expectedAttributes = new HeroAttribute(5, 2, 1);
        HeroAttribute actualAttributes = barbarian.totalAttributes();

        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

    @Test
    public void test_Barbarian_Correct_Damage() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        double expectedDamage = 1.05;
        double actualDamage = barbarian.calculateDamage();

        assertTrue(expectedDamage == actualDamage);

    }

    @Test
    public void test_Barbarian_Increased_Level_Up_CorrectDamage() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        double expectedDamage = 1.08;

        barbarian.levelUp();
        double actualDamage = barbarian.calculateDamage();

        assertTrue(expectedDamage == actualDamage);

    }

    @Test
    public void test_Barbarian_Increased_Level_Up_Correct_Attribute_For_Strength() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        barbarian.levelUp();

        HeroAttribute actualAttributes = barbarian.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(8, 4, 2);

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
    }

    @Test
    public void test_Barbarian_Increased_Level_Up_Correct_Attribute_For_Dexterity() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        barbarian.levelUp();

        HeroAttribute actualAttributes = barbarian.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(8, 4, 2);

        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
    }

    @Test
    public void test_Barbarian_Increased_Level_Up_Correct_Attribute_For_Intelligence() {
        Hero barbarian = new Barbarian("Emre Barbarian");
        barbarian.levelUp();

        HeroAttribute actualAttributes = barbarian.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(8, 4, 2);

        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

}
