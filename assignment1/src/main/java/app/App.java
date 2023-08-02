package app;

import app.heroes.Hero;
import app.heroes.Wizard;

public class App {
    public static void main(String[] args) {

        Hero wizard = new Wizard("Wizard");
        wizard.display();

        System.out.println();
    }
}
