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
public class Manager1941723009Hafid extends Karyawan1941723009Hafid {
    private double mTunjangan;
    private String mBagian;
    private Staff1941723009Hafid st[];

    public double getmTunjangan() {
        return mTunjangan;
    }

    public void setmTunjangan(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getmBagian() {
        return mBagian;
    }

    public void setmBagian(String mBagian) {
        this.mBagian = mBagian;
    }
    
    public void setStaff(Staff1941723009Hafid st[]) {
        this.st=st;
    }
    
    public void viewStaff()
    {
        int i;
        System.out.println("--------------");
        for (i = 0; i < st.length; i++) {
        st[i].lihatinfo();
        }
        System.out.println("---------------");
    }
    
    public void lihatinfo()
    {
        System.out.println("Manager:"+this.getmBagian());
        System.out.println("NIP:"+this.getmNip());
        System.out.println("Nama:"+this.getmNama());
        System.out.println("Golongan:"+this.getmGolongan());
        System.out.printf("Tunjangan:%.0f\n",this.getmTunjangan());
        System.out.printf("Gaji:%.0f\n",this.getmGaji());
        System.out.println("Bagian:"+this.getmBagian());
        this.viewStaff();
    }

    @Override
    public double getmGaji() {
        return super.getmGaji()+mTunjangan; //To change body of generated methods, choose Tools | Templates.
    }
    
}
