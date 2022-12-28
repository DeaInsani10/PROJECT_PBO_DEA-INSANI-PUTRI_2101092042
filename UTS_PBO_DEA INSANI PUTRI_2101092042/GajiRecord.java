/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_DeaInsaniPutri_16112022;

/**
 *
 * @author deain
 */
public class GajiRecord {
    private String kodeSlip;
    private String tanggal;
    private String nama;
    private int golongan;
    private double gajiPokok;
    private double tunjanganAnak;
    private double tunjanganIstri;
  
    public GajiRecord(){
        
    }
    
    public String getKode(){
        return kodeSlip;
    }
    
    public void setKode(String kode){
        this.kodeSlip=kode;
    }
    
    public String getTanggal(){
        return tanggal;
    }
    
    public void setTgl(String tgl){
        this.tanggal=tanggal;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public int getGolongan(){
        return golongan;
    }
    
    public void setGolongan(int golongan){
        this.golongan=golongan;
    }
    
    public double getGaji(){
        
        if(golongan==1){
            gajiPokok=1000000;
        }
        else if(golongan==2){
            gajiPokok=2000000;
        }
        else{
            System.out.println("-Golongan tidak terdaftar-");
        }
        
        return gajiPokok;
    }
    
    public double getTunjanganAnak(){
        return tunjanganAnak;
    }
    
    public void setTunjanganAnak(double tAnak ){
        tunjanganAnak=tAnak;
    }
    
    public double getTunjanganIstri(){
        return tunjanganIstri;
    }
    
    public void setTunjanganIstri(double tIstri ){
        tunjanganIstri=tIstri;
    }
    
    
    public double getTotal(){
        double total;
        
        total=gajiPokok+tunjanganAnak+tunjanganIstri;
        
        return total;
    }
}
