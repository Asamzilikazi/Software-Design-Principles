package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Bike {

    private Vehicle bike;
    public Bike() {
    }

    public Bike(Vehicle bikes) {
        bike = bikes;
    }

    public int getNumberOfSeats() {
        return 1;
    }

    public int getNumberOfWheels() {
        return 2;
    }

    public String getVehicleType() {
        return "Motor Bike";
    }

    public void move() {
        System.out.print("Bikes are a fast type of transportation.");
    }

    public void drive() {
        System.out.print("You are riding on a bike.");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "Bike=" + bike +
                '}';
    }
}
