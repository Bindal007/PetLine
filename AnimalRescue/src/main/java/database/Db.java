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
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/petline?user=root&password=root");
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
            int row = st.executeUpdate();
            rs.next();
            conn.close();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
         
    }
    
    
//    --------------------------------------- Products CRUD ------------------------------------------------------
    
    public int createProduct(String name, String cat, int qty, double price) {
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("insert into product (productName, productCat, productQty, productPrice) values(?,?,?,?)");
            st.setString(1, name);
            st.setString(2, cat);
            st.setInt(3, qty);
            st.setDouble(4, price);
            int row = st.executeUpdate();
            conn.close();
            return row;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public ResultSet getProducts() {
        ResultSet rs = null;
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("select * from product");
            rs = st.executeQuery();
            rs.next();
            conn.close();
            return rs;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getVendorProducts(int vendorId) {
        ResultSet rs = null;
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("select * from product where vendorId = ?");
            st.setInt(1, vendorId);
            rs = st.executeQuery();
            rs.next();
            conn.close();
            return rs;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public int updateProduct(int productId, String name, String cat, int qty, double price) {
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("update product set productName=?, productCat=?, productQty=?, productPrice=? where productId=?");
            st.setString(1, name);
            st.setString(2, cat);
            st.setInt(3, qty);
            st.setDouble(4, price);
            st.setInt(5, productId);
            int row = st.executeUpdate();
            conn.close();
            return row;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int deleteProduct(int productId) {
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("delete from product where productId=?");
            st.setInt(1, productId);
            int row = st.executeUpdate();
            conn.close();
            return row;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
//    -----------------------------------------------------------------------------------------
    
    
}
