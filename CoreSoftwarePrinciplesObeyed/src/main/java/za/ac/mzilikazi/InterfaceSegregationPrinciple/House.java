package za.ac.mzilikazi.InterfaceSegregationPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class House implements Development {

    private double price;
    private String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}' +"\n";
    }
}
