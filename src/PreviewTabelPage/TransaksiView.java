/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package PreviewTabelPage;

import java.awt.Frame;

import konektor.Profile;
import apoteker.admin_page;
//import konektor.connect;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import konektor.ProfileTransaksiDetail;

/**
 *
 * @author HUSAIN
 */
public class TransaksiView extends javax.swing.JDialog {

    /**
     * Creates new form TransaksiView
     */
    ProfileTransaksiDetail TR;
    static DefaultTableModel trs;

    public TransaksiView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initComponents();
        settingTableTransaksi();
        viewdataTransaksi("");
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
        label_kembali = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_transaksi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        label_kembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_kembali.setForeground(new java.awt.Color(255, 255, 255));
        label_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_left_2_20px.png"))); // NOI18N
        label_kembali.setText("KEMBALI");
        label_kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_kembaliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tbl_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Tanggal Transaksi", "Nama Kasir", "Nama Produk", "Jumlah Produk", "Total Pembelian", "Uang Diterima", "Uang Kembali", "Metode Pembayaran"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_transaksi);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_kembaliMouseClicked
        dispose();
    }//GEN-LAST:event_label_kembaliMouseClicked

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
            java.util.logging.Logger.getLogger(TransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TransaksiView dialog = new TransaksiView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_kembali;
    private javax.swing.JTable tbl_transaksi;
    // End of variables declaration//GEN-END:variables
    public static void viewdataTransaksi(String where) {
        try {

            for (int i = trs.getRowCount() - 1; i >= 0; i--) {
                trs.removeRow(i);
            }

            Connection K = konektor.connect.Go();
            Statement S = K.createStatement();
            // Construct SQL query

            String Q = "SELECT * FROM transaksi " + where;
//            System.out.println(Q);
            ResultSet R = S.executeQuery(Q);
            int no = 1;
            while (R.next()) {
                int ID_Trans = R.getInt("ID_transaksi");
                String Tanggal_Transaksi = R.getString("tanggal_transaksi");
                String Kode_Obat = R.getString("kode_obat");
                String Jumlah_Produk = R.getString("jumlah_produk");
                String Harga_Satuan = R.getString("harga_satuan");
                String Total_harga = R.getString("total_harga");
                String Uang_Diterima = R.getString("Uang_Diterima");
                String Uang_Kembali = R.getString("Uang_Kembali");
                String Nama_Kasir = R.getString("nama_kasir");

                Object[] transs = {no, ID_Trans, Tanggal_Transaksi, Kode_Obat, Jumlah_Produk, Harga_Satuan, Total_harga, Uang_Diterima, Uang_Kembali, Nama_Kasir};
                trs.addRow(transs);
                no++;
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    private void settingTableTransaksi() {
        trs = (DefaultTableModel) tbl_transaksi.getModel();
        tbl_transaksi.getColumnModel().getColumn(0).setMinWidth(50);
        tbl_transaksi.getColumnModel().getColumn(0).setMaxWidth(70);

        tbl_transaksi.getColumnModel().getColumn(1).setMinWidth(0);
        tbl_transaksi.getColumnModel().getColumn(1).setMaxWidth(0);

        tbl_transaksi.getColumnModel().getColumn(2).setMinWidth(140);
        tbl_transaksi.getColumnModel().getColumn(2).setMaxWidth(140);

        tbl_transaksi.getColumnModel().getColumn(3).setMinWidth(120);
        tbl_transaksi.getColumnModel().getColumn(3).setMaxWidth(120);

        tbl_transaksi.getColumnModel().getColumn(4).setMinWidth(120);
        tbl_transaksi.getColumnModel().getColumn(4).setMaxWidth(120);

        tbl_transaksi.getColumnModel().getColumn(5).setMinWidth(140);
        tbl_transaksi.getColumnModel().getColumn(5).setMaxWidth(140);

        tbl_transaksi.getColumnModel().getColumn(6).setMinWidth(140);
        tbl_transaksi.getColumnModel().getColumn(6).setMaxWidth(140);
    }

}
