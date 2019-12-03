/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Hafid
 */
public class Kategori1941723009Hafid {
    private int mIdKategori;
    private String mNama;
    private String mKeterangan;

    public int getmIdKategori() {
        return mIdKategori;
    }

    public void setmIdKategori(int mIdKategori) {
        this.mIdKategori = mIdKategori;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmKeterangan() {
        return mKeterangan;
    }

    public void setmKeterangan(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

    public Kategori1941723009Hafid() {
    }

    public Kategori1941723009Hafid(String nama, String keterangan) {
        this.mNama = nama;
        this.mKeterangan = keterangan;
    }

    public Kategori1941723009Hafid getById(int id) {
        Kategori1941723009Hafid kat = new Kategori1941723009Hafid();
        ResultSet rs = DBHelper1941723009Hafid.selectQuery("SELECT * FROM kategori " + " WHERE idKategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1941723009Hafid();
                kat.setmIdKategori(rs.getInt("idKategori"));
                kat.setmNama(rs.getString("nama"));
                kat.setmKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1941723009Hafid> getAll() {
        ArrayList<Kategori1941723009Hafid> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1941723009Hafid.selectQuery("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1941723009Hafid kat = new Kategori1941723009Hafid();
                kat.setmIdKategori(rs.getInt("idKategori"));
                kat.setmNama(rs.getString("nama"));
                kat.setmKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }

    public ArrayList<Kategori1941723009Hafid> search(String keyword) {
        ArrayList<Kategori1941723009Hafid> ListKategori = new ArrayList();

        String sql = "Select * from kategori where " + " nama like '%" + keyword + "%' " + " or keterangan like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1941723009Hafid.selectQuery(sql);

        try {
            while (rs.next()) {
                Kategori1941723009Hafid kat = new Kategori1941723009Hafid();
                kat.setmIdKategori(rs.getInt("idKategori"));
                kat.setmNama(rs.getString("nama"));
                kat.setmKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }
    
    public void save(){
        if(getById(mIdKategori).getmIdKategori() == 0){
            String SQL = "Insert into kategori (nama,keterangan) values(" 
                    + " '" +this.mNama + "', "
                    + " '"+this.mKeterangan+"' "
                    + " )";
                    this.mIdKategori = DBHelper1941723009Hafid.insertQueryGetId(SQL);
        }else{
            String SQL = "Update kategori set"
                   + " nama = '" +this.mNama +"', "
                   + " keterangan = '"+this.mKeterangan+"' "
                   +"Where idKategori = '"+this.mIdKategori+"'";
            DBHelper1941723009Hafid.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM kategori WHERE idKategori = '"+this.mIdKategori+"'";
        DBHelper1941723009Hafid.executeQuery(SQL);
    }
    
    @Override
    public String toString() {
        return mNama;
    } 
}
