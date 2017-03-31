package za.ac.mzilikazi.LiskovSubstitutionPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class TransportWithoutEngine extends Transport {

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(double speed) {
        super.setSpeed(speed);
    }

    public void startMoving(){

    }
}
