Panduan Penggunaan Aplikasi : 
1. Aplikasi API dapat dijalankan di lokal pengguna. IDE yang disarankan untuk menjalankan aplikasi adalah eclipse/netbeans.
2. Pastikan module dan dependensi yang diperlukan telah terinstall dalam komputer pengguna termasuk Enviroment Variable yang telah
di set sebelumnya.
3. Framework yang digunakan pada aplikasi adalah SpringBoot yang menggunakan beberapa depedency yaitu:

	- Spring Devtools : development tools yang disediakan framework SpringBoot.
	- Spring Web : untuk membuat aplikasi REST API.
	- Spring Data JPA : untuk mengimplementasikan JPA sehingga operasi-operasi standar seperti Create Read Update Delete sudah disediakan. 
				Spring data JPA menggunakan interface Repository yang mana menggunakan ID dari class domain sebagai parameter nya. 
				Spring data JPA juga mendukung query method, native query, JPQL dan lain sebagainya.
	- MySQL Driver : Driver agar aplikasi dapat terhubung ke Database dan menggunakan RDBMS berupa MySQL.
	- Spring Security : untuk menambahkan fungsi Authentikasi
	- JSONWEbToken(JWT : untuk membuat membangkitkan token yang dapat diauntentikasi


4. Panduan dan dokumentasi endpoint yang dapat diakses oleh pengguna untuk melakukan request:
	a. Pengguna dapat menggunakan Postman (disarankan) untuk melakukan request dan melihat response
	b. Hal pertama pengguna dapat menambahkan user (registrasi user) untuk dapat dimasukkan ke dalam database users
	pada endpoint dengan request method POST : 
	
	http://localhost:8085/user 

	> Masukkan username dan password dengan format json pada bagian Body > raw
	
	{ "username" : "selfhy", "password" :"password!" }
	
	c. Kemudian pengguna dapat melakukan autentikasi dari user yang telah terdaftar dengan endpoint dan request method POST :
	
	http://localhost:8085/authenticate
	
	> Masukkan username dan password dengan format json pada bagian Body > raw
	
	d. Ketika username dan password yang dimasukkan benar maka API akan memberikan response berupa Token dengan format Barier milik JWT
	
	e. Untuk melakukan request terhadap blog maka pengguna harus terlebih dahulu memasukan token kedalam header:
		
		klik header > isi key dengan Authorization > isi value dengan string token
	
	f. Pengguna dapat melakukan beberapa request pada blog dengan dokumentasi:
	
	- (GET) http://localhost:8085/blog : for getting all blogs
	- (GET) http://localhost:8085/blog/id : for getting one blog by id
	- (POST) http://localhost:8085/blog/ : for adding blog on body request
		Scheme body :
		
		{
    			"title" : "agina's blog",
    			"content" : "this is a blog",
    			"author" : "aginaginting"
		}

	- (PUT) http://localhost:8085/blog/id : for editing one blog and put in into body request
		Scheme body :
		
		{
    			"title" : "selfhy's blog",
    			"content" : "this is a blog",
    			"author" : "selfhyinting"
		}
	- (DELETE) http://localhost:8085/blog/id : for deleting blog item
	- (POST) http://localhost:8085/blog/search : for searching term by text
		Scheme body :
		
		{
    			"text" : "selfhy's",
    		}

	
 
	
