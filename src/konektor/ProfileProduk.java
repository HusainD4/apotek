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
    private double harga_jual;
    private double harga_beli;
    private int stok;

    public int getId() {
        return ID_produk;
    }

    public void setId(int ID_produk) {
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

    public double getHargaJual() {
        return harga_jual;
    }
    
    public void setHargaJual(double harga_jual){
        this.harga_jual = harga_jual;
    }
    
    public double getHargaBeli(){
        return harga_beli;
    }
    
    public void setHargaBeli(double harga_beli){
        this.harga_beli = harga_beli;
        
    }

    public int getStok(){
        return stok;
    }
    
    public void set(int setStok) {
        this.stok = stok;
    }
    
   
}

    public static void main(String[] args) {
        System.out.println("ProfileProduk");
    }
    
}
