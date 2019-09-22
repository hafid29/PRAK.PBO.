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
public class Admin {
    private String nama;
    private int id;

    public Admin(){
        
    }
    
    public Admin(String nama, int id) {
        this.nama = nama;
        this.id = id;
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
    
    public String info(){
        String info="";
        info += "Id Admin : " +this.id+"\n";
        info += "Nama : "+this.nama + "\n";
        return info;
    }
    
}

