/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafidarw.inheritance.j6percobaan_2;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class ClassB1941723009Hafidp2 extends ClassA1941723009Hafidp2  {
    private int mZ;
    
    public void setZ(int z){
        this.mZ = z; 
    }
    public void getNilaiZ(){
        System.out.println("nilai z:"+ mZ);
    }
    public void getJumlah(){
        System.out.println("jumlah:"+ (mX+mY+mZ));
    }
}
