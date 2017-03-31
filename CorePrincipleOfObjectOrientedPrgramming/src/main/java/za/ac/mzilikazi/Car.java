package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Car extends Vehicle{
    private int doorNumber;

    public Car() {
    }

    public Car(int seatNumber, int wheelNumber, String vehicleType, int doorNum) {
        super(seatNumber, wheelNumber, vehicleType);
        doorNumber = doorNum;
    }

    public int getNumOfDoors() {
        return doorNumber;
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
        System.out.print("A car is a private type of transportation.");
    }

    @Override
    public void drive() {
        System.out.print("You are driving a car.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
