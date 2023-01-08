/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dea30122022;

import java.util.Scanner;

/**
 *
 * @author deain
 */
public class AngkaGanjil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, n;
        System.out.println("Program Menampilkan Bilangan Ganjil");
        System.out.print("Masukkan n : ");
        n = input.nextInt();
        System.out.println("----------------------------------------------");
        for (int a = 1; a <= n; a++) {
            System.out.println(a + "");
            a++;
        }
    }
}
