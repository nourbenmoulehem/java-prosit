public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }

    @Override
    public String toString() {
        String result = "Zoo: " + name + " in " + city + " has " + nbrCages + " cages.\n" + "Animals:\n";

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                result += animals[i].toString() + "\n";
            }
        }
        return result;
    }
}
