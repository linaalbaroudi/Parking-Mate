/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking_mate;

import java.util.Scanner;

/**
 *
 * @author lina Albaroudi, Hala Murad, Albatool Qatrangi, Shahed Alkharsah,
 * Einas Alkharsah
 */
public class Admin extends User {

    public Admin(int userID, String name, String password, String email, String phone) {
        super(userID, name, password, email, phone);
    }

    @Override
    public boolean login() {
        return super.login();
    }

    @Override
    public boolean logout() {
        return super.logout(); //To change body of generated methods, choose Tools | Templates.
    }

}
