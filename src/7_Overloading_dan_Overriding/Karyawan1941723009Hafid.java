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
public class Karyawan1941723009Hafid {
    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmNip() {
        return mNip;
    }

    public void setmNip(String mNip) {
        this.mNip = mNip;
    }

    public String getmGolongan() {
        return mGolongan;
    }

    public void setmGolongan(String mGolongan) {
        this.mGolongan = mGolongan;
        
        switch (mGolongan.charAt(0))
        {
            case '1':this.mGaji=5000000;
            break;
            case '2':this.mGaji=3000000;
            break;
            case '3':this.mGaji=2000000;
            break;
            case '4':this.mGaji=1000000;
            break;
            case '5':this.mGaji=750000;
            break;
        }
    }

    public double getmGaji() {
        return mGaji;
    }

    public void setmGaji(double mGaji) {
        this.mGaji = mGaji;
    }
    
    
}
