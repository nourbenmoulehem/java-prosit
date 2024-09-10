import java.util.Scanner;

public class ZooManagement {
  int nbrCages = 0;
  String zooName = "";

  public static void main(String[] args) {

    ZooManagement zoo = new ZooManagement();

    Scanner sc = new Scanner(System.in);

    while (zoo.nbrCages <= 0) {
      System.out.println("Enter nbrCages");
      System.out.println("please enter a positive number");
      zoo.nbrCages = sc.nextInt();
    }

    while (zoo.zooName.length() == 0) {
      System.out.println("please enter a string");
      zoo.zooName = sc.nextLine();
    }

    System.out.println(zoo.zooName + " comporte de " + zoo.nbrCages);

    sc.close();
  }
}