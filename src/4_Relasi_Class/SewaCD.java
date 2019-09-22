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
public class SewaCD {
    private String nama;
    private int id;
    private int harga;

    public SewaCD(){
        
    }
    
    public SewaCD(String nama, int id, int harga) {
        this.nama = nama;
        this.id = id;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
    public int hitungBiayaCD(int hari){
        return harga*hari;
    }
    
    public String info(){
        String info="";
        info += "Id CD : " +this.id+"\n";
        info += "Nama : "+this.nama + "\n";
        info += "Sewa/hari : Rp."+this.harga;
        return info;
    }
}

