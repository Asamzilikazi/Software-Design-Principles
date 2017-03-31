package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Bike extends Vehicle {
    public Bike() {
    }

    public Bike(int seatNumber, int wheelNumber, String vehicleType) {
        super(seatNumber, wheelNumber, vehicleType);
    }

    @Override
    public int getNumberOfSeats() {
        return super.getNumberOfSeats();
    }

    @Override
    public int getNumberOfWheels() {
        return super.getNumberOfWheels();
    }

    @Override
    public String getVehicleType() {
        return super.getVehicleType();
    }

    @Override
    public void move() {
        System.out.print("Bike is a fast type of transportation.");
    }

    @Override
    public void drive() {
        System.out.print("You are riding on a bike.");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
