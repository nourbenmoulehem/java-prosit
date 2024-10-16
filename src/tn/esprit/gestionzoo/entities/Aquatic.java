package src.tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat;

    Aquatic (String habitat, String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
