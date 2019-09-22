/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encap;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class EncapTest {
    public static void main(String args[])
    {
        EncapDemo encap = new EncapDemo();
        encap.setName("james");
        encap.setAge(35);
        
        System.out.println("name :"+ encap.getName());
        System.out.println("Age :"+ encap.getAge());
    }
}
