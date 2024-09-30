package src;

import src.Animal;
import src.Zoo;

import static src.Zoo.compareZoos;

public class Main {


    public static void main(String[] args) {
        Animal lion = new Animal("9tates", "Lion", 5, true);

        Zoo zoo = new Zoo("Belvedere", "Tunis");

        boolean isAdded = zoo.addAnimal(lion);
        boolean isAdded2 = zoo.addAnimal(new Animal("3safer", "baba8ayou", 3, false));

        zoo.displayAnimals();
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