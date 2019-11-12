/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_job10_Hafid;

/**
 *
 * @author Hafid
 */
public class Barrier1941723009Hafid implements IDestroyable1941723009Hafid{
    private int mStrength;
    
    public Barrier1941723009Hafid(int mStrength) {
        this.mStrength = mStrength;
    }

    public int getmStrength() {
        return mStrength;
    }

    public void setmStrength(int mStrength) {
        this.mStrength = mStrength;
    }

    @Override
    public void destroyedHafid() {
        this.mStrength -= (0.1 * this.mStrength);
    }
    public String getBarrierInfo(){
        return "Barrier Strength = " + this.mStrength;
    }
}
