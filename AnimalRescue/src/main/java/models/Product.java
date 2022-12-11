/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import database.Db;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Farheen Zubair
 */
public class Product {
    private int productId;
    private String productName;
    private int category;
    private int quantity;
    private double productPrice;
    private Db db = new Db();

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    
    public void createProduct(String name, String cat, int qty, double price) {
        int res = db.createProduct(name, cat, qty, price);
        if(res != 0) {
            JOptionPane.showMessageDialog(null, "Product is created!");
        }
    }
    
    public ResultSet getProducts() {
        ResultSet rs = db.getProducts();
        return rs;
    }
    
    public ResultSet getVendorProducts(int vendorId) {
        ResultSet rs = db.getVendorProducts(vendorId);
        return rs;
    }
    
}
