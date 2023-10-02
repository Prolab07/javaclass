package MySQL;

import java.sql.*;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private Connection connection;

    private DatabaseConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "1234";
            String base_url = "jdbc:mysql://localhost:3306/";

            // Підключення без вказівки схеми
            DatabaseMetaData DriverManager;
            Connection initialConnection = DriverManager.getConnection(base_url, user, password);
            String dbName = "robot_dreams";
            try (Statement statement = initialConnection.createStatement()) {
                // Створення схеми, якщо вона не існує
                statement.execute("CREATE DATABASE IF NOT EXISTS " + dbName);
            }
            initialConnection.close();

            // Підключення до створеної (або існуючої) схеми
            String url = base_url + dbName;
            this.connection = DriverManager.getConnection();
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        } else if (instance.getConnection().isClosed()) {
            synchronized (DatabaseConnection.class) {
                if (instance == null || instance.getConnection().isClosed()) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}

