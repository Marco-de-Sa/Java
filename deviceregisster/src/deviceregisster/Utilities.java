/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceregisster;
/**
*
* @author EvAarde
*/
public class Utilities
{
 //NOTE: This is a Helper method, private, used only in this class
 //private String addSpaces(String s, int width)
 //NOTE: This is a Helper method, private, used only in this class
 public static String addSpaces(String s, int width)
 //This method receives a string value and a width
 //It returns a string of spaces so that the string plus spaces are as long as "width"
 //This will allow values to be aligned
 {
 //Declare and initialise variable
 String newString = "";
 //Add spaces till the string and spaces are as long as "width"
 for (int i = 0; i < width - s.length(); i++)
 {
 //Add a space
 newString += " ";
 }
 return newString;
 }
}