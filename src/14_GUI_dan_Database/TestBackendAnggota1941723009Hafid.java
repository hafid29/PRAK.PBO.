/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota1941723009Hafid;

/**
 *
 * @author Hafid
 */
public class TestBackendAnggota1941723009Hafid {
    public static void main(String[] args) {
        Anggota1941723009Hafid agt1 = new Anggota1941723009Hafid("Hafid", "Bojonegoro", "101");
        Anggota1941723009Hafid agt2 = new Anggota1941723009Hafid("Ali", "Surabaya", "102");
        Anggota1941723009Hafid agt3 = new Anggota1941723009Hafid("Rahman", "Malang", "103");
        
        //test insert
        agt1.save();
        agt2.save();
        agt3.save();
        
        //test update
        agt2.setmAlamat("Indonesia");
        agt2.save();
        
        //test delete
        agt3.delete();
        
        //tes select all
        for(Anggota1941723009Hafid A : new Anggota1941723009Hafid().getAll()){
            System.out.println("Nama: " + A.getmNama()+ ", Alamat : " + A.getmAlamat()+ ", Telepon : " + A.getmTelepon());
        }
        
        //test search
        for(Anggota1941723009Hafid B : new Anggota1941723009Hafid().search("Timur")){
            System.out.println("Nama: " + B.getmNama()+ ", Alamat : " + B.getmAlamat()+ ", Telepon : " + B.getmTelepon());
        }
    }
}
