/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author nikhilbindal
 */
public class City {
    String name;
    
    public City (String name){
        
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean isMatch(String name){
        if(getName().equals(name)) return true;
        return false;
    }
}
