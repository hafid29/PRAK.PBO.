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
public class Tester21941723009Hafid {
    public static void main(String[] args) {
        PermanenEmployee1941723009Hafid pEmp = new PermanenEmployee1941723009Hafid("Dedik", 500);
        Employee1941723009Hafid e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfoHafid());
        System.out.println("------------------");
        System.out.println(""+pEmp.getEmployeeInfoHafid());
    }
}
