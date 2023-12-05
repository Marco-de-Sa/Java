/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise;

/**
 *
 * @author gaurd
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String custName = "Jon Doe", itemDesc = "shirt", message;
        message = custName + " wants to buy a " + itemDesc;
        int quantity = 2;
        double tax = 1.15, price = 100, total;
        total = quantity * price * tax;
        
        System.out.println(message);
        System.out.println("Total cost with tax: " + total);
    }
    
}
