/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author vicken
 */
public class Hospital {
    
    private String name;
    private String about;
    private int zipCode;
    private String address;
    
    public Hospital(String name, String about, int zipCode,
            String address){
        this.name = name;
        this.about = about;
        this.zipCode = zipCode;
        this.address = address;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAbout(String about){
        this.about = about;
    }
    
    public String getAbout(){
        return about;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setZip(int zipCode){
        this.zipCode = zipCode;
    }
    
    public int getZipCode(){
        return zipCode;
    }
    
    
}
