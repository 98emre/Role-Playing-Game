# Hero Creation

## Descriptions 
This project is part of Noroff Accelerate program. In this project is create a simple role-playing game mechanic to simulate heroes, their abilities, weapons, and armors. There are various hero classes such as Barbarian, Wizard, etc., each with their unique attributes that effect the damage. The heroes can also be equipped with different weapons and armors, where they are uniq for each hero.

You can use the project to create simple hero classes for example for a game where you can add multiple weapons and equipment and adjust in your way.

## Noroff minimum requirements
Use plain Java to create a console application: 
a) Various hero classes having attributes which increase at different rates as the character gains levels.
b) Equipment, such as armor and weapons, that characters can equip. The equipped items will alter the 
power of the hero, causing it to deal more damage and be able to survive longer. Certain heroes can 
equip certain item types.
c) Custom exceptions. There are two custom exceptions you are required to write, as detailed in 
Appendix B.
d) Testing of the main functionality.

## Technologies used
Java and Maven.

## Functions
* Create different hero types.
* Add limited of weapons and equiqment for the heroes.
* Damage depends on hereos attributs and equiqments.
* All test logic handle for one heroe and  the rest were tested for attributes and damage calculation.

## Java Installation Guide

### Step 1: Download Java
First download latest version of Java [Java](https://www.oracle.com/java/) to install.

### Step 2: Verify Installation
Open a new command prompt (or terminal) and type:

```bash
java --version
```
This should display Java's version, indicating a successful installation.

## Maven Installation Guide

### Step 1: Download Maven
First download the latest version of Maven [Maven](https://maven.apache.org/download.cgi).

### Step 2: Installed Maven
Extract the downloaded file to a suitable location on your computer.

### Step 3: Add Maven To Path
To run Maven in your command line, you need to add Maven bin in your system `PATH` variable.

Windows: 
1. Right click on `This PC` and choose `Properties`.
2. Click on `Advanced system settings`
3. Click on `Environment Variables`.
4. Under System Variables, locate `PATH` and click `Edit`.
5. Click `New` and add the path to Maven's bin

Mac:
Add the following line to your .bashrc, .bash_profile, or .zshrc, depending on your shell:
```bash
export PATH=$PATH:/path/to/maven/bin
```
Replace /path/to/maven with the actual path where you extracted Maven.

### Step 4: Verify Installation
Open a new command prompt (or terminal) and type:

```bash
mvn --version
```

This should display Maven's version, indicating a successful installation.

## Usage

### Example Using Wizard Class 
```java
package app;

import app.heroAttributes.HeroAttribute;
import app.heroes.Hero;
import app.heroes.classes.Wizard;
import app.items.Armor;
import app.items.Weapon;
import app.types.ArmorType;
import app.types.Slot;
import app.types.WeaponType;

public class App {
    public static void main(String[] args) {
        System.out.println();

        Weapon weapon1 = new Weapon("Wand", 1, WeaponType.WANDS, 10);
        Armor armor1 = new Armor("Cloth Helmet", 1, ArmorType.CLOTH, Slot.HEAD, new HeroAttribute(10, 10, 10));
        Hero wizard = new Wizard("Emre Merlin");

        wizard.equip(weapon1);
        wizard.equip(armor1);
        wizard.levelUp();

        System.out.println(wizard.display());

    }
}
```
### How Compile With Command line
First you need to open your commandline/terminal and go inside the project folder. 

Step 1: Compile alla java classfiles
```bash
javac *.java
```

Step 2: How To Start The Program
```bash
java App 
```

## Status
Project is finished, but can be more improved.

Future improvment: 
* Add more hero classes and equiqments.
* Add implementation of fightning with other heroes, where you challenge dummy data of heroes of your own creation.
* Add spellcast for each heroes and it should be uniq depends on the which hero class.

## Contribute
No contribution as this is a assignment.

## Made by:
Emre Demirel 
