package za.ac.mzilikazi.DependancyInversionPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Iron implements SwitchPool {
    public void turnOn() {
        System.out.println("Iron: Iron turned on...");
    }

    public void turnOff() {
        System.out.println("Iron: Iron turned off...");
    }
}
