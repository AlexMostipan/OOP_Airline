package model;

public class PassengerPlane extends Plane {
    private int seatinCapacity;

    public int getSeatinCapacity() {
        return seatinCapacity;
    }

    public PassengerPlane(String name, int flihtRange, int fuelConsumption, int seatinCapacity) {
        super(name, flihtRange, fuelConsumption);
        this.seatinCapacity = seatinCapacity;
    }

    @Override
    public int getMaxCapacity() {
        return 0;
    }

    @Override
    public int getMaxSeatingCapacity() {
        return seatinCapacity;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "name='" + getName() + '\'' +
                ", flihtRange=" + getFlihtRange() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", seatinCapacity=" + getSeatinCapacity() +
                '}';
    }
}

