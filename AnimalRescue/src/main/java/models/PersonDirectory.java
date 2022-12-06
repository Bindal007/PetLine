package models;

import java.util.ArrayList;

/**
 *
 * @author vicken
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList();
    }
    
    public Person newPerson(String name, int age, String phoneNumber, String email, int ssn, String username, String usertype, String password, String address, /*Post post,*/ int personID) {
        
        Person p = new Person(name, age, phoneNumber, email, ssn, username, usertype, password, address, /*post,*/ personID);
        personList.add(p);
        return p;
    }
    
    public ArrayList<Person> getPerson(){
        return personList;
    }
    
    /*
    // will search database and find person you are looking for based on email
    public Person findPerson(String email){
        
    }
    
    // returns a boolean of whether the person exists based on an email search
    public boolean isPersonByEmailExist(String email){
        
    }

    // returns a boolean of whether the person exists based on a username search
    public boolean isPersonByUsernameExist(String username){
    
    }
    */
}
