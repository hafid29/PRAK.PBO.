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
public class WalkingZombie1941723009Hafid extends Zombie1941723009Hafid{
    
    public WalkingZombie1941723009Hafid( int mHealth, int mLevel ){
        this.mHealth = mHealth;
        this.mLevel = mLevel;
        
    }

    @Override
    public void healHafid() {
        switch(this.mLevel){
            case 1: this.mHealth += (20/100 * this.mHealth);break;
            case 2: this.mHealth += (30/100 * this.mHealth);break;
            case 3: this.mHealth += (40/100 * this.mHealth);break;
        }
    }

    @Override
    public void destroyedHafid() {
        this.mHealth -= (20 * this.mHealth / 100);
    }

    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo();
        return "Walking Zombie Data = \n"
        + info;
    }
    
}
