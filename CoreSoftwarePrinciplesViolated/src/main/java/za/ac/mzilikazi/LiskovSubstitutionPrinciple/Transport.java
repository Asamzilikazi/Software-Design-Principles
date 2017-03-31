package za.ac.mzilikazi.LiskovSubstitutionPrinciple;

import com.sun.xml.internal.ws.api.pipe.Engine;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Transport {

    private String name;
    private double speed;
    private Engine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    void setEngine(Engine engine) {
        this.engine = engine;
    }

    void startEngine(){
    }

}
