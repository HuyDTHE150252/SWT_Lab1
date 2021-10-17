package kienlthe140057;

import java.util.ArrayList;
import java.util.Hashtable;
import model.Order;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import view.OrderView;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class OrderViewTest {
    
    public OrderViewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of displayListOrder method, of class OrderView.
     */
    @Test
    public void testDisplayListOrder() {
        System.out.println("displayListOrder");
        ArrayList<Order> lo = null;
        OrderView.displayListOrder(lo);
        fail("The test case is a prototype.");
    }

    
    
}
