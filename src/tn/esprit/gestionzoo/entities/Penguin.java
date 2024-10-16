package src.tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {

    float swimmingDepth;

    Penguin(String habitat, float swimmingDepth, String family, String name, int age, boolean isMammal) {
        super(habitat, family, name, age, isMammal);
        this.swimmingDepth = swimmingDepth;
    }
}
