package src.tn.esprit.gestionzoo.main;


import src.tn.esprit.gestionzoo.entities.Animal;
import src.tn.esprit.gestionzoo.entities.Aquatic;
import src.tn.esprit.gestionzoo.entities.Penguin;
import src.tn.esprit.gestionzoo.entities.Zoo;

import static src.tn.esprit.gestionzoo.entities.Zoo.compareZoos;

public class Main {


    public static void main(String[] args) {
        Animal lion = new Animal("9tates", "Lion", 5, true);

        Zoo zoo = new Zoo("Belvedere", "Tunis");

        boolean isAdded = zoo.addAnimal(lion);
        boolean isAdded2 = zoo.addAnimal(new Animal("3safer", "baba8ayou", 3, false));

        zoo.displayAnimals();

        Aquatic aquatic1 = new Aquatic("Ocean", "Delphinidae", "Dolphin", 8, true);
        Aquatic aquatic2 = new Aquatic("Sea", "Carcharhinidae", "Shark", 12, false);
        Aquatic penguin1 = new Penguin("Antarctica", 15.0f, "Bird", "Penguin", 5, false);
        Aquatic penguin2 = new Penguin("9oteb el janoubi", 60.0f, "3asfour", "Penguin", 5, false);

        zoo.addAquaticAnimal(aquatic1);
        zoo.addAquaticAnimal(aquatic2);
        zoo.addAquaticAnimal(penguin1);
        zoo.addAquaticAnimal(penguin2);

        for(Aquatic aquatic : zoo.getAquaticAnimals()) {
            if (aquatic != null) {  // Check if the object is not null
                System.out.println(aquatic.getHabitat());
                aquatic.swim();
            }
        }

        System.out.println(zoo.maxPenguinSwimmingDepth());

        zoo.displayNumberOfAquaticsByType();

        /*System.out.println(isAdded);

        System.out.println(zoo.toString());*/

        System.out.println("Animal lion exist at: " + zoo.searchAnimal(lion));

        System.out.println("Animal removing lion operation is:" + zoo.removeAnimal(lion));

        System.out.println("Animal lion exist at: " + zoo.searchAnimal(lion));

        zoo.displayAnimals();


        System.out.println(zoo.toString());

        Zoo zoo2 = new Zoo("AfricaPark", "Sousse");
        zoo2.addAnimal(lion);
        zoo2.addAnimal(new Animal("7out", "dauphin", 1, true));
        zoo2.addAnimal(new Animal("idk", "zarafa", 2, true));

        Zoo BiggestZoo = compareZoos(zoo, zoo2);

        System.out.println("\uD83E\uDE98 And the biggest zoo is *drums* :" + BiggestZoo.toString());

        System.out.println("Testing isZooFull: " + zoo.isZooFull());
    }
}