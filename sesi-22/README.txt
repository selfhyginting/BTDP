Panduan Penggunaan Aplikasi : 
1. Aplikasi API dapat dijalankan di lokal pengguna. IDE yang disarankan untuk menjalankan aplikasi adalah eclipse/netbeans.
2. Pastikan module dan dependensi yang diperlukan telah terinstall dalam komputer pengguna termasuk Enviroment Variable yang telah
di setting sebelumnya.
3. Pada aplikasi ini akan memperlihatkan hasil kualitas code menggunakan:
	
	- Codecoverage : tools untuk mengukur efektivitas dari unit testing. Codecoverage juga mampu menunjukkan
	 kelengkapan kode yang tulis telah sesuai atau tidak dari tujuan developer yang dicover dengan unit test.
	 Untuk mendapatkan hasil PASS dari pengujian pada kode jika semua code tercover minimal 90%. Ketika tidak maka developer disarankan
	 untuk memperbaiki kode.
	
	- SonarQube dan Jacoco : library untuk aplikasi java yang opensource berdasarkan hasil penelitan EclEmma. 
	Kita dapat melihat hasil inspeksi bug, code smells, dan security vulnerabilities yang tampil sebagai repot dalam Sonarqube. 
	Cara menjalankan Sonarqube: 
	a. Silahkan download tool Sonarqube (Community) kemudian extract file zip.
	b. Masuk ke dalam folder bin kemudian pilih folder sesuai dengan OS komputer yang digunakan.
	c. Jalankan file StartSonat.bat (application).
	d. SonarQube telah running ketika terdapat command line status SonarQube is up.

4. Jacoco dan Sonarqube telah diintegrasikan dalam project aplikasi. Dapat dilihat pada file pom.xml
5. Buka http://localhost:9000 untuk melakukan inisialisasi dan set up project java pada SonarQube. 
6. Masuk ke dalam folder project lalu buka terminal (command prompt/git bash), jika membuka project menggunakan vscode 
buka terminal dengan shortcut ctl + shift + `
	
	Ketikkan : mvn sonar:sonar 

7. Ketika muncul status Analysis total time dan Build Success, copy url yang diberikan untuk hasil report biasanya pada port 9000
kemudian paste pada browser.

	http://localhost:9000/dasboard?id-nama-project

8. Hasil report akan ditampilkan, jika mendapatkan hasil PASS maka akan tulisan akan berwarna hijau.


---------------------------------------------------------------

Pada project kedua membuat aplikasi yang dideploy ke enviroment cloud milik Heroku. 

Heroku adalah cloud platform yang mendukung bahasa pemrograman java dan banyak yang lainnya.

1. Aplikasi dapat diakses melalui link:

	https://hello-spring-java-sag.herokuapp.com/api/welcome/index

2. Setelah pengguna mendaftarkan akun heroku maka sudah bisa mengintegrasikan project dengan Heroku kemudian GitHub.
Ketika developer melakukan pengembangan kemudian melakukan push ke repo yang ada di github remote maka Heroku secara langsung 
melakukan deployment ke server agar link yang dapat diakses secara online bisa sesuai.

