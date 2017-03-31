package za.ac.mzilikazi.InterfaceSegregationPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Plane implements Development, Mobile,Skyworthy {

    private double price;
    private String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Plane: Accelerate plane.\n");
    }

    public void fly() {
        System.out.println("Plane: fly plane.\n");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}'+"\n";
    }
}
