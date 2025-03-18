<<<<<<< HEAD
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://LAPTOP-BCICGTP0\\SQL2019A;databaseName=BookShop;encrypt=false;trustServerCertificate=TRUE;loginTimeout=30;";
    private static final String USER = "sa";
    private static final String PASSWORD = "12345";

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args) {
        getConnection();
    }
}
=======
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://LAPTOP-BCICGTP0\\SQL2019A;databaseName=BookShop;encrypt=false;trustServerCertificate=TRUE;loginTimeout=30;";
    private static final String USER = "sa";
    private static final String PASSWORD = "12345";

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args) {
        getConnection();
    }
}
>>>>>>> c95924d (Moved Dockerfile to root directory)
