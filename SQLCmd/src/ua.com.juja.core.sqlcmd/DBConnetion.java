package ua.com.juja.core.sqlcmd;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Diana on 14.01.2019.
 */
 class DBConnetion {
    static Connection getDBConnection(String databaseName, String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String databaseAdress = "jdbc:postgresql://127.0.0.1:5432/";
        return DriverManager.getConnection(databaseAdress + "" + databaseName, username, password);
    }
}
