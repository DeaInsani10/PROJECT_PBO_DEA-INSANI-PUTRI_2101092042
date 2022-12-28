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
public class Employee extends Person {

    @Override
    public String getName() {
        super.name = "insani";
        System.out.println("Employee Name:" + name);
        return name;
    }
}
