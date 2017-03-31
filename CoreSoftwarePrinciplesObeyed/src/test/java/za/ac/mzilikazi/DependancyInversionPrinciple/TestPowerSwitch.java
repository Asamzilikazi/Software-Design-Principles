package za.ac.mzilikazi.DependancyInversionPrinciple;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-30.
 */
public class TestPowerSwitch {

    SwitchPool bulb;
    SwitchPool iron;
    Controller bulbController;
    Controller ironController;

    @Before
    public void setUp() throws Exception {
        bulb   = new Bulb();
        iron = new Iron();
        bulbController = new PowerSwitch(bulb);
        ironController = new PowerSwitch(iron);
    }

    @Test
    public void testPress() throws Exception
    {
        //come back here
        bulb.turnOn();
        bulb.turnOff();
        iron.turnOn();
        iron.turnOff();
    }
}
