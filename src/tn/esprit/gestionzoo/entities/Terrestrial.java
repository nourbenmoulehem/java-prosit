package src.tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{

    private int nbrLegs;

    Terrestrial (int nbrLegs, String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
}
