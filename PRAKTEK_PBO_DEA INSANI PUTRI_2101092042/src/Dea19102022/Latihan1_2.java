/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dea19102022;

import javax.swing.JOptionPane;

/**
 *
 * @author deain
 */
public class Latihan1_2 {
    public static void main(String[] args) {
        int grade=0;
        String msg =" ";
        grade = Integer.parseInt(JOptionPane.showInputDialog("Please enter your grade"));
         
        if (grade >= 90){
            msg="Exellent";
        }
        else if ((grade<90) && (grade >=80)){
            msg="Good Job";
        }
        else if ((grade < 80) && (grade >=60)){
            msg="Study Harder";
        }
        else{
            msg="Sorry you failed";
        }
        JOptionPane.showMessageDialog(null, "nilai anda "+grade+"\n"+msg);
    }
}