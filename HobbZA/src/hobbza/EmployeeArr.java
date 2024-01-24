/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hobbza;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author gaurd
 */
public class EmployeeArr {
    private Employee userArr[] = new Employee[50];
    private int size = 0;

    public EmployeeArr() {
        try{
            size = 0;
            Scanner scFile = new Scanner(new File("Users.txt"));
            
            do {                
                String line = scFile.nextLine();
                Scanner scTokens = new Scanner(line).useDelimiter("#");
                String username = scTokens.next();
                String password = scTokens.next();
                
                userArr[size] = new Employee(username, password);
                size++;
                
            } while (scFile.hasNext());
            scFile.close();
            
        } catch (FileNotFoundException f) {
            JOptionPane.showMessageDialog(null, "File not found");
        }
    }
    
    public boolean userExists(String inUserName){
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (userArr[i].getUserName().equals(inUserName)) {
                found = true;
                break;
            }
        }
        return found;
    }
    
    public boolean passwordValid(String inUserName, JPasswordField inPassword){
        boolean valid = false;
        
        char[] input = inPassword.getPassword();
        for (int i = 0; i < size; i++) {
            if (userArr[i].getUserName().equals(inUserName)) {
                char[] correctPassword = userArr[i].getPassword().toCharArray();
                
                if (input.length != correctPassword.length) {
                    valid = false;
                } else{
                    valid = Arrays.equals(input, correctPassword);
                }
            }
        }
        return valid;
        
    }
}
