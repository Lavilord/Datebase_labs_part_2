package ua.lviv.iot.dal.persistant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/iot_lab_db_2"
            +"?allowPublicKeyRetrieval=true&createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException sqlException) {
            System.out.println("SQL Exception:" + sqlException.getMessage());
            System.out.println("SQL State:" + sqlException.getSQLState());
            System.out.println("Vendor Error:" + sqlException.getErrorCode());
        }
        return connection;
    }
}
