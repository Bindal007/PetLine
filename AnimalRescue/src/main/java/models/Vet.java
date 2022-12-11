
package models;

/**
 *
 * @author vicken
 */
public class Vet {
    
    private int vetID; // primary key
    private int appointmentID; // array foreign key
    private int hospitalID; // foreign key
    private int personID; // foreign key
    
    public Vet(int vetID, int appointmentID, int hospitalID, int personID){
        this.vetID = vetID;
        this.appointmentID = appointmentID;
        this.hospitalID = hospitalID;
        this.personID = personID;
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
    
    public int getPersonID(){
        return personID;
    }
    
    public void setPersonID(int personID){
        this.personID = personID;
    }
}
