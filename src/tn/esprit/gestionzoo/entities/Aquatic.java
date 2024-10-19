package src.tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String habitat, String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    boolean equals(Aquatic aquatic) {
            if(this.habitat.equals(aquatic.getHabitat()) && this.getAge() == aquatic.getAge() && this.name.equals(aquatic.name)) {
                return true;
            }

        return false;

        }



    }

