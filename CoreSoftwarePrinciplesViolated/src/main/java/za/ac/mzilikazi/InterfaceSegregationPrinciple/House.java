package za.ac.mzilikazi.InterfaceSegregationPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class House  {

    double price;
    String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.print("Not all objects created can move!\n");
    }

    public void fly() {
        System.out.print("Not all objects created can fly!");
    }
}
