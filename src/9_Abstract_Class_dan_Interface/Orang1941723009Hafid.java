/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass;

/**
 *
 * @author Hafid
 */
public class Orang1941723009Hafid {
    private String mNama;
    private Hewan1941723009Hafid mHewanPeliharaan;
    
    public Orang1941723009Hafid(String nama){
        this.mNama = nama;
    }
    
    public void peliharaanHewanHafid(Hewan1941723009Hafid mHewanPeliharaan){
        this.mHewanPeliharaan = mHewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalanHafid(){
        System.out.println("Namaku " + this.mNama);
        System.out.println("Hewan Peliharaanku berjalan dengan cara : ");
        this.mHewanPeliharaan.bergerak();
        System.out.println("------------------------------------------");
    }
}
