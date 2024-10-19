package src.tn.esprit.gestionzoo.entities;

public class Zoo {
    static final int NUMBER_CAGES = 25;
    private Animal[] animals;
    private String name;
    private String city;
    int nbrAnimals;

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    Aquatic[] aquaticAnimals = new Aquatic[10];


    public Zoo(String name, String city) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be null or empty");
        }
        this.name = name;
        this.city = city;
        this.animals = new Animal[25];
        nbrAnimals = 0;
    }

    public Zoo () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null) {
            throw new IllegalArgumentException("Zoo Name must not be null");
        }
        this.name = name;
    }

    public boolean addAnimal(Animal animal) {
        if(isZooFull()) {
            System.out.println("Zoo is full");
            return false;
        } else {
            if (searchAnimal(animal) == -1) {
                // Animals doesn't exist and can be added
                for (int i = 0; i < animals.length; i++) {
                    if (animals[i] == null) {
                        animals[i] = animal;
                        nbrAnimals++;
                        return true;
                    }
                }
                System.out.println("Animals est saturee");
                return false;
            } else {
                System.out.println("Animal existe deja");
                return false;
            }
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

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_CAGES;
    }

    public static Zoo compareZoos(Zoo zoo1, Zoo zoo2) {
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


    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                break;
            }
        }
    }

    public float maxPenguinSwimmingDepth() {
        float max = 0;
         for(Aquatic p : this.aquaticAnimals) {
            if (p != null) {
                if(p instanceof Penguin) {
                    if(((Penguin) p).swimmingDepth > max) {
                        max = ((Penguin) p).swimmingDepth;
                    }
                }
            }


         }

        return max;
    }


    public void displayNumberOfAquaticsByType() {
        int nbrPenguins = 0;
        int nbrDolphins = 0;
        for(Aquatic a : this.aquaticAnimals) {
            if (a != null) {
                if(a instanceof Penguin) {
                    nbrPenguins++;
                }
                if(a instanceof Dolphin) {
                    nbrDolphins++;
                }

            }

        }

        System.out.println("Number of Penguins : " + nbrPenguins);
        System.out.println("Number of Dolphins : " + nbrDolphins);
    }


}
