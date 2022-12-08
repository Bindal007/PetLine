
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
    // private Vitals vitals;
    
}
