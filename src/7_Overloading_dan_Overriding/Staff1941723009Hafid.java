/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.OverloadingdanOverriding;

/**
 *
 * @author Hafid
 */
public class Staff1941723009Hafid extends Karyawan1941723009Hafid {
    private int mLembur;
    private double mGajiLembur;

    public int getmLembur() {
        return mLembur;
    }

    public void setmLembur(int mLembur) {
        this.mLembur = mLembur;
    }

    public double getmGajiLembur() {
        return mGajiLembur;
    }

    public void setmGajiLembur(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    

    
    public double getmGaji(int mLembur,double mGajilembur) {
        return super.getmGaji()+mLembur*mGajilembur; //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double getmGaji()
    {
        return super.getmGaji()+mLembur*mGajiLembur;
    }
    
    public void lihatinfo()
    {
        System.out.println("NIP:"+this.getmNip());
        System.out.println("Nama:"+this.getmNama());
        System.out.println("Golongan:"+this.getmGolongan());
        System.out.println("Jml Lembur:"+this.getmLembur());
        System.out.printf("Gaji Lembur:%.0f\n",this.getmGajiLembur());
        System.out.printf("Gaji:%.0f\n",this.getmGaji());
    }
    
}
