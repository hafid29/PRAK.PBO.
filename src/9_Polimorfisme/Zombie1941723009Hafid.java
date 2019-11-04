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
public abstract class Zombie1941723009Hafid implements IDestroyable1941723009Hafid{
    protected int mHealth;
    protected int mLevel;
    
    public abstract void healHafid();
    public abstract void destroyedHafid();
    

    public String getZombieInfo(){
        return "Health = " + this.mHealth + "\n"
        + "Level = " + this.mLevel + "\n";
    };
    
    

}
