/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package writetofilepractice;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class WriteToFilePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String out = "";
        try {
            FileWriter fw = new FileWriter("Names.txt");
            
            fw.write("Alex#Don");
            fw.close();
        } catch (IOException e) {
            System.out.println("could not execute");
        }
    }
    //https://www.youtube.com/watch?v=kjzmaJPoaNc&ab_channel=BroCode
}
