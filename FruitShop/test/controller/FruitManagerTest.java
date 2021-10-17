/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Fruit;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author win
 */
public class FruitManagerTest {
    FruitManager fm;
    public FruitManagerTest() {
        fm = new FruitManager();
    }

    @Test
    public void testAddFruit() {
    }

    @Test
    public void testUpdateFruit() {
    }

    @Test
    public void testDeleteFruit() {
    }

    @Test
    public void testGetFruitList() {
    }

    @Test
    public void testGetFruitByItem() {
        Fruit f = fm.getFruitByItem(0);
        Fruit expected = null;
        assertEquals(expected, f);
        
    }
    
}
