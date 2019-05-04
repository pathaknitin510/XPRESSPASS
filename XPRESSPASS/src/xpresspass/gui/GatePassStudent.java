/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpresspass.gui;

import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import xpresspass.dao.CollegeDAO;
import xpresspass.dao.StudentDAO;
import xpresspass.pojo.StudentPojo;

/**
 *
 * @author Rahul
 */
public class GatePassStudent extends javax.swing.JFrame {

    private String name,enroll,sem,reason,email,contact,passId;
    private static int flagClg=0,passCount=0;
    private boolean isStudentRegistered=false;
    ImageIcon icon, icon2, icon3;

    public GatePassStudent() {
        initComponents();

        super.setLocationRelativeTo(null);

        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/ticket16.png"));
//        super.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            icon2 = new ImageIcon(getClass().getResource("/images/right1.gif"));
        icon3 = new ImageIcon(getClass().getResource("/images/dinogif1.gif"));

txtName.setEditable(false);
        txtReason.setEditable(false);
        txtEmail.setEditable(false);
        txtContact.setEditable(false);
        
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReason = new javax.swing.JTextArea();
        jcbSem = new javax.swing.JComboBox<>();
        txtEnroll = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnApply = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 253));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XPRESSPASS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Enrollment");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Semester");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Reason");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Email");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Contact");

        txtContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtReason.setColumns(20);
        txtReason.setRows(5);
        jScrollPane1.setViewportView(txtReason);

        jcbSem.setBackground(new java.awt.Color(255, 248, 253));
        jcbSem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));

        txtEnroll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnApply.setBackground(new java.awt.Color(77, 142, 234));
        btnApply.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnApply.setForeground(new java.awt.Color(255, 255, 255));
        btnApply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnApply.setText("Apply");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(77, 142, 234));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel37.setText("©xpresspass");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnApply, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(67, 67, 67)
                                    .addComponent(txtContact))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(85, 85, 85)
                                    .addComponent(txtEmail))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel10))
                                    .addGap(70, 70, 70)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtName)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
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

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
      int isValid=validateInput();
      if(isValid==0)
      {
          JOptionPane.showMessageDialog(null,"No field can be left blank!","Oops!",JOptionPane.ERROR_MESSAGE);
          return;
      }
      if(isValid==-1)
      {
          JOptionPane.showMessageDialog(null,"Mail must be in Gmail Format","Oops!",JOptionPane.ERROR_MESSAGE);
          txtEmail.requestFocus();
          return;
      }
      if(isValid==-2)
      {
          JOptionPane.showMessageDialog(null,"Mobile number must contain 10 digits","Oops!",JOptionPane.ERROR_MESSAGE);
          txtContact.requestFocus();
          return;
      }
      //long mob=Long.valueOf(contact);
      //String s="\\d+";
      String regex = "\\d+";
      if(contact.matches(regex)==false)
      {
          JOptionPane.showMessageDialog(null,"Contact number must contain digits only!","Oops!",JOptionPane.ERROR_MESSAGE);
          txtContact.requestFocus();
          return;
      }
      passId=generatePassId();
      StudentPojo sPojo=new StudentPojo();
      sPojo.setStudName(name);
            sPojo.setSem(sem);
            sPojo.setStudEmail(email);
            sPojo.setStudMob(contact);
            sPojo.setReason(reason);
            sPojo.setPassId(passId);
            sPojo.setEnroll(enroll);
            try{
                if(flagClg==1)
                {
                    if(CollegeDAO.insertLnctStudent(sPojo))
                     JOptionPane.showMessageDialog(null,"Your PassId is: "+passId,"Success!",JOptionPane.INFORMATION_MESSAGE,icon2);
                    else
                        JOptionPane.showMessageDialog(null,"Your Pass could not be generated!","ERROR!",JOptionPane.ERROR_MESSAGE);
                }
                else if(flagClg==2)
                {
                    if(CollegeDAO.insertLnctsStudent(sPojo))
                     JOptionPane.showMessageDialog(null,"Your PassId is: "+passId,"Success!",JOptionPane.INFORMATION_MESSAGE,icon2);
                    else
                        JOptionPane.showMessageDialog(null,"Your Pass could not be generated!","ERROR!",JOptionPane.ERROR_MESSAGE);
                }
                else if(flagClg==3)
                {
                    if(CollegeDAO.insertLncteStudent(sPojo))
                     JOptionPane.showMessageDialog(null,"Your PassId is: "+passId,"Success!",JOptionPane.INFORMATION_MESSAGE,icon2);
                    else
                        JOptionPane.showMessageDialog(null,"Your Pass could not be generated!","ERROR!",JOptionPane.ERROR_MESSAGE);
                }
            
            //JOptionPane.showMessageDialog(null,"Your PassId is: "+passId,"Congratulations!",JOptionPane.INFORMATION_MESSAGE);
            clearAll();
//            GatePassHod g=new GatePassHod(sPojo);
            }
            catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);

        }
            
    }//GEN-LAST:event_btnApplyActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        enroll=txtEnroll.getText().trim();
        if(enroll.isEmpty() && enroll.length()>4)
        {
            JOptionPane.showMessageDialog(null,"Please enter your enrollment number first!","Oops!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if((enroll.substring(0, 4)).equals("0103"))
        {
            flagClg=1;
            searchStudent(enroll,flagClg);
        }
        else if((enroll.substring(0,4)).equals("0157"))
        {
            flagClg=2;
            searchStudent(enroll,flagClg);
        }
        else if((enroll.substring(0,4)).equals("0176"))
        {
             flagClg=3;
            searchStudent(enroll,flagClg);
        }
            txtReason.setEditable(true);
            txtEmail.setEditable(true);
            txtContact.setEditable(true);
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(GatePassStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GatePassStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GatePassStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GatePassStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GatePassStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbSem;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnroll;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtReason;
    // End of variables declaration//GEN-END:variables

private void searchStudent(String enroll,int flagClg)
{
    StudentPojo sPojo;
    try{
    if(flagClg==1)
    {
       sPojo=CollegeDAO.findLnctStudent(enroll);
        if(sPojo!=null)
        {
            txtName.setText(sPojo.getStudName());
            txtReason.setText(sPojo.getReason());
            txtEmail.setText(sPojo.getStudEmail());
            txtContact.setText(sPojo.getStudMob());
            
            
            isStudentRegistered=true;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No record found!\nPlease enter all fields carefully","Oops!",JOptionPane.INFORMATION_MESSAGE);
            txtName.setText("");
            txtReason.setText("");
            txtEmail.setText("");
            txtContact.setText("");
            txtName.setEditable(true);
        }
        }
      
    else if(flagClg==2)
    {
        sPojo=CollegeDAO.findLnctsStudent(enroll);
        if(sPojo!=null)
        {
            txtName.setText(sPojo.getStudName());
            txtReason.setText(sPojo.getReason());
            txtEmail.setText(sPojo.getStudEmail());
            txtContact.setText(sPojo.getStudMob());
            
            isStudentRegistered=true;
        }
        else
        { JOptionPane.showMessageDialog(null,"No record found!\nPlease enter all fields carefully","Oops!",JOptionPane.INFORMATION_MESSAGE);
          txtName.setText("");
            txtReason.setText("");
            txtEmail.setText("");
            txtContact.setText("");
          txtName.setEditable(true);
        }
        
    }
    else if(flagClg==3)
    {
        sPojo=CollegeDAO.findLncteStudent(enroll);
        if(sPojo!=null)
        {
            txtName.setText(sPojo.getStudName());
            txtReason.setText(sPojo.getReason());
            txtEmail.setText(sPojo.getStudEmail());
            txtContact.setText(sPojo.getStudMob());
            
            isStudentRegistered=true;
        }
        else
        { JOptionPane.showMessageDialog(null,"No record found!\nPlease enter all input fields carefully","Oops!",JOptionPane.INFORMATION_MESSAGE);
          txtName.setText("");
            txtReason.setText("");
            txtEmail.setText("");
            txtContact.setText("");
          txtName.setEditable(true);
        }
        
        
    }
    
    }
    catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);

        }
}
private int validateInput()
{
    name=txtName.getText();
    enroll=txtEnroll.getText();
    sem=String.valueOf(jcbSem.getSelectedItem());
    reason=txtReason.getText();
    email=txtEmail.getText();
    contact=txtContact.getText();
    if(name.isEmpty()||enroll.isEmpty()||sem.isEmpty()||reason.isEmpty()||email.isEmpty()||contact.isEmpty())
    {
        return 0;
    }
    else if(email.contains("@gmail.com")==false)
        return -1;
    else if(contact.length()!=10)
        return -2;
    return 1;
    
}
private String generatePassId()
{
    int count=0;
    passCount++;
    try{
        count=StudentDAO.getTotalPassCount();
    }
    catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);

        }
    count+=passCount;
    if(flagClg==1)
    return "XM"+enroll.substring(4,6)+count;
    else if(flagClg==2)
        return "XS"+enroll.substring(4,6)+count;
    
        return "XE"+enroll.substring(4,6)+count;
    
}
private void clearAll()
{
    txtEnroll.setText("");
    txtName.setText("");
    txtReason.setText("");
    txtEmail.setText("");
    txtContact.setText("");
    
}

}
