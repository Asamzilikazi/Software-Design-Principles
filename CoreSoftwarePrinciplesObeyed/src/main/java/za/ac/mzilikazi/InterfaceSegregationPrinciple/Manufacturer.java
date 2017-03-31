package za.ac.mzilikazi.InterfaceSegregationPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Manufacturer {
    public static House buildHouse() {
        House house = new House();
        house.setPrice(15.00);
        house.setColor("white");
        return house;
    }

    public static Car buildCar() {
        Car car = new Car();
        car.setPrice(25.00);
        car.setColor("black");
        car.move();
        return car;
    }

    public static Plane buildPlane() {
        Plane plane = new Plane();
        plane.setPrice(200.00);
        plane.setColor("yellow");
        plane.move();
        plane.fly();
        return plane;
    }
}
