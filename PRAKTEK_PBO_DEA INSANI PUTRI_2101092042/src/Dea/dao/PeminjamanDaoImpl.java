/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dea.dao;
import Dea.dao.PeminjamanDao;
import Dea.model.Peminjaman;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deain
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
     List<Peminjaman> data = new ArrayList<>();

    public PeminjamanDaoImpl() {
        data.add(new Peminjaman("2101092142", "B101","20 Des 2022","20 Jan 2023"));
        data.add(new Peminjaman("2101092015", "B102","15 Maret 2022","9 Jan 2023"));
        data.add(new Peminjaman("2101091001", "208","3 juni 2022","19 feb 2023"));
    }
     
     
    public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    public void update(int index,Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    
    public List<Peminjaman>getAll(){
        return data;
    }
}
