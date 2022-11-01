package hv_7;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EmployeeUtilsTest {
    private final NewManeger[] managers0 = new NewManeger[]{};

    NewEmployee newEmployee = new NewEmployee("Alex",43,'M',500);
    NewManeger newManeger1 = new NewManeger("Smith",55,'M',300,5);
    NewManeger newManeger2 = new NewManeger("Joe",32,'M',500,10);
    NewManeger newManeger3 = new NewManeger("Billy",25,'M',700,15);

    private final NewManeger[] managers = new NewManeger[]{newManeger1,newManeger2,newManeger3};

    @BeforeMethod
    public void setUp() {
        System.out.println("EmployeeUtilsTest.setUp...");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("EmployeeUtilsTest.tearDown...");
    }

    @Test
    public void testEmployeeParthNameSearch() {
        System.out.println("testEmployeeParthNameSearch");
    }

    @Test
    public void testSumOfSalary() {
    }

    @Test
    public void testLoverstAndHighestSalaru() {
        System.out.println("testSumOfSalary");
    }

    @Test
    public void testLoverstAndHighestNumberOfSubordinates() {
        System.out.println("testLoverstAndHighestNumberOfSubordinates");

        Assert.assertEquals(EmployeeUtils.loverstAndHighestNumberOfSubordinates(managers0,"min"),-1);
        Assert.assertEquals(EmployeeUtils.loverstAndHighestNumberOfSubordinates(null,"min"),-1);
        Assert.assertEquals(EmployeeUtils.loverstAndHighestNumberOfSubordinates(managers,"min"),5);
    }

    @Test
    public void testLoverstAndHighesPayment() {
        System.out.println("testLoverstAndHighesPayment");
    }
}