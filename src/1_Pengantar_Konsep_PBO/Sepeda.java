/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sepedademo;

/**
 *
 * @author user
 */
public class Sepeda {
    private String merek;
    private int kecepatan, gear;
    private String warna;
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void gantiGear(int newValue){
        gear = newValue;
    }
    
    public void tambahKecepatan (int increment){
        kecepatan = kecepatan + increment;
    }
    public void setWarna (String newValue){
        warna = newValue;
    }
    
    public void rem (int decrement){
        kecepatan = kecepatan - decrement;
    }
    
    public void cetakStatus(){
        System.out.println("Merek : " + merek);;
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println("Gear : " + gear);
        System.out.println("Warna : " + warna);
    }
    
}
