/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dea30112022;

/**
 *
 * @author deain
 */
public class Student extends Person {

    public Student() {
        super("dea", "Padang");
        super.name = "dea"; 
        super.address = "some address"; 
        System.out.println("Inside Student:Constructor");
    }
    @Override
    public String getName() {
        System.out.println("Student: getName");
        return name;
    }
    
    public static void main(String[] args) {
        Student dea = new Student();
        System.out.println("Nama =" + dea.getName());
        dea.name = "dea";
        dea.address = "Padang";
    }
}
