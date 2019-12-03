/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.util.ArrayList;
import java.sql.*;
import backend.*; 

/**
 *
 * @author Hafid
 */
public class Anggota1941723009Hafid {
    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public int getmIdAnggota() {
        return mIdAnggota;
    }

    public void setmIdAnggota(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamat() {
        return mAlamat;
    }

    public void setmAlamat(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getmTelepon() {
        return mTelepon;
    }

    public void setmTelepon(String mTelepon) {
        this.mTelepon = mTelepon;
    }

    public Anggota1941723009Hafid() {
    }

    public Anggota1941723009Hafid(String nama, String alamat, String telepon) {
        this.mNama = nama;
        this.mAlamat = alamat;
        this.mTelepon = telepon;
    }
    
    public Anggota1941723009Hafid getById(int id) {
        Anggota1941723009Hafid agt = new Anggota1941723009Hafid();
        ResultSet rs = DBHelper1941723009Hafid.selectQuery("SELECT * FROM anggota " + " WHERE idAnggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1941723009Hafid();
                agt.setmIdAnggota(rs.getInt("idAnggota"));
                agt.setmNama(rs.getString("nama"));
                agt.setmAlamat(rs.getString("alamat"));
                agt.setmTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota1941723009Hafid> getAll() {
        ArrayList<Anggota1941723009Hafid> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1941723009Hafid.selectQuery("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1941723009Hafid agt = new Anggota1941723009Hafid();
                agt.setmIdAnggota(rs.getInt("idAnggota"));
                agt.setmNama(rs.getString("nama"));
                agt.setmAlamat(rs.getString("alamat"));
                agt.setmTelepon(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public ArrayList<Anggota1941723009Hafid> search(String keyword) {
        ArrayList<Anggota1941723009Hafid> ListAnggota = new ArrayList();

        String sql = "Select * from anggota where " + " nama like '%" + keyword + "%' " + " or alamat like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1941723009Hafid.selectQuery(sql);

        try {
            while (rs.next()) {
                Anggota1941723009Hafid agt = new Anggota1941723009Hafid();
                agt.setmIdAnggota(rs.getInt("idAnggota"));
                agt.setmNama(rs.getString("nama"));
                agt.setmAlamat(rs.getString("alamat"));
                agt.setmTelepon(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }
    
    public void save(){
        if(getById(mIdAnggota).getmIdAnggota()== 0){
            String SQL = "Insert into anggota (nama,alamat,telepon) values(" 
                    + " '" +this.mNama + "', "
                    + " '" +this.mAlamat + "', "
                    + " '"+this.mTelepon+"' "
                    + " )";
                    this.mIdAnggota = DBHelper1941723009Hafid.insertQueryGetId(SQL);
        }else{
            String SQL = "Update anggota set"
                   + " nama = '" +this.mNama +"', "
                   + " alamat = '" +this.mAlamat +"', "
                   + " telepon = '"+this.mTelepon+"' "
                   +"Where idAnggota = '"+this.mIdAnggota+"'";
            DBHelper1941723009Hafid.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM anggota WHERE idAnggota = '"+this.mIdAnggota+"'";
        DBHelper1941723009Hafid.executeQuery(SQL);
    }
}

