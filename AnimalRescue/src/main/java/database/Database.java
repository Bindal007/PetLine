/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author nikhilbindal
 */
public class Database {
    public static Connection getConnect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/petline?user=root&password=nikhil007");
            System.out.println("Connection established!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
//    public 
//    
//    public static void main(String args[]) {
//        getConnect();
//    }
}
