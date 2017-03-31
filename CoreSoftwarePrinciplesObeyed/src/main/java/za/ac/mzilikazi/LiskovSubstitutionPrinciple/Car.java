package za.ac.mzilikazi.LiskovSubstitutionPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Car extends TransportWithEngine{

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.print("Car: Car engine started\n");

    }
}
