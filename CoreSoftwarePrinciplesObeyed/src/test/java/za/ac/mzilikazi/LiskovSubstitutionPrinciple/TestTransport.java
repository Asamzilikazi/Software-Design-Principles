package za.ac.mzilikazi.LiskovSubstitutionPrinciple;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-30.
 */
public class TestTransport {

    Car car;
    Bicycle bike;

    @Before
    public void setUp() throws Exception {
        car = new Car();
        bike = new Bicycle();

    }

    @Test
    public void testMovement() throws Exception {
        car.startEngine();
        bike.startMoving();
    }
}
