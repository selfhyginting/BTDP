Panduan Penggunaan Aplikasi : 
1. Aplikasi API dapat dijalankan di lokal pengguna. IDE yang disarankan untuk menjalankan aplikasi adalah eclipse/netbeans.
2. Pastikan module dan dependensi yang diperlukan telah terinstall dalam komputer pengguna termasuk Enviroment Variable yang telah
di set sebelumnya.
3. Depedency yang ditambahkan pada project BelajarSpringBootstrap:

	- Spring Devtools : development tools yang disediakan framework SpringBoot.
	- Spring Web : untuk membuat aplikasi REST API. Spring Web ini pasti menggunakan annotasi @Controller pada level Controller nya.
	- MySQL Driver : Driver agar aplikasi dapat terhubung ke Database dan menggunakan RDBMS berupa MySQL.
	- Thymeleaf : template engine khusus java untuk melakukan templating pada file-file HTML.
	- org.webjar Bootstrap : untuk menambahkan framework bootstrap (css,javascript) ke dalam projek.

4. Dependency tambahan kembali pada project LatihanBootstrapJPA:
	- Spring Data JPA : untuk mengimplementasikan JPA sehingga operasi-operasi standar seperti Create Read Update Delete sudah disediakan. 
		Spring data JPA menggunakan interface Repository yang mana menggunakan ID dari class domain sebagai parameter nya. 
		Spring data JPA juga mendukung query method, native query, JPQL dan lain sebagainya.
	- Flyway : untuk data migration tools 
