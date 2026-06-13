import java.sql.*;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBConnection{
    
    private static final String url = "jdbc:mysql://localhost:3306/student_management";
    private static  final String username = "YOUR-USERNAME";
    private static final String password = "YOUR-PASSWORD"; 

    public static Connection getConnection() throws SQLException{
       return DriverManager.getConnection(url, username , password);
    }
}