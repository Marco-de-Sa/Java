/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceregisster;
import java.sql.*;
import javax.swing.JOptionPane;
/**
* @author elna.vanaarde
*/
public class DB
 //Declare properties
 private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
 private final String url = "jdbc:ucanaccess://StudentDevices.accdb"; //DB must be in project folder
 private Connection connection;
 private Statement statement;
 private ResultSet resultSet;
 public DB()
 {
 //Load driver
 try
 {
 Class.forName(driver);
 System.out.println("Driver found");
 }
 catch (ClassNotFoundException e) //Trap the error if the driver is not found
 {
 JOptionPane.showMessageDialog(null, "Error: Database Driver not found");
 }
 //Create connection
 try
 {
 connection = DriverManager.getConnection(url);
 }
 catch(SQLException e) //Trap the error if database connection is not successful
 {
 //System.out.println(e.toString());
 JOptionPane.showMessageDialog(null, "unable to connect");
 }
 }
 public ResultSet queryDB(String inStatement) throws SQLException
 //This is the genetic query to execute a SELECT statement
 {
 //Query the database
 statement = connection.createStatement();
 System.out.println(inStatement);
 resultSet = statement.executeQuery(inStatement);
 //Return data as a resultset
 return resultSet;
 }
 public void changeDB(String inStatement) throws SQLException
 //This is the genetic query to execute an INSERT / UPDATE / DELETE statement
 {
 statement = connection.createStatement();
 //Excecute the SQL statement
 statement.executeUpdate(inStatement);
 statement.close();
 }
}