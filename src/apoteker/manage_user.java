/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package apoteker;

import fundamental.HalamanUser;
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
public class manage_user extends javax.swing.JDialog {

    /**
     * Creates new form manage_user
     */
    Profile p;
    static DefaultTableModel m;
    
    
    public manage_user(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
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

        bawah = new java.awt.Panel();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_reload = new javax.swing.JButton();
        btn_exit = new javax.swing.JLabel();
        btn_reload1 = new javax.swing.JButton();
        atas = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        tengah = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 102, 102));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        bawah.setBackground(new java.awt.Color(0, 153, 153));

        btn_tambah.setBackground(new java.awt.Color(102, 255, 102));
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(255, 255, 0));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(255, 0, 0));
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_reload.setBackground(new java.awt.Color(255, 153, 102));
        btn_reload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reload.setText("MUAT ULANG");
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_30px.png"))); // NOI18N
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });

        btn_reload1.setBackground(new java.awt.Color(102, 255, 204));
        btn_reload1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reload1.setText("KEMBALI");
        btn_reload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reload1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bawahLayout = new javax.swing.GroupLayout(bawah);
        bawah.setLayout(bawahLayout);
        bawahLayout.setHorizontalGroup(
            bawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bawahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reload, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reload1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bawahLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_exit)
                .addGap(14, 14, 14))
        );
        bawahLayout.setVerticalGroup(
            bawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bawahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reload, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reload1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_exit)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(bawah, java.awt.BorderLayout.PAGE_END);

        atas.setBackground(new java.awt.Color(0, 153, 153));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGEMANT USER");

        javax.swing.GroupLayout atasLayout = new javax.swing.GroupLayout(atas);
        atas.setLayout(atasLayout);
        atasLayout.setHorizontalGroup(
            atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                .addContainerGap())
        );
        atasLayout.setVerticalGroup(
            atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(atas, java.awt.BorderLayout.PAGE_START);

        tengah.setLayout(new java.awt.BorderLayout());

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "ID", "NAMA LENGKAP", "USERNAME", "PASSWORD", "LEVEL"
            }
        ));
        jTable1.setMinimumSize(new java.awt.Dimension(1650, 1080));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        tengah.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(tengah, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed

    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed

    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed

    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed

    }//GEN-LAST:event_btn_reloadActionPerformed

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        dispose();
    }//GEN-LAST:event_btn_exitMouseClicked

    private void btn_reload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reload1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reload1ActionPerformed

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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                manage_user dialog = new manage_user(new javax.swing.JFrame(), true);
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
    private java.awt.Panel atas;
    private java.awt.Panel bawah;
    private javax.swing.JButton btn_edit;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_reload;
    private javax.swing.JButton btn_reload1;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Panel tengah;
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
        m = (DefaultTableModel) jTable1.getModel();        
        jTable1.getColumnModel().getColumn(0).setMinWidth(50);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(70);

        jTable1.getColumnModel().getColumn(1).setMinWidth(0);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(0);

        jTable1.getColumnModel().getColumn(2).setMinWidth(350);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(500);
    }

}
