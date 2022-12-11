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
            System.out.println("User created!");
        }
        return conn;
    }

    
//    --------------------------------------- User and Address CRUD ----------------------------------------------
    
    public int createAddress(String street, String city, String state, String zip) {
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("insert into address (street, city, state, zipcode) values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, street);
            st.setString(2, city);
            st.setString(3, state);
            st.setString(4, zip);
            int row = st.executeUpdate();
            ResultSet genKey = st.getGeneratedKeys();
            if(genKey.next()) {
                int key = genKey.getInt(1);
                return key;
            }
            return row;
        } catch(Exception e) {
            System.out.println("User created!");
        }
        return 0;
    }
    
    public ResultSet getUserAddress(int userId) {
        ResultSet rs = null;
        try {
            Connection conn = getConnect();
            PreparedStatement userDetails = (PreparedStatement) conn.prepareStatement("select addressId from person where personId=?");
            userDetails.setInt(1, userId);
            rs = userDetails.executeQuery();
            if(rs.next()) {
                int addressId = rs.getInt("addressId");
                if(addressId > 0) {
                    PreparedStatement st = (PreparedStatement) conn.prepareStatement("select * from address where addressId=?");
                    st.setInt(1, addressId);
                    rs = st.executeQuery();
                }
            }
        } catch(Exception e) {
            System.out.println("User created!");
        }
        return rs;
    }
    
    public int createPerson(String name, String email, String phnNo, String uname, String pass, int age, String ssn, int addressId) {
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("insert into person (name, personType, age, SSN, username, password, addressId, email, phoneNo) values(?,?,?,?,?,?,?,?,?)");
            st.setString(1, name);
            st.setString(2, "User");
            st.setInt(3, age);
            st.setString(4, ssn);
            st.setString(5, uname);
            st.setString(6, pass);
            st.setInt(7, addressId);
            st.setString(8, email);
            st.setString(9, phnNo);
            int row = st.executeUpdate();
            return row;
        } catch(Exception e) {
            System.out.println("User created!");
        }
        return 0;
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
            if(rs.next()) {
                return rs;
            }            
        } catch (Exception e) {
            System.out.println("User created!");
        }
        return rs;
         
    }
    
    public boolean checkIfUsernameExists(String uname) {
        ResultSet rs = null;
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("select * from Person where username=?");
            st.setString(1, uname);
            rs = st.executeQuery();
            if(rs.next()) {
                return true;
            }            
        } catch (Exception e) {
            System.out.println("User already exists!");
            return true;
        }
        return false;
    }
    
    public boolean checkIfEmailExists(String email) {
        ResultSet rs = null;
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("select * from Person where email=?");
            st.setString(1, email);
            rs = st.executeQuery();
            if(rs.next()) {
                return true;
            }            
        } catch (Exception e) {
            System.out.println("Email already exists!");
            return true;
        }
        return false;
    }
    
    public boolean checkIfPhoneNoExists(String phnNo) {
        ResultSet rs = null;
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("select * from Person where phoneNo=?");
            st.setString(1, phnNo);
            rs = st.executeQuery();
            if(rs.next()) {
                return true;
            }            
        } catch (Exception e) {
            System.out.println("Phone number already exists!");
            return true;
        }
        return false;
    }
    
    public boolean checkIfSSNExists(String ssn) {
        ResultSet rs = null;
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("select * from Person where ssn=?");
            st.setString(1, ssn);
            rs = st.executeQuery();
            if(rs.next()) {
                return true;
            }            
        } catch (Exception e) {
            System.out.println("SSN already exists!");
            return true;
        }
        return false;
    }
    
    public ResultSet getAllCities() {
        ResultSet rs = null;
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("select * from city");
            rs = st.executeQuery();
//            conn.close();
            return rs;
        } catch(Exception e) {
            System.out.println("User created!");
        }
        return rs;
    }


//   ---------------------------------------- NGO and functions CRUD ---------------------------------------------
    
    public int createNgo(String name, String email, String phnNo, String uname, String pass, int ngoSize, String ngoName, int addressId, String ngoDesc, String city) {
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("insert into person (name, personType, username, password, addressId, email, phoneNo) values(?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, name);
            st.setString(2, "NGO");
            st.setString(3, uname);
            st.setString(4, pass);
            st.setInt(5, addressId);
            st.setString(6, email);
            st.setString(7, phnNo);
            int row = st.executeUpdate();
            ResultSet genKey = st.getGeneratedKeys();
            if(genKey.next()) {
                int key = genKey.getInt(1);
                
                st = (PreparedStatement) conn.prepareStatement("insert into ngo (ngoName, addressId, personId, ngoDesc, ngoSize, city) values(?,?,?,?,?,?)");
                st.setString(1, ngoName);
                st.setInt(2, addressId);
                st.setInt(3, key);
                st.setString(4, ngoDesc);
                st.setInt(5, ngoSize);
                st.setString(6, city);
                row = st.executeUpdate();
                return row;
            }
            return 0;
        } catch(Exception e) {
            System.out.println("User created!");
        }
        return 0;
    }
    
//    --------------------------------------- Vendor, Delivery and Products CRUD ------------------------------------------------------
    
    public int createVendor(String name, String email, String phnNo, String uname, String pass, String orgName, int addressId, String city) {
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("insert into person (name, personType, username, password, addressId, email, phoneNo) values(?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, name);
            st.setString(2, "Vendor");
            st.setString(3, uname);
            st.setString(4, pass);
            st.setInt(5, addressId);
            st.setString(6, email);
            st.setString(7, phnNo);
            int row = st.executeUpdate();
            ResultSet genKey = st.getGeneratedKeys();
            if(genKey.next()) {
                int key = genKey.getInt(1);
                
                st = (PreparedStatement) conn.prepareStatement("insert into vendors (vendorName, addressId, personId, city) values(?,?,?,?)");
                st.setString(1, orgName);
                st.setInt(2, addressId);
                st.setInt(3, key);
                st.setString(4, city);
                row = st.executeUpdate();
                return row;
            }
            return 0;
        } catch(Exception e) {
            System.out.println("User created!");
        }
        return 0;
    }
    
    public int createDelivery(String name, String email, String phnNo, String uname, String pass, String orgName, int addressId, String city) {
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("insert into person (name, personType, username, password, addressId, email, phoneNo) values(?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, name);
            st.setString(2, "Delivery Partner");
            st.setString(3, uname);
            st.setString(4, pass);
            st.setInt(5, addressId);
            st.setString(6, email);
            st.setString(7, phnNo);
            int row = st.executeUpdate();
            ResultSet genKey = st.getGeneratedKeys();
            if(genKey.next()) {
                int key = genKey.getInt(1);
                System.out.println(key);
                st = (PreparedStatement) conn.prepareStatement("insert into deliveryPartner (vendorName, personId, city) values(?,?,?)");
                st.setString(1, orgName);
                st.setInt(2, key);
                st.setString(3, city);
                row = st.executeUpdate();
                return row;
            }
            return 0;
        } catch(Exception e) {
            System.out.println("User created!");
        }
        return 0;
    }
    
    public int createDriver(String name, String email, String phnNo, String uname, String pass, int age, String ssn, int addressId, String city) {
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("insert into person (name, personType, age, SSN, username, password, addressId, email, phoneNo) values(?,?,?,?,?,?,?,?,?)");
            st.setString(1, name);
            st.setString(2, "User");
            st.setInt(3, age);
            st.setString(4, ssn);
            st.setString(5, uname);
            st.setString(6, pass);
            st.setInt(7, addressId);
            st.setString(8, email);
            st.setString(9, phnNo);
            int row = st.executeUpdate();
            conn.close();
            return row;
        } catch(Exception e) {
            System.out.println("User created!");
        }
        return 0;
    }
    
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
            System.out.println("User created!");
        }
        return 0;
    }
    
    public ResultSet getProducts() {
        ResultSet rs = null;
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("select * from product");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println("User created!");
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
            return rs;
        } catch(Exception e) {
            System.out.println("User created!");
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
            System.out.println("User created!");
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
            System.out.println("User created!");
        }
        return 0;
    }

//    ------------------------------------ Hospital Admin and Vets CRUD ------------------------------
    public int createHospital(String name, String email, String phnNo, String uname, String pass, String orgName, int addressId,String city) {
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("insert into person (name, personType, username, password, addressId, email, phoneNo) values(?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, name);
            st.setString(2, "Vendor");
            st.setString(3, uname);
            st.setString(4, pass);
            st.setInt(5, addressId);
            st.setString(6, email);
            st.setString(7, phnNo);
            int row = st.executeUpdate();
            ResultSet genKey = st.getGeneratedKeys();
            if(genKey.next()) {
                int key = genKey.getInt(1);
                
                st = (PreparedStatement) conn.prepareStatement("insert into hospitals (hospitalName, addressId, personId, city) values(?,?,?,?)");
                st.setString(1, orgName);
                st.setInt(2, addressId);
                st.setInt(3, key);
                st.setString(4, city);
                row = st.executeUpdate();
                return row;
            }
            return 0;
        } catch(Exception e) {
            System.out.println("User created!");
        }
        return 0;
    }


//    ------------------------------------------ Posts CRUD ------------------------------------------
    
    public int addPost(String city, String type, String desc) {
        int row = 0;
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("insert into posts (city, postTag, description) values (?,?,?)");
            st.setString(1, city);
            st.setString(2, type);
            st.setString(3, desc);
            row = st.executeUpdate();
        } catch(Exception e) {
            System.out.println("Post created!");
        }
        return row;
    }
    
    public ResultSet getAllPosts() {
        ResultSet rs = null;
        try {
            Connection conn = getConnect();
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("select * from posts order by postId desc");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println("Post fetched!");
        }
        return rs;
    }
}
