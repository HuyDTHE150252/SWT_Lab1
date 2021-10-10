package ducnvhe141646_ManagerUser;
import model.User;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author asus
 */
public class TestException {
    @Test
    public  void testUsernameisNull(){
        try {
            User u= new User();
            u.setUserName("null");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("User can not blank", e.getMessage());
        }
    }
// @Test
//public void testUsernameTooShort() {
//    Throwable exception = assertThrows(
//            IllegalArgumentException.class, () -> {
//                User user = new User();
//                user.setUserName("Jo");
//            }
//    );
// 
//    assertEquals("Username is too short", exception.getMessage());     
//}
}
