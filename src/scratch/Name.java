/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratch;

/**
 *
 * @author davjohns
 */
public class Name {
    private String firstName;
    private String lastName;
    private char initial;
    
    public String getNormalOrder() {
        return firstName + " " + initial + "." + " " + lastName; 
    }
    
    public String getReverseOrder() {
        return lastName + ", " + firstName + " " + initial + ".";
    }
    
    public String toString() {
        return getNormalOrder();
    }
    
    Name(String first, char init, String last) {
        this.firstName = first;
        this.initial = init;
        this.lastName = last;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public char getInitial() {
        return this.initial;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setInitial(char initial) {
        this.initial = initial;
    }
}
