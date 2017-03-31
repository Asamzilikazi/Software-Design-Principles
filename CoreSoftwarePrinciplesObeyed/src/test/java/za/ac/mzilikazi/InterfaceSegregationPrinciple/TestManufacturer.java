package za.ac.mzilikazi.InterfaceSegregationPrinciple;

import org.junit.Test;

/**
 * Created by mandisi on 2017-03-30.
 */
public class TestManufacturer {

    @Test
    public void testBuildHouse() throws Exception {
        House house = Manufacturer.buildHouse();
        System.out.print(house);
    }

    @Test
    public void testBuildCar() throws Exception {
        Car car = Manufacturer.buildCar();
        System.out.print(car);
    }

    @Test
    public void testBuildPlane() throws Exception {
        Plane plane = Manufacturer.buildPlane();
        System.out.print(plane);
    }
}
