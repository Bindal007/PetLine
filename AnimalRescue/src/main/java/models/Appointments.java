
package models;

/**
 *
 * @author vicken
 */
public class Appointments {
    
    private int appointmentID; // private key
    private int vetID; // foreign key
    private int personID; // foreign key
    private String dateTime;
    private String reason;
    private String petType;
    private Vitals vitals;
    
    public Appointments(int appointmentID, int vetID, int personID, String dateTime, String reason, String petType, Vitals vitals) {
        this.appointmentID = appointmentID;
        this.vetID = vetID;
        this.personID = personID;
        this.dateTime = dateTime;
        this.reason = reason;
        this.petType = petType;
        this.vitals = vitals;
    }
    
    public int getAppointmentID() {
        return appointmentID;
    }
    
    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public int getVetID() {
        return vetID;
    }
    
    public void setVetID(int vetID) {
        this.vetID = vetID;
    }

    public int getPersonID() {
        return personID;
    }
    
    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getDateTime() {
        return dateTime;
    }
    
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getReason() {
        return reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPetType() {
        return petType;
    }
    
    public void setPetType(String petType) {
        this.petType = petType;
    }

    public Vitals getVitals() {
        return vitals;
    }
    
    public void setVitals(Vitals vitals) {
        this.vitals = vitals;
    }
    
}
