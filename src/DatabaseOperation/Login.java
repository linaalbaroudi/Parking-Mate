/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import javax.swing.JFrame;

/**
 *
 * @author lina
 */
public class Login extends JFrame {

    Connection conn;
    PreparedStatement statement = null;
    ResultSet result = null;

    /**
     *
     * @throws SQLException
     */
    public Login() throws SQLException {

        conn = DatabaseConnection.DatabaseConnection();

    }

    /**
     *
     * @param name
     * @param password
     * @return
     * @throws SQLException
     */
    public boolean verifyUser(String name, String password) throws SQLException {
//        try {
//            String insertQuery = "insert into HotelManagers"
//                    + "('" + "Name" + "'," + "'" + "Password"+"')"
//                    + " values('"
//                    + name
//                    + "','" + password + "'"
//                    + ")";
//
//            //System.out.println(">>>>>>>>>> "+ insertQuery);
//            statement = conn.prepareStatement(insertQuery);
//
//            statement.execute();
//
//            JOptionPane.showMessageDialog(null, "successfully inserted new Customer");
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "InsertQuery Failed");
//        }
//        finally
//        {
//            flushStatementOnly();
//        }
        try {

            String sql = "select * from HotelManagers where Name='" + name + "'AND Password= '" + password + "'"
                    + "";// ?
            statement = conn.prepareStatement(sql);
            result = statement.executeQuery();
            //statement.setString(1,name );
            //   statement.setString(2,password );
            // System.out.println(result);
            if (result.next()) {
                // return (result.getString("Password").equals(password));
                statement.close();
                result.close();
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");

            return false;
        }
        return false;
    }

    private void flushStatementOnly() {
        {
            try {
                statement.close();
                //conn.close();
            } catch (SQLException ex) {
                System.err.print(ex.toString() + " >> CLOSING DB");
            }
        }
    }

    /**
     *
     */
    public void flushAll() {
        {
            try {
                statement.close();
                result.close();
            } catch (SQLException ex) {
                System.err.print(ex.toString() + " >> CLOSING DB");
            }
        }
    }

}
