package za.ac.mzilikazi.LiskovSubstitutionPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Bicycle extends TransportWithoutEngine {
    @Override
    public void startMoving() {
        super.startMoving();
        System.out.print("Bicycle: Bicycle is moving");

    }
}
