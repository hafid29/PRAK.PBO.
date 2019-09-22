/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HafidARW.relasiclass.percobaan4;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class Gerbong {
    private String kode;
    private Kursi[] arraykursi;
    private int jumlah;
    
    public Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arraykursi = new Kursi[jumlah];
        this.initKursi();
    }
    private void initKursi(){
      for (int i = 0; i < arraykursi.length; i++){
          this.arraykursi[i] = new Kursi(String.valueOf(i + 1));
      }  
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public String getKode(){
        return kode;
    }
    public void setPenumpang(Penumpang penumpang, int nomor){
        this.arraykursi[nomor - 1].setPenumpang(penumpang);
    }
    public Kursi[] getArrayKursi(){
        return arraykursi;
    }
    public String info (){
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arraykursi){
            info += kursi.info();
        }
        return info;
    }
    
}
