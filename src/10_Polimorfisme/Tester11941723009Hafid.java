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
public class Tester11941723009Hafid {
    public static void main(String[] args) {
        PermanenEmployee1941723009Hafid pEmp =  new PermanenEmployee1941723009Hafid("Dedik", 500);
        InternshipEmployee1941723009Hafid iEmp = new InternshipEmployee1941723009Hafid("Sunarto", 5);
        ElectricityBill1941723009Hafid eBill = new ElectricityBill1941723009Hafid(5, "A-1");
        Employee1941723009Hafid e;
        Payable1941723009Hafid p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}
