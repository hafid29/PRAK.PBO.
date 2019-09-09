/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        mhs1.nim=101;
        mhs1.nama="HAFID";
        mhs1.alamat="Jatimulyo";
        mhs1.kelas="TI 2C";
        mhs1.tampilBiodata();
        
        mhs2.nim=102;
        mhs2.nama="WIBISANA";
        mhs2.alamat="Jatimulyo2";
        mhs2.kelas="TI 2C";
        mhs2.tampilBiodata();
    }
}
