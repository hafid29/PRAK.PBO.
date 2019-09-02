# Laporan Praktikum #1 - Pengantar Konsep PBO

## Kompetensi

(ID_Jobsheet-01-Pengantar Konsep PBO)

## Ringkasan Materi

(berisi catatan penting pribadi selama praktikum berlangsung ataupun menemukan permasalahan khusus saat melakukan percobaan)

## Percobaan

### Percobaan 1

1. Percobaan pada source code sepeda.java 

`contoh screenshot yang benar, menampilkan 3 komponen, yaitu struktur project, kode program, dan hasil kompilasi`

![screenshot sepeda](img/sepeda_1.jpg)

link kode program : [ini link ke kode program](../../src/1_Pengantar_Konsep_PBO/Sepeda.java)<br>

2. Percobaan pada source code sepedaDemo.java 

![screenshot sepedademo](img/sepeda_demo_1.jpg)

link kode program : [ini link ke kode program](../../src/1_Pengantar_Konsep_PBO/SepedaDemo.java)

### Percobaan 2

1. Percobaan pada source code sepedaGunung.java

`contoh screenshot yang benar, menampilkan 3 komponen, yaitu struktur project, kode program, dan hasil kompilasi`

![screenshot sepedagunung](img/sepeda_gunung_1.jpg)

link kode program : [ini link ke kode program](../../src/1_Pengantar_Konsep_PBO/SepedaGunung.java)

## Pertanyaan

 1. Sebutkan dan jelaskan aspek-aspek yang ada pada pemrograman berorientasi objek!<br>
 Pemrograman berorientasi objek (Inggris: object-oriented programming disingkat OOP) merupakan paradigma pemrograman berdasarkan konsep "objek", yang dapat berisi data, dalam bentuk field atau dikenal juga sebagai atribut; serta kode, dalam bentuk fungsi/prosedur atau dikenal juga sebagai method. Semua data dan fungsi di dalam paradigma ini dibungkus dalam kelas-kelas atau objek-objek. Bandingkan dengan logika pemrograman terstruktur. Setiap objek dapat menerima pesan, memproses data, dan mengirim pesan ke objek lainnya,
Model data berorientasi objek dikatakan dapat memberi fleksibilitas yang lebih, kemudahan mengubah program, dan digunakan luas dalam teknik peranti lunak skala besar. Lebih jauh lagi, pendukung OOP mengklaim bahwa OOP lebih mudah dipelajari bagi pemula dibanding dengan pendekatan sebelumnya, dan pendekatan OOP lebih mudah dikembangkan dan dirawat.<br>
Aspeknya :<br>
•	Kelas — kumpulan atas definisi data dan fungsi-fungsi dalam suatu unit untuk suatu tujuan tertentu. Sebagai contoh 'class of dog' adalah suatu unit yang terdiri atas definisi-definisi data dan fungsi-fungsi yang menunjuk pada berbagai macam perilaku/turunan dari anjing. Sebuah class adalah dasar dari modularitas dan struktur dalam pemrograman berorientasi object. Sebuah class secara tipikal sebaiknya dapat dikenali oleh seorang non-programmer sekalipun terkait dengan domain permasalahan yang ada, dan kode yang terdapat dalam sebuah class sebaiknya (relatif) bersifat mandiri dan independen (sebagaimana kode tersebut digunakan jika tidak menggunakan OOP). Dengan modularitas, struktur dari sebuah program akan terkait dengan aspek-aspek dalam masalah yang akan diselesaikan melalui program tersebut. Cara seperti ini akan menyederhanakan pemetaan dari masalah ke sebuah program ataupun sebaliknya.<br>
•	Objek - membungkus data dan fungsi bersama menjadi suatu unit dalam sebuah program komputer; objek merupakan dasar dari modularitas dan struktur dalam sebuah program komputer berorientasi objek.<br>
•	Abstraksi - Kemampuan sebuah program untuk melewati aspek informasi yang diproses olehnya, yaitu kemampuan untuk memfokus pada inti. Setiap objek dalam sistem melayani sebagai model dari "pelaku" abstrak yang dapat melakukan kerja, laporan dan perubahan keadaannya, dan berkomunikasi dengan objek lainnya dalam sistem, tanpa mengungkapkan bagaimana kelebihan ini diterapkan. Proses, fungsi atau metode dapat juga dibuat abstrak, dan beberapa teknik digunakan untuk mengembangkan sebuah pengabstrakan.<br>
•	Enkapsulasi - Memastikan pengguna sebuah objek tidak dapat mengganti keadaan dalam dari sebuah objek dengan cara yang tidak layak; hanya metode dalam objek tersebut yang diberi izin untuk mengakses keadaannya. Setiap objek mengakses interface yang menyebutkan bagaimana objek lainnya dapat berinteraksi dengannya. Objek lainnya tidak akan mengetahui dan tergantung kepada representasi dalam objek tersebut.<br>
•	Polimorfisme melalui pengiriman pesan. Tidak bergantung kepada pemanggilan subrutin, bahasa orientasi objek dapat mengirim pesan; metode tertentu yang berhubungan dengan sebuah pengiriman pesan tergantung kepada objek tertentu di mana pesa tersebut dikirim. Contohnya, bila sebuah burung menerima pesan "gerak cepat", dia akan menggerakan sayapnya dan terbang. Bila seekor singa menerima pesan yang sama, dia akan menggerakkan kakinya dan berlari. Keduanya menjawab sebuah pesan yang sama, namun yang sesuai dengan kemampuan hewan tersebut. Ini disebut polimorfisme karena sebuah variabel tungal dalam program dapat memegang berbagai jenis objek yang berbeda selagi program berjalan, dan teks program yang sama dapat memanggil beberapa metode yang berbeda di saat yang berbeda dalam pemanggilan yang sama. Hal ini berlawanan dengan bahasa fungsional yang mencapai polimorfisme melalui penggunaan fungsi kelas-pertama.<br>
 2. Apa yang dimaksud dengan object dan apa bedanya dengan class?<br> 
    Objek - membungkus data dan fungsi bersama menjadi suatu unit dalam sebuah program komputer; objek merupakan dasar dari modularitas     dan struktur dalam sebuah program komputer berorientasi objek.<br>
    Class : class merupakan rancangan (design) bersifat abstract <br>
    Object : perwujudan suatu class class Object bersifat konkrit<br>
 3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan dengan pemrograman struktural!<br>
    Cara pandang PBO : Program bukan urut – urutan instruksi tapi diselesaikan oleh objek – objek yang bekerjasama untuk menyelesaikan       masalah.<br>
 4. Pada class Sepeda, terdapat state/atribut apa saja?<br>
    Pada class Sepeda, terdapat state/atribut ada merek, kecepatan, gear dan warna<br>
 5. Tambahkan atribut warna pada class Sepeda.<br>
    ![screenshot](img/5.jpg)
 6. Mengapa pada saat kita membuat class SepedaGunung, kita tidak perlu membuat class nya dari nol?<br>
    karena kita sudah membuat mewariskan class sepeda kepada sepeda gunung.<br>
## Tugas

(silakan kerjakan tugas di sini beserta `screenshot` hasil kompilasi program. Jika ada rujukan ke file program, bisa dibuat linknya di sini.)

`contoh screenshot yang benar, menampilkan 3 komponen, yaitu struktur project, kode program, dan hasil kompilasi`

![screenshot Mobil](img/Mobil.jpg)

link kode program : [ini link ke kode program](../../src/1_Pengantar_Konsep_PBO/MobilKeluarga.java)<br>

![screenshot MobilKeluarga](img/MobilKeluarga.jpg)

link kode program : [ini link ke kode program](../../src/1_Pengantar_Konsep_PBO/Mobil.java)<br>

![screenshot MobilSport](img/MobilSport.jpg)

link kode program : [ini link ke kode program](../../src/1_Pengantar_Konsep_PBO/MobilSport.java)

## Kesimpulan

(Alhamdulillah saya berhasil walau banyak salah dibagian MobilKeluarga dengan bantuan modul dan mereferensi project sepeda saya bisa memahami sedikit demi sedikit materinya dan tugasnya)

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

HAFID ALI RAHMAN WIBISANA
