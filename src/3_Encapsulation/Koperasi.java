/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasi;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class Koperasi {
    private String nama;
    private int id;
    private float angsuran;
    private float pinjaman;
    private float meminjam;
    Koperasi (String nama, int pinjaman){
        this.nama=nama;
        this.pinjaman=pinjaman;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setAngsuran(float angsuran){
        this.angsuran=angsuran;
    }
    public void setPinjaman(float pinjaman){
    this.pinjaman=pinjaman;
    }
    public String getNama(){
        return nama;
    }
    public float getAngsuran(){
        return angsuran;
    }
    public float getPinjaman(){
        return pinjaman;
    }
    public void angsur (float uang){
        pinjaman -=uang;
    }
    public void pinjam (float uang){
        pinjaman +=uang;
    }
    public void limit (float uang){
        pinjaman -=uang;
    }
    public void meminjam (float uang){
        meminjam -=uang;
    }
}
