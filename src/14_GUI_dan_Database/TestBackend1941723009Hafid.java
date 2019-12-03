/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Kategori1941723009Hafid;

/**
 *
 * @author Hafid
 */
public class TestBackend1941723009Hafid {
    public static void main(String[] args){
        Kategori1941723009Hafid kat1 = new Kategori1941723009Hafid("Novel", "Koleksi buku novel");
        Kategori1941723009Hafid kat2 = new Kategori1941723009Hafid("Referensi", "Buku referensi ilmiah");
        Kategori1941723009Hafid kat3 = new Kategori1941723009Hafid("Komik", "Komik anak-anak");
        
        kat1.save();
        kat2.save();
        kat3.save();

        kat2.setmKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        kat3.delete();

        for(Kategori1941723009Hafid k : new Kategori1941723009Hafid().getAll()){
            System.out.println("Nama: " + k.getmNama()+ ", Ket: " + k.getmKeterangan());
        }

        for(Kategori1941723009Hafid k : new Kategori1941723009Hafid().search("ilmiah")){
            System.out.println("Nama: " + k.getmNama()+ ", Ket: " + k.getmKeterangan());
        }
    }
}
