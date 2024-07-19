# RESTful API untuk Manajemen Produk
_Product Management RESTful API_

Proyek ini adalah sebuah RESTful API yang dibangun menggunakan Spring Boot untuk mengelola data produk. API ini menyediakan operasi CRUD (Create, Read, Update, Delete) untuk produk yang disimpan dalam database MySQL. API ini menggunakan Spring Data JPA untuk interaksi dengan database, serta Spring Validation untuk memastikan data yang valid.

#### Teknologi :
- [Spring Boot](https://docs.spring.io/spring-boot/api/java/index.html) : 3.3.1
- [MySQL](https://downloads.mysql.com/archives/get/p/25/file/mysql-installer-community-8.0.28.0.msi) : 8.0.28
- [JDK](https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.exe) : 17

#### Dependensi :
- Spring Data JPA: Untuk mengelola dan mengakses data dalam database MySQL dengan cara yang lebih mudah dan terstruktur.
- Spring Web: Untuk menyediakan kemampuan RESTful API dan menangani HTTP requests/responses.
- MySQL Driver: Untuk menghubungkan aplikasi Spring Boot dengan database MySQL.
- Lombok: Untuk mengurangi boilerplate code seperti getter, setter, dan constructor dengan anotasi sederhana.
- Validation: Untuk melakukan validasi data pada entitas dan DTO (Data Transfer Object) yang dikirimkan ke dan dari API.

#### Fitur Utama :
1. CRUD Operasi Produk:
- Create: Menambahkan produk baru ke dalam database.
- Read: Mengambil data produk berdasarkan ID atau daftar semua produk.
- Update: Memperbarui data produk yang sudah ada.
- Delete: Menghapus produk dari database berdasarkan ID.
2. Validasi Data:
- Menggunakan Spring Validation untuk memastikan bahwa data produk yang diterima oleh API valid sebelum disimpan ke dalam database.
3. Dokumentasi API :
- Postman: Dokumentasi API dikelola menggunakan Postman. Dokumentasi ini mencakup deskripsi detail dari setiap endpoint, termasuk request dan response body, serta parameter yang diperlukan.

#### Arsitektur Proyek :
- Controller: Mengelola permintaan HTTP dan meresponsnya dengan data atau status yang sesuai.
- Service: Mengandung logika bisnis untuk operasi CRUD dan interaksi dengan repository.
- Service_impl: Implementasi logika bisnis yang lebih spesifik, di mana implementasi sebenarnya dari antarmuka service dikelola.
- Repository: Mengelola akses data ke database menggunakan Spring Data JPA.
- Model: Mewakili entitas produk dengan atribut seperti id, namaBarang, kategori, satuan, harga, stok.
- DTO: Data Transfer Object untuk mempermudah pengiriman data antara client dan server.
- Exception: Menangani dan memproses kesalahan yang terjadi selama eksekusi API, termasuk pembuatan custom exception dan penanganan kesalahan umum.

#### Instalasi dan Konfigurasi

1. Clone Repository :
```sh
git clone git@github.com:idteguhjulianto/springboot-restful-api.git
```

2. Masuk ke Direktori Proyek :

```sh
cd springboot-restful-api
```

3. Jalankan Aplikasi :
```sh
./mvnw spring-boot:run
```

4. Konfigurasi Database :
 ```sh
spring.datasource.url=jdbc:mysql://localhost:3306/db_barang_restful
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
