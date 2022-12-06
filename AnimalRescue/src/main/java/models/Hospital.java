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
    
    private int hospitalID;
    private String hospitalName;
    private int addressID;
    private int vetID;
    private int appointmentID;
    
    public Hospital(int hospitalID, String hospitalName, int addressID, int vetID, int appointmentID){
        this.hospitalID = hospitalID;
        this.hospitalName = hospitalName;
        this.addressID = addressID;
        this.vetID = vetID;
        this.appointmentID = appointmentID;
    }
    
    public void setHospitalName(String hospitalName){
        this.hospitalName = hospitalName;
    }
    
    public String getHospitalName(){
        return hospitalName;
    }
    
    public void setHospitalID(int hospitalID){
        this.hospitalID = hospitalID;
    }
    
    public int getHospitalID(){
        return hospitalID;
    }
    
    public void setAddressID(int addressID){
        this.addressID = addressID;
    }
    
    public int getAddressID(){
        return addressID;
    }
    
    public void setVetID(int vetID){
        this.vetID = vetID;
    }
    
    public int getVetID(){
        return vetID;
    }
    
    public void setAppointmentID(int appointmentID){
        this.appointmentID = appointmentID;
    }
    
    public int getAppointmentID(){
        return appointmentID;
    }
    
    
}
