/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpresspass.gui;

import java.sql.SQLException;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import xpresspass.dao.StudentDAO;
import xpresspass.pojo.StudentPojo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
 

/**
 *
 * @author Rahul
 */
public class GatePassSecurity extends javax.swing.JFrame {

    private String passId, issuedDate, issuedTime, currentTime, currentDate, finalStatus;
    private int issuedMinutes, currentMinutes;
    private StudentPojo sPojo;
    ImageIcon icon, icon2, icon3;

    public GatePassSecurity() {
        initComponents();
        super.setLocationRelativeTo(null);

        setTitle("XPRESSPASS SecurityEnd");
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/ticket16.png"));
        icon2 = new ImageIcon(getClass().getResource("/images/right1.gif"));
        icon3 = new ImageIcon(getClass().getResource("/images/dinogif1.gif"));

        setIconImage(icon1.getImage());
        setVisible(true);
        super.setResizable(false);
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
        jLabel6 = new javax.swing.JLabel();
        txtPassId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblCollege = new javax.swing.JLabel();
        lblBranch = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblSem = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnPassUsed = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 253));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XPRESSPASS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Pass Id");

        txtPassId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(77, 142, 234));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblCollege.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblBranch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 0, 0));

        lblSem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnPassUsed.setBackground(new java.awt.Color(77, 142, 234));
        btnPassUsed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPassUsed.setForeground(new java.awt.Color(255, 255, 255));
        btnPassUsed.setText("OK");
        btnPassUsed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassUsedActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel37.setText("©xpresspass");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBranch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCollege, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPassUsed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(195, 195, 195)
                .addComponent(jLabel37)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPassId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnPassUsed)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        passId = txtPassId.getText();
        clearAll();
        try {
            sPojo = StudentDAO.verifyPass(passId);
            if (sPojo != null) {
                int isPassValid = checkPass(sPojo);
                if (isPassValid == 0) {
                    JOptionPane.showMessageDialog(null, "Pass Time has Expired!", "ATTENTION!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (isPassValid == -2) {
                    JOptionPane.showMessageDialog(null, "Pass Date has Expired!", "ATTENTION!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (isPassValid == -1) {
                    JOptionPane.showMessageDialog(null, "Pass has already been used!", "ATTENTION!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                lblName.setText("Name: " + sPojo.getStudName());
                lblSem.setText("Sem: " + sPojo.getSem());
                lblDate.setText("Date: " + sPojo.getStudDated());
                lblTime.setText("Time: " + sPojo.getStudTime());
                lblBranch.setText("Branch: " + sPojo.getStudBranch());
                lblCollege.setText("College: " + sPojo.getStudCollege());

            } else {
                JOptionPane.showMessageDialog(null, "No such pass allotted!", "ATTENTION!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnPassUsedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassUsedActionPerformed
        clearAll();
       sendSMS sms=new sendSMS();
        System.out.println(sms.sendSms());
        if (currentMinutes - issuedMinutes > 2 || currentDate.equals(issuedDate) == false || sPojo.getStudUsed().equals("N") == false) {
            finalStatus = "Expired!";
        } else {
            finalStatus = currentTime;
        }

        try {
               System.out.println(finalStatus+" "+passId);
            if (StudentDAO.updateUsedTime(finalStatus, passId)) {
                JOptionPane.showMessageDialog(null, "Exit time updated successfully!", "Success!", JOptionPane.INFORMATION_MESSAGE,icon2);
            } else {
                JOptionPane.showMessageDialog(null, "Exit time could not be updated!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_btnPassUsedActionPerformed

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
            java.util.logging.Logger.getLogger(GatePassSecurity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GatePassSecurity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GatePassSecurity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GatePassSecurity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GatePassSecurity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPassUsed;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBranch;
    private javax.swing.JLabel lblCollege;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSem;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField txtPassId;
    // End of variables declaration//GEN-END:variables

    private void clearAll() {
        lblName.setText("");
        lblSem.setText("");
        lblDate.setText("");
        lblTime.setText("");
        lblBranch.setText("");
        lblCollege.setText("");

    }

    private int checkPass(StudentPojo sPojo) {
        Date d = new Date();
        String s = String.valueOf(d);
        String str[] = s.split(" ");
        currentTime = str[3] + " " + str[4];
        currentDate = str[1] + " " + str[2] + ", " + str[5];
        issuedTime = sPojo.getStudTime();
        issuedDate = sPojo.getStudDated();
        System.out.println(currentTime + " " + currentDate);
        System.out.println(issuedTime + " " + issuedDate);
        issuedMinutes = calculateMinutes(issuedTime);
        currentMinutes = calculateMinutes(currentTime);
        if (currentMinutes - issuedMinutes > 2) {
            return 0;
        }
        if (currentDate.equals(issuedDate) == false) {
            return -2;
        }
        if (sPojo.getStudUsed().equals("N") == false) {
            return -1;
        }

        return 1;
    }

    private int calculateMinutes(String str) {
        String s = str;

        int hm, mm;
        //System.out.println(s.charAt(0));
        if (s.charAt(0) == 0) {
            hm = s.charAt(1) * 60;
        } else {
            hm = Integer.valueOf(s.substring(0, 2)) * 60;
        }
        // System.out.println(hm);
        if (s.charAt(3) == 0) {
            mm = s.charAt(4);
        } else {
            mm = Integer.valueOf(s.substring(3, 5));
        }
        //System.out.println(mm);
        System.out.println(hm + mm);
        return (hm + mm);

    }
    private void sendMessage()
    {
	     try {
			// Construct data
			String apiKey =  "xOfDe64XSrQ-4aIXH78Pk6TKT8BxJ1KjwmXUtFIq6e";
			String message = "&message=" + "Your child is leaving the college";
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + "917509112738";
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			
			              System.out.println(stringBuffer.toString());
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
			
		}
	}
}
    


