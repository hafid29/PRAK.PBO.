# Laporan #11 - Pengantar Konsep PBO

# GUI(Graphical User Interface)

## Kompetensi

Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu:
1. Membuat aplikasi Graphical User Interface sederhana dengan bahasa pemrograman java;
2. Mengenal komponen GUI seperti frame, label, textfield, combobox, radiobutton, checkbox,
textarea, menu, serta table;
3. Menambahkan event handling pada aplikasi GUI  
## Ringkasan Materi
 GUI adalah sebuah interface antara user dengan program dengan tampilan grafis.
 Bagian dalam GUI ada 4 :
1. Membuat windows utama
2. Menentukan komponen-komponen pendukung program
3. Menentukan tata letak layout agar nantinya semua komponen – komponen yang sudah
dipersiapkan bisa diaatur sedemikian rupa
4. Event Handling dari sebuah aktivitas, seperti penekanan button, check box dan lain-lain,
Java Swing merupakan bagian dari JFC (Java Foundation Classes) yang menyediakan API untuk
menangani hal yang berkaitan dengan GUI bagi program Java. Kita bisa membedakan komponen
Swing dengan komponen AWT, di mana pada umumnya kelas-kelas yang berada dalam komponen
Swing diawali dengan huruf J, misal: JButton, JLabel, JTextField, JRadioButton.

## Percobaan

### Percobaan 1

1. Percobaan pada JFrame HelloGUI

![screenshot](img/main1.JPG)

link kode program : [link kode](../../src/11_GUI/HelloGui1941723009Hafid.java)

### Percobaan 2 

1. Percobaan pada input pada GUI
![screenshot](img/main2.JPG)

link kode program : [link kode](../../src/11_GUI/Main21941723009Hafid.java)

![screenshot](img/input2.JPG)

link kode program : [link kode](../../src/11_GUI/MyInputForm1941723009Hafid.java)

### Pertanyaan

Modifikasi kode program dengan menambahkan JButton baru untuk melakukan fungsi
perhitungan penambahan, sehingga ketika button di klik (event click) maka akan
menampilkan hasil penambahan dari nilai A dan B

![screenshot](img/soal1.jpg)

dengan menambahkan method overriding dan menambah kan fungsi button

### Percobaan 3

1. Percobaan pada Manajemen Layout

![screenshot](img/border.jpg)

link kode program : [link kode](../../src/11_GUI/Border1941723009Hafid.java)

![screenshot](img/grid.jpg)

link kode program : [link kode](../../src/11_GUI/Grid1941723009Hafid.java)

![screenshot](img/box.jpg)

link kode program : [link kode](../../src/11_GUI/Box1941723009Hafid.java)

![screenshot](img/main3.jpg)

link kode program : [link kode](../../src/11_GUI/Main31941723009Hafid.java)

### Pertanyaan

a) Apa perbedaan dari Grid Layout, Box Layout dan Border Layout?
### jawab:
grid layout terdapat button dengan posisi tabel 4x2 yaitu 4 baris dan 2 kolom, sedangkan box layout terdapat button yang berbentuk serializabel
b) Apakah fungsi dari masing-masing kode berikut?
### jawab :
fungsi dari masing masing kode berikut adalah instasiasi object jframe, menampilkan frame, dan membuat operasi exit_on_close yang berguna untuk keluar dari frame

### Percobaan 4

1. Percobaan pada class swing

![screenshot](img/guip4.jpg)

link kode program : [link kode](../../src/11_GUI/swing.java)

2. ini frame gui percobaan 4 yang belum dijalankan
![screenshot](img/mentahangui.jpg)

3. tampilan source code swing percobaan 4

![screenshot](img/srcgui.jpg)

### Pertanyaan

a) Apakah fungsi dari kode berikut?
### jawab :
berfungsi untuk perintah menjalankan program gui
b) Mengapa pada bagian logika checkbox dan radio button digunakan multiple if ?
### jawab :
karena terdapat lebih dari 1 pilihan didalam checkbox dan radio button
c) Lakukan modifikasi pada program untuk melakukan menambahkan inputan berupa alamat
dan berikan fungsi pemeriksaan pada nilai Alamat tersebut jika belum diisi dengan
menampilkan pesan peringatan
### jawab :
JOptionPane.showMessageDialog(null, "Belum diisi!!!"+JOptionPane.WARNING_MESSAGE);
,... maaf pak saya coba pakek perintah ini hasilnya tetap sama aja

### Percobaan 4


1. Percobaan pada swing

![screenshot](img/main5.jpg)

link kode program : [link kode](../../src/11_GUI/swing21941723009Hafid.java)

2. tampilan source code pada swing percobaan 5

![screenshot](img/src5.jpg)

### Pertanyaan

a) Apa kegunaan komponen swing JTabPane,JTtree, pada percobaan5?
### jawab
komponen JTabpane berfungsi sebagai menu pilihan dan JTree sebagai pembuatan folder yang ada didalam form tersebut yaitu halaman 3
b) Modifikasi program untuk menambahkan komponen JTable pada tab Halaman 1 dan tab
Halaman 2
### jawab :
1. Pada Halaman 1

![screenshot](img/halaman1.jpg)

2. Pada Halaman 2

![screenshot](img/halaman2.jpg)

### Asigment

1. Percobaan pada class kalkulator

![screenshot](img/mainkalkulator.jpg)

link kode program : [link kode](../../src/11_GUI/Kalkulator1941723009Hafid.java)

2. mentahan Kalkulator dan src kalkulator

![screenshot](img/mentahankalkulator.jpg)

![screenshot](img/srckalkulator.jpg)

## Kesimpulan

saya mempelajari konsep PBO salah satu 4 pilar yaitu Polimorfisme yang berartikan perubahan bentuk maksutnya Class parent Berubah bentuk menjadi Class turunannya dengan cara membuat objek dan memanggil method didalam Class parent yang mengoverriding ke Class turunannya.

## Pernyataan Diri

	Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

	Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

	Ttd,

	(Hafid Ali Rahman Wibisana)