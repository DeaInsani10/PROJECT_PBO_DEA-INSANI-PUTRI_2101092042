/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dea02112022;

/**
 *
 * @author deain
 */
public class StudentRecord1 {
    public static void main(String[] args) {
        StudentRecord student3 = new StudentRecord("Doni","Padang");
        student3.setAge(20);
        student3.print("");
        StudentRecord student4 = new StudentRecord();
        student4.print("");
        System.out.println("jumlah siswa :"+StudentRecord.getStudentCount());
    }
}
