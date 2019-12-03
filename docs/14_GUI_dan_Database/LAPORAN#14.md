# Laporan #12 - Pengantar Konsep PBO

# Java_API_dan_Database

## Kompetensi

Setelah menempuh materi percobaan ini, mahasiswa mampu mengenal:
1. Menggunakan paradigma berorientasi objek untuk interaksi dengan database
2. Membuat backend dan frontend
3. Membuat form sebagai frontend  

## Ringkasan Materi

Secara umum, tahapan yang akan kita lakukan adalah sebagai berikut:
1. Membuat database dan tabel-tabelnya.
2. Membuat backend yang berisi class-class yang mewakili data yang ada pada database, dan
class helper untuk melakukan eksekusi query database.
3. Membuat frontend yang merupakan antarmuka kepada pengguna. Frontend ini bisa
berbasis teks (console), GUI, web, mobile, dan sebagainya.
Library yang digunakan untuk project ini antara lain:
1. JDBC, untuk melakukan interaksi ke database.
2. ArrayList, untuk menampung data hasil query ke database.
3. Swing, untuk membuat tampilan GUI.


## Percobaan

### Percobaan 1

1. Datebase perpustakaan

![screenshot](img/dbperpus.JPG)

2. Table Anggota

![screenshot](img/tbanggota.JPG)

3. Tabel Buku

![screenshot](img/tbbuku.JPG)

4. Tabel Kategori

![screenshot](img/tbkategori.JPG)

5. Tabel Peminjaman

![screenshot](img/tbpeminjaman.JPG)

### Percobaan 2 

1. Nama Project 
![screenshot](img/namaproject.JPG)

2. Library 
![screenshot](img/library.JPG)

3. Package
![screenshot](img/package.JPG)

### Percobaan 3

1. Class DbHelper1941723009Hafid

![screenshot](img/dbhelper.jpg)

link kode program : [link kode](../../src/14_GUI_dan_Database/DBHelper1941723009Hafid.java)

2. import library

![screenshot](img/import.JPG)

### Percobaan 4

1. Class InputData1941723009Hafid

![screenshot](img/inputdata.jpg)

link kode program : [link kode](../../src/12_Java_API_dan_Database/InputData1941723009Hafid.java)

2. Class Mahasiswa1941723009Hafid

![screenshot](img/mahasiswa.jpg)

link kode program : [link kode](../../src/12_Java_API_dan_Database/Mahasiswa1941723009Hafid.java)

3. Class TampilGui1941723009Hafid

![screenshot](img/maintampilgui.jpg)

link kode program : [link kode](../../src/12_Java_API_dan_Database/TampilGui1941723009Hafid.java)


### Percobaan 5


1. Buatlah Package baru dengan nama Biodata atau membuat project baru dengan cara
a. File  New Project
b. Pilih categories  Java dengan Projects  Java Application  klik next
c. Isi nama Project dengan Biodata dan atur letak project akan disimpan
d. Kemudian tambahkan Jframe Form dengan nama FormKoneksi.
e. Desain FormKoneksi seperti berikut2. Langkah selanjutnya tambahkan libraries, dengan cara klik kanan pada Libraries. Kemudian
pilih add library dan pilih MySQL JDBC Driver.
Tampilan Libraries setelah ditambah MySQL JDBC Driver.
3. Pada tahap ini aplikasi sudah siap untuk bertransaksi dengan database yang sudah kita buat
pada langkah 1. Selanjutnya kita buat method untuk melakukan koneksi dengan database,
seperti berikut:Pada method buka_koneksi untuk variabel url terdapat angka 6606 adalah port mysql yang
digunakan oleh penulis. Pada umumnya port mysql secara default adalah 3306. Sedangkan
untuk Biodata adalah nama database yang digunakan oleh penulis.
4. Pada button add klik tambahkan code sebagai berikut:
buka_koneksi();
String sqlkode="Insert into anggota (nama,alamat,telp) "
+ "values ('"+this.jTFNama.getText()+"',"
+ "'"+this.jTFAlamat.getText()+"',"
+ "'"+this.jTFTelepon.getText()+"')";
try {
PreparedStatement mStatement = koneksi.prepareStatement(sqlkode);
mStatement.executeUpdate();
mStatement.close();
JOptionPane.showMessageDialog(this,"Data Berhasil Ditambah");
} catch (SQLException ex) {
JOptionPane.showMessageDialog(this,"Terjadi Kesalahan "+ex.getMessage());
}
5. Setelah menambah code pada action button klik, coba jalankan program dan tambahkan
data. Apakah program berhasil menambahkan data? Jika tidak apakah penyebabnya.
.................................................................
6. Jelaskan maksud source code untuk melakukan insert data diatas?
.................................................................
7. Buat Table model yang digunakan untuk memanipulasi tampilan pada Jtable, seperti pada
code dibawah ini:8. Selanjutnya buat method ambil_data_tabel seperti berikut
private void ambil_data_tabel() {
model.getDataVector().removeAllElements();
model.fireTableDataChanged();
try {
buka_koneksi();
Statement s = koneksi.createStatement();
String sql = "Select * from anggota";
ResultSet r = s.executeQuery(sql);
while (r.next()) {
Object[] o = new Object[4];
o[0] = r.getString("id");
o[1] = r.getString("nama");
o[2] = r.getString("alamat");
o[3] = r.getString("telp");
model.addRow(o);
}
r.close();
s.close();
} catch (SQLException e) {
JOptionPane.showMessageDialog(this,"Terjadi kesalahan " + e.getMessage());
}
}
Jalankan program maka data yang sudah kita add akan tampil seperti berikut:9. Jelaskan alur dari method ambil_data_tabel?
...........
10. Buat fungsi untuk merefresh sehingga data yang baru dapat ditampilkan pada tabel.
2

## Kesimpulan

yang saya pelajari dari kumpulan percobaan pada minggu ke 12 java api dan database adalah mengisi, menghapus, memformat object dengan fungsi yang ada pada program HashMap, dan menambahkan data / menginput data menggunakan fungsi arraylist serta menampilkan di dalam komponen JFrame

## Pernyataan Diri

	Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

	Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

	Ttd,

	(Hafid Ali Rahman Wibisana)