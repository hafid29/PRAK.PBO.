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
public class JumpingZombie1941723009Hafid extends Zombie1941723009Hafid{
    
    public JumpingZombie1941723009Hafid(int mHealth, int mLevel){
    this.mHealth = mHealth;
    this.mLevel = mLevel;
}

    @Override
    public void healHafid() {
        switch(this.mLevel){
            case 1: this.mHealth += (30/100 * this.mHealth);break;
            case 2: this.mHealth += (40/100 * this.mHealth);break;
            case 3: this.mHealth += (50/100 * this.mHealth);break;
        }
    }

    @Override
    public void destroyedHafid() {
        this.mHealth -= (10 * this.mHealth / 100);
    }

    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo();
        return "Jumping Zombie Data = \n"
        + info;
    }
}
