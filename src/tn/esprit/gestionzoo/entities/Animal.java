package src.tn.esprit.gestionzoo.entities;

public class Animal {
    String family;
    String name;
    private int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        if(age < 0) {
            throw new IllegalArgumentException("Age of the animal must be positive");
        }
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return name + "  " + family + " aged " + age + ". It is " + (isMammal ? "" : "not ") + "a mammal.";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.age = age;
    }
}
