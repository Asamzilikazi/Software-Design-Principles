package za.ac.mzilikazi.DependancyInversionPrinciple;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-30.
 */
public class TestPowerSwitch {

    Bulb bulb;
    PowerSwitch powerSwitch;

    @Before
    public void setUp() throws Exception {
        bulb   = new Bulb();
        powerSwitch = new PowerSwitch(bulb);
    }

    @Test
    public void testPress() throws Exception
    {
        powerSwitch.press();

    }
}
