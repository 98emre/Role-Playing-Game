package app;

import app.heroes.Archer;
import app.heroes.Barbarian;
import app.heroes.Hero;
import app.heroes.Wizard;

public class App {
    public static void main(String[] args) {

        Hero wizard = new Wizard("Wizard");
        wizard.display();
        wizard.levelUp();
        System.out.println();

        Hero archer = new Archer("Archer");
        archer.levelUp();
        archer.levelUp();
        archer.levelUp();
        archer.display();
        System.out.println();

        Hero barbarian = new Barbarian("Barbarian");
        barbarian.levelUp();
        barbarian.display();
        System.out.println();
    }
}
