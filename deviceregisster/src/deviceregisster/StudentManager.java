/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceregisster;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class StudentManager
{
 //Create database object
 private DB hobbyZA = new DB();
 //Declare resultset
 ResultSet rs;
 public StudentManager()
 {
 }
 public String getStudentData()
 //Return all the array entries as a string
 {
 //This is the heading line, add two new lines so that there is a space
 //between the heading and the data
 String out = "Id" + Utilities.addSpaces("Id", 10) + "Name" + Utilities.addSpaces("Name", 30) +
"Grade" + Utilities.addSpaces("Grade", 5) + "\n\n";
 String query = "SELECT * FROM tblStudents";
 try
 {
 rs = hobbyZA.queryDB(query);
 //Read through resultset
 while (rs.next())
 {
 //Add data to output string
 //Add spaces to allow text to align
 out += rs.getInt("ID") + Utilities.addSpaces("" + rs.getInt("ID"),10); //Convert int to
String
 out += rs.getString("StudentName") + Utilities.addSpaces(rs.getString("StudentName"),30);
 out += rs.getInt("Grade") + Utilities.addSpaces("" + rs.getInt("Grade"),5) + "\n"; //Convert
int to String, move cursor to netxt line
 }
 }
 catch(SQLException e)
 {
 //Display an error if the database could not be read
 JOptionPane.showMessageDialog(null, "Could not read data");
 }
 //return output string
 return out;
 }
 public String getStudentData(String sortField, String whereClause)
 //Return all the array entries as a string
 {
 //This is the heading line, add two new lines so that there is a space
 //between the heading and the data
 String out = "Id" + Utilities.addSpaces("Id", 10) + "Name" +
 Utilities.addSpaces("Name", 30) + "Grade" +
 Utilities.addSpaces("Grade", 5) + "\n\n";
 //Basix query
 String query = "SELECT * FROM tblStudents";
 //Check if there is a WHERE clause
 if (!whereClause.isEmpty())
 {
 //Add if not empty
 query += " WHERE " + whereClause;
 }
 //Check if an ORDER BY clause is specified
 if (!sortField.isEmpty())
 {
 //Add if not empty
 query += " ORDER BY " + sortField;
 }
 try
 {
 //Run the query
 rs = hobbyZA.queryDB(query);
 //Read through resultset
 while (rs.next())
 {
 //Add data to output string
 //Add spaces to allow text to align
 out += rs.getInt("ID") + Utilities.addSpaces("" + rs.getInt("ID"),10); //Convert int to
String
 out += rs.getString("StudentName") + Utilities.addSpaces(rs.getString("StudentName"),30);
 out += rs.getInt("Grade") + Utilities.addSpaces("" + rs.getInt("Grade"),5) + "\n";
 //Convert int to String, move cursor to next
line
 }
 }
 catch(SQLException e)
 {
 //Display an error if the database could not be read
 JOptionPane.showMessageDialog(null, "Could not read data");
 }
 //return output string
 return out;
 }
 public Student getOneStudent(int inId)
 //Return all the array entries as a string
 {
 Student studentSearched = new Student();
 String query = "SELECT * FROM tblStudents WHERE Id = " + inId;
 try
 {
 rs = hobbyZA.queryDB(query);
 //Read through resultset
 if (rs.next())
 {
 //Add data to output string
 studentSearched.setId(rs.getInt("ID"));
 studentSearched.setName(rs.getString("StudentName"));
 studentSearched.setGrade(rs.getInt("Grade"));
 }
 }
 catch(SQLException e)
 {
 //Display an error if the database could not be read
 JOptionPane.showMessageDialog(null, "Could not read data");
 }
 //return output string
 return studentSearched;
 }
 public void addStudentToDB(String inName, int inGrade)
 //This method will write the data for a new student to the database
 {
 try
 {
 //Send query to DB
 hobbyZA.changeDB("INSERT INTO tblStudents(StudentName, Grade) "
 + "VALUES ('" + inName + "'," + inGrade + ")");
 }
 catch(SQLException e)
 {
 //Display an error if the database could not be read
 JOptionPane.showMessageDialog(null, "Could not insert data");
 }
 }
 public void deleteStudentFromDB(int inId)
 //This method will delete a student with a specific id
 { //Write the updated array to the file
 changeDB("DELETE FROM tblStudents WHERE ID = " + inId);
 }
 public void updateStudentInDB(int inId, String inNewName, int inNewGrade)
 //This method updates the values of a specific student
 {
 //Write the updated array to the file
 changeDB("UPDATE tblStudents SET StudentName = '" + inNewName + "', Grade = " + inNewGrade
 + " WHERE ID = " + inId);
 }
 //NOTE: This is a Helper method, private, used only in this class
 private void changeDB(String inStatement)
 //This method will write the data for all students to the file
 {
 try
 {
 //Send query to DB
 hobbyZA.changeDB(inStatement);
 }
 catch(SQLException e)
 {
 //Display an error if the database could not be read
 JOptionPane.showMessageDialog(null, "Could not alter database");
 }
 }
}