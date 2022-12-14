/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dea.controller;
import Dea.dao.PeminjamanDaoImpl;
import Dea.dao.PeminjamanDao;
import Dea.model.Peminjaman;
import Dea.model.Buku;
import Dea.model.Anggota;
import Dea.view.FormPeminjaman;
import javax.swing.table.DefaultTableModel;
import Dea.dao.AnggotaDao;
import Dea.dao.BukuDao;
import Dea.dao.BukuDaoImpl;
import Dea.dao.AnggotaDaoImpl;
import java.util.*;
/**
 *
 * @author deain
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    public PeminjamanController (FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtTglpinjam().setText("");
        formPeminjaman.getTxtTglkembali().setText("");
        
    }
    
    public void setCboNobp(){
        formPeminjaman.getCboNobp().removeAllItems();
        List <Anggota> list = anggotaDao.getAllAnggota();
        for (Anggota anggota : list){
            formPeminjaman.getCboNobp().
                    addItem(anggota.getNobp()+"-"+anggota.getNama());
        }
        
    }
    
    public void setCboBuku(){
        formPeminjaman.getCboKodebuku().removeAllItems();
        List <Buku> list = bukuDao.getAll();
        for (Buku buku : list){
            formPeminjaman.getCboKodebuku().
                    addItem(buku.getKodeBuku());
        }
        
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp( formPeminjaman.getCboNobp()
                .getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodebuku( formPeminjaman.getCboKodebuku()
                .getSelectedItem().toString());
        peminjaman.setTglpinjam( formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali( formPeminjaman.getTxtTglkembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Entri Ok");
    }
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if (peminjaman != null){
            List<Anggota> listAnggota = anggotaDao.getAllAnggota();
            for(Anggota anggota:listAnggota){
                if(peminjaman.getNobp()==anggota.getNobp()){
                    formPeminjaman.getCboNobp()
                    .setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
                    break;
                }
            }
            formPeminjaman.getCboKodebuku().setSelectedItem(peminjaman.getKodebuku());
            formPeminjaman.getTxtTglpinjam().setText(peminjaman.getTglpinjam());
            formPeminjaman.getTxtTglkembali().setText(peminjaman.getTglkembali());
        }
    }
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        peminjaman.setNobp( formPeminjaman.getCboNobp()
                .getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodebuku( formPeminjaman.getCboKodebuku()
                .getSelectedItem().toString());
        peminjaman.setTglpinjam( formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali( formPeminjaman.getTxtTglkembali().getText());
        peminjamanDao.update(index,peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Update Ok");
    }
    public void deletePeminjaman(){
         int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
         peminjamanDao.delete(index);
         javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Delete Ok");
    }
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel)formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAll();
        for (Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getNobp(),
                peminjaman.getKodebuku(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali()
            };
            tabelModel.addRow(data);
        }
    }
}
