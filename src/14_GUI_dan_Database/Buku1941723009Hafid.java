/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author mwpras
 */
public class Buku1941723009Hafid {
    private int mIdbuku;
    private Kategori1941723009Hafid mKategori = new Kategori1941723009Hafid();
    private String mJudul;
    private String mPenerbit;
    private String mPenulis;

    public int getmIdbuku() {
        return mIdbuku;
    }

    public void setmIdbuku(int mIdbuku) {
        this.mIdbuku = mIdbuku;
    }

    public Kategori1941723009Hafid getKategori() {
        return mKategori;
    }

    public void setKategori(Kategori1941723009Hafid kategori) {
        this.mKategori = kategori;
    }

    public String getmJudul() {
        return mJudul;
    }

    public void setmJudul(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getmPenerbit() {
        return mPenerbit;
    }

    public void setmPenerbit(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getmPenulis() {
        return mPenulis;
    }

    public void setmPenulis(String mPenulis) {
        this.mPenulis = mPenulis;
    }
    
    public Buku1941723009Hafid() {
    
    }
    
    public Buku1941723009Hafid(Kategori1941723009Hafid kategori, String judul, String penerbit, String penulis) {
        this.mKategori = kategori;
        this.mJudul = judul;
        this.mPenerbit = penerbit;
        this.mPenulis = penulis;
    }
    
    public Buku1941723009Hafid getById(int id) {
        Buku1941723009Hafid buku = new Buku1941723009Hafid();
        ResultSet rs = DBHelper1941723009Hafid.selectQuery("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.idbuku = '" + id + "'");
        try {
            while(rs.next()) {
                buku = new Buku1941723009Hafid();
                buku.setmIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setmIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setmNama(rs.getString("nama"));
                buku.getKategori().setmKeterangan(rs.getString("keterangan"));
                buku.setmJudul(rs.getString("judul"));
                buku.setmPenerbit(rs.getString("penerbit"));
                buku.setmPenulis(rs.getString("penulis"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }
    
    public ArrayList<Buku1941723009Hafid> getAll() {
        ArrayList<Buku1941723009Hafid> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1941723009Hafid.selectQuery("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori");
        try {
            while(rs.next()) {
                Buku1941723009Hafid buku = new Buku1941723009Hafid();
                buku.setmIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setmIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setmNama(rs.getString("nama"));
                buku.getKategori().setmKeterangan(rs.getString("keterangan"));
                buku.setmJudul(rs.getString("judul"));
                buku.setmPenerbit(rs.getString("penerbit"));
                buku.setmPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public ArrayList<Buku1941723009Hafid> search(String keyword) {
        ArrayList<Buku1941723009Hafid> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1941723009Hafid.selectQuery("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.judul LIKE '%" + keyword + "%'"
                                                    + " OR b.penerbit LIKE '%" + keyword + "%'"
                                                    + " OR b.penulis LIKE '%" + keyword + "%'");
        try {
            while(rs.next()) {
                Buku1941723009Hafid buku = new Buku1941723009Hafid();
                buku.setmIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setmIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setmNama(rs.getString("nama"));
                buku.getKategori().setmKeterangan(rs.getString("keterangan"));
                buku.setmJudul(rs.getString("judul"));
                buku.setmPenerbit(rs.getString("penerbit"));
                buku.setmPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public void save() {
        if(getById(mIdbuku).getmIdbuku() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                        + "'" + this.mJudul + "', "
                        + "'" + this.getKategori().getmIdKategori()+ "', "
                        + "'" + this.mPenulis + "', "
                        + "'" + this.mPenerbit + "'"
                        + ")";
            this.mIdbuku = DBHelper1941723009Hafid.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE buku SET"
                        + " judul = '" + this.mJudul + "', "
                        + " idkategori = '" + this.getKategori().getmIdKategori()+ "', "
                        + " penulis = '" + this.mPenulis + "', "
                        + " penerbit = '" + this.mPenerbit + "' "
                        + " WHERE idbuku = '" + this.mIdbuku + "'";
            DBHelper1941723009Hafid.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdbuku + "'";
        DBHelper1941723009Hafid.executeQuery(SQL);
    }
}
