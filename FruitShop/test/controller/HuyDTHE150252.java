/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Fruit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TrungHuy: HuyDTHE150252
 */
public class HuyDTHE150252 {
    
    public HuyDTHE150252() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addFruit method, of class FruitManager.
     */
    @Test
    public void testAddFruit() {
        System.out.println("addFruit");
        FruitManager instance = new FruitManager();
        instance.addFruit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateFruit method, of class FruitManager.
     */
    @Test
    public void testUpdateFruit() {
        System.out.println("updateFruit");
        FruitManager instance = new FruitManager();
        instance.updateFruit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFruit method, of class FruitManager.
     */
    @Test
    public void testDeleteFruit() {
        System.out.println("deleteFruit");
        FruitManager instance = new FruitManager();
        instance.deleteFruit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFruitList method, of class FruitManager.
     */
    @Test
    public void testGetFruitList() {
        System.out.println("getFruitList");
        ArrayList<Fruit> expResult = null;
        ArrayList<Fruit> result = FruitManager.getFruitList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFruitByItem method, of class FruitManager.
     */
    @Test
    public void testGetFruitByItem() {
        System.out.println("getFruitByItem");
        int id = 0;
        FruitManager instance = new FruitManager();
        Fruit expResult = null;
        Fruit result = instance.getFruitByItem(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
