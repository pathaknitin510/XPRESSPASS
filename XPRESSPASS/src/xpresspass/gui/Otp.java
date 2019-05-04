/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpresspass.gui;

import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import xpresspass.dao.AdminDAO;
import xpresspass.dao.HodDAO;
import xpresspass.pojo.AdminPojo;
import xpresspass.pojo.HodPojo;

/**
 *
 * @author Rahul
 */
public class Otp extends javax.swing.JFrame {

    private String email,adminId;
    private int otpNo;
    private HodPojo hodPojo;
    private AdminPojo adminPojo;
    private String authority;
    ImageIcon icon;

    public Otp() {
        initComponents();
        super.setLocationRelativeTo(null);

        setTitle("XPRESSPASS OTP");
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/ticket16.png"));
        icon = new ImageIcon(getClass().getResource("/images/recttick.gif"));

        setIconImage(icon1.getImage());
        setVisible(true);
        super.setResizable(false);
    }

    public Otp(HodPojo hodPojo, int otpNo) {
        this();
        this.hodPojo = hodPojo;
        email = hodPojo.getHodEmail();
        this.otpNo = otpNo;
        System.out.println(email);
        authority="HOD";
        lblMail.setText("Mail sent to:" + email);
    }

    public Otp(AdminPojo adminPojo,int otpNo)
    {
        this();
        this.adminPojo=adminPojo;
        email = adminPojo.getEmail();
        this.otpNo = otpNo;
        this.adminId=adminPojo.getAuthority_id();
        authority="ADMIN";
        System.out.println(email);
        lblMail.setText("Mail sent to:" + email);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOtp = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();

        lblEmail.setText("jLabel2");

        jLabel1.setText("Mail Sent to:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 253));

        lblMail.setText("Mail sent to: sainerahul@gmail.com");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("OTP");

        btnRegister.setBackground(new java.awt.Color(77, 142, 234));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel37.setText("©xpresspass");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOtp))
                    .addComponent(lblMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93)
                .addComponent(jLabel37)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblMail)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegister)
                    .addComponent(jLabel37))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if ((txtOtp.getText()).equals(String.valueOf(otpNo))) {
            try {
                if(authority.equals("ADMIN"))
                {
                    if(AdminDAO.registerAdmin(adminPojo))
                  {
                    JOptionPane.showMessageDialog(null, "Registration successfull", "Success!", JOptionPane.INFORMATION_MESSAGE, icon);
                    this.dispose();
                    return;
                }
                    else {
                    JOptionPane.showMessageDialog(null, "Registration failed", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }

                
                }
                
               else if (HodDAO.registerHod(hodPojo)) {
                    JOptionPane.showMessageDialog(null, "Registration successfull!", "Success!", JOptionPane.INFORMATION_MESSAGE, icon);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Registration failed!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Registration failed!\nOTP does not match!", "Oops!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(Otp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Otp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Otp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Otp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Otp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMail;
    private javax.swing.JTextField txtOtp;
    // End of variables declaration//GEN-END:variables
}
