/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HafidARW.relasiclass.percobaan1;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop() {
    }

    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }
    
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.Info();
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }
    
}

