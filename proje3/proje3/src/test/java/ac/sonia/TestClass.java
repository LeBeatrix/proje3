package ac.sonia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;

public class TestClass {

    Employee employee;
    Employee employee1


    @Before
    public void setUp(){
        employee = new Employee("Sonia", "Sontshatsha", "215s", 253.5);
        employee1 = new Employee("Vee", "Njuse", "184r", 5);
    }

    @After
    public void tearDown(){

    }

    @Test
    public void testObjectEquality(){
        assertEquals(employee,employee);
    }
    @Test
    public void testObjectIdentity(){
        assertSame(employee,employee1);
    }
}
