/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratch;
import java.io.*;
import java.util.*;

/**
 *
 * @author davjohns
 */
public class Scratch {
    public static void main(String[] args) {
        Moo[] elements = {new Blue(), new Moo(), new Shoe(), new Flute()};
        for (int i = 0; i < elements.length; i++) {
            elements[i].method2();
            elements[i].method1();
            System.out.println(elements[i]);
            System.out.println();
        }
    }

      
}

