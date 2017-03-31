package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by mandisi on 2017-03-30.
 */
public class TestTransportation {

    private Car car;
    private Bike bike;

    @Before
    public void setUp() throws Exception {
        car = new Car(4,4,"Car",4);
        bike = new Bike(1,2,"Bike");
    }

    @Test
    public void TestTransportation() throws Exception {
        System.out.print("My " + car.getVehicleType() + " has " + car.getNumberOfSeats() + " seats" + ", " + car.getNumberOfWheels() + " wheels" + " and " + car.getNumOfDoors()+ " doors." + "\n");
        car.move();
        System.out.print("\n");
        car.drive();
        System.out.print("\n\n");

        System.out.print("My " + bike.getVehicleType() + " has " + bike.getNumberOfSeats() + " seat" + "  and " + car.getNumberOfWheels() + " wheels." +  "\n");
        bike.move();
        System.out.print("\n");
        bike.drive();
        System.out.print("\n\n");

        Assert.assertEquals(car.getVehicleType(),"Car");
    }
}
