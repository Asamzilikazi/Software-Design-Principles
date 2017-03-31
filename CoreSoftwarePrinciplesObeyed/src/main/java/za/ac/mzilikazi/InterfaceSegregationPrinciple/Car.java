package za.ac.mzilikazi.InterfaceSegregationPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Car implements Development,Mobile {

    private double price;
    private String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Car: Accelerating car.\n");
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}'+"\n";
    }
}
