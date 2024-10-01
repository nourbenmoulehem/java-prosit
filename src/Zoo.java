package src;

import src.Animal;

public class Zoo {
    static final int NUMBER_CAGES = 25;
    public Animal[] animals;
    String name;
    String city;
     int nbrAnimals;


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[25];
        nbrAnimals = 0;
    }

    public Zoo () {

    }

    public boolean addAnimal(Animal animal) {
        if(searchAnimal(animal) == -1) {
            // Animals doesn't exist and can be added
            for(int i = 0; i < animals.length; i++) {
                if(animals[i] == null) {
                    animals[i] = animal;
                    nbrAnimals++;
                    return true;
                }
            }
            System.out.println("Animals est saturee");
            return false;
        }  else {
            System.out.println("Animal existe deja");
            return false;
        }


    }

    public void displayAnimals() {
        System.out.println("Animals:");
        for (int i = 0; i < animals.length; i++) {

            if (animals[i] != null) {
                System.out.println("Animal numero " + (i + 1) + " " + animals[i].toString());
            }
        }
        System.out.println("****** FIN ANIMALS *****");
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if( (animals[i] != null) && (animals[i].name.equals(animal.name))) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if(index != -1) {
            animals[index] = null;
            nbrAnimals--;
            return true;
        } else {
            // Animal doesn't exist
            return false;
        }

    }

    boolean isZooFull() {
        return nbrAnimals == NUMBER_CAGES;
    }

    static Zoo compareZoos(Zoo zoo1, Zoo zoo2) {
        if(zoo1.nbrAnimals > zoo2.nbrAnimals) {
            return zoo1;
        }
        return zoo2;
    }

    @Override
    public String toString() {

//        for (int i = 0; i < animals.length; i++) {
//            if (animals[i] != null) {
//                result += animals[i].toString() + "\n";
//            }
//        }
        return "Zoo: " + name + " in " + city + " has " + NUMBER_CAGES + " cages," + " and number of animals in total: " + nbrAnimals;
    }

}
