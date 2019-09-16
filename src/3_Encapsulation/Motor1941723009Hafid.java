/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorencapsulation;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class Motor1941723009Hafid {
    private int kecepatan = 0;
    private boolean kontak0n = false;
    
    
    public void nyalakanMesin(){
        kontak0n = true;
    }
    public void matikanMesin(){
        kontak0n = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kontak0n == true) {
            kecepatan += 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin 0ff!\n");
        }
    }
    public void kurangKecepatan(){
        if (kontak0n == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin 0ff! \n");
        }
    }
    public void printStatus(){
        if (kontak0n == true) {
            System.out.println("Kontak 0n");
        } else{
            System.out.println("Kontak 0ff");
        }
            System.out.println("Kecepatan " + kecepatan+"\n");
    } 
}
