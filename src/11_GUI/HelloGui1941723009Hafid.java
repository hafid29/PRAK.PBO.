/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan_1_JFrame_HelloGUI;

/**
 *
 * @author Hafid
 */
import javax.swing.*;
public class HelloGui1941723009Hafid {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("ini percobaan HelloGui Frame");
                         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//program akan berhenti jika ditutup
                         frame.setSize(600, 300);//lebar, tinggi windows
                         frame.setLocation(600, 300);//x, y tampilan pada windows
                         frame.setLocationRelativeTo(null);//menempatkan frame ditengah-tengah layar
                         frame.setVisible(true);//untuk menampilkan frame
        
    }
}
