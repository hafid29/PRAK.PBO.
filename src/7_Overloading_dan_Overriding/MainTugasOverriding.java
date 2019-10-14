/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugasoverriding;

/**
 *
 * @author Hafid
 */
public class MainTugasOverriding{
    
        public static void main(String[] args) {
        Manusia1941723009Hafid man = new Manusia1941723009Hafid();
        Manusia1941723009Hafid man1 = new Dosen1941723009Hafid();
        Manusia1941723009Hafid man2 = new Mahasiswa1941723009Hafid();
        
        System.out.println("manusia");
        man.bernafas();
        man.makan();
        System.out.println("dosen");
        man1.bernafas();
        man1.makan();
        System.out.println("mahasiswa");
        man2.bernafas();
        man2.makan();
    }
}
   
