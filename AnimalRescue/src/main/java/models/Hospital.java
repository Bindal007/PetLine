
package models;

import java.util.ArrayList;

/**
 *
 * @author vicken
 */
public class Hospital {
    
    private int hospitalID; // primary key
    private String hospitalName;
    private int addressID; // foreign key
    private int vetID; // foreign key
    private int appointmentID; // array foreign key
    
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
