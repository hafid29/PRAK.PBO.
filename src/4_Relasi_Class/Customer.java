/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafidarw.relasiclass.percobaan4.studikasusp4;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class Customer {
    private String nama;
    private int ktp;
    private BeliCD belicd;
    private SewaCD cd;
    private int hari;
    private int jumlah;

    Customer() {
           }
    
    public Customer(String nama, int ktp, BeliCD belicd, SewaCD cd, int hari, int jumlah) {
        this.nama = nama;
        this.ktp = ktp;
        this.belicd = belicd;
        this.cd = cd;
        this.hari = hari;
        this.jumlah = jumlah;
    }



    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKtp() {
        return ktp;
    }

    public void setKtp(int ktp) {
        this.ktp = ktp;
    }

    public BeliCD getBeliCD() {
        return belicd;
    }

    public void setBeliCD(BeliCD belicd) {
        this.belicd = belicd;
    }

    public SewaCD getCD() {
        return cd;
    }

    public void setCD(SewaCD cd) {
        this.cd = cd;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
        
    public int hitungBiayaTotal(){
       return cd.hitungBiayaCD(hari)+belicd.hitungBiayaBeliCD(jumlah);
    }
    
    public String info(){
        String info="";
        info += "Nama = "+this.nama + "\n";
        info += "Ktp = " +this.ktp+"\n\n";
        info += "Beli CD  \n"+this.belicd.info()+"\n\n";
        info += "Sewa CD  \n"+this.cd.info()+"\n\n";
        info += "Keterangan \n";
        info += "Lama sewa = "+this.hari+" Hari"+"\n";
        info += "Jumlah CD = "+this.jumlah+" CD"+"\n";
        info += "Biaya Total = Rp."+this.hitungBiayaTotal();
        return info;
    }
    
}
