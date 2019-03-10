package ua.com.juja.core.sqlcmd;

import java.sql.*;

/**
 * Created by Diana on 12.01.2019.
 */
public class Main {
    private static Connection connection;
    private static DatabaseMetaData dbData;
    private static ResultSet resultSet;

    public static void main(String[] argv) {
        try {
            connection = DBConnetion.getDBConnection("postgres", "postgres", "fg56j7");
            Statement stmt = connection.createStatement();

            stmt.executeUpdate("INSERT INTO clients " + "VALUES ('23', 'Simpson', '+380672209450', 'Kyiv')");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }
}
