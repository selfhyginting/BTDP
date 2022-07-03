Panduan Penggunaan Aplikasi : 
1. Aplikasi API dapat dijalankan di lokal pengguna. IDE yang disarankan untuk menjalankan aplikasi adalah eclipse/netbeans.
2. Pastikan module dan dependensi yang diperlukan telah terinstall dalam komputer pengguna termasuk Enviroment Variable yang telah
di set sebelumnya.
3. Depedency yang ditambahkan pada project:

	- Spring Devtools : development tools yang disediakan framework SpringBoot.
	- MySQL Driver : Driver agar aplikasi dapat terhubung ke Database dan menggunakan RDBMS berupa MySQL.
	- Spring Data JPA : untuk mengimplementasikan JPA sehingga operasi-operasi standar seperti Create Read Update Delete sudah disediakan. 
		Spring data JPA menggunakan interface Repository yang mana menggunakan ID dari class domain sebagai parameter nya. 
		Spring data JPA juga mendukung query method, native query, JPQL dan lain sebagainya.
	 	
		Beberapa penjelasan annotation yang digunakan:

		a. @Entity : merepresentasikan bahwa class adalah sebuah entitas, yang akan membangkitkan sebuah table di database dengan nama class tersebut.
		b. @Id : menunjukan bahwa properties tersebut adalah sebuah ID atau Primary Key dari suatu table yang sifatnya mandatory/wajib.
		c. @GeneratedValue : untuk membangkitkan suatu nilai. Karena menggunakan strategy = GenerationType.IDENTITY yang artinya nilai akan diberikan secara increment atau fungsi nya sama dengan AUTO_INCREMENT pada sebuah table. 
		d. @Column(nullable = false) : properties yang akan menjadi kolom di dalam table tidak boleh null atau not null.

	- HikariCP: Hikari Connection Pool sebenarnya sudah secara default digunakan pada Spring Boot versi 2 karakternya sangat cepat, ringan, dapat diandalkan dalam fase production. 
	
		Beberapa penjelasan annotation lanjutan yang digunakan:

		a. @OneToMany adalah annotasi yang mendefinisikan relasi one-to-many. 
		b. mappedBy adalah atribute yang memberitahu foreign key dari relasi. 
		c. CascadeType.ALL adalah sebuah tipe cascade yang akan menyebarkan semua operasi EntityManager (PERSIST, REMOVE, REFRESH, MERGE, DETACH) ke entitas yang berelasi. 
		d. @ManyToOne mendefinisikan relasi many-to-one antara dua entitas. 
		e. @JoinColumn mengindikasikan bahwa suatu entitas sebagai yang mempunyai kunci (foreign key) yang menghubungkan dengan class parent.
		f. FetchType.LAZY konfigurasi yang tidak secara otomatis memuat data yang berada pada relasi nya sehingga untuk memuat harus menggunakan getter method. 
		g. CascadeType.PERSIST artinya bahwa operasi save() dari Spring Data JPA cascade ke entitas yang berelasi. 
