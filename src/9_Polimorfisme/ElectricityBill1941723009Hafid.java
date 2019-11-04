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
public class ElectricityBill1941723009Hafid implements Payable1941723009Hafid{
    private int mKwh;
    private String mCategory;

    public ElectricityBill1941723009Hafid(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getmKwh() {
        return mKwh;
    }

    public void setmKwh(int mKwh) {
        this.mKwh = mKwh;
    }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    @Override
    public int getPayableAmountHafid() {
        return mKwh*getBasePriceHafid();
    }

    private int getBasePriceHafid() {
        int bPrice = 0;
        switch(mCategory){
            case "R-2" : bPrice = 100;break;
            case "R-1" : bPrice = 200;break;
        }
        return bPrice;
    }
    public String getBillInfoHafid(){
        return "KWh = "+mKwh+"\n"+
                "Category = "+mCategory+"("+getBasePriceHafid()+"per KWH)\n";
    }    
}
