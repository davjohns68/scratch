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
public class Car {
    public void m1() {
        System.out.println("car 1");
    }
    
    public void m2() {
        System.out.println("car 2");
    }
    
    public String toString() {
        return "vroom";
    }
    
    public class Truck extends Car {
        public void m1() {
            System.out.println("truck 1");
        }
    }
    
    public void main(String args[]) {
        Car mycar = new Car();
        Truck mytruck = new Truck();
        
        System.out.println(mycar);
        mycar.m1();
        mycar.m2();
        System.out.println(mytruck);
        mytruck.m1();
        mytruck.m2();
    }
}
