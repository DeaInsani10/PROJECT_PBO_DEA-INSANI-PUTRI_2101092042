/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dea09122022;

/**
 *
 * @author deain
 */
public class Aritmatika {
    public boolean isPrima(int n){
        boolean prima=true;
        if(n==0 || n==1){
            prima = false;
        }else{
            for(int i=2;i<=n / 2;i++){
                if(n%1 == 0){
                    prima=false;
                    break;
                }
            }
        }
        return prima;
    }
    
    public int tambah(int a, int b){
        return a+b;
    }
    public int kurang(int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        int a1 = 4;
        int a2 = 6;
        Aritmatika aritmatika = new Aritmatika();
        int hasil = aritmatika.tambah(a1, a2);
        int hasilKurang = aritmatika.kurang(a1, a2);
        boolean prima = aritmatika.isPrima(2);
        System.out.println("prima "+prima);
        
    }
}
