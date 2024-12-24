package konektor;

public class ProfileTransaksiDetail {

    // Kelas Transaksi
    public static class Transaksi {

        private int ID_transaksi_detail;
        private String tanggal_pembelian;
        private double total_harga;
        private double uang_diterima;
        private double uang_kembali;

        // Getter dan Setter untuk ID_transaksi
        public int getIdTransaksi() {
            return ID_transaksi_detail;
        }

        public void setIdTransaksi(int ID_Transaksi) {
            this.ID_transaksi_detail = ID_Transaksi;
        }

        // Getter dan Setter untuk Tanggal_Pembelian
        public String getTanggalPembelian() {
            return tanggal_pembelian;
        }

        public void setTanggalPembelian(String Tanggal_Pembelian) {
            this.tanggal_pembelian = Tanggal_Pembelian;
        }

        // Getter dan Setter untuk Total_Harga
        public double getTotalHarga() {
            return total_harga;
        }

        public void setTotalHarga(double Total_Harga) {
            this.total_harga = Total_Harga;
        }

        // Getter dan Setter untuk Uang_Diterima
        public double getUangDiterima() {
            return uang_diterima;
        }

        public void setUangDiterima(double Uang_Diterima) {
            this.uang_diterima = Uang_Diterima;
        }

        // Getter dan Setter untuk Uang_Kembali
        public double getUangKembali() {
            return uang_kembali;
        }

        public void setUangKembali(double Uang_Kembali) {
            this.uang_kembali = Uang_Kembali;
        }

    }
}
