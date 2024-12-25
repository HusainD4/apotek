/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package PreviewTabelPage;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import konektor.ProfileHistoryKeranjang;
import konektor.connect; // Pastikan ini sesuai dengan implementasi Anda

/**
 *
 * @author HUSAIN
 */
public class History_Keranjang extends javax.swing.JDialog {

    /**
     * Creates new form History_Keranjang
     */
    static DefaultTableModel HK = new DefaultTableModel();

    public History_Keranjang(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        if (HK == null) {
            HK = new DefaultTableModel();
        }

        // Populate and configure the table
        settingTableHistoryKeranjang();
        viewdataHK("");
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
        jPanel2 = new javax.swing.JPanel();
        pencarianHistoryKeranjang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_HistoryKeranjang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pencarianHistoryKeranjang.setFont(new java.awt.Font("Rockwell Nova Light", 0, 14)); // NOI18N
        pencarianHistoryKeranjang.setForeground(new java.awt.Color(0, 102, 102));
        pencarianHistoryKeranjang.setText("Pencarian");
        pencarianHistoryKeranjang.setBorder(null);
        pencarianHistoryKeranjang.setSelectionColor(new java.awt.Color(0, 153, 153));
        pencarianHistoryKeranjang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pencarianHistoryKeranjangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pencarianHistoryKeranjangFocusLost(evt);
            }
        });
        pencarianHistoryKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencarianHistoryKeranjangActionPerformed(evt);
            }
        });
        pencarianHistoryKeranjang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pencarianHistoryKeranjangKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pencarianHistoryKeranjangKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pencarianHistoryKeranjang, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pencarianHistoryKeranjang, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_20px_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1290, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tbl_HistoryKeranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID_keranjang", "kode  Produk", "Nama Produk", "Harga Satuan", "Jumlah Produk", "Total Belanja"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_HistoryKeranjang.setRowHeight(40);
        tbl_HistoryKeranjang.setSelectionBackground(new java.awt.Color(0, 255, 204));
        jScrollPane1.setViewportView(tbl_HistoryKeranjang);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_kembaliMouseClicked
        dispose();
    }//GEN-LAST:event_label_kembaliMouseClicked

    private void pencarianHistoryKeranjangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pencarianHistoryKeranjangFocusGained
        String Cari = pencarianHistoryKeranjang.getText();
        if (Cari.equals("Pencarian")) {
            pencarianHistoryKeranjang.setText("");
        }
    }//GEN-LAST:event_pencarianHistoryKeranjangFocusGained

    private void pencarianHistoryKeranjangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pencarianHistoryKeranjangFocusLost
        String Cari = pencarianHistoryKeranjang.getText();
        if (Cari.equals("") || Cari.equals("Pencarian")) {
            pencarianHistoryKeranjang.setText("Pencarian");
        }
    }//GEN-LAST:event_pencarianHistoryKeranjangFocusLost

    private void pencarianHistoryKeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencarianHistoryKeranjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pencarianHistoryKeranjangActionPerformed

    private void pencarianHistoryKeranjangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pencarianHistoryKeranjangKeyReleased
//        String key = pencarianHistoryKeranjang.getText();
//        String where = "WHERE "
//        + "kode_produk LIKE '%" + key + "%' OR "
//        + "nama_produk LIKE '%" + key + "%' OR "
//        + "kategori LIKE '%" + key + "%' OR "
//        + "harga_jual LIKE '%" + key + "%' OR "
//        + "";
    }//GEN-LAST:event_pencarianHistoryKeranjangKeyReleased

    private void pencarianHistoryKeranjangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pencarianHistoryKeranjangKeyTyped
//
//        String key = pencarianHistoryKeranjang.getText();
//        String query = "SELECT * FROM products WHERE "
//        + "kode_produk LIKE ? OR "
//        + "nama_produk LIKE ? OR "
//        + "kategori LIKE ? OR "
//        + "harga_jual LIKE ? OR "
//        + "harga_beli LIKE ? OR "
//        + "stok LIKE ?";
    }//GEN-LAST:event_pencarianHistoryKeranjangKeyTyped

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
            java.util.logging.Logger.getLogger(History_Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History_Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History_Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History_Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                History_Keranjang dialog = new History_Keranjang(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_kembali;
    private javax.swing.JTextField pencarianHistoryKeranjang;
    private javax.swing.JTable tbl_HistoryKeranjang;
    // End of variables declaration//GEN-END:variables
    public static void viewdataHK(String where) {
        try {
            // Clear the table before adding new data
            for (int i = HK.getRowCount() - 1; i >= 0; i--) {
                HK.removeRow(i);
            }

            // Establish database connection
            Connection K = konektor.connect.Go();
            Statement S = K.createStatement();

            // Construct SQL query (Using prepared statements to avoid SQL injection)
            String Q = "SELECT * FROM cart " + where;

            // Execute query
            ResultSet R = S.executeQuery(Q);
            int no = 1;

            // Iterate over the result set and add rows to the table
            while (R.next()) {
                int ID_K = R.getInt("ID_keranjang");
                String KD = R.getString("kode_produk");
                String NP = R.getString("nama_produk");
                String HS = R.getString("harga_satuan");
                String BP = R.getString("banyak_produk");
                String TB = R.getString("total_belanja");

                // Add a new row to the table model
                Object[] HKR = {no, ID_K, KD, NP, HS, BP, TB};
                HK.addRow(HKR);
                no++;
            }

            // Close resources
            R.close();
            S.close();
            K.close();
        } catch (SQLException e) {
            // Handle SQL exceptions properly (show an error message instead of just printing stack trace)
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void settingTableHistoryKeranjang() {
        HK = (DefaultTableModel) tbl_HistoryKeranjang.getModel();

        // Set column widths for a consistent table layout  
        tbl_HistoryKeranjang.getColumnModel().getColumn(0).setMinWidth(50);
        tbl_HistoryKeranjang.getColumnModel().getColumn(0).setMaxWidth(70);

        tbl_HistoryKeranjang.getColumnModel().getColumn(1).setMinWidth(0);
        tbl_HistoryKeranjang.getColumnModel().getColumn(1).setMaxWidth(0);

        tbl_HistoryKeranjang.getColumnModel().getColumn(2).setMinWidth(350);
        tbl_HistoryKeranjang.getColumnModel().getColumn(2).setMaxWidth(500);
        
        tbl_HistoryKeranjang.getColumnModel().getColumn(3).setMinWidth(350);
        tbl_HistoryKeranjang.getColumnModel().getColumn(3).setMaxWidth(500);
        
        tbl_HistoryKeranjang.getColumnModel().getColumn(4).setMinWidth(350);
        tbl_HistoryKeranjang.getColumnModel().getColumn(4).setMaxWidth(500);
        
        tbl_HistoryKeranjang.getColumnModel().getColumn(5).setMinWidth(350);
        tbl_HistoryKeranjang.getColumnModel().getColumn(5).setMaxWidth(500);
    }


}
