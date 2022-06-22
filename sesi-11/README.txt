1. Install mongo dan copy path folder bin pada folder mongo yang telah diinstall kemudian paste pada enviroment variable system > path > add new

2. Buka cmd atau terminal lainnya ketik "mongo" tanpa tanda petik maka akan tampil mongoshell. Kemudian akan muncul beberapa keterangan dan tanda (">")

3. show dbs --> untuk melihat semua database

4. use belajar --> untuk menggunakan database. Ketika database belum ada maka mongo akan membuat databasenya secara otomatis.

5. db.createCollection('collection_selfhy') --> untuk membuat collection

6. show collections --> untuk melihat semua collection

7. db.collection_selfhyinsertOne({nama: "selfhy", umur : 21}) --> untuk menambahkan satu data

8. db.nama_collection.insertMany() --> untuk menambahkan banyak data, dipisahkan oleh koma

9. db.collection_selfhy.find() --> melihat semua data dalam collection 

10. db.collection_selfhy({ nama : "selfhy"}) --> melihat data sesuai dengan filter yang ditambahkan

11. db.collection_selfhy.updateOne( { nama : "selfhy" } , {  { $set : pekerjaan : "software engineer"} } ) --> untuk mengubah satu dokumen 

12. db.nama_collection.updateMany()   --> untuk mengubah banyak dokumen sekaligus

13. db.nama_collection.replaceOne() -->  untuk mengganti satu dokumen dengan dokumen yang baru

14. db.collection_selfhy.deleteOne({ nama : "selfhy"}) -->  untuk menghapus satu dokumen

15. db.nama_collection.deleteMany()

------------------------------------------------------------------------------------------------

Relasi 

1. Relasi one to one 
Relasi one to one Hubungan antar tabel dimana tabel A adalah data master dan tabel B harus mempunyai data yang ada pada tabel A

2. Relasi one to many 
Sebuah hubungan antara tabel dimana tabel A memiliki sebuah data yang bisa di pakai pada tabel B data tersebut bisa banyak data atau beberapa data saja

3. Relasi many to many 
Sebuah hubungan antara tabel dimana tabelnya ini ada banyak. Hubungannya itu bisa banyak tabel misalkan tabel A dengan tabel B dan tabel C dengan tabel B seperti itu.

-------------------------------------------------------------------------------------------------

Lookup 
Lookup adalah sebuah metode yang digunakan untuk menampilkan data seperti find tetapi di lookup ini kita dapat menampilkan beberapa tabel untuk di tampilkan (lookup ini bisa berjalan kalau tabelnya sudah berrelasi)
Contohnya : db.collection.aggregate({ $lookup : { from : collection2, localField : “_id”, foreignField : “_id”, as : “join” } })
