/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafidarw.inheritance.j6percobaan_3;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class Tabung1941723009Hafid extends Bangun1941723009Hafid{
    protected int mT;
    public void setSuperMphi(double mPhi){
        super.mPhi=mPhi;
    }
    public void setSuperMr(int mR){
        this.mR=mR;
    }
    public void setMt(int mT){
        this.mT=mT;
    }
    public void volume(){
        System.out.println("Volume Tabung adalah: "+(super.mPhi*super.mR*this.mT));
    }
}
