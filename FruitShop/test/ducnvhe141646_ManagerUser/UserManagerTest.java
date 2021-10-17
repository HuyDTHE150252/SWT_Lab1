package ducnvhe141646_ManagerUser;

import common.AppConstant;
import common.DataInput;
import controller.UserManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import model.User;
import org.junit.After;
import org.junit.AfterClass;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import view.UserView;

/**
 *
 * @author asus
 */
public class UserManagerTest {

    private static UserManager testUserManager;

    public UserManagerTest() {
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
     * Test of getListAccountsFromData method, of class UserManager.
     */
    @Test
    public void testCheckAccounts() {

        ArrayList<User> listUsers = new ArrayList<>();
        User user1 = new User(1, "duc", "123", 1);
        User user2 = new User(2, "trung", "123", 3);
        User user3 = new User(3, "linh", "123", 4);
        User user4 = new User(4, "ducnv", "abcd", 1);
        listUsers.add(0, user1);
        listUsers.add(1, user2);
        listUsers.add(2, user3);
        listUsers.add(3, user4);

        testUserManager = new UserManager();

        //TC1 (user name true, pass true)
        boolean result = testUserManager.checkLogin(user1);
        boolean expectedResult = false;
        assertEquals("TC1", expectedResult, result);

        //TC2 (user name true, pass false)
        boolean result2 = testUserManager.checkLogin(user2);
        boolean expectedResult2 = true;
        assertEquals("TC2", expectedResult2, result2);

        //TC3 (user name true, pass true)
        boolean result3 = testUserManager.checkLogin(user4);
        boolean expectedResult3 = true;
        assertEquals("TC2", expectedResult3, result3);
        //TC4 (user name false, pass false)

        boolean result4 = testUserManager.checkLogin(user3);
        boolean expectedResult4 = false;
        assertEquals("TC4", expectedResult3, result4);
    }

    /**
     * Test of saveAccountToFile method, of class UserManager.
     */
    /**
     * Test of checkLogin method, of class UserManager.
     */
    @Test(timeout = 100)
    public void testAddUser() {
        System.out.println("testAddUser");
        ArrayList<User> listUsers = new ArrayList<>();
        User user1 = new User(1, "duc", "123", 1);
        User user2 = new User(2, "trung", "123", 3);
        User user3 = new User(3, "linh", "123", 4);
        User user4 = new User(4, "ducnv", "abcd", 1);

        listUsers.add(0, user1);
        listUsers.add(1, user2);
        listUsers.add(2, user3);
        listUsers.add(3, user4);
        boolean flag = true;
        String userName = "duc";

        String password = "123";
        int userType = 1;
        User user = new User(5, userName, password, userType);
        listUsers.add(user);
        // TC1: 
        assertEquals(true, flag);

        // TC2 
        int expectedResult = 5;
        assertEquals(expectedResult, listUsers.size());

        // TC3 X
        assertEquals(userName, listUsers.get(4).getUserName());

    }

}
