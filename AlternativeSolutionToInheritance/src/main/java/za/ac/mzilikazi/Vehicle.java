package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Vehicle {

    private int seatNumber;
    private int wheelNumber;
    private String vehicleType;

    public Vehicle() {
    }

    public Vehicle(int seatNum, int wheelNum, String vehicletype) {
        seatNumber = seatNum;
        wheelNumber = wheelNum;
        vehicleType = vehicletype;
    }

    public int getNumberOfSeats() {
        return seatNumber;
    }

    public int getNumberOfWheels() {
        return wheelNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }
    public void move(){
        System.out.print("Vehicles are used to move around.");
    }

    public void drive(){
        System.out.print("You are driving a vehicle.");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numOfSeats=" + seatNumber +
                ", numOfWheels=" + wheelNumber +
                ", vehType='" + vehicleType + '\'' +
                '}';
    }
}
