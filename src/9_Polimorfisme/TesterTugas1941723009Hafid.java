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
public class TesterTugas1941723009Hafid {
    public static void main(String[] args) {
        WalkingZombie1941723009Hafid wz = new WalkingZombie1941723009Hafid(100, 1);
        JumpingZombie1941723009Hafid jz = new JumpingZombie1941723009Hafid(100, 2);
        Barrier1941723009Hafid b = new Barrier1941723009Hafid(100);
        Plant1941723009Hafid p = new Plant1941723009Hafid();
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {//Destroy the enemis 4 times
            p.doDestroyHafid(wz);
            p.doDestroyHafid(jz);
            p.doDestroyHafid(b);
        }
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
    }
}
