package app;

import app.heroes.Archer;
import app.heroes.Barbarian;
import app.heroes.Hero;
import app.heroes.Swashbuckler;
import app.heroes.Wizard;

public class App {
    public static void main(String[] args) {
        System.out.println();

        Hero wizard = new Wizard("Wizard");
        wizard.display();
        wizard.levelUp();
        System.out.println(wizard.display());
        System.out.println("Ksss: " + wizard.calculateTotalAttributes());
        System.out.println();

        Hero archer = new Archer("Archer");
        archer.levelUp();
        archer.levelUp();
        archer.levelUp();
        System.out.println(archer.display());
        System.out.println();

        Hero barbarian = new Barbarian("Barbarian");
        barbarian.levelUp();
        System.out.println(barbarian.display());
        System.out.println();

        Hero swashbuckler = new Swashbuckler("Swashbuckler");
        swashbuckler.levelUp();
        System.out.println(swashbuckler.display());
        System.out.println();

    }
}
