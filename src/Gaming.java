/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tokogaming;
import java.util.Scanner;
/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class Gaming {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int jumlah;
        int harga;
        int total=0;
        int jumlah_kaset;
        String game, nama_member, id_member;   
        System.out.println("Masukan Nama Game : ");
        game = a.nextLine();
        System.out.println("Masukan ID : ");
        id_member = a.nextLine();
        System.out.println("Masukan Nama Member? : ");
        nama_member= a.nextLine();
        System.out.println("Masukan Jumlah kaset ? : ");
        jumlah_kaset = a.nextInt();
        System.out.println("TERIMA KASIH SUDAH MEMINJAM DI TOKO Gaming");
        System.out.println("GAME AKAN DI HITUNG SEGERA");
        System.out.println("ID Game 1 Spesial(Rp.10000/Pinjam) ");
        System.out.println("ID Game Selain 1 Free(Rp0) ");
        for (int kaset=0; kaset<jumlah_kaset;kaset++){
            System.out.println("ID Game 1 : ");
            jumlah = a.nextInt();
            if(jumlah==0x1){
                harga=10000;
                total=total+harga;
            }
        }
        System.out.println("Nama Game        : "+ game);
        System.out.println("Id Member    : "+ id_member);
        System.out.println("Jumlah Kaset    : "+ jumlah_kaset);
        System.out.println("Nama Member       : "+ nama_member);
        System.out.println("Total     : "+ total);
    }
}
