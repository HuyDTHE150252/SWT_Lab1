package ducnvhe141646_ManagerUser;

import controller.UserManager;
import static controller.UserManager.getListAccountsFromData;
import java.util.ArrayList;
import model.User;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class UserManagerTest {
    
    public UserManagerTest() {
    }
    
    

    
    

    /**
     * Test of getListAccountsFromData method, of class UserManager.
     */
    @Test
    public void testGetListAccountsFromData() {
        System.out.println("getListAccountsFromData");
       int expResult = 1;
        ArrayList<User> result = UserManager.getListAccountsFromData();
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of saveAccountToFile method, of class UserManager.
     */
    @Test
    public void testSaveAccountToFile() {
        System.out.println("saveAccountToFile");
        ArrayList<User> listUsers =  new ArrayList<>();
        listUsers.add( new User(1, "duc", "456", 3));
        UserManager.saveAccountToFile(listUsers);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of checkLogin method, of class UserManager.
     */
    @Test
    public void testCheckLogin() {
        System.out.println("checkLogin");
        ArrayList<User> result = UserManager.getListAccountsFromData();
        User user =result.get(0) ;

        boolean expResult = true;
        boolean result1 = UserManager.checkLogin(user);
        assertEquals(expResult, result1);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of addUser method, of class UserManager.
     */
//    @Test
//    public void testAddUser() {
//        System.out.println("addUser");
//        User u= new User(1, "duc", "123", 3);
//          ArrayList<User> listUsers = getListAccountsFromData();
//          listUsers.add(u);
//        UserManager instance = new UserManager();
//        instance.addUser();
//        instance.saveAccountToFile(listUsers);
//        int list_count=2;
//       
//        // TODO review the generated test code and remove the default call to fail.
//         assertEquals(instance, list_count);
//    }
//
//    /**
//     * Test of updateUser method, of class UserManager.
//     */
//    @Test
//    public void testUpdateUser() {
//        System.out.println("updateUser");
//        UserManager instance = new UserManager();
//        instance.updateUser();
//        // TODO review the generated test code and remove the default call to fail.
//           }
//
//    /**
//     * Test of deleteUser method, of class UserManager.
//     */
//    @Test
//    public void testDeleteUser() {
//        System.out.println("deleteUser");
//        UserManager instance = new UserManager();
//        instance.deleteUser();
//        // TODO review the generated test code and remove the default call to fail.
//       
//    }
    
}
