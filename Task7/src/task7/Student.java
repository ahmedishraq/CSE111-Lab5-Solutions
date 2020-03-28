/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

/**
 *
 * @author 19301261
 */
public class Student {

    String name = "default name";
 static int numberOfStudents=0; // use static for change and count hole things in class.
    public Student() {
numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public Student(String n) {
        name = n;
        numberOfStudents++;
    }
    
}
