 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dea23112022;
import java.io.*;

/**
 *
 * @author deain
 */
public class BukuAlamatExample {
    public static void main(String[] args) {
        BukuAlamat bukuAlamat[] = new BukuAlamat[100];
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
        int jumlah = 5;
        
        try{
            for (int i=0;i<=jumlah;i++){
                System.out.println("Data ke ->" +(i+1));
                BukuAlamat bukuAlamat1 = new BukuAlamat();
                System.out.println("Nama      :");
                bukuAlamat1.setNama(dataIn.readLine());
                System.out.println("Alamat    :");
                bukuAlamat1.setAlamat(dataIn.readLine());
                System.out.println("Email     :");
                bukuAlamat1.setEmail(dataIn.readLine());
                System.out.println("No Telepon    :");
                bukuAlamat1.setNotelp(dataIn.readLine());
                bukuAlamat[i]=bukuAlamat1;
            } 
        }catch (Exception ex){
        }
       
        //tampil
        for(int i=0;i<jumlah;i++){
            System.out.println("Data Ke ->"+(i+1));
            System.out.println("Nama    :"+bukuAlamat[i].getNama());
            System.out.println("Alamat  :"+bukuAlamat[i].getAlamat());
            System.out.println("Email   :"+bukuAlamat[i].getEmail());
            System.out.println("No Telp :"+bukuAlamat[i].getNotelp());
        }
}
}
