/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konektor;

/**
 *
 * @author HUSAIN
 */
public class ProfileProduk {

    public class Profile {

        private int ID_produk;
        private int kode_produk;
        private String nama_produk;
        private String kategori;
        private double harga_satuan;
        private int stok;

        public int getIdPrd() {
            return ID_produk;
        }

        public void setIdPrd(int ID_produk) {
            this.ID_produk = ID_produk;
        }

        public int getKodeProduk() {
            return kode_produk;
        }

        public void setKodeProduk(int kode_produk) {
            this.kode_produk = kode_produk;
        }

        public String getNamaProduk() {
            return nama_produk;
        }

        public void setNamaProduk(String nama_produk) {
            this.nama_produk = nama_produk;
        }

        public String getKategori() {
            return kategori;
        }

        public void setKategori(String kategori) {
            this.kategori = kategori;
        }

        public double getHargaSatuan() {
            return harga_satuan;
        }

        public void setHargaSatuan(double harga_satuan) {
            this.harga_satuan = harga_satuan;
        }

        public int getStok() {
            return stok;
        }

        public void setStok(int Stok) {
            this.stok = Stok;
        }

    }

    public static void main(String[] args) {
        System.out.println("ProfileProduk");
    }

}
