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
public class InternshipEmployee1941723009Hafid extends Employee1941723009Hafid{
    private int mLength;

    public InternshipEmployee1941723009Hafid(String name, int mLength) {
        this.mLength = mLength;
        this.mName = name;
    }

    public int getmLength() {
        return mLength;
    }

    public void setmLength(int mLength) {
        this.mLength = mLength;
    }

    @Override
    public String getEmployeeInfoHafid() {
        String info = super.getEmployeeInfoHafid()+"\n";
        info += "Registered as internship employee for "+mLength+"month/s\n";
        return info;
    }
}
