
package models;
import database.Database;
/**
 *
 * @author nikhilbindal
 */
public class Person {
    
    private int personID;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private int ssn;
    private String username;
    private String password;
    private int addressID;
    private int postID;
    // private Post post;
    
    public Person(int personID, String name, int age, String phoneNumber, String email, int ssn, String username, 
            String password, int addressID, int postID /*Post post*/){
        this.personID = personID;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.ssn = ssn;
        this.username = username;
        this.password = password;
        this.addressID = addressID;
        this.postID = postID;
        //this.post = post;

    }
    
    public boolean isMatch(String name){
        if(getName().equals(name)) return true;
        return false;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public int getSSN(){
        return ssn;
    }
    
    public void setSSN(int ssn){
        this.ssn = ssn;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public int getAddressID(){
        return addressID;
    }
    
    public void setAddressID(int addressID){
        this.addressID = addressID;
    }
    /*
    public Post getPost(){
        return post;
    }
    
    public void setPost(Post post){
        this.post = post;
    }
    */
    public int getPersonID(){
        return personID;
    }
    
    public void setPersonID(int personID){
        this.personID = personID;
    }
    
    public boolean checkPersonCreds(String userType, String username, String password) {
        Person person = Database.getPersonDetails(userType, username, password);
        if (person) {
            return true;
        }
        return false;
    }
    
}
