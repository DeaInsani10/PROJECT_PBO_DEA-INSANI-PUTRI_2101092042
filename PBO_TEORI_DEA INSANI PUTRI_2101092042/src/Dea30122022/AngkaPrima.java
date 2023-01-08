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
public class AngkaPrima {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int bil, n;

        System.out.println("Program Menampilkan Bilangan Prima");
        System.out.print("Masukkan n : ");
        n = input.nextInt();
        System.out.println("----------------------------------------------");
        for (int i = 0; i <= n; i++) {
            bil = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    bil = bil + 1;
                }
            }
            if (bil == 2) {
                System.out.print(i + " ");
            }
        }
    }

}
