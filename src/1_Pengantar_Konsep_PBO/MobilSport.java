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
public class MobilSport extends Mobil{
	private String tipeSuspensi;
	public void setTipeSuspensi (String newValue)
	{
		tipeSuspensi = newValue;
	}	
        @Override
	public void cetakStatus()
	{
		super.cetakStatus();
		System.out.println("Tipe Suspensi : " + tipeSuspensi);
	}
}
