/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.perusahaan;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class perusahaan {
    private int idKaryawan;
    private String namaKaryawan;
    private String jenisKelamin;
    private String jabatan;
    private int gaji;
     public void setidKaryawan(int newValue){
         idKaryawan = newValue;
     }    
     public void setnamaKaryawan(String newValue){
         namaKaryawan = newValue;
     }
     public void setjenisKelamin(String newValue){
         jenisKelamin = newValue;
     }
     public void setjabatan(String newValue){
         jabatan = newValue;
     }
     public void setgaji(int newValue){
         gaji = newValue;
     }
    
     public void cetakStatus(){
        System.out.println("IdKaryawan : " + idKaryawan);;
        System.out.println("NamaKaryawan : " + namaKaryawan);
        System.out.println("JenisKelamin : " + jenisKelamin);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji : " + gaji);
     }
}
