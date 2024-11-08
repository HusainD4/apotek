/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manage_table;

import konektor.Profile;
import apoteker.admin_page;
import konektor.connect;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;


/**
 *
 * @author HUSAIN
 */
public class manage_produk extends javax.swing.JFrame {

    /**
     * Creates new form manage_produk
     */
    Profile p;
    static DefaultTableModel prd;
    
    
 public manage_produk() {
        initComponents();
        settingTableProduk();        
        viewProduk("");
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atas_transaksi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pencarian = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        label_kembali = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tengah_transaksi = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_produk = new javax.swing.JTable();
        bawah_transaksi = new javax.swing.JPanel();
        btn_TambahProduk = new javax.swing.JButton();
        btn_EditProduk = new javax.swing.JButton();
        btn_MuatUlang = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        btn_HapusProduk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        atas_transaksi.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_transaction_30px_3.png"))); // NOI18N
        jLabel1.setText(" MANAGE PRODUK");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pencarian.setFont(new java.awt.Font("Rockwell Nova Light", 0, 14)); // NOI18N
        pencarian.setForeground(new java.awt.Color(0, 102, 102));
        pencarian.setText("Pencarian");
        pencarian.setBorder(null);
        pencarian.setSelectionColor(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pencarian, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pencarian, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_20px_1.png"))); // NOI18N

        label_kembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_kembali.setForeground(new java.awt.Color(255, 255, 255));
        label_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_left_2_20px.png"))); // NOI18N
        label_kembali.setText("KEMBALI");
        label_kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_kembaliMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout atas_transaksiLayout = new javax.swing.GroupLayout(atas_transaksi);
        atas_transaksi.setLayout(atas_transaksiLayout);
        atas_transaksiLayout.setHorizontalGroup(
            atas_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atas_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atas_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addGroup(atas_transaksiLayout.createSequentialGroup()
                        .addComponent(label_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        atas_transaksiLayout.setVerticalGroup(
            atas_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atas_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(atas_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(atas_transaksi, java.awt.BorderLayout.PAGE_START);

        tengah_transaksi.setBackground(new java.awt.Color(0, 102, 102));

        tbl_produk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID", "kode_produk", "nama_produk", "kategori", "harga_jual", "harga_beli", "stok"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_produk);

        javax.swing.GroupLayout tengah_transaksiLayout = new javax.swing.GroupLayout(tengah_transaksi);
        tengah_transaksi.setLayout(tengah_transaksiLayout);
        tengah_transaksiLayout.setHorizontalGroup(
            tengah_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tengah_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                .addContainerGap())
        );
        tengah_transaksiLayout.setVerticalGroup(
            tengah_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tengah_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(tengah_transaksi, java.awt.BorderLayout.CENTER);

        bawah_transaksi.setBackground(new java.awt.Color(0, 102, 102));

        btn_TambahProduk.setBackground(new java.awt.Color(204, 255, 204));
        btn_TambahProduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_TambahProduk.setText("TAMBAH PRODUK");
        btn_TambahProduk.setBorderPainted(false);
        btn_TambahProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TambahProdukActionPerformed(evt);
            }
        });

        btn_EditProduk.setBackground(new java.awt.Color(102, 204, 255));
        btn_EditProduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_EditProduk.setText("EDIT PRODUK");
        btn_EditProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditProdukActionPerformed(evt);
            }
        });

        btn_MuatUlang.setBackground(new java.awt.Color(255, 255, 51));
        btn_MuatUlang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_MuatUlang.setText("MUAT ULANG");
        btn_MuatUlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MuatUlangActionPerformed(evt);
            }
        });

        btn_kembali.setBackground(new java.awt.Color(255, 204, 153));
        btn_kembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_kembali.setText("KEMBALI");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        btn_HapusProduk.setBackground(new java.awt.Color(255, 153, 153));
        btn_HapusProduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_HapusProduk.setText("HAPUS PRODUK");
        btn_HapusProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HapusProdukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bawah_transaksiLayout = new javax.swing.GroupLayout(bawah_transaksi);
        bawah_transaksi.setLayout(bawah_transaksiLayout);
        bawah_transaksiLayout.setHorizontalGroup(
            bawah_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bawah_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bawah_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bawah_transaksiLayout.createSequentialGroup()
                        .addComponent(btn_MuatUlang, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bawah_transaksiLayout.createSequentialGroup()
                        .addComponent(btn_TambahProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_EditProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_HapusProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(389, Short.MAX_VALUE))
        );
        bawah_transaksiLayout.setVerticalGroup(
            bawah_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bawah_transaksiLayout.createSequentialGroup()
                .addGroup(bawah_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bawah_transaksiLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bawah_transaksiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bawah_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_TambahProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_EditProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_HapusProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_MuatUlang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(bawah_transaksi, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EditProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditProdukActionPerformed

    private void btn_TambahProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TambahProdukActionPerformed
        editor_manage.TambahProduk TP = new editor_manage.TambahProduk(this, true);
        TP.setVisible(true);
    }//GEN-LAST:event_btn_TambahProdukActionPerformed

    private void btn_HapusProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HapusProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HapusProdukActionPerformed

    private void label_kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_kembaliMouseClicked
        dispose();
    }//GEN-LAST:event_label_kembaliMouseClicked

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        dispose();
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void btn_MuatUlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MuatUlangActionPerformed
        viewProduk("");
    }//GEN-LAST:event_btn_MuatUlangActionPerformed

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
            java.util.logging.Logger.getLogger(manage_produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            manage_produk MP = new manage_produk();
            MP.setExtendedState(Frame.MAXIMIZED_BOTH);
            //L.setAlwaysOnTop(true); 
            MP.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atas_transaksi;
    private javax.swing.JPanel bawah_transaksi;
    private javax.swing.JButton btn_EditProduk;
    private javax.swing.JButton btn_HapusProduk;
    private javax.swing.JButton btn_MuatUlang;
    private javax.swing.JButton btn_TambahProduk;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_kembali;
    private javax.swing.JTextField pencarian;
    private javax.swing.JTable tbl_produk;
    private javax.swing.JPanel tengah_transaksi;
    // End of variables declaration//GEN-END:variables
public static void viewProduk(String where) {
        try {
            //kode kita
            for (int i = prd.getRowCount()-1; i >=0; i--) {
                prd.removeRow(i);
            }

            Connection K = connect.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM produk" + where;
//            System.out.println(Q);
            ResultSet R = S.executeQuery(Q);
            int no = 1;
            while (R.next()) {
                int ID = R.getInt("ID");
                String kode_produk = R.getString("kode_produk");
                String nama_produk = R.getString("nama_produk");
                String kategori = R.getString("kategori");
                String harga_jual = R.getString("harga_jual");
                String harga_beli    = R.getString("harga_beli");
                String stok = R.getString("stok");

                Object[] P = {no, ID, kode_produk, nama_produk, kategori, harga_jual, harga_beli, stok};
                prd.addRow(P);

                no++;
            }
        } catch (SQLException e) {
            //error handling
        }
    }
    
    
    private void settingTableProduk() {
        prd = (DefaultTableModel) tbl_produk.getModel();        
        tbl_produk.getColumnModel().getColumn(0).setMinWidth(50);
        tbl_produk.getColumnModel().getColumn(0).setMaxWidth(70);

        tbl_produk.getColumnModel().getColumn(1).setMinWidth(0);
        tbl_produk.getColumnModel().getColumn(1).setMaxWidth(0);

        tbl_produk.getColumnModel().getColumn(2).setMinWidth(350);
        tbl_produk.getColumnModel().getColumn(2).setMaxWidth(500);
    }


}
