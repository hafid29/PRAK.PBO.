/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jobsheet.polimorfisme;

/**
 *
 * @author Hafid
 */
public class PermanenEmployee1941723009Hafid extends Employee1941723009Hafid implements  Payable1941723009Hafid{
    private int mSalary;

    public PermanenEmployee1941723009Hafid(String mName, int mSalary) {
        this.mName= mName;
        this.mSalary = mSalary;
    }

    public int getmSalary() {
        return mSalary;
    }

    public void setmSalary(int mSalary) {
        this.mSalary = mSalary;
    }
    @Override
    public int getPayableAmountHafid() {
        return (int) (mSalary+0.05*mSalary);
    }

    @Override
    public String getEmployeeInfoHafid() {
        String info = super.getEmployeeInfoHafid()+"\n";
        info += "Registered as permanent employee with salary "+mSalary+"\n";
        return info;
    }
    
}
