package za.ac.mzilikazi.SingleResponsibilityPrinciple;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-30.
 */
public class TestBook {

    Book book;


    @Before
    public void setUp() throws Exception {
        book = new Book();

    }

    @Test
    public void testPrinter() throws Exception {
        book.setAuthor("Stephenie Meyer");
        book.setTitle("The twilight saga: new moon");
        book.setPrice(150.00);
        book.printBook();
    }
}
