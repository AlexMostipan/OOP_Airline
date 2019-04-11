package model;


public abstract class Plane {


    private String name;
    private int flihtRange;
    private int fuelConsumption;

    public abstract int getMaxCapacity();

    public abstract int getMaxSeatingCapacity();

    public String getName() {
        return name;
    }


    public int getFlihtRange() {
        return flihtRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public Plane(String name, int flihtRange, int fuelConsumption) {
        this.name = name;
        this.flihtRange = flihtRange;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", flihtRange=" + flihtRange +
                ", fuelConsumption=" + fuelConsumption +
                '}';

    }
}
