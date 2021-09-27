package controller;

import common.DataInput;
import java.util.ArrayList;
import model.Fruit;

public class FruitManager {

    //Huy-bug 2: this field should be private type instead of final
    private static ArrayList<Fruit> fruitList = new ArrayList<>();

    public FruitManager() {
    }

    public void addFruit() {
        //loop until user don't want to create fruit
        while (true) {
            //Huy-bug 3: change suitable method
            // String fruitId = DataInput.checkInputString("Enter fruit id: ");
            int fruitId = DataInput.checkInputIntLimit("Enter fruit id: ",0, Integer.MAX_VALUE);
            if (DataInput.fruitExisted(fruitList, fruitId)) {
                System.err.println("Id exist");
                return;
            }
             
            //Huy-bug 4: name is not formated
            //  String fruitName = DataInput.checkInputString("Enter fruit name: ");
            String fruitName = DataInput.checkInputName("Enter fruit name: ");
            //Huy-bug 5: price is not set condition
            //double price = DataInput.checkInputDouble("Enter price: ");
            double price = 0;
            do{
             price = DataInput.checkInputDouble("Enter price: ");
            }while(price <= 0);
            
            //Huy-bug 6: quantity is not set condition
            //int quantity = DataInput.checkInputInt("Enter quantity: ");
            int quantity = DataInput.checkInputIntLimit("Enter quantity: ",0, Integer.MAX_VALUE);
            //Huy-bug 7: origin is not formated
            //String origin = DataInput.checkInputString("Enter origin: ");
            String origin = DataInput.checkInputName("Enter origin: ");
            fruitList.add(new Fruit(fruitId, fruitName, price, quantity, origin));
            //check user want to continue or not
            if (!DataInput.checkInputYN()) {
                return;
            }
        }
    }

    public void updateFruit() {
        //loop until user don't want to create fruit
        while (true) {
             //Huy-bug 8: change suitable method
            // String fruitId = DataInput.checkInputString("Enter fruit id: ");
            int fruitId = DataInput.checkInputIntLimit("Enter fruit id: ",0, Integer.MAX_VALUE);
            if (!DataInput.fruitExisted(fruitList, fruitId)) {
                System.err.println("Id does not exist!");
                return;
            }
            //Huy-bug 9: name is not formated
            //  String fruitName = DataInput.checkInputString("Enter fruit name: ");
            String fruitName = DataInput.checkInputName("Enter fruit name: ");
            
           //Huy-bug 10: price is not set condition
            //double price = DataInput.checkInputDouble("Enter price: ");
            double price = 0;
            do{
             price = DataInput.checkInputDouble("Enter price: ");
            }while(price <= 0);
            //Huy-bug 11: quantity is not set condition
            //int quantity = DataInput.checkInputInt("Enter quantity: ");
            int quantity = DataInput.checkInputIntLimit("Enter quantity: ",0, Integer.MAX_VALUE);
            
            
            //Huy - bug 12 : origin is not formated
            // String origin = DataInput.checkInputString("Enter origin: ");
            String origin = DataInput.checkInputName("Enter origin: ");
            fruitList.add(new Fruit(fruitId, fruitName, price, quantity, origin));
        }
    }

    public void deleteFruit() {
        while (true) {
             //Huy-bug 13: change suitable method
            // String fruitId = DataInput.checkInputString("Enter fruit id: ");
            int fruitId = DataInput.checkInputIntLimit("Enter fruit id: ",0, Integer.MAX_VALUE);
            if (!DataInput.fruitExisted(fruitList, fruitId)) {
                System.err.println("Id does not exist!");
                return;
            }
            //Huy - bug 14: delete is empty!
            for(int i = 0; i <fruitList.size(); i++){
                if(fruitList.get(i).getFruitId() == fruitId){
                    fruitList.remove(i);
                    return;
                }
            }
        }
    }

    //Huy-bug 15: set this method to static in order to get fruitlist
    public static ArrayList<Fruit> getFruitList() {
        return fruitList;
    }

    //Huy-bug 16:  Fruit must be found by id not item
    /*
    //get fruint user want to by
    public Fruit getFruitByItem(int item) {
        int countItem = 1;
        for (Fruit fruit : fruitList) {
            //check shop have item or not 
            if (fruit.getQuantity() != 0) {
                countItem++;
            }
            if (countItem - 1 == item) {
                return fruit;
            }
        }
        return null;
    }
    */
    public Fruit getFruitByItem(int id) {
        int countItem = 1;
        for (Fruit fruit : fruitList) {
            //check shop have item or not 
             
            if (countItem - 1 == id) {
                return fruit;
            }
        }
        return null;
    }
}
