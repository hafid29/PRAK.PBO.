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
public class Sarjana1941723009Hafid extends Mahasiswa1941723009Hafid implements IBerprestasi1941723009Hafid{
    public Sarjana1941723009Hafid(String nama){
        super(nama);
    }
    public void kuliahDiKampusHafid(){
        System.out.println("Aku mahasiswa, namaku "+ this.mNama);
        System.out.println("Aku berkuliah di kampus.");
    }
    

    @Override
    public void lulusHafid() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggiHafid() {
        System.out.println("IPK-ku lebih dari 3,51");
    }

    @Override
    public void menjuaraiKompetisiHafid() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahHafid() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
}
