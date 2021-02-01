import management.Manager;
import techStaff.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Colon",  "JX295928A", 50000, "Marketing");
    }

    @Test
    public void hasName(){
        assertEquals("Colon", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JX295928A", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Marketing", manager.getDepName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(60000, manager.raiseSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(57500, manager.payBonus(), 0.1);
    }


}
