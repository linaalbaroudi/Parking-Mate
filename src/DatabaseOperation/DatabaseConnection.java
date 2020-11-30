/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
//import org.sqlite.*;

/**
 *
 * @author lina
 */
public class DatabaseConnection {

    static Connection DatabaseConnection() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Parking_Mate_DB.sql");
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
    }

}
