public class Main {


    public static void main(String[] args) {
        Animal lion = new Animal("9tates", "Lion", 5, true);

        Zoo zoo = new Zoo("Belvedere", "Tunis", 40);

        zoo.animals[0] = lion;

        System.out.println(zoo.toString());
    }
}