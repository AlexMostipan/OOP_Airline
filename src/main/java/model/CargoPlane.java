package model;


public class CargoPlane extends Plane {

    private int loadCapacity;

    public CargoPlane(String name, int flihtRange, int fuelConsumption, int loadCapacity) {
        super(name, flihtRange, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public int getMaxCapacity() {
        return loadCapacity;
    }

    @Override
    public int getMaxSeatingCapacity() {
        return 0;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "name='" + getName() + '\'' +
                ", flihtRange=" + getFlihtRange() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}
