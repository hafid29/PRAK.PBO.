# Laporan Praktikum #2 - Class_dan_Object

## Kompetensi

 Mahasiswa dapat memahami deskripsi dari class dan object<br> 
 Mahasiswa memahami implementasi dari class<br> 
 Mahasiswa dapat memahami implementasi dari attribute<br> 
 Mahasiswa dapat memahami implementasi dari method<br>
 Mahasiswa dapat memahami implementasi dari proses instansiasi<br> 
 Mahasiswa dapat memahami implementasi dari try-catch<br> 
 Mahasiswa dapat memahami proses pemodelan class diagram menggunakan UML 

## Ringkasan Materi

(berisi catatan penting pribadi selama praktikum berlangsung ataupun menemukan permasalahan khusus saat melakukan percobaan)

## Percobaan

### Percobaan 1

1. ![screenshot](img/percobaan1.JPG)<br>
2. Class Perusahaan dan Karyawan<br>
3. Class Karyawan <br>
atribut<br>
idKaryawan int<br>
namaKaryawan String<br>
jenisKelamin String<br>
jabatan String<br>
gaji int<br>
4. 1001<br>
Hafid<br>
Pria<br>
Supervisior<br>
2000000<br>

`contoh screenshot yang benar, menampilkan 3 komponen, yaitu struktur project, kode program, dan hasil kompilasi`

![screenshot](img/percobaan1.2.JPG)<br>
![screenshot](img/percobaan1.3.JPG)<br>

link kode program : [ini link ke kode program](/../src/2_Class_and_Object/perusahaan.java)<br>
link kode program : [ini link ke kode program](/../src/2_Class_and_Object/Karyawan.java)<br>

### Percobaan 2

pembuatan class mahasiswa<br>

`contoh screenshot yang benar, menampilkan 3 komponen, yaitu struktur project, kode program, dan hasil kompilasi`

1. Bagian Mahasiswa ![screenshot](img/percobaan2.JPG)<br>

link kode program : [contoh link ke kode program](../../src/2_Class_dan_Object/Mahasiswa.java)<br>

2. Bagian TestMahasiswa ![screenshot](img/percobaan2.1.JPG)<br>

link kode program : [contoh link ke kode program](../../src/2_Class_dan_Object/TestMahasiswa.java)<br>

Essai<br>
7. bagian pendeklarasian atribut adalah nim, nama, alamat, dan kelas.<br>
   public void tampilBiodata() {<br>
    	System.out.println("Nim :"+nim);
    	System.out.println("Nama :"+nama);
    	System.out.println("Alamat :"+alamat);   
   	System.out.println("Kelas :"+kelas);
8. bagian pendeklarasian method adalah 101, HAFID, Jatimulyo, TI 2C, dan TampilBiodata<br>
	mhs1.nim=101;
        mhs1.nama="HAFID";
        mhs1.alamat="Jatimulyo";
        mhs1.kelas="TI 2C";
        mhs1.tampilBiodata();
9. 1 object yaitu Mahasiswa.java<br>
10. yang dilakukan pada sintaks tersebut adalah untuk menginput method kedalam atribut<br>
11. yang dilakukan pada sintaks tersebut adalah untuk menampilkan seluruh method yang ada pada atribut<br>
12. Bagian Instasiasi 2 object ![screenshot](img/2object.jpg)<br>

link kode program : [contoh link ke kode program](../../src/2_Class_dan_Object/TestMahasiswa.java)<br>

## Percobaan 3: Menulis method yang memiliki argument/parameter dan memiliki return

1,2,3.  Bagian Barang ![screenshot](img/brg1.jpg)<br>

link kode program : [link ke kode program](../../src/2_Class_dan_Object/Barang.java)<br>

4,5,6. Bagian TestBarang ![screenshot](img/brg2.jpg)<br>

link kode program : [link ke kode program](../../src/2_Class_dan_Object/testBarang.java)<br>

7. fungsi argumen dalam suatu method adalah untuk menambahkan/menginput stok barang<br>
8. kesimpulan tentang kegunaan kata kunci return adalah return berfungsi untuk mengembalikan nilai dari suatu variabel dan ditambahkan nilai input<br>
ketika suatu method ingin mengembalikan nilai variabelnya secara langsung<br>

## Pertanyaan
 ()<br>
## Tugas
1. Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana data yang dicatat ketika ada orang yang melakukan peminjaman adalah id, nama member, nama game, dan harga yang harus dibayar.<br> Setiap peminjaman bisa menampilkan data hasil peminjaman dan harga yang harus dibayar.<br> Buatlah class diagram pada studi kasus diatas!
Penjelasan:<br>
a. Harga yang harus dibayar diperoleh dari lama sewa x harga.<br>
b. Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya 1 game saja.<br>
Bagian TokoGaming ![screenshot](img/tokogame.jpg)<br>

link kode program : [link ke kode program](../../src/2_Class_dan_Object/Gaming.java)<br>
2. jadi satu sama nomer 1<br>

3. Program Hitung Jari-Jari lingkaran
Bagian Lingkaran ![screenshot](img/lingkaran.jpg)<br>

link kode program : [link ke kode program](../../src/2_Class_dan_Object/Lingkaran.java)<br>
4. Program Pembayaran Dengan Diskon 
Pada program ini terdapat objek dan class seperti class Barang dan TestBarang dimana di dalamnya terdapat objek Barang meliputi kodeBarang, namaBarang, dan harga.
Bagian Diskon ![screenshot](img/diskon1.jpg)<br>

link kode program : [link ke kode program](../../src/2_Class_dan_Object/diskon.java)<br>
Bagian MainDiskon ![screenshot](img/diskon.jpg)<br>

link kode program : [link ke kode program](../../src/2_Class_dan_Object/maindiskon.java)<br>
## Kesimpulan

return memiliki fungsi yang terbilang penting karena bisa mengembalikan nilai tanpa harus menulis kembali nilai tersebut

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

(HAFID ALI RAHMAN WIBISANA)
