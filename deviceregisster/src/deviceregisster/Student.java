/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceregisster;

/**
*
* @author elna.vanaarde
*/
public class Student
{
 //Declare properties
 private int id;
 private String name;
 private int grade;
 //Constructor
 public Student()
 {
 }
 //Return name
 public String getName()
 {
 return name;
 }
 //Return grade
 public int getGrade()
 {
 return grade;
 }
 //Update id
 public void setId(int inId)
 {
 id = inId;
 }
 //Update name
 public void setName(String inName)
 {
 name = inName;
 }
 //Update grade
 public void setGrade(int inGrade)
 {
 grade = inGrade;
 }
}