/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobil;

/**
 *
 * @author Shirogami
 */
public class MobilKeluarga{
	public static void main(String[] args)
	{
		//data dari objek
		Mobil mbl1 = new Mobil();
		Mobil mbl2 = new Mobil();
		MobilSport mbl3 = new MobilSport();
		//memanggil method
		mbl1.setMerek("Avanza");
		mbl1.setWarna("Silver");
		mbl1.tambahKecepatan(5);
		mbl1.gantiGear(1);
                mbl1.setJenis("Mobil Keluarga");
		mbl1.cetakStatus();

		mbl2.setMerek("Inova");
		mbl2.setWarna("Hijau");
		mbl2.tambahKecepatan(80);
		mbl2.gantiGear(4);
                mbl2.setJenis("Mobil Keluarga");
		mbl2.cetakStatus();

		mbl3.setMerek("Jazz");
		mbl3.setWarna("Biru");
		mbl3.tambahKecepatan(120);
		mbl3.gantiGear(5);
                mbl3.setJenis("Mobil Sport");
		mbl3.setTipeSuspensi("Gas Suspension");
		mbl3.cetakStatus();


	} 
}
