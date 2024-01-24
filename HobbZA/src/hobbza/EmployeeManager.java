/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hobbza;

import java.io.IOException;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author gaurd
 */
public class EmployeeManager {

    private DB HobbyZA = new DB();
    ResultSet rs;

    public EmployeeManager() {

    }

    public String getEmployeeData() {
        String out = "EmployeeID\tName\t\tStoreID\t\tManager\t\tUsername\t\tPassword\n\n";
        String query = "SELECT * FROM tblEmployees";

        try {
            rs = HobbyZA.queryDB(query);
            while (rs.next()) {
                out += rs.getInt("EmployeeID") + "\t";
                out += rs.getString("Firstname") + " ";
                out += rs.getString("Surname") + "\t\t";
                out += rs.getInt("StoreID") + "\t\t";
                if (rs.getBoolean("Manager")) {
                    out += "yes\t\t";
                } else {
                    out += "no\t\t";
                }
                out += rs.getString("Username") + "\t\t";
                out += rs.getString("Password") + "\n";
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error data not found");
        }

        return out;
    }

    public void addEmployeeToDB(int Store, String text, String text0, String text1, boolean Mngr) throws IOException {
        String Login = "";
        //text is firstname and text0 is Surname
        int rand = (int) (Math.random() * (99 - 1 + 1) + 1);
        String Username = text.substring(0, 3) + text0.substring(0, 3) + rand;

        try {
            HobbyZA.changeDB("INSERT INTO tblEmployees(StoreID, Firstname, Surname, Username, Password, Manager)"
                    + " VALUES(" + Store + ", '" + text + "', '" + text0 + "', '" + Username + "', '" + text1 + "', " + Mngr + ")");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Could not insert data");
        }

    }

    private void changeDB(String inStatement) {
        try {
            HobbyZA.changeDB(inStatement);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "could not alter");
        }
    }

    //text = Firstname      text0 = Surname       text1 = Password     text2 = Employee ID
    public void updateEmployeeData(int Store, String text, String text0, String text1, boolean Mngr, String text2) {
        int rand = (int) (Math.random() * (99 - 1 + 1) + 1);
        String Username = text.substring(0, 3) + text0.substring(0, 3) + rand;
        String Login = "";
        changeDB("UPDATE tblEmployees SET tblEmployees.StoreID = '"
                + Store + "', tblEmployees.Firstname = '"
                + text + "', tblEmployees.Surname = '"
                + text0 + "', tblEmployees.Username = '"
                + Username + "', tblEmployees.[Password] = '"
                + text1 + "', tblEmployees.Manager = "
                + Mngr + " WHERE (((tblEmployees.[EmployeeID])="
                + Integer.parseInt(text2) + "))");

    }

    public void deleteEmployeeFromDB(int ID) {
        changeDB("DELETE FROM tblEmployees WHERE EmployeeID = " + ID);
    }
}
