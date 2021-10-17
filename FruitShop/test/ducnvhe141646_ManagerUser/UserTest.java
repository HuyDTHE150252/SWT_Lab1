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
   private User u;
    public UserTest() {
        u=null;
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
        u = new User(1, "duc", "123", 1);
//        "TC1"
        int expResult = 1;
        int result = u.getUserId();
        assertEquals(expResult, result);
        

        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserId method, of class User.
     */
    

    /**
     * Test of getUserName method, of class User.
     */
    @Test(timeout = 120)
    public void testGetUserName() {
        System.out.println("getUserName");
        u = new User(1, "duc", "123",1);
        String expResult = "duc";
        String result = u.getUserName();
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
       u = new User(1, "duc", "123", 1);
        String expResult = "123";
        String result = u.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test(timeout = 200)
    public void testToString(){
        //tc1
         System.out.println("Test ToString case 1:");
         u = new User(1, "duc", "123", 1);
         String expResult="2,duc,,1";
         String result=u.getUserId()+","+u.getUserName()+","+u.getPassword()+","+u.getType();
         assertEquals(expResult, result);
         
         //tc2
         System.out.println("Test ToString case 2:");
         
         String expResult1="1,duc,123,1";
         String result1=u.getUserId()+","+u.getUserName()+","+u.getPassword()+","+u.getType();
         assertEquals(expResult1, result1);
         //tc3
         System.out.println("Test ToString case 2:");
         
         String expResult2="-1,duc,123456a,1";
         String result2=u.getUserId()+","+u.getUserName()+","+u.getPassword()+","+u.getType();
         assertEquals(expResult2, result2);

    }

    
    

}
