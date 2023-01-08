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
public class Latihan5 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String nilai1 = "";
        String nilai2 = "";
        String nilai3 = "";

        try {
            System.out.println("Masukkan nilai pertama =");
            nilai1 = dataIn.readLine();
            System.out.println("Masukkan nilai kedua =");
            nilai2 =dataIn.readLine();
            System.out.println("Masukkan nilai ketiga =");
            nilai3 =dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Kata yang Anda masukkan salah, silahkan coba lagi.");
        }
        int pertama;
        int kedua;
        int ketiga;
        pertama = Integer.parseInt(nilai1);
        kedua = Integer.parseInt(nilai2);
        ketiga = Integer.parseInt(nilai3);
        int rata_rata = (pertama + kedua + ketiga) / 3;

        System.out.println("Rata-rata nilai Anda: " + rata_rata);
        if (rata_rata <= 60) {
            System.out.println(":-(");
        } else {
            System.out.println(":-)");
        }
    }
}
