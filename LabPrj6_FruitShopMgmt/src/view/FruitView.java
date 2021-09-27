/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import common.AppConstant;
import common.DataInput;
import controller.FruitManager;
import model.Fruit;
import java.util.ArrayList;

public class FruitView {

    public static void manageFruits() {
        FruitManager userManager = new FruitManager();
        //Huy-bug 1: Fruits list is not displayed when admin try to manage
        displayListFruit(FruitManager.getFruitList());
        
        while (true) {
            System.out.println("FRUITS MANAGEMENT");
            System.out.println("  1.Add new fruit");
            System.out.println("  2.Edit/update a fruit");
            System.out.println("  3.Delete a fruit");
            System.out.println("  4.Main screen");

            switch (DataInput.checkInputIntLimit(AppConstant.ENTER_CHOICE, 1, 4)) {
                case 1:
                    userManager.addFruit();
                    break;
                case 2:
                    userManager.updateFruit();
                    break;
                case 3:
                    userManager.deleteFruit();
                    break;
                default:
                    return;
            }
        }
    }

    
    // Huy: set this method to static type
    public static void displayListFruit(ArrayList<Fruit> fruitList) {
        int countItem = 1;
        System.out.printf("|++%s++|++%s++|++%s++|++%s++|++%s++|\n", "id", "Fruit name", "Origin", "Price", "Quantity");
        for (Fruit fruit : fruitList) {
            //check shop have item or not 
            if (fruit.getQuantity() != 0) {
                System.out.printf("%5d%10s%15s%10.0f$%10d\n", countItem++,fruit.getFruitName(), fruit.getOrigin(), fruit.getPrice(), fruit.getQuantity());
            }
        }
    }

}
