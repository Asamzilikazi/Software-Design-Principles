package za.ac.mzilikazi.PrincipleOfLeastKnowledge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-31.
 */
public class TestMale {

    private Male oldInfo;

    @Before
    public void setUp() throws Exception
    {
        oldInfo = new Male("Mellow", 24);
    }

    @Test
    public void testMalePerson() throws Exception
    {
        Assert.assertEquals(oldInfo.getName(),"Mellow");
    }
}
