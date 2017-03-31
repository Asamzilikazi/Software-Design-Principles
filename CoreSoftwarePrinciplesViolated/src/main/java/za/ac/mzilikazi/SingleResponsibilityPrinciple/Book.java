package za.ac.mzilikazi.SingleResponsibilityPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Book {
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String text) {
        this.title = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void printBook() {
        System.out.print("Book: not all Books can be printed");
    }
}
