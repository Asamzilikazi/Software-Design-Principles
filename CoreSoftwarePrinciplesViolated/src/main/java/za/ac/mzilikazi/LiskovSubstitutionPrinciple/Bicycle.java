package za.ac.mzilikazi.LiskovSubstitutionPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Bicycle extends Transport {
    public Bicycle() {
    }

    @Override
    void startEngine() {
        super.startEngine();
        System.out.print("Bicycle: Bicycles do not have engines");
    }
}
