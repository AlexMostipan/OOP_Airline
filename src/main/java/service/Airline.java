package service;

import model.Plane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Airline {
    private String name;

    public Airline(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Plane> planesArrayList = new ArrayList<Plane>();

    public void addToList(Plane plane) {
        planesArrayList.add(plane);
    }

    public List<Plane> showPlanesList() {
        return planesArrayList;
    }

    public int sumOfAllPasengersCapacity() {
        int maxSeatingCapacity = 0;
        for (int i = 0; i < planesArrayList.size(); i++) {
            maxSeatingCapacity += planesArrayList.get(i).getMaxSeatingCapacity();
        }
        return maxSeatingCapacity;
    }

    public int sumOfAllCarcoCapacity() {
        int cargoMaxCapacity = 0;
        for (int i = 0; i < planesArrayList.size(); i++) {
            cargoMaxCapacity += planesArrayList.get(i).getMaxCapacity();
        }
        return cargoMaxCapacity;
    }

    public void sortByFlyRange() {
        Collections.sort(this.planesArrayList, new PlaneComparator());
    }

    public List<Plane> getByFuel(int from, int to) {
        List<Plane> planes = new ArrayList<Plane>();
        for (Plane plane : planesArrayList) {
            if (plane.getFuelConsumption() >= from && plane.getFuelConsumption() <= to) {
                planes.add(plane);
            }
        }
        return planes;
    }
}
