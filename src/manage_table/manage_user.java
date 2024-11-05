/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manage_table;

import editor_manage.EditUser;
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
public class manage_user extends javax.swing.JFrame {

    /**
     * Creates new form manage_user
     */
    Profile p;
    static DefaultTableModel m;
    
    
 public manage_user() {
        initComponents();
        settingTable();        
        viewData("");
        
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
        tbl_user = new javax.swing.JTable();
        bawah_transaksi = new javax.swing.JPanel();
        btn_TambahUser = new javax.swing.JButton();
        btn_EditUser = new javax.swing.JButton();
        btn_MuatUlang = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        btn_HapusUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        atas_transaksi.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_transaction_30px_3.png"))); // NOI18N
        jLabel1.setText(" MANAGE USER");

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
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
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

        tbl_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID", "FULLNAME", "USERNAME", "PASSWORD", "LEVEL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_user);

        javax.swing.GroupLayout tengah_transaksiLayout = new javax.swing.GroupLayout(tengah_transaksi);
        tengah_transaksi.setLayout(tengah_transaksiLayout);
        tengah_transaksiLayout.setHorizontalGroup(
            tengah_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tengah_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addContainerGap())
        );
        tengah_transaksiLayout.setVerticalGroup(
            tengah_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tengah_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(tengah_transaksi, java.awt.BorderLayout.CENTER);

        bawah_transaksi.setBackground(new java.awt.Color(0, 102, 102));

        btn_TambahUser.setText("TAMBAH USER");
        btn_TambahUser.setBorderPainted(false);
        btn_TambahUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TambahUserActionPerformed(evt);
            }
        });

        btn_EditUser.setText("EDIT USER");
        btn_EditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditUserActionPerformed(evt);
            }
        });

        btn_MuatUlang.setText("MUAT ULANG");

        btn_kembali.setText("KEMBALI");

        btn_HapusUser.setText("HAPUS USER");
        btn_HapusUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HapusUserActionPerformed(evt);
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
                        .addComponent(btn_TambahUser, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_EditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_HapusUser, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(378, Short.MAX_VALUE))
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
                            .addComponent(btn_TambahUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_EditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_HapusUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_MuatUlang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(bawah_transaksi, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditUserActionPerformed

        int n = tbl_user.getSelectedRow();
        if(n != -1){
            int ID = Integer.parseInt(tbl_user.getValueAt(n, 1).toString());
            String FULLNAME = tbl_user.getValueAt(n, 2).toString();
            String USERNAME = tbl_user.getValueAt(n, 3).toString();
            String PASSWORD = tbl_user.getValueAt(n, 4).toString();
            String LEVEL = tbl_user.getValueAt(n, 5).toString();
            editor_manage.EditUser EU = new editor_manage.EditUser(this, true);
            EU.setId(ID);
            EU.setFullname(FULLNAME);
            EU.setUsername(USERNAME);
            EU.setPassword(PASSWORD); 
            EU.setLevel(LEVEL); 
            EU.setVisible(true); 
            

            
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data");
        }
    }//GEN-LAST:event_btn_EditUserActionPerformed

    private void btn_TambahUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TambahUserActionPerformed
        editor_manage.TambahUser TU = new editor_manage.TambahUser(this, true);
        TU.setVisible(true);
    }//GEN-LAST:event_btn_TambahUserActionPerformed

    private void btn_HapusUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HapusUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HapusUserActionPerformed

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
            java.util.logging.Logger.getLogger(manage_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            manage_user MU = new manage_user();
            MU.setExtendedState(Frame.MAXIMIZED_BOTH);
            //L.setAlwaysOnTop(true); 
            MU.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atas_transaksi;
    private javax.swing.JPanel bawah_transaksi;
    private javax.swing.JButton btn_EditUser;
    private javax.swing.JButton btn_HapusUser;
    private javax.swing.JButton btn_MuatUlang;
    private javax.swing.JButton btn_TambahUser;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_kembali;
    private javax.swing.JTextField pencarian;
    private javax.swing.JTable tbl_user;
    private javax.swing.JPanel tengah_transaksi;
    // End of variables declaration//GEN-END:variables
    public static void viewData(String where) {
        try {
            //kode kita
            for (int i = m.getRowCount()-1; i >=0; i--) {
                m.removeRow(i);
            }

            Connection K = connect.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM user " + where;
//            System.out.println(Q);
            ResultSet R = S.executeQuery(Q);
            int no = 1;
            while (R.next()) {
                int id = R.getInt("id");
                String fullname = R.getString("fullname");
                String username = R.getString("username");
                String password = R.getString("password");
                String level = R.getString("level");

                Object[] D = {no, id, fullname, username, password, level};
                m.addRow(D);

                no++;
            }
        } catch (SQLException e) {
            //error handling
        }
    }
    
    
    private void settingTable() {
        m = (DefaultTableModel) tbl_user.getModel();        
        tbl_user.getColumnModel().getColumn(0).setMinWidth(50);
        tbl_user.getColumnModel().getColumn(0).setMaxWidth(70);

        tbl_user.getColumnModel().getColumn(1).setMinWidth(0);
        tbl_user.getColumnModel().getColumn(1).setMaxWidth(0);

        tbl_user.getColumnModel().getColumn(2).setMinWidth(350);
        tbl_user.getColumnModel().getColumn(2).setMaxWidth(500);
    }
    
    
    

}
