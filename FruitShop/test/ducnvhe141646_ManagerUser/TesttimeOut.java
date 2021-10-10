package ducnvhe141646_ManagerUser;

import java.util.ArrayList;
import model.User;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author asus
 */
public class TesttimeOut {

    @Test(timeout = 200)
    public void testDisplayUserList() {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User(1, "duc", "123", 1));
        userList.add(new User(2, "duc1", "123", 4));
        userList.add(new User(3, "duc2", "123", 2));
        userList.add(new User(4, "duc3", "123", 1));
        int list_count = 4;
        assertEquals(list_count, userList.size());

    }
}
