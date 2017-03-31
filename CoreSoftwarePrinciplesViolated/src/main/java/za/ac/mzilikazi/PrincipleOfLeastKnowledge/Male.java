package za.ac.mzilikazi.PrincipleOfLeastKnowledge;

/**
 * Created by mandisi on 2017-03-31.
 */
public class Male {

    private String name;
    private EarlierAge age;

    public Male(String nm, int years)
    {
        name=nm;
        age= new EarlierAge(years);
    }
    public String getName()
    {
        return name;
    }

    public int getAge() {
        return age.getEarlierAge();
    }

}
