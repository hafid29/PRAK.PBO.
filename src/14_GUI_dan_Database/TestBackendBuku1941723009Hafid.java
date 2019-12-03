/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author mwpras
 */
import backend.*;

public class TestBackendBuku1941723009Hafid {
    public static void main(String[] args){
        Kategori1941723009Hafid novel = new Kategori1941723009Hafid().getById(27);
        Kategori1941723009Hafid referensi = new Kategori1941723009Hafid().getById(28);
        
        Buku1941723009Hafid buku1 = new Buku1941723009Hafid(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1941723009Hafid buku2 = new Buku1941723009Hafid(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1941723009Hafid buku3 = new Buku1941723009Hafid(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        buku1.save();
        buku2.save();
       
        buku2.setmJudul("Aljabar Linier");
        buku2.save();
      
        buku3.delete();
        
        for(Buku1941723009Hafid b : new Buku1941723009Hafid().getAll()){
            System.out.println("Kategori: " + b.getKategori().getmNama()+ ", Judul: " + b.getmJudul());
        }
        // test search
        for(Buku1941723009Hafid b : new Buku1941723009Hafid().search("timun")){
            System.out.println("Kategori: " + b.getKategori().getmNama()+ ", Judul: " + b.getmJudul());
        }
    }
}
