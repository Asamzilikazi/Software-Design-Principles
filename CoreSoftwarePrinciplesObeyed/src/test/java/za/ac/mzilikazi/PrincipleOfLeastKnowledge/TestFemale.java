package za.ac.mzilikazi.PrincipleOfLeastKnowledge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-31.
 */
public class TestFemale {
    private  Female female;

    @Before
    public void setUp() throws Exception {
        female = new Female("", 23);
    }
    @Test
    public void testFemalePerson() throws Exception
    {
        Assert.assertEquals(23, female.getAge());
    }
}
