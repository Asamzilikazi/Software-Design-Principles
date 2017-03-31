package za.ac.mzilikazi.DependancyInversionPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Bulb implements SwitchPool {
    public void turnOn() {
        System.out.println("Bulb: Bulb turned on...");
    }

    public void turnOff() {
        System.out.println("Bulb: Bulb turned off...");
    }
}
