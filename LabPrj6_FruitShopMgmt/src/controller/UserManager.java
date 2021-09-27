/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.AppConstant;
import common.DataInput;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author kiennt
 */
public class UserManager {

    public void addAdmin() {
        File f = new File(AppConstant.USER_DATA);
        if (!f.exists()) {
            // do something
            User u = new User(1, "truongvim", "123", 1);
            try {
                FileWriter fw = new FileWriter("src/view/Data/user.dat");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(u.toString());
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        } else {
            if (f.length() == 0) {
                User u = new User(1, "truongvim", "123", 1);
                try {
                    FileWriter fw = new FileWriter("src/view/Data/user.dat");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(u.toString());
                    bw.close();
                    fw.close();
                } catch (Exception e) {
                }
            }else{
                return;
            }
        }

    }

    public static ArrayList<User> getListAccountsFromData() {
        ArrayList<User> listUsers = new ArrayList<>();
        try {
            FileReader fr = new FileReader(AppConstant.USER_DATA);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String txt[] = line.split("\\|");
                int id = Integer.parseInt(txt[0]);
                String name = txt[1];
                String pass = txt[2];
                int type = Integer.parseInt(txt[3]);
                listUsers.add(new User(id, name, pass, type));
            }
        } catch (Exception e) {
        }
        return listUsers;
    }

    public static void saveAccountToFile(ArrayList<User> listUsers) {
        try {
            FileWriter fw = new FileWriter(AppConstant.USER_DATA);
            BufferedWriter bw = new BufferedWriter(fw);
            for (User u : listUsers) {
                bw.write(u.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public static boolean checkLogin(User user) {
        File f = new File(AppConstant.USER_DATA);
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split("\\|");
                if (user.getUserName().equals(userInfo[1].trim()) && user.getPassword().equals((userInfo[2].trim()))) {
                    user.setType(Integer.parseInt(userInfo[3].trim()));
                    user.setUserId(Integer.parseInt(userInfo[0].trim()));
                    return true;
                }
            }
        } catch (IOException ex) {
        }

        return false;
    }

    public void addUser() {
        //loop until user don't want to create fruit
        ArrayList<User> listUsers = getListAccountsFromData();
        while (true) {
            String userName = DataInput.checkInputString("Enter user name: ");
            String password = DataInput.checkInputString("Enter password: ");
            int userType = DataInput.checkInputInt("Enter user type: ");
            listUsers.add(new User(listUsers.get(listUsers.size() - 1).getUserId() + 1, userName, password, userType));

            //check user want to continue or not
            if (!DataInput.checkInputYN()) {
                saveAccountToFile(listUsers);
                return;
            }

        }
    }

    public void updateUser() {
        ArrayList<User> listUsers = getListAccountsFromData();
        //loop until user don't want to create fruit
        while (true) {
            int userCode = DataInput.checkInputInt("Enter user code: ");
            if (!DataInput.userExisted(listUsers, userCode)) {
                System.err.println("User code does not exist!");
                return;
            }

            String userName = DataInput.checkInputString("Enter user name: ");
            String password = DataInput.checkInputString("Enter password: ");
            int userType = DataInput.checkInputInt("Enter user type: ");
            for (User u : listUsers) {
                if (u.getUserId() == userCode) {
                    u.setUserName(userName);
                    u.setPassword(password);
                    saveAccountToFile(listUsers);
                    return;
                }
            }

        }

    }

    public void deleteUser() {
        ArrayList<User> listUsers = getListAccountsFromData();
        while (true) {
            int userCode = DataInput.checkInputInt("Enter user code: ");
            if (!DataInput.userExisted(listUsers, userCode)) {
                System.err.println("Id does not exist!");
                return;
            } else {
                for (User u : listUsers) {
                    if (u.getUserId() == userCode) {
                        listUsers.remove(u);
                        saveAccountToFile(listUsers);
                        return;
                    }
                }
            }
        }
    }
}
