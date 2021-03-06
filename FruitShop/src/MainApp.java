
import view.FruitView;
import view.OrderView;

import controller.*;
import common.*;
import model.User;
import view.UserView;

public class MainApp {
    public static void main(String[] args) {
        UserManager u = new UserManager();
        u.addAdmin();// add admin to controller manager
        // remove shopping screen because when user login first--> depending on type -->shopping
        while (true) {
            System.out.println("FRUIT SHOP SYSTEM");
            System.out.println("  1.Login");
            System.out.println("  2.Exit");
            switch (DataInput.checkInputIntLimit(AppConstant.ENTER_CHOICE, 1, 2)) {
                case 1:
                    UserView userView = new UserView();
                    User user = userView.login();
                    if (user.getType() == 1) {
                        handleAdminMenu(user);
                    } else {
                        handleSaleMenu();//remove user parameter
                    }
                    break;
                default:
                    return;
            }
        }
    }

    private static void goShopping() {
        FruitManager fm = new FruitManager();
        FruitView fv = new FruitView();
        OrderManager om = new OrderManager();
        OrderView ov = new OrderView();
       
        fv.displayListFruit(fm.getFruitList());
        System.out.print("Enter item: ");// if shopping dont have item annouce list item empty

        int item = DataInput.checkInputIntLimit(1, fm.getFruitList().size());//annouce you selected name fruit by id
        // check fruit existed 
        System.out.print("Enter quantity: ");
        int quantity = DataInput.checkInputIntLimit(1, fm.getFruitByItem(item).getQuantity());
//        // must call check input Y/N
//        Do you want to order now 
//(Y/N). If customer selects N, the program returns to List of Fruit to continue ordering. If 
//select Y
        om.shopping(fm.getFruitList(), fm.getFruitByItem(item), quantity);
        ov.displayListOrder(om.getListOrder());
        String name = DataInput.checkInputString("Enter name: ");
        om.putToHT(name);
        // need add more fucntion to update quantity when user finished bought 
        System.out.println("Add successfull");
    }

    private static void handleAdminMenu(User user) {
        while (true) {
            System.out.println("ADMIN SYSTEM");// change  because FRUIT SHOP duplicated 3 times
            System.out.println("  1.Manage users");
            System.out.println("  2.Manage fruits");
            System.out.println("  3.View orders");
            System.out.println("  4.Shopping");
            System.out.println("  5.Logout");
            switch (DataInput.checkInputIntLimit(AppConstant.ENTER_CHOICE, 1, 5)) {
                case 1:
                    UserView.manageUsers();
                    break;
                case 2:
                    FruitView.manageFruits();
                    break;
                case 3:
                    viewOrders();
                    break;// need add break;
                case 4:
                    goShopping();
                    break;// need add break;
                default:
                    return;
            }
        }
    }

    private static void viewOrders() {
        OrderManager orderManager = new OrderManager();
        OrderView orderView = new OrderView();
        orderView.viewOrder(orderManager.getHT());
    }

    private static void handleSaleMenu() {//remove User user 
        while (true) {
            System.out.println(" SALE FRUIT SYSTEM");//change  because FRUIT SHOP duplicated 3 times
            System.out.println("  1.Manage fruits");
            System.out.println("  2.View orders");
            System.out.println("  3.Shopping");
            System.out.println("  4.Logout");
            switch (DataInput.checkInputIntLimit(AppConstant.ENTER_CHOICE, 1, 4)) {
                case 1:
                    FruitView.manageFruits();
                    break;
                case 2:
                    viewOrders();
                    break; 
                case 3:
                    goShopping();
                    break;
                default:
                    return;
            }
        }
    }
}
