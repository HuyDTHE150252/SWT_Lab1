package ducnvhe141646_ManagerUser;

import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class UserTest {

    public UserTest() {
        User u1= new User(1, "duc", "123", 1);
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Calling the @BeforeClass Method! ");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Calling the @AfterClass Method! ");

    }

    @Before
    public void setUp() {
        System.out.println("Calling the @Before  Method (before each test method)! ");

    }

    @After
    public void tearDown() {
       System.out.println("Calling the @After  Method (after each test method)! ");

    }

    /**
     * Test of getUserId method, of class User.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        User instance = new User(1, "duc", "123", 1);
        int expResult = 1;
        int result = instance.getUserId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserId method, of class User.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        int userId = 0;
        User instance = new User();
        instance.setUserId(userId);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class User.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        User instance = new User(11, "duc", "123", 2);
        String expResult = "duc";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User(3, "trung", "123", 3);
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    
    

}
