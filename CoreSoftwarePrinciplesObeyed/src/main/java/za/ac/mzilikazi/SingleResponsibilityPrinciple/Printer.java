package za.ac.mzilikazi.SingleResponsibilityPrinciple;

/**
 * Created by mandisi on 2017-03-30.
 */
public class Printer {

    Book book;

    public Printer(Book book) {
        this.book = book;
    }
    public void printBook(){
        System.out.print("Book sent to printer to be printed");

    }
}
