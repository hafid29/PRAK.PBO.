/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugasoverloading;

/**
 *
 * @author Hafid
 */
public class Segitiga1941723009Hafid {
    private static int mSudut;
    
    public static int totalSudut(int sudutA){
        return 0;
    }
    
    public static int totalSudut(int sudutA, int sudutB){
        return 0;
    }
    
    public static int keliling(int sisiA, int sisiB, int sisiC){
        return 0;
    }
    
    public static double keliling(int sisiA, int sisiB){
        return 0;
    }
    
    public static int totalsudut(float sudutA){
        return (int) ((int)180 - sudutA);
    }
    
    public static int totalSudut(float sudutA, float sudutB){
        return (int) ((int) 180 - (sudutA+sudutB));
    }
    
    public static int kelilingSudut(float sisiA, int sisiB, int sisiC){
        return(int) ((int) sisiB+sisiA+sisiC);
    }
    
    public static double kelilingSudut(float sisiA, int sisiB){
        return Math.pow(Math.sqrt(sisiA),2) + Math.pow(Math.sqrt(sisiA),2);
    }
    public static void main(String[] args) {
        mSudut=50;
        System.out.println(totalSudut(mSudut));
        System.out.println(totalSudut(mSudut, mSudut));
        System.out.println(kelilingSudut(mSudut, mSudut, mSudut));
        System.out.println(kelilingSudut(mSudut, mSudut, mSudut));
        
        System.out.println("");
        
        System.out.println(totalSudut((float)mSudut, (float)mSudut));
        System.out.println(totalsudut(mSudut));
        System.out.println(kelilingSudut((float)mSudut, mSudut, mSudut));
        System.out.println(kelilingSudut((float)mSudut, mSudut));
        
    }
    
     
}
