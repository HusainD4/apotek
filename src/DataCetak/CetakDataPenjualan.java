/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DataCetak;

import java.awt.Font;
import konektor.connect;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.TableModel;



/**
 *
 * @author HUSAIN
 */

public class CetakDataPenjualan extends javax.swing.JFrame {
    static DefaultTableModel cp;
    /**
     * Creates new form CetakTransaksi
     */
    public CetakDataPenjualan() {
        initComponents();
        settingTable();
        viewDataJ("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LAPORAN_PENJUALAN = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        CETAK = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(595, 842));
        setMinimumSize(new java.awt.Dimension(595, 842));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(595, 842));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LAPORAN PENJUALAN");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        LAPORAN_PENJUALAN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "TANGGAL", "NAMA PRODUK", "PRODUK TERJUAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(LAPORAN_PENJUALAN);
        if (LAPORAN_PENJUALAN.getColumnModel().getColumnCount() > 0) {
            LAPORAN_PENJUALAN.getColumnModel().getColumn(0).setResizable(false);
            LAPORAN_PENJUALAN.getColumnModel().getColumn(1).setResizable(false);
            LAPORAN_PENJUALAN.getColumnModel().getColumn(2).setResizable(false);
            LAPORAN_PENJUALAN.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        CETAK.setText("CETAK");
        CETAK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CETAKActionPerformed(evt);
            }
        });

        jButton1.setText("KEMBALI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(508, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CETAK)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CETAK)
                    .addComponent(jButton1))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CETAKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CETAKActionPerformed
    // Membuat PrinterJob untuk menangani pencetakan
    PrinterJob printerJob = PrinterJob.getPrinterJob();
    
    // Menentukan PageFormat untuk kertas A4
    PageFormat pageFormat = printerJob.defaultPage();
    Paper paper = new Paper();
    double width = 595;  // Lebar A4 dalam point
    double height = 842; // Tinggi A4 dalam point
    paper.setSize(width, height);
    paper.setImageableArea(50, 50, width - 100, height - 100); // Area yang bisa dicetak (memberi margin)
    pageFormat.setPaper(paper);
    
    // Membuat objek Printable untuk mendefinisikan cara mencetak
    Printable printable = new Printable() {
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            if (pageIndex > 0) {
                return NO_SUCH_PAGE; // Jika lebih dari satu halaman
            }

            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

            // Mengatur font dan ukuran tulisan
            g2d.setFont(new Font("Serif", Font.PLAIN, 10));

            // Mengambil data dari JTable
            JTable table = LAPORAN_PENJUALAN; // Pastikan LAPORAN_PENJUALAN adalah objek JTable
            TableModel model = table.getModel();
            
            // Menulis header tabel
            int y = 20; // Posisi awal vertikal
            int x = 50; // Posisi awal horizontal
            int rowHeight = 20; // Tinggi baris
            int columnWidth = 100; // Lebar kolom

            // Menulis header tabel
            for (int col = 0; col < model.getColumnCount(); col++) {
                g2d.drawString(model.getColumnName(col), x + col * columnWidth, y);
            }

            y += rowHeight; // Pindah ke baris berikutnya

            // Menulis data tabel
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    g2d.drawString(model.getValueAt(row, col).toString(), x + col * columnWidth, y);
                }
                y += rowHeight;

                // Cek jika baris melebihi batas halaman, jika iya, lanjutkan ke halaman berikutnya
                if (y > height - 50) { // Jika melebihi batas halaman, lanjut ke halaman baru
                    return PAGE_EXISTS; // Halaman berikutnya
                }
            }

            return PAGE_EXISTS; // Menyelesaikan pencetakan untuk halaman ini
        }
    };

    // Menentukan pencetak yang digunakan untuk mencetak dokumen
    printerJob.setPrintable(printable, pageFormat);

    // Menampilkan dialog untuk mencetak
    if (printerJob.printDialog()) {
        try {
            printerJob.print(); // Mencetak dokumen
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_CETAKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CetakDataPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CetakDataPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CetakDataPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CetakDataPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CetakDataPenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CETAK;
    private javax.swing.JTable LAPORAN_PENJUALAN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
public void viewDataJ(String where) {
        try {
            // Clear existing rows
            for (int i = cp.getRowCount() - 1; i >= 0; i--) {
                cp.removeRow(i);
            }

            // Koneksi ke database
            Connection K = connect.Go();
            Statement S = K.createStatement();
            
            // Query untuk mengambil data dari tabel cart
            String Q = "SELECT tanggal_transaksi, nama_produk, SUM(banyak_produk) AS banyak_produk "
                     + "FROM cart " + where
                     + " GROUP BY tanggal_transaksi, nama_produk "
                     + "ORDER BY tanggal_transaksi, nama_produk";
            
            // Eksekusi query
            ResultSet R = S.executeQuery(Q);
            int no = 1;
            
            // Loop untuk mengambil data dari ResultSet
            while (R.next()) {
                String tanggalTransaksi = R.getString("tanggal_transaksi");
                String namaProduk = R.getString("nama_produk");
                int banyakProduk = R.getInt("banyak_produk");

                // Menambahkan data ke tabel
                Object[] U = {no, tanggalTransaksi, namaProduk, banyakProduk};
                cp.addRow(U);

                no++;
            }

            // Menutup koneksi
            R.close();
            S.close();
            K.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


private void settingTable() {
    cp = (DefaultTableModel) LAPORAN_PENJUALAN.getModel();
    
    // Mengatur ukuran kolom tabel
    LAPORAN_PENJUALAN.getColumnModel().getColumn(0).setMinWidth(50);
    LAPORAN_PENJUALAN.getColumnModel().getColumn(0).setMaxWidth(70);  // Kolom nomor (no)

    LAPORAN_PENJUALAN.getColumnModel().getColumn(1).setMinWidth(150);
    LAPORAN_PENJUALAN.getColumnModel().getColumn(1).setMaxWidth(150);  // Kolom tanggal_transaksi

    LAPORAN_PENJUALAN.getColumnModel().getColumn(2).setMinWidth(150);
    LAPORAN_PENJUALAN.getColumnModel().getColumn(2).setMaxWidth(150);  // Kolom nama_produk

    LAPORAN_PENJUALAN.getColumnModel().getColumn(3).setMinWidth(100);
    LAPORAN_PENJUALAN.getColumnModel().getColumn(3).setMaxWidth(200);  // Kolom banyak_produk
}


}
