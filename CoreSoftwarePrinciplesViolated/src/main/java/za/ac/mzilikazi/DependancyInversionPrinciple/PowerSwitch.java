package za.ac.mzilikazi.DependancyInversionPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class PowerSwitch {
    private Bulb lightBulb;
    private boolean on;

    public PowerSwitch(Bulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }
    public boolean isOn(){
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if(checkOn){
            lightBulb.turnOff();
            this.on = false;
        }
        else {
            lightBulb.turnOn();
            this.on = true;
        }
    }
}
