/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import models.Person;
import java.sql.PreparedStatement;

/**
 *
 * @author nikhilbindal
 */
public class Database {
    private Connection conn = null;
    public Connection getConnect() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/petline?user=root&password=nikhil007");
            System.out.println("Connection established!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    public Person getPersonDetails(String userType, String username, String password) {
        PreparedStatement st = (PreparedStatement) conn.prepareStatement("select * from Person where username=? and password=? and personType=?");
         
    }
//    
//    public static void main(String args[]) {
//        getConnect();
//    }
}
