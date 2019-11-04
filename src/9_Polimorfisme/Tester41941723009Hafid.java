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
public class Tester41941723009Hafid {
    public static void main(String[] args) {
        Owner1941723009Hafid ow = new Owner1941723009Hafid();
        ElectricityBill1941723009Hafid eBill =new ElectricityBill1941723009Hafid(5, "R-1");
        ow.payHafid(eBill);//pay for electricity bill
        System.out.println("--------------------------------------------------");
        
        PermanenEmployee1941723009Hafid pEmp = new PermanenEmployee1941723009Hafid("Dedik", 500);
        ow.payHafid(pEmp);//pay for permanent employee
        System.out.println("--------------------------------------------------");
        
        InternshipEmployee1941723009Hafid iEmp = new InternshipEmployee1941723009Hafid("Sunarto", 5);
        ow.showMyEmployeeHafid(pEmp);//show permanent employee info
        System.out.println("--------------------------------------------------");
        ow.showMyEmployeeHafid(iEmp);//show internship employee info
        
        
    }   
    
}
