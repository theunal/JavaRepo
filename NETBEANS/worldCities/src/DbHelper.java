import java.sql.*;
public class DbHelper {
    private String username = "root";
    private String password = "12345";
    private String url = "jdbc:mysql://localhost:3306/world";
    
    
    public Connection getConnection()throws SQLException{
    return DriverManager.getConnection(url, username, password);
}
    
    public void showErrorMessage(SQLException exception) {
        System.out.println("Error: "+exception.getMessage());
          System.out.println("Error Code: "+exception.getErrorCode());
    }
    
}
