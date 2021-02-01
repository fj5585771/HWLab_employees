import management.Director;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Melissa", "JX285928B", "Operations", 1000000);
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000, director.getBudget(), 0.1);
    }

}
