/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceregisster;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
*
* @author EvAarde
*/
public class User
{
 //Declare properties
 private String userName;
 private String password;
 //Constructor
 public User(String inUserName, String inPassword)
 {
 userName = inUserName;
 password = inPassword;
 }
 //Get the username
 public String getUserName()
 {
 return userName;
 }
 //get the password
 public String getPassword()
 {
 return password;
 }
}