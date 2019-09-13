package BillingSystem;


import java.sql.*;
import java.io.FileReader;
import java.util.Properties;

public class DbUtils {
    
    Connection conn;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public DbUtils() {
        initConnection();
    }
    
    private void initConnection() {
        String username;
        String password;
        String host;
        String url;
        try {
            FileReader loginFile = new FileReader("conf/login.properties");
            Properties properties = new Properties();
            properties.load(loginFile);
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            host = properties.getProperty("host");            
            url = "jdbc:postgresql://".concat(host);
            
            conn = DriverManager.getConnection(url, username, password);
        } catch(Exception e) {
            System.out.println("Error occured during login: " + e);
        }
    }
    
    public ResultSet execute(String sql) {
        try {
            preparedStatement = conn.prepareStatement(sql);
            if(sql.startsWith("insert")) {
                preparedStatement.executeUpdate();
            } else {  
                resultSet = preparedStatement.executeQuery();
            }
        } catch (SQLException e) {
            System.out.println("Error occured during execution: " + e);
        }
        return resultSet;
    }
}
