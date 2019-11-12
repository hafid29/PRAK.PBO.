/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterFacelatihan;

/**
 *
 * @author Hafid
 */
public class Mahasiswa1941723009Hafid implements ICumlaude1941723009Hafid{
    protected String mNama;
    
    public Mahasiswa1941723009Hafid(String nama){
        this.mNama = nama;
    }
    
    public void kuliahDiKampusHafid(){

    }

    @Override
    public void lulusHafid() {
        System.out.println("Aku mahasiswa, namaku " + this.mNama);
//        System.out.println("Aku sudah menyelesaikan TESIS");
}

    @Override
    public void meraihIPKTinggiHafid() {
//        System.out.println("IPK-ku lebih dari 3.31");
        System.out.println("Aku berkuliah di kampus.");
    }
}
