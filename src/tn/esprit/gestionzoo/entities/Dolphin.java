package src.tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{

    float swimmingSpeed;

    Dolphin(String habitat, float swimmingSpeed, String family, String name, int age, boolean isMammal) {
        super(habitat, family, name, age, isMammal);
        this.swimmingSpeed = swimmingSpeed;
    }

    public void swim() {
        System.out.println("This dolphin is swimming.");
    }


}
