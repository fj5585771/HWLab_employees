import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Sky", "JXAAAAAA9");
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(35000, databaseAdmin.raiseSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(28749, databaseAdmin.payBonus(), 0.1);
    }
}
