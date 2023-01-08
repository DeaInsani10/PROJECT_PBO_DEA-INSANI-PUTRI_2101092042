/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dea19102022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author deain
 */
public class Latihan1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new
        InputStreamReader( System.in) );
        int grade=0;
         try{
             System.out.print(" Masukkan nilai :");
             grade = Integer.parseInt(dataIn.readLine());

        }catch( IOException e ){
        System.out.println("Error!");
        }
         
        if (grade >= 90){
            System.err.println("Exellent!");
        }
        else if ((grade<90) && (grade >=80)){
            System.err.println("Good Job !");
        }
        else if ((grade < 80) && (grade >=60)){
            System.err.println("Study Harder!");
        }
        else{
            System.err.println("Sorry, you failed.");
        }
    }
}
