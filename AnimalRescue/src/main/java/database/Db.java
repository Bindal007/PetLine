/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import models.Person;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author nikhilbindal
 */
public class Db {
    public Connection getConnect() {
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
    
    public ResultSet getPersonDetails(String userType, String username, String password) {
        ResultSet rs = null;
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("select * from Person where username=? and password=? and personType=?");
            st.setString(1, username);
            st.setString(2, password);
            st.setString(3, userType);
            rs = st.executeQuery();
            rs.next();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
         
    }
//    
//    public static void main(String args[]) {
//        getConnect();
//    }
}
