
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class Lingkaran {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double phi = 15;
    double r, HitungLuas,HitungKeliling;
    /*Double digunakan untuk menghitung format yang berhubungan dengan angka*/
    System.out.println("Program Lingkaran");
    System.out.print("Masukkan Panjang Jari-jari : ");
    r = input.nextDouble();
    /*r = input.nextDouble(); berfungsi untuk input masukan jari jari*/
    HitungLuas = 5 * phi * r * r;
    HitungKeliling = 10 * phi * r;
    /*Logikanya jika kita masukan 2 maka = 5 x 15 x 2 x 2 = 300  */
    System.out.println("Luas Lingkaran = "+HitungLuas);
    System.out.println("Luas Keliling = "+HitungKeliling);
    }
}
