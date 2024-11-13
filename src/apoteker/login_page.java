/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apoteker;

import konektor.connect;
import konektor.Profile;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class login_page extends javax.swing.JFrame {
    int xx, xy;
    public login_page() {
        initComponents();
    }
    
    void bersih(){
        username.setText("Username");
        password.setText("Password");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icon_username = new javax.swing.JLabel();
        icon_password = new javax.swing.JLabel();
        image1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        login_apoteker = new javax.swing.JLabel();
        pembatas = new javax.swing.JSeparator();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_password_20px.png"))); // NOI18N
        jPanel1.add(icon_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 30, 30));

        icon_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_name_20px.png"))); // NOI18N
        jPanel1.add(icon_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 30, 30));

        image1.setBackground(new java.awt.Color(255, 255, 255));
        image1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/data1login.png"))); // NOI18N
        image1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 127, -1, 237));

        jPanel1.add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_30px.png"))); // NOI18N
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 6, -1, -1));

        login_apoteker.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        login_apoteker.setForeground(new java.awt.Color(255, 255, 255));
        login_apoteker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_apoteker.setText("LOGIN APOTEKER");
        jPanel1.add(login_apoteker, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 124, 261, -1));

        pembatas.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(pembatas, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 163, 206, 10));

        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setText("Username");
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 179, 206, 34));

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setText("Password");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 219, 206, 34));

        btn_login.setBackground(new java.awt.Color(0, 153, 0));
        btn_login.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("LOGIN");
        btn_login.setBorder(null);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 280, 206, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        dispose();
    }//GEN-LAST:event_btn_exitMouseClicked

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
      String user = username.getText();
        String pass = new String(password.getText());
        
        try {
  
            Connection K = connect.Go();
            String Q = "SELECT * FROM `user` WHERE username=? AND password=?;";
            PreparedStatement S = K.prepareStatement(Q);
            S.setString(1, user);
            S.setString(2, pass);
            ResultSet R = S.executeQuery();
            int count = 0;
            Profile P = new Profile();
            while (R.next()) {                 
                P.setId(R.getInt("ID")); 
                P.setFullname(R.getString("FULLNAME")); 
                P.setUsername(R.getString("USERNAME")); 
                P.setPassword(R.getString("PASSWORD")); 
                P.setLevel(R.getString("LEVEL")); 
                count++;
                
            }

            
            if(count > 0){
                JOptionPane.showMessageDialog(this, "Sukses Login");
                switch (P.getLevel()) {
                    case "ADMIN" ->                         {
                            admin_page O = new admin_page(P);
                            O.setExtendedState(Frame.MAXIMIZED_BOTH);
                            this.setVisible(false);
                            O.setVisible(true);
                            
                        }
                    case "KASIR" ->                         {   
                            kasir_page O = new kasir_page(P);
                            O.setExtendedState(Frame.MAXIMIZED_BOTH);
                            this.setVisible(false);
                            O.setVisible(true); 
                        }
//                    case "owner" ->                         {
//                            owner O = new owner(P);
//                            O.setExtendedState(Frame.MAXIMIZED_BOTH);
//                            this.setVisible(false);
//                            O.setVisible(true);
//                        }
                    default -> {
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this, "Invalid username/password");
                username.requestFocus();
            }
                username.requestFocus();
            
        } catch (HeadlessException | SQLException e) {
            System.err.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        password.requestFocus();
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        String Uname = username.getText();
        if (Uname.equals("Username")){
            username.setText("");
        }
    }//GEN-LAST:event_usernameFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        String Passw = password.getText();
        if (Passw.equals("Password")){
            password.setText("");
        }
    }//GEN-LAST:event_passwordFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        String Uname = username.getText();
        if (Uname.equals("")||(Uname.equals("Username"))){
            username.setText("Username");
        }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        String Passw = password.getText();
        if (Passw.equals("")||(Passw.equals("Password"))){
            password.setText("Password");
        }
    }//GEN-LAST:event_passwordFocusLost

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
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel icon_password;
    private javax.swing.JLabel icon_username;
    private javax.swing.JPanel image1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login_apoteker;
    private javax.swing.JTextField password;
    private javax.swing.JSeparator pembatas;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
