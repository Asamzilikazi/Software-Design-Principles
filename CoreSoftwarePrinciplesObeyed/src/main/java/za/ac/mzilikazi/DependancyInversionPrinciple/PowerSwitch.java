package za.ac.mzilikazi.DependancyInversionPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class PowerSwitch implements Controller{
    private SwitchPool generator;
    private boolean on;

    public PowerSwitch(SwitchPool generate) {
        generator = generate;
        this.on = false;
    }
    public boolean isOn(){
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if(checkOn){
            generator.turnOff();
            this.on = false;
        }
        else {
            generator.turnOn();
            this.on = true;
        }
    }
}
