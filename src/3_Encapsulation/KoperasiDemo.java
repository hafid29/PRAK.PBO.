/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasigettersetter;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class KoperasiDemo {
    public static void main(String[] args) 
    {
        Anggota anggota1 = new Anggota(" Hafid Ali Rahman Wibisana","Perum Bomai Tikusan Bojonegoro");
        System.out.println("Simpanan" +anggota1.getNama()+ " : Rp "+anggota1.getSimpanan());
        
        anggota1.setNama("Hafid Ali Rahman Wibisana");
        anggota1.setAlamat("Perum Bomai Tikusan Bojonegoro");
        anggota1.setor(500000);
        System.out.println("simpanan "+ anggota1.getNama()+ " : Rp "+anggota1.getSimpanan());
        
        anggota1.pinjaman(5000);
        System.out.println("simpanan " +anggota1.getNama()+" : Rp "+ anggota1.getSimpanan());
    }
}
