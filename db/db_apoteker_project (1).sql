-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 09 Des 2024 pada 18.42
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_apoteker_project`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cart`
--

CREATE TABLE `cart` (
  `ID_cart` int(11) NOT NULL,
  `ID_transaksi` int(11) NOT NULL,
  `ID_produk` int(11) NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `jumlah_produk` int(11) NOT NULL,
  `harga_satuan` decimal(10,2) NOT NULL,
  `total_belanja` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `products`
--

CREATE TABLE `products` (
  `ID_produk` int(11) NOT NULL,
  `kode_produk` int(11) DEFAULT NULL,
  `nama_produk` varchar(255) DEFAULT NULL,
  `kategori` varchar(255) DEFAULT NULL,
  `harga_satuan` decimal(10,2) DEFAULT NULL,
  `stok` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `products`
--

INSERT INTO `products` (`ID_produk`, `kode_produk`, `nama_produk`, `kategori`, `harga_satuan`, `stok`) VALUES
(1, 1233, 'Paracetamol 500mg', 'Painkiller', 5000.00, 100),
(2, 2342, 'Ibuprofen 200mg', 'Painkiller', 7000.00, 150),
(3, 7890, 'Amoxicillin 250mg', 'Antibiotic', 12000.00, 80),
(4, 2176, 'Vitamin C 500mg', 'Vitamin', 8000.00, 200),
(5, 8765, 'Cetirizine 10mg', 'Antihistamine', 6000.00, 120),
(6, 9238, 'Omeprazole 20mg', 'Acid Reducer', 10000.00, 90),
(7, 9876, 'Metformin 500mg', 'Diabetes', 15000.00, 70),
(8, 7345, 'Aspirin 100mg', 'Painkiller', 5000.00, 160),
(9, 6723, 'Clarithromycin 500mg', 'Antibiotic', 18000.00, 50),
(10, 8912, 'Vitamin D 1000 IU', 'Vitamin', 11000.00, 130),
(11, 2361, 'Loperamide 2mg', 'Antidiarrheal', 5000.00, 110),
(12, 1123, 'Hydrocortisone Cream 1%', 'Corticosteroid', 12000.00, 40),
(13, 5679, 'Dextromethorphan 15mg', 'Cough Suppressant', 7000.00, 90),
(14, 2555, 'Folic Acid 1mg', 'Vitamin', 4000.00, 150),
(15, 9993, 'Amlodipine 5mg', 'Blood Pressure', 15000.00, 60),
(16, 8888, 'Simvastatin 20mg', 'Cholesterol', 13000.00, 80),
(17, 1237, 'Lorazepam 1mg', 'Anxiety', 25000.00, 30),
(18, 5412, 'Prednisone 10mg', 'Corticosteroid', 0.00, 75),
(19, 9181, 'Cefuroxime 500mg', 'Antibiotic', 20000.00, 55),
(20, 1946, 'Azithromycin 250mg', 'Antibiotic', 16000.00, 65),
(22, 1277, 'antimo', 'obat ringan', 1000.00, 12);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `ID_transaksi` int(11) NOT NULL,
  `tanggal_transaksi` date NOT NULL,
  `kode_obat` int(11) NOT NULL,
  `jumlah_produk` int(11) NOT NULL,
  `harga_satuan` decimal(10,2) NOT NULL,
  `total_harga` decimal(10,2) NOT NULL,
  `uang_diterima` decimal(10,2) NOT NULL,
  `uang_kembali` decimal(10,2) NOT NULL,
  `nama_kasir` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`ID_transaksi`, `tanggal_transaksi`, `kode_obat`, `jumlah_produk`, `harga_satuan`, `total_harga`, `uang_diterima`, `uang_kembali`, `nama_kasir`) VALUES
(1, '2024-12-09', 1233, 2, 5000.00, 10000.00, 30000.00, 20000.00, 'Husain Mulyansyah');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `ID_AKUN` int(11) NOT NULL,
  `FULLNAME` varchar(255) NOT NULL,
  `USERNAME` varchar(255) NOT NULL,
  `PASSWORD` varchar(11) NOT NULL,
  `LEVEL` enum('ADMIN','KASIR','OWNER') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`ID_AKUN`, `FULLNAME`, `USERNAME`, `PASSWORD`, `LEVEL`) VALUES
(1, 'HUSAIN MULYANSYAH', 'husain', '123', 'ADMIN'),
(2, 'marcel mardiana', 'marcel', '1234', 'OWNER'),
(5, 'BUDI SANTOSO AWAL', 'budi', '123', 'KASIR'),
(8, 'ahmad dana doni', 'doni', '123', 'OWNER');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`ID_cart`),
  ADD KEY `ID_transaksi` (`ID_transaksi`),
  ADD KEY `ID_produk` (`ID_produk`),
  ADD KEY `nama_produk` (`nama_produk`);

--
-- Indeks untuk tabel `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`ID_produk`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`ID_transaksi`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID_AKUN`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `cart`
--
ALTER TABLE `cart`
  MODIFY `ID_cart` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `products`
--
ALTER TABLE `products`
  MODIFY `ID_produk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `ID_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `ID_AKUN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `cart`
--
ALTER TABLE `cart`
  ADD CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`ID_transaksi`) REFERENCES `transaksi` (`ID_transaksi`),
  ADD CONSTRAINT `cart_ibfk_2` FOREIGN KEY (`ID_produk`) REFERENCES `products` (`ID_produk`),
  ADD CONSTRAINT `cart_ibfk_3` FOREIGN KEY (`nama_produk`) REFERENCES `products` (`nama_produk`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
