import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Fraz", "JX285928B");
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(45000, developer.raiseSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(40250, developer.payBonus(), 0.1);
    }
}
