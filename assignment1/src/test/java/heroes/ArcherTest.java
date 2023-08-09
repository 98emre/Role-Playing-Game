package heroes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;
import app.heroes.classes.Archer;

public class ArcherTest {

    @Test
    public void test_Archer_Creation_Check_Strength_Attribute() {
        Hero archer = new Archer("Emre Archer");
        HeroAttribute expectedAttributes = new HeroAttribute(1, 7, 1);
        HeroAttribute actualAttributes = archer.totalAttributes();

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
    }

    @Test
    public void test_Archer_Creation_Check_Attribute_Dexterity() {
        Hero archer = new Archer("Emre Archer");
        HeroAttribute expectedAttributes = new HeroAttribute(1, 7, 1);
        HeroAttribute actualAttributes = archer.totalAttributes();

        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
    }

    @Test
    public void test_Archer_Creation_Check_Attribute_Intelligence() {
        Hero archer = new Archer("Emre Archer");
        HeroAttribute expectedAttributes = new HeroAttribute(1, 7, 1);
        HeroAttribute actualAttributes = archer.totalAttributes();

        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }

    @Test
    public void test_Archer_Correct_Damage() {
        Hero archer = new Archer("Emre Archer");
        double expectedDamage = 1.07;
        double actualDamage = archer.calculateDamage();

        assertTrue(expectedDamage == actualDamage);

    }

    @Test
    public void test_Archer_Increased_Level_Up_Correct_With_Damage() {
        Hero archer = new Archer("Emre Archer");
        double expectedDamage = 1.12;

        archer.levelUp();
        double actualDamage = archer.calculateDamage();

        assertTrue(expectedDamage == actualDamage);

    }

    @Test
    public void test_Archer_Increased_Level_Up_Correct_Attribute_For_Strength() {
        Hero archer = new Archer("Emre Archer");
        archer.levelUp();

        HeroAttribute actualAttributes = archer.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(2, 12, 2);

        assertEquals(expectedAttributes.getStrength(), actualAttributes.getStrength());
    }

    @Test
    public void test_Archer_Increased_Level_Up_Correct_Attribute_For_Dexterity() {
        Hero archer = new Archer("Emre Archer");
        archer.levelUp();

        HeroAttribute actualAttributes = archer.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(2, 12, 2);

        assertEquals(expectedAttributes.getDexterity(), actualAttributes.getDexterity());
    }

    @Test
    public void test_Archer_Increased_Level_Up_Correct_Attribute_For_Intelligence() {
        Hero archer = new Archer("Emre Archer");
        archer.levelUp();

        HeroAttribute actualAttributes = archer.totalAttributes();
        HeroAttribute expectedAttributes = new HeroAttribute(2, 12, 2);

        assertEquals(expectedAttributes.getIntelligence(), actualAttributes.getIntelligence());
    }
}
