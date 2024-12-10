/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konektor;

/**
 *
 * @author HUSAIN
 */
public class ProfileHistoryKeranjang {

    private int ID_keranjang;
    private String kode_produk;
    private String nama_produk;
    private double harga_satuan;
    private int banyak_produk;
    private double total_belanja;

    // Getter dan Setter untuk ID_keranjang
    public int getID_keranjang() {
        return ID_keranjang;
    }

    public void setID_keranjang(int ID_keranjang) {
        this.ID_keranjang = ID_keranjang;
    }

    // Getter dan Setter untuk kode_produk
    public String getKode_produk() {
        return kode_produk;
    }

    public void setKode_produk(String kode_produk) {
        this.kode_produk = kode_produk;
    }

    // Getter dan Setter untuk nama_produk
    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    // Getter dan Setter untuk harga_satuan
    public double getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(double harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    // Getter dan Setter untuk banyak_produk
    public int getBanyak_produk() {
        return banyak_produk;
    }

    public void setBanyak_produk(int banyak_produk) {
        this.banyak_produk = banyak_produk;
    }

    // Getter dan Setter untuk total_belanja
    public double getTotal_belanja() {
        return total_belanja;
    }

    public void setTotal_belanja(double total_belanja) {
        this.total_belanja = total_belanja;
    }
}
