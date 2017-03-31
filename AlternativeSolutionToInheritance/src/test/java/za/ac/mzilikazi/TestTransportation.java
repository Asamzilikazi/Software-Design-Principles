package za.ac.mzilikazi;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-30.
 */
public class TestTransportation {

    private Vehicle vehicle;
    private Car car;
    private Bike bike;

    @Before
    public void setUp() throws Exception {
        vehicle = new Vehicle();
        car = new Car(vehicle,4);
        bike = new Bike(vehicle);
    }

    @Test
    public void testTransport() throws Exception {
        vehicle.move();
        System.out.print("\n\n");

        System.out.print("My " + car.getVehicleType() + " has " + car.getNumberOfSeats() + " seats" + " , " + car.getNumberOfWheels() + " wheels " + " and "+ car.getNumberOfDoors()+" doors."+ "\n");
        car.move();
        System.out.print("\n");
        car.drive();
        System.out.print("\n\n");

        System.out.print("My " + bike.getVehicleType() + " has " + bike.getNumberOfSeats() + " seat" + " and " + bike.getNumberOfWheels() + " wheels."+ "\n");
        bike.move();
        System.out.print("\n");
        bike.drive();
        System.out.print("\n\n");

    }
}
