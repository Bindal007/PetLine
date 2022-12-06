
package models;

/**
 *
 * @author vicken
 */
public class Vet {
    
    private int vetID;
    private int appointmentID;
    private int hospitalID;
    
    public Vet(int vetID, int appointmentID, int hospitalID){
        this.vetID = vetID;
        this.appointmentID = appointmentID;
        this.hospitalID = hospitalID;
    }
    
    public int getVetID(){
        return vetID;
    }
    
    public void setVetID(int vetID){
        this.vetID = vetID;
    }
    
    public int getAppointmentID(){
        return appointmentID;
    }
    
    public void setAppointmentID(int appointmentID){
        this.appointmentID = appointmentID;
    }
    
    public int getHospitalID(){
        return hospitalID;
    }
    
    public void sethospitalID(int hospitalID){
        this.hospitalID = hospitalID;
    }
}
