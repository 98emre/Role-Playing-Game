package app.heroAttributes;

public class HeroAttribute {
    private int strength;
    private int dexterity;
    private int intelligence;

    public HeroAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public HeroAttribute addAttributes(HeroAttribute otherAttribute) {
        return new HeroAttribute(
                this.strength + otherAttribute.strength,
                this.dexterity + otherAttribute.dexterity,
                this.intelligence + otherAttribute.intelligence);
    }

    public void increaseAttributes(int strength, int dexterity, int intelligence) {
        this.strength += strength;
        this.dexterity += dexterity;
        this.intelligence += intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "HeroAttributes [strength=" + strength + ", dexterity=" + dexterity + ", intelligence=" + intelligence
                + "]";
    }
}
