
package models;

/**
 *
 * @author nikhilbindal
 */
public class Person {
    
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private int ssn;
    private String username;
    private String usertype;
    private String password;
    private String address;
    // private Post post;
    private int personID;
    
    public Person(String name, int age, String phoneNumber,
            String email, int ssn, String username,
            String usertype, String password, String address,
            /*Post post,*/ int personID){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.ssn = ssn;
        this.username = username;
        this.usertype = usertype;
        this.password = password;
        this.address = address;
        //this.post = post;
        this.personID = personID;
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
    
    public String getUsertype(){
        return usertype;
    }
    
    public void setUsertype(String usertype){
        this.usertype = usertype;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
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
    
}
