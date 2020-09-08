/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class MySQLAccess {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String db = "mydb";
    private String user = "root";
    private String pass = "rootroot";
    private String url = "jdbc:mysql://localhost:3306/" + db + "?";

    public MySQLAccess() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();

        } catch (Exception e) {
            System.out.println(e.toString());

        }
    }

    public void insertInto(PreparedStatement ps) throws SQLException {
        this.preparedStatement = ps;
        preparedStatement.executeUpdate();
    }

    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}
