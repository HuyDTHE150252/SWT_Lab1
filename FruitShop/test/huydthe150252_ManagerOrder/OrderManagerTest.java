/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huydthe150252_ManagerOrder;

import controller.OrderManager;
import java.util.ArrayList;
import java.util.Hashtable;
import model.Fruit;
import model.Order;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TrungHuy
 */
public class OrderManagerTest {

    public OrderManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of shopping method, of class OrderManager.
     */
    @Test
    public void testShopping() {
        System.out.println("shopping");
        ArrayList<Fruit> lf = null;
        
        
        OrderManager instance = new OrderManager();
        ArrayList<Fruit> listF = new ArrayList<>();
        listF.add(new Fruit(1, "FruitName", 10.42, 10, "Fpt"));
        listF.add(new Fruit(2, "FruitName", 10.42, 10, "Fpt"));

        listF.add(new Fruit(3, "FruitName", 10.42, 10, "Fpt"));

        listF.add(new Fruit(4, "FruitName", 10.42, 10, "Fpt"));

        //TC1:
        Fruit fruit = new Fruit(4, "FruitName", 10.42, 10, "Fpt");
        instance.shopping(listF, fruit, 1);
        assertEquals("TC1", fruit.getQuantity(),9);
        
        //TC2:
        instance.shopping(null, fruit, 1);
        assertEquals("TC1", fruit.getQuantity(),8);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putToHT method, of class OrderManager.
     */
    @Test
    public void testPutToHT() {
        System.out.println("putToHT");
        String name = "Huy";
        OrderManager instance = new OrderManager();
        
        instance.putToHT(name);
        //TC1:
        instance.getHT().forEach((key,item) -> {
            assertEquals("TC1", key,"Huy");
        });
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHT method, of class OrderManager.
     */
    @Test
    public void testGetHT() {
        System.out.println("getHT");
        OrderManager instance = new OrderManager();
        Hashtable<String, ArrayList<Order>> expResult = null;
        Hashtable<String, ArrayList<Order>> result = instance.getHT();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOrder method, of class OrderManager.
     */
    @Test
    public void testGetListOrder() {
        System.out.println("getListOrder");
        OrderManager instance = new OrderManager();
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.getListOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateOrder method, of class OrderManager.
     */
    @Test
    public void testUpdateOrder() {
        System.out.println("updateOrder");
        ArrayList<Order> lo = null;
        int id = 0;
        int quantity = 0;
        OrderManager instance = new OrderManager();
        instance.updateOrder(lo, id, quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
