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
public class Owner1941723009Hafid {
    public void payHafid(Payable1941723009Hafid p){
        System.out.println("Total payment = "+p.getPayableAmountHafid());
        if (p instanceof ElectricityBill1941723009Hafid) {
            ElectricityBill1941723009Hafid eb = (ElectricityBill1941723009Hafid) p;
            System.out.println(""+eb.getBillInfoHafid());
        } else if(p instanceof PermanenEmployee1941723009Hafid){
            PermanenEmployee1941723009Hafid pe = (PermanenEmployee1941723009Hafid) p;
            pe.getEmployeeInfoHafid();
            System.out.println(""+pe.getEmployeeInfoHafid());
        }
    }
    public void showMyEmployeeHafid(Employee1941723009Hafid e){
        System.out.println(""+e.getEmployeeInfoHafid());
        if(e instanceof PermanenEmployee1941723009Hafid)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
