/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dea.p21092022;

/**
 *
 * @author deain
 */
public class Latihan3Dea {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int max;
        
        System.out.println("number1 = "+number1);
        System.out.println("number2 = "+number2);
        System.out.println("number3 = "+number3);
        
        max=(number2>=number1)?number2:number1;
        max=(number3>=max)?number3:max;
        System.out.println("Nilai tertingginya adalah angkan= "+max);
        
    }
}
