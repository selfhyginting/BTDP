Pada Aplikasi ini melakukan Parsing Data dalam bentuk XML.

Teknik parsing yang digunakan dalam aplikasi ini adalah:
 - SAX (Simple Api XML)
 - DOM (Document Object Model)

SAX :
1. Pada Aplikasi JavaReadXmlSAX akan memanggil class MyRunner yang menggunakan SAXParser untuk hold-data dari file XML dan melakukan parsing ke bentuk Object yang sesuai dengan object User yang telah didefenisikan sebelumnya. 
2. Kemudian MyRunner akan memanggil Objek Handler yang terdiri dari event handlers. 
3. Lalu data dapat di parse dan ditampilkan ke dalam bentuk String yang dapat dilihat pada console.

DOM : 
1. DOM dikenal dengan Document Object Model, yang merupakan bagian dari Java API untuk XML Processing. DOM Parser pada Java melintasi file XML dan membuat objek DOM yang sesuai. Lalu Objek DOM ini dihubungkan kedalam struktur tree sehingga Parser membaca seluruh struktur XML ke dalam memori. Kemudian seluruh context dapat di get menggunakan fungsi yang disediakan class Element.
