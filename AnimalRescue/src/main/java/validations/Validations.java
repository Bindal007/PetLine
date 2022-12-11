/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nikhilbindal
 */
public class Validations {
    public boolean ValidatePhoneNumber(String value) {
        String PATTERN = "^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{4}$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidatePassword(String value) {
        String PATTERN = "^[a-zA-Z0-9]{5,12}$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateUsername(String value) {
        String PATTERN = "^(?=.{3,20}$)(?![.])[a-zA-Z0-9._]+(?<![.])$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateEmail(String value) {
        String PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)+$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateAge(String value) {
        String PATTERN = "^(0?[1-9]|[1-9][0-9]|[1][1-9][1-9]|200)$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateName(String value) {
        String PATTERN = "^[A-Za-z]+([\\ A-Za-z]+)*";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateZip(String value) {
        String PATTERN = "^[0-9]{5,7}$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateLevel(String value) {
        String PATTERN = "^[0-9]{1,2}$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateInt(String value) {
        String PATTERN = "^[0-9]{1,3}$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateFloat(String value) {
        String PATTERN = "[+-]?([0-9]*[.])?[0-9]+";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateEmpty(String value) {
        return !value.isEmpty();
    }
    
    public boolean ValidateBloodPressure(String value) {
        String PATTERN = "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))";
        return MatchPattern(PATTERN, value);
    }
    
    private boolean MatchPattern(String pattern, String value) {
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(value);
        return match.matches();
    }
}
