package service;

import model.CargoPlane;
import model.PassengerPlane;
import model.Plane;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirlineTest {

    Airline airline = new Airline("LuftHansa");
    Plane an1;
    Plane an2;
    Plane an3;
    Plane an4;


    @Before
    public void setUp() {

        an1 = new PassengerPlane("AN-1", 3000, 2000, 50);
        an2 = new PassengerPlane("AN-2", 2000, 3000, 60);
        an3 = new CargoPlane("AN-3", 1000, 3500, 15000);
        an4 = new CargoPlane("AN-4", 4000, 4000, 20000);
        airline.addToList(an1);
        airline.addToList(an2);
        airline.addToList(an3);
        airline.addToList(an4);

    }

    @Test
    public void shouldSumOfLoadCargoCapacity() {
        assertEquals(airline.sumOfAllCarcoCapacity(), 35000);
    }

    @Test
    public void shouldSumOfLoadPassengersCapacity() {
        assertEquals(airline.sumOfAllPasengersCapacity(), 110);
    }

    @Test
    public void sortByFlyRange() {
        airline.sortByFlyRange();
        assertEquals(airline.showPlanesList().get(0), an3);
    }

    @Test
    public void getByFuel() {
        airline.sortByFlyRange();
        assertEquals(airline.getByFuel(1999, 2001).get(0), an1);
    }
}