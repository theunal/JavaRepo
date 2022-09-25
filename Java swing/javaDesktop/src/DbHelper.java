
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    
    private static String username = "root";
    private static String password = "12345";
    private static String url = "jdbc:mysql://localhost:3306/market";
    
    public Connection getConnection() throws SQLException{
        
        return DriverManager.getConnection(url,username,password);
                
    }
    
}
