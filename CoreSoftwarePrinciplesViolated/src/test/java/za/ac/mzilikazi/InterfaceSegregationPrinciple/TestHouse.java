package za.ac.mzilikazi.InterfaceSegregationPrinciple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-30.
 */
public class TestHouse {

    House house;

    @Before
    public void setUp() throws Exception {
        house = new House();

    }

    @Test
    public void testHouses() throws Exception {
        house.setColor("white");
        house.move();
        house.fly();
        Assert.assertEquals(house.color,"white");
    }
}
