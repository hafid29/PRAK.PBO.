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
public class Peminjaman1941723009Hafid {
    private int mIdpeminjaman;
    private Anggota1941723009Hafid mAnggota = new Anggota1941723009Hafid();
    private Buku1941723009Hafid mBuku = new Buku1941723009Hafid();
    private String mTanggalpinjam;
    private String mTanggalkembali;

    public Peminjaman1941723009Hafid() {
    }

    public Peminjaman1941723009Hafid(Anggota1941723009Hafid anggota, Buku1941723009Hafid buku, String tanggalpinjam, String tanggalkembali) {        
        this.mAnggota = anggota;
        this.mBuku = buku;
        this.mTanggalpinjam = tanggalpinjam;
        this.mTanggalkembali = tanggalkembali;
    }    

    public int getmIdpeminjaman() {
        return mIdpeminjaman;
    }

    public void setmIdpeminjaman(int mIdpeminjaman) {
        this.mIdpeminjaman = mIdpeminjaman;
    }

    public Anggota1941723009Hafid getAnggota() {
        return mAnggota;
    }

    public void setAnggota(Anggota1941723009Hafid anggota) {
        this.mAnggota = anggota;
    }

    public Buku1941723009Hafid getBuku() {
        return mBuku;
    }

    public void setBuku(Buku1941723009Hafid buku) {
        this.mBuku = buku;
    }

    public String getmTanggalpinjam() {
        return mTanggalpinjam;
    }

    public void setmTanggalpinjam(String mTanggalpinjam) {
        this.mTanggalpinjam = mTanggalpinjam;
    }

    public String getmTanggalkembali() {
        return mTanggalkembali;
    }

    public void setmTanggalkembali(String mTanggalkembali) {
        this.mTanggalkembali = mTanggalkembali;
    }

    
    
    public Peminjaman1941723009Hafid getById(int id){
        Peminjaman1941723009Hafid peminjaman = new Peminjaman1941723009Hafid();
        ResultSet rs = DBHelper1941723009Hafid.selectQuery("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                        +"      WHERE p.idpeminjaman = '"+ id + "'");
        try {
            while(rs.next()){
                peminjaman = new Peminjaman1941723009Hafid();
                peminjaman.setmIdpeminjaman(rs.getInt("idbuku"));
                peminjaman.getAnggota().setmIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setmNama(rs.getString("nama_anggota"));
                peminjaman.getAnggota().setmAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setmTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setmIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setmIdKategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getKategori().setmNama(rs.getString("nama_kategori"));
                peminjaman.getBuku().getKategori().setmKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setmJudul(rs.getString("judul"));
                peminjaman.getBuku().setmPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setmPenulis(rs.getString("penulis"));
                peminjaman.setmTanggalpinjam(rs.getDate("tanggalpinjam").toString());
                peminjaman.setmTanggalkembali(rs.getDate("tanggalkembali").toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }
    
    public ArrayList<Peminjaman1941723009Hafid> getAll(){
        ArrayList<Peminjaman1941723009Hafid> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1941723009Hafid.selectQuery("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota ");
        
        try {
            while(rs.next()){
                Peminjaman1941723009Hafid peminjaman = new Peminjaman1941723009Hafid();
                peminjaman.setmIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setmIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setmNama(rs.getString("nama_anggota"));
                peminjaman.getAnggota().setmAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setmTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setmIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setmIdKategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getKategori().setmNama(rs.getString("nama_kategori"));
                peminjaman.getBuku().getKategori().setmKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setmJudul(rs.getString("judul"));
                peminjaman.getBuku().setmPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setmPenulis(rs.getString("penulis"));
                peminjaman.setmTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setmTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPeminjaman;
    }
    
    public ArrayList<Peminjaman1941723009Hafid> search(String keyword){
        ArrayList<Peminjaman1941723009Hafid> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1941723009Hafid.selectQuery("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                        +"      WHERE p.tanggalpinjam LIKE '%" + keyword + "%' "
                                        +"          OR p.tanggalkembali LIKE '%" + keyword + "%' ");
        
        try {
            while(rs.next()){
                Peminjaman1941723009Hafid peminjaman = new Peminjaman1941723009Hafid();
                peminjaman.setmIdpeminjaman(rs.getInt("idbuku"));
                peminjaman.getAnggota().setmIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setmNama(rs.getString("nama_anggota"));
                peminjaman.getAnggota().setmAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setmTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setmIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setmIdKategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getKategori().setmNama(rs.getString("nama_kategori"));
                peminjaman.getBuku().getKategori().setmKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setmJudul(rs.getString("judul"));
                peminjaman.getBuku().setmPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setmPenulis(rs.getString("penulis"));
                peminjaman.setmTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setmTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPeminjaman;
    }
    
    public void save(){
        if(getById(mIdpeminjaman).getmIdpeminjaman()== 0){
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    +"      '"+ this.getAnggota().getmIdAnggota()+"', "
                    +"      '"+ this.getBuku().getmIdbuku()+"', "
                    +"      '"+ this.mTanggalpinjam + "', "
                    +"      '"+ this.mTanggalkembali + "' "
                    +"      )";
            this.mIdpeminjaman = DBHelper1941723009Hafid.insertQueryGetId(SQL);
            
        } else {
            String SQL = "UPDATE peminjaman SET "
                    +"      idanggota = '"+ this.getAnggota().getmIdAnggota()+ "', "
                    +"      idbuku = '"+ this.getBuku().getmIdbuku()+"', "
                    +"      tanggalpinjam = '"+ this.mTanggalpinjam +"', "
                    +"      tanggalkembali = '"+ this.mTanggalkembali +"' "
                    +"      WHERE idpeminjaman = '"+this.mIdpeminjaman + "'";
            DBHelper1941723009Hafid.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.mIdpeminjaman + "'";
        DBHelper1941723009Hafid.executeQuery(SQL);
    }   
    
}
