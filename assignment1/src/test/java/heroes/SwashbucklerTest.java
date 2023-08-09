package heroes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;
import app.heroes.classes.Swashbuckler;

public class SwashbucklerTest {

    @Test
    public void test_Swashbuckler_Creation_Check_Strength_Attribute() {
        Hero swashbuckler = new Swashbuckler("Emre Swashbuckler");
        HeroAttribute expectedAttributes = new HeroAttribute(2, 6, 1);
        HeroAttribute actualAttributes = swashbuckler.totalAttributes();

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
    }

    @Test
    public void test_Swashbuckler_Creation_Check_DexterityAttribute() {
        Hero swashbuckler = new Swashbuckler("Emre Swashbuckler");
        HeroAttribute expectedAttributes = new HeroAttribute(2, 6, 1);
        HeroAttribute actualAttributes = swashbuckler.totalAttributes();

        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
    }

    @Test
    public void test_Swashbuckler_Creation_Check_Intelligence_Attribute() {
        Hero swashbuckler = new Swashbuckler("Emre Swashbuckler");
        HeroAttribute expectedAttributes = new HeroAttribute(2, 6, 1);
        HeroAttribute actualAttributes = swashbuckler.totalAttributes();

        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

    @Test
    public void test_Swashbuckler_Correct_Damage() {
        Hero swashbuckler = new Swashbuckler("Emre Swashbuckler");
        double expectedDamage = 1.06;
        double actualDamage = swashbuckler.calculateDamage();

        assertTrue(expectedDamage == actualDamage);

    }

    @Test
    public void test_Swashbuckler_Increased_Level_Correct_Damage() {
        Hero swashbuckler = new Swashbuckler("Emre Swashbuckler");
        double expectedDamage = 1.1;

        swashbuckler.levelUp();
        double actualDamage = swashbuckler.calculateDamage();

        assertTrue(expectedDamage == actualDamage);

    }

    @Test
    public void test_Swashbuckler_Increased_Level_Strength_Correct_Attribute() {
        Hero swashbuckler = new Swashbuckler("Emre Archer");
        swashbuckler.levelUp();

        HeroAttribute actualAttributes = swashbuckler.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(3, 10, 2);

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
    }

    @Test
    public void test_Swashbuckler_Increased_Level_Dexterity_Correct_Attribute() {
        Hero swashbuckler = new Swashbuckler("Emre Archer");
        swashbuckler.levelUp();

        HeroAttribute actualAttributes = swashbuckler.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(3, 10, 2);

        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
    }

    @Test
    public void test_Swashbuckler_Increased_Level_Intelligence_Correct_Attribute() {
        Hero swashbuckler = new Swashbuckler("Emre Archer");
        swashbuckler.levelUp();

        HeroAttribute actualAttributes = swashbuckler.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(3, 10, 2);

        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

}
