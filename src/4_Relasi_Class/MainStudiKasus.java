/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafidarw.relasiclass.percobaan4.studikasusp4;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class MainStudiKasus {
    public static void main(String[] args) {
        Admin A = new Admin("Hafid",1941723009);
        BeliCD B = new BeliCD("Transformer 3 the Fallen",12345,50000);
        SewaCD S = new SewaCD("Harry Porter and the Deathly Hallows",67890,4000);
        Customer CS = new Customer("Wibisana",1234567890,B,S,3,1);
        
        System.out.println("************************************");
        System.out.println(CS.info());
        System.out.println("====================================");
    }
}
