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
public class UndergraduateStudent  extends Student {
    private int year;
    
    public UndergraduateStudent(String name) {
        super(name, 18);
        this.year = 0;
    }
    
    @Override
    public void setAge(int age) {
        super.setAge(age);
        this.year++;
    }
}
