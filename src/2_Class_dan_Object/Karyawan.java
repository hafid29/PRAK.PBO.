/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.perusahaan;
public class Karyawan {
    public static void main(String[] args) {
       perusahaan kyn1 = new perusahaan();
       
        kyn1.setidKaryawan(1001);
        kyn1.setnamaKaryawan("Hafid");
        kyn1.setjenisKelamin("Ppriaa");
        kyn1.setjabatan("Supervisior");
        kyn1.setgaji(2000000);
        kyn1.cetakStatus();
       
       
    }
    
}
