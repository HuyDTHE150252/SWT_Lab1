package controller;

import common.DataInput;
import java.util.ArrayList;
import model.Fruit;

public class FruitManager {

    private final ArrayList<Fruit> fruitList = new ArrayList<>();

    public void addFruit() {
        //loop until user don't want to create fruit
        while (true) {
            int fruitId = DataInput.checkInputIntLimit("Enter fruit id: ",0, Integer.MAX_VALUE);
            if (DataInput.fruitExisted(fruitList, fruitId)) {
                System.err.println("Id exist");
                return;
            }
            String fruitName = DataInput.checkInputString("Enter fruit name: ");
            double price = DataInput.checkInputDouble("Enter price: ");
            int quantity = DataInput.checkInputIntLimit("Enter quantity: ",0, Integer.MAX_VALUE);
            String origin = DataInput.checkInputString("Enter origin: ");
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
            int fruitId = DataInput.checkInputIntLimit("Enter fruit id: ",0, Integer.MAX_VALUE);
            if (!DataInput.fruitExisted(fruitList, fruitId)) {
                System.err.println("Id does not exist!");
                return;
            }
            String fruitName = DataInput.checkInputString("Enter fruit name: ");
            double price = DataInput.checkInputDouble("Enter price: ");
            int quantity = DataInput.checkInputIntLimit("Enter quantity: ",0, Integer.MAX_VALUE);
            String origin = DataInput.checkInputString("Enter origin: ");
            fruitList.add(new Fruit(fruitId, fruitName, price, quantity, origin));
        }
    }

    public void deleteFruit() {
        while (true) {
            int fruitId = DataInput.checkInputIntLimit("Enter fruit id: ",0, Integer.MAX_VALUE);
            if (!DataInput.fruitExisted(fruitList, fruitId)) {
                System.err.println("Id does not exist!");
                return;
            }
        }
    }

    public ArrayList<Fruit> getFruitList() {
        return fruitList;
    }

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
}
