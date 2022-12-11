/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author vicken
 */
public class NGO {
    
    private int ngoID; // primary key
    private String ngoName;
    private int addressID; // foreign key
    private int phoneNum;
    private int numOfPets;
    private int postID; // foreign key
    
    public NGO(int ngoID, String ngoName, int addressID, int phoneNum, int numOfPets, int postID) {
        this.ngoID = ngoID;
        this.ngoName = ngoName;
        this.addressID = addressID;
        this.phoneNum = phoneNum;
        this.numOfPets = numOfPets;
        this.postID = postID;
    }
    
    public int getNGOID() {
        return ngoID;
    }
    
    public void setNGOID(int ngoID) {
        this.ngoID = ngoID;
    }

    public String getNGOName() {
        return ngoName;
    }
    
    public void setNGOName(String ngoName) {
        this.ngoName = ngoName;
    }

    public int getAddressID() {
        return addressID;
    }
    
    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public int getPhoneNum() {
        return phoneNum;
    }
    
    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getNumOfPets() {
        return numOfPets;
    }
    
    public void setNumOfPets(int numOfPets) {
        this.numOfPets = numOfPets;
    }

    public int getPostID() {
        return postID;
    }
    
    public void setPostID(int postID) {
        this.postID = postID;
    }
    
}
