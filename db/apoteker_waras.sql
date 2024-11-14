-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Nov 2024 pada 05.26
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
-- Database: `apoteker_waras`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `id_akun` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password_hash` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`id_akun`, `id_user`, `username`, `password_hash`) VALUES
(1, 1, 'ahmad_fauzi', 'hash_password1'),
(2, 2, 'budi_santoso', 'hash_password2'),
(3, 3, 'citra_dewi', 'hash_password3'),
(4, 4, 'dewi_anggraini', 'hash_password4'),
(5, 5, 'eko_saputra', 'hash_password5'),
(6, 6, 'fitri_wulandari', 'hash_password6'),
(7, 7, 'gilang_pratama', 'hash_password7'),
(8, 8, 'hesti_lestari', 'hash_password8'),
(9, 9, 'iqbal_ramadhan', 'hash_password9'),
(10, 10, 'joko_widodo', 'hash_password10');

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_transaksi`
--

CREATE TABLE `detail_transaksi` (
  `id_detail` int(11) NOT NULL,
  `id_transaksi` int(11) NOT NULL,
  `id_produk` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga_satuan` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `detail_transaksi`
--

INSERT INTO `detail_transaksi` (`id_detail`, `id_transaksi`, `id_produk`, `jumlah`, `harga_satuan`) VALUES
(1, 1, 1, 2, 5000.00),
(2, 2, 3, 1, 10000.00),
(3, 3, 5, 3, 8000.00),
(4, 4, 2, 1, 25000.00),
(5, 5, 6, 2, 12000.00),
(6, 6, 4, 1, 15000.00),
(7, 7, 8, 2, 30000.00),
(8, 8, 7, 1, 18000.00),
(9, 9, 9, 3, 20000.00),
(10, 10, 10, 1, 25000.00);

-- --------------------------------------------------------

--
-- Struktur dari tabel `keranjang`
--

CREATE TABLE `keranjang` (
  `id_keranjang` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_produk` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `keranjang`
--

INSERT INTO `keranjang` (`id_keranjang`, `id_user`, `id_produk`, `jumlah`) VALUES
(1, 1, 1, 2),
(2, 2, 3, 1),
(3, 3, 5, 3),
(4, 4, 2, 1),
(5, 5, 6, 2),
(6, 6, 4, 1),
(7, 7, 8, 2),
(8, 8, 7, 1),
(9, 9, 9, 3),
(10, 10, 10, 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `id_produk` int(11) NOT NULL,
  `nama_produk` varchar(100) NOT NULL,
  `kategori_produk` enum('Obat Bebas','Resep Dokter') NOT NULL,
  `deskripsi` text DEFAULT NULL,
  `harga` decimal(10,2) NOT NULL,
  `stok` int(11) NOT NULL DEFAULT 0,
  `tanggal_kadaluarsa` date NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `produk`
--

INSERT INTO `produk` (`id_produk`, `nama_produk`, `kategori_produk`, `deskripsi`, `harga`, `stok`, `tanggal_kadaluarsa`, `created_at`) VALUES
(1, 'Paracetamol', 'Obat Bebas', 'Pereda demam dan nyeri', 5000.00, 100, '2025-12-31', '2024-11-13 09:51:31'),
(2, 'Amoxicillin', 'Resep Dokter', 'Antibiotik untuk infeksi', 25000.00, 50, '2024-06-30', '2024-11-13 09:51:31'),
(3, 'Vitamin C', 'Obat Bebas', 'Meningkatkan daya tahan tubuh', 10000.00, 200, '2026-01-01', '2024-11-13 09:51:31'),
(4, 'Ibuprofen', 'Obat Bebas', 'Pereda nyeri dan inflamasi', 15000.00, 75, '2025-05-31', '2024-11-13 09:51:31'),
(5, 'Antasida', 'Obat Bebas', 'Mengatasi gangguan pencernaan', 8000.00, 150, '2024-11-30', '2024-11-13 09:51:31'),
(6, 'Cetirizine', 'Obat Bebas', 'Mengatasi alergi', 12000.00, 80, '2025-09-30', '2024-11-13 09:51:31'),
(7, 'Ranitidine', 'Resep Dokter', 'Mengurangi asam lambung', 18000.00, 60, '2024-07-31', '2024-11-13 09:51:31'),
(8, 'Metformin', 'Resep Dokter', 'Obat diabetes', 30000.00, 40, '2025-03-31', '2024-11-13 09:51:31'),
(9, 'Amlodipine', 'Resep Dokter', 'Obat hipertensi', 20000.00, 70, '2026-06-30', '2024-11-13 09:51:31'),
(10, 'Simvastatin', 'Resep Dokter', 'Menurunkan kolesterol', 25000.00, 55, '2024-12-31', '2024-11-13 09:51:31');

-- --------------------------------------------------------

--
-- Struktur dari tabel `profile`
--

CREATE TABLE `profile` (
  `id_profile` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `alamat` text DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `profile`
--

INSERT INTO `profile` (`id_profile`, `id_user`, `alamat`, `tanggal_lahir`) VALUES
(1, 1, 'Jl. Mawar No. 10', '1990-01-01'),
(2, 2, 'Jl. Melati No. 20', '1985-02-02'),
(3, 3, 'Jl. Kenanga No. 30', '1992-03-03'),
(4, 4, 'Jl. Anggrek No. 40', '1988-04-04'),
(5, 5, 'Jl. Tulip No. 50', '1995-05-05'),
(6, 6, 'Jl. Kamboja No. 60', '1993-06-06'),
(7, 7, 'Jl. Dahlia No. 70', '1990-07-07'),
(8, 8, 'Jl. Sawo No. 80', '1987-08-08'),
(9, 9, 'Jl. Durian No. 90', '1989-09-09'),
(10, 10, 'Jl. Mangga No. 100', '1991-10-10');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `total_harga` decimal(10,2) NOT NULL,
  `tanggal_transaksi` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `id_user`, `total_harga`, `tanggal_transaksi`) VALUES
(1, 1, 10000.00, '2024-11-13 09:51:31'),
(2, 2, 10000.00, '2024-11-13 09:51:31'),
(3, 3, 24000.00, '2024-11-13 09:51:31'),
(4, 4, 25000.00, '2024-11-13 09:51:31'),
(5, 5, 24000.00, '2024-11-13 09:51:31'),
(6, 6, 15000.00, '2024-11-13 09:51:31'),
(7, 7, 60000.00, '2024-11-13 09:51:31'),
(8, 8, 18000.00, '2024-11-13 09:51:31'),
(9, 9, 60000.00, '2024-11-13 09:51:31'),
(10, 10, 25000.00, '2024-11-13 09:51:31');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `no_hp` varchar(15) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `nama`, `email`, `no_hp`, `created_at`) VALUES
(1, 'Ahmad Fauzi', 'ahmad@gmail.com', '081234567890', '2024-11-13 09:51:31'),
(2, 'Budi Santoso', 'budi@gmail.com', '081234567891', '2024-11-13 09:51:31'),
(3, 'Citra Dewi', 'citra@gmail.com', '081234567892', '2024-11-13 09:51:31'),
(4, 'Dewi Anggraini', 'dewi@gmail.com', '081234567893', '2024-11-13 09:51:31'),
(5, 'Eko Saputra', 'eko@gmail.com', '081234567894', '2024-11-13 09:51:31'),
(6, 'Fitri Wulandari', 'fitri@gmail.com', '081234567895', '2024-11-13 09:51:31'),
(7, 'Gilang Pratama', 'gilang@gmail.com', '081234567896', '2024-11-13 09:51:31'),
(8, 'Hesti Lestari', 'hesti@gmail.com', '081234567897', '2024-11-13 09:51:31'),
(9, 'Iqbal Ramadhan', 'iqbal@gmail.com', '081234567898', '2024-11-13 09:51:31'),
(10, 'Joko Widodo', 'joko@gmail.com', '081234567899', '2024-11-13 09:51:31');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`id_akun`),
  ADD UNIQUE KEY `username` (`username`),
  ADD KEY `id_user` (`id_user`);

--
-- Indeks untuk tabel `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD PRIMARY KEY (`id_detail`),
  ADD KEY `id_transaksi` (`id_transaksi`),
  ADD KEY `id_produk` (`id_produk`);

--
-- Indeks untuk tabel `keranjang`
--
ALTER TABLE `keranjang`
  ADD PRIMARY KEY (`id_keranjang`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_produk` (`id_produk`);

--
-- Indeks untuk tabel `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`id_produk`);

--
-- Indeks untuk tabel `profile`
--
ALTER TABLE `profile`
  ADD PRIMARY KEY (`id_profile`),
  ADD KEY `id_user` (`id_user`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_user` (`id_user`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `no_hp` (`no_hp`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `akun`
--
ALTER TABLE `akun`
  MODIFY `id_akun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  MODIFY `id_detail` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `keranjang`
--
ALTER TABLE `keranjang`
  MODIFY `id_keranjang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `produk`
--
ALTER TABLE `produk`
  MODIFY `id_produk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `profile`
--
ALTER TABLE `profile`
  MODIFY `id_profile` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD CONSTRAINT `akun_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`) ON DELETE CASCADE;

--
-- Ketidakleluasaan untuk tabel `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD CONSTRAINT `detail_transaksi_ibfk_1` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id_transaksi`) ON DELETE CASCADE,
  ADD CONSTRAINT `detail_transaksi_ibfk_2` FOREIGN KEY (`id_produk`) REFERENCES `produk` (`id_produk`) ON DELETE CASCADE;

--
-- Ketidakleluasaan untuk tabel `keranjang`
--
ALTER TABLE `keranjang`
  ADD CONSTRAINT `keranjang_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`) ON DELETE CASCADE,
  ADD CONSTRAINT `keranjang_ibfk_2` FOREIGN KEY (`id_produk`) REFERENCES `produk` (`id_produk`) ON DELETE CASCADE;

--
-- Ketidakleluasaan untuk tabel `profile`
--
ALTER TABLE `profile`
  ADD CONSTRAINT `profile_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`) ON DELETE CASCADE;

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
