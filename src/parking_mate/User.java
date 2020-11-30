/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking_mate;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lina Albaroudi, Hala Murad, Albatool Qatrangi, Shahed Alkharsah,
 * Einas Alkharsah
 *
 */
public abstract class User {

    private int userID;
    private String name;
    private String password;
    private String email;
    private String phone;

    /**
     *
     * @param userID
     * @param name
     * @param password
     * @param email
     * @param phone
     */
    public User(int userID, String name, String password, String email, String phone) {
        this.userID = userID;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    public boolean login() {
        boolean isLoggedIn = false;

        String userName;
        String password;

        Scanner nameInput = new Scanner(System.in);
        System.out.println("Username:");
        userName = nameInput.next();

        Scanner passwordInput = new Scanner(System.in);
        System.out.println("Password:");
        password = passwordInput.next();

        if (userName == this.getName() && password == this.getPassword()) {
            isLoggedIn = true;
        }

        return isLoggedIn;
    }

    public boolean logout() {
        boolean isLoggedOut = false;
        try {
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isLoggedOut;
    }

}
