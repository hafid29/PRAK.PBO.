/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diskon;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class diskon {
     public int code;
    public String nameofPackage;
    public int basicPrice;
    public float discount;
    
    public float afterdiskon(){
       float afterdiskon = (basicPrice * discount);
       return afterdiskon;
    }
    public void tampilDatadiskon(){
        System.out.println("Kode Barang : " +code);
        System.out.println("Nama Barang : " +nameofPackage);
        System.out.println("Harga Dasar : " +basicPrice);
        System.out.println("Diskon : " +discount +("%"));
    }
}
