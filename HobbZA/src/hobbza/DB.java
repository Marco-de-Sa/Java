package hobbza;

/**
 *
 * @author gaurd
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class DB{
    //Declare properties
    private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    private final String url = "jdbc:ucanaccess://HobbyZA.accdb"; 
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    public DB(){
        try{
            Class.forName(driver);
            System.out.println("Driver found");
        }
        catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error: Database Driver not found");
        }
        try{
            connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT EmployeeID, Firstname, Surname, Manager FROM tblEmployees");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "unable to connect");
        }
    }
    public ResultSet queryDB(String inStatement) throws SQLException{
        statement = connection.createStatement();
        resultSet = statement.executeQuery(inStatement);
        return resultSet;
    }

    /**
     *
     * @param inStatement
     * @throws SQLException
     */
    public void changeDB(String inStatement) throws SQLException{
        statement = connection.createStatement();
        statement.executeUpdate(inStatement);
        statement.close();
    }
}