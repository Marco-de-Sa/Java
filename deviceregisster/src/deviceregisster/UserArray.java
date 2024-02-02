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
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
/**
*
* @author EvAarde
*/
public class UserArray
{
 //Declare array. Make provision for 20 values
 private User userArr[] = new User[20];
 private int size = 0;
 //Contructor
 public UserArray()
 //Read through the text file and populate the array
 {
 try
 {
 //Initialise size. This method can be called from different places
 //Every time the file is read, the size must be initialised
 size = 0;
 //Opent the file
 Scanner scFile = new Scanner(new File("Users.txt"));
 //Read through file
 while (scFile.hasNext())
 {
 //Get line
 String line = scFile.nextLine();
 //Get tokens, specify delimiter
 Scanner scTokens = new Scanner(line).useDelimiter("#");
 //Get the values
 String userName = scTokens.next();
 String password = scTokens.next();
 //Populate array
 userArr[size] = new User(userName, password);
 //Increase size
 size++;
 }
 //Close file
 scFile.close();
 }
 catch(FileNotFoundException f)
 {
 //Display an error if the file is not found
 JOptionPane.showMessageDialog(null, "File not found");
 }
 }
 public boolean userExists(String inUserName)
 {
 boolean found = false;
 for (int i = 0; i < size; i++)
 {
 if(userArr[i].getUserName().equals(inUserName))
 {
 found = true;
 break;
 }
 }
 return found;
 }
 public boolean passwordValid(String inUserName, JPasswordField inPassword)
 {
 boolean valid = false;
 char[] input = inPassword.getPassword();
 for (int i = 0; i < size; i++)
 {
 if(userArr[i].getUserName().equals(inUserName))
 {
 char[] correctPassword = userArr[i].getPassword().toCharArray();
 if (input.length != correctPassword.length) {
 valid = false;
 } else {
 valid = Arrays.equals (input, correctPassword);
 }
 }
 }
 return valid;
 }
 //*** Only include if register button used
 //Add a new user
 public void insertUser(String inUsername, JPasswordField inPassword)
 {
 if (!userExists(inUsername))
 {
 //Convert character array to String
 String password = new String(inPassword.getPassword());
 userArr[size+1] = new User(inUsername, password);
 size++;
 writeUserToFile(inUsername,password);
 }
 }
 //*** Only include if register button used
 public void writeUserToFile(String inUsername, String inPassword)
 {
 //This method will write the data for a new user to the file
 try
 {
 //Create new user in file
 PrintWriter userFile = new PrintWriter(new FileWriter("Users.txt", true));
 userFile.println(inUsername + "#" + inPassword);
 //Close the file
 userFile.close();
 }
 catch (IOException ex)
 {
 //Display error message if the file was not found
 JOptionPane.showMessageDialog(null, "File not found");
 }
 }
}