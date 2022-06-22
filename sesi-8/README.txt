Pada Aplikasi ini memperlihatkan penggunaan Thread pada java.
1. Konsep Thread digunakan untuk mengerjakan tugas dengan pararel. 
2. Aplikasi Thread ini menampilkan skema multithread dan synchronized thread.
Thread pada java dilakukan dengan dua cara yaitu : 
    - mengimplementasikan interface Runnable 
    - melakukan extends dengan class Thread
Panduan menjalankan aplikasi :
1. Pastikan maven telah ada pada project. 
2. Pada aplikasi yang ingin dilihat hasilnya pada bagian maven > klik kanan > lakukan : 
    - mvn clean
    - mvn compile 
    - mvn install ->> untuk menginstall libray dalam project
3. Kode test diletakkan pada bagian unit testing. Pastikan dependency j-unit terdapat dalam pom.xml 
4. Untuk melihat hasil Thread klik kanan pada bagian maven untuk project yang ingin dijalankan pilih > mvn test 
5. Selain itu juga dapat diklik pada bagian testing dengan unit testing yang telah digenerate. Hasil akan tampil pada debug console