Panduan Penggunaan Aplikasi : 
1. Aplikasi API dapat dijalankan di lokal pengguna. IDE yang disarankan untuk menjalankan aplikasi adalah eclipse/netbeans.
2. Pastikan module dan dependensi yang diperlukan telah terinstall dalam komputer pengguna termasuk Enviroment Variable yang telah
di setting sebelumnya.
3. API yang akan digunakan menggunakan mekanisme Authentication yaitu Basic Auth, dalam pengembangan aplikasi java menggunakan dependency tambahan:
	
	- Spring Boot Security yang menjadi satu bundle dari 3 komponen:
		a. Security Config
		b. Security Core
		c. Security Web

4. Pengguna dapat melakukan request ke API menggunakan Postman (disarankan)
5. Untuk dapat melakukan request, terlebih dahulu memasukkan data yang telah ditambahkan ke dalam database untuk diautentikasi 
6. Pada postman:
	
	a. masukkan endpoint dan request method 
	b. klik Auth (di dekat params)
	c. pilih type Basic Auth
	d. masukkan username dan password yang telah tersimpan dalam database user
	e. setelah autentikasi berhasil, pengguna dapat melihat response yang diberikan.

----------------------------------------------
Pada aplikasi kedua terdapat unit testing yang ditambahkan dari project pertama.

Unit testing adalah pengujian dasar yang menguji setiap unit atau component baik itu dari 
segi functional atau behavior. Tools yang akan digunakan dalam unit testing aplikasi ini menggunakan dependency JUnit dan Mockito.

Plugin yang ditambahkan ke dalam aplikasi:

	- Apache Commons yang akan membangkitkan data palsu sesuai dengan tipe data pada field yang telah ditentukan.
	- Zalando yang berfungsi mengubah file json menjadi object

1. Aplikasi dapat dijalankan dengan mvn clean > mvn install > kemudian jalankan JUnit. 
2. Hasil unit testing akan tampil di bagian testing pada IDE.




