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
	- Thymeleaf : template engine khusus java untuk melakukan templating pada file-file HTML.

4. Dokumentasi endpoint yang dapat diakses oleh pengguna untuk melakukan request pada BelajarApi:
	
	(GET) http://localhost:8181/belajar-api/v1/get 

5. Dokumentasi endpoint yang dapat diakses oleh pengguna untuk melakukan request pada LatihanRestApi:

	- (GET) http://localhost:8084/users : for getting all items
	- (GET) http://localhost:8084/users/id : for getting one item by id
	- (POST) http://localhost:8084/users/ : for adding item on body request
	- (PUT) http://localhost:8084/users/id : for editing one item and put in into body request
	- (DELETE) http://localhost:8084/users/id : for deleting one item

6. Dokumentasi endpoint yang dapat diakses oleh pengguna untuk melakukan request pada AssignmentRestApi:
 
	- (GET) http://localhost:8084/items : for getting all items
	- (GET) http://localhost:8084/items/id : for getting one item by id
	- (POST) http://localhost:8084/items/ : for adding item on body request
	- (PUT) http://localhost:8084/items/id : for editing one item and put in into body request
	- (DELETE) http://localhost:8084/items/id : for deleting one item

7. Ketika aplikasi telah dijalankan maka akan menampilkan halaman utama berupa guide pada url : http://localhost:8084