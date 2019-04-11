import model.Plane;
import service.Airline;
import model.CargoPlane;
import model.PassengerPlane;

public class Main {
    public static void main(String[] args) {
        Plane boing = new PassengerPlane("Boing-777", 2000, 1234, 200);
        Plane AN24 = new CargoPlane("AN-24", 3000, 4321, 500);
        Plane kukuruznik = new CargoPlane("An-2", 500, 222, 1000);
        Plane an30 = new PassengerPlane("An 30", 4000, 333, 300);
        Airline MAU = new Airline("Ukraine Airlines");
        MAU.addToList(boing);
        MAU.addToList(AN24);
        MAU.addToList(kukuruznik);
        MAU.addToList(an30);
        System.out.println("\n All planes \n");
        System.out.println(MAU.showPlanesList());
        MAU.sortByFlyRange();
        System.out.println("\n Planes after sort by range \n");
        System.out.println(MAU.showPlanesList());
        System.out.println("\n Planes after sort by fuel \n");
        System.out.println(MAU.getByFuel(222, 1234));
        System.out.println("All carcgo capacity = " + MAU.sumOfAllCarcoCapacity());
        System.out.println("All passengers capacity = " + MAU.sumOfAllPasengersCapacity());


    }
}
