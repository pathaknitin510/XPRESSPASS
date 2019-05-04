/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpresspass.gui;

import java.awt.Color;
import java.awt.Font;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import xpresspass.dao.CollegeDAO;
import xpresspass.dao.PassDAO;
import xpresspass.dao.StudentDAO;
import xpresspass.pojo.HodPojo;
import xpresspass.pojo.PassPojo;
import xpresspass.pojo.StudentPojo;

/**
 *
 * @author Rahul
 */
public class GatePassHod extends javax.swing.JFrame {

    private String name, enroll, sem, reason, email, contact, enrollType;
    private HodPojo hodPojo;
    private String hodBranch, hodCollege, hodAuthorityId;
    public static int remPassCount, usedPassCount, passCount=0;
    public static String passDate, passTime;
    private StudentPojo sPojo;
    private static String adminMsg;
    private static ArrayList<StudentPojo> studList=new ArrayList<>();
    private String passId;
    private String currentTime, currentDate;
    private boolean isHodEnd = false;
    ImageIcon icon, icon2, icon3,icon4;
 
    public GatePassHod() {
        initComponents();
        super.setLocationRelativeTo(null);

        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/ticket16.png"));
        super.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        icon = new ImageIcon(getClass().getResource("/images/gmailgif1.gif"));
        icon2 = new ImageIcon(getClass().getResource("/images/right1.gif"));
        icon3 = new ImageIcon(getClass().getResource("/images/dinogif1.gif"));
        icon4=  new ImageIcon(getClass().getResource("/images/g+.png"));
        setIconImage(icon1.getImage());
        setVisible(true);
        super.setResizable(false);
    }
//    public GatePassHod(StudentPojo sPojo)
//    {
//        this.sPojo=sPojo;
//        studList.add(sPojo);
//    }

    public GatePassHod(HodPojo hodPojo) {
        this();
        this.hodPojo = hodPojo;
        hodBranch = hodPojo.getHodBranch();
        hodCollege = hodPojo.getHodCollege();
        hodAuthorityId = hodPojo.getHodAuthorityId();
        System.out.println(hodPojo.getHodBranch() + " " + hodBranch);
        System.out.println(hodPojo.getHodCollege() + " " + hodCollege);
        System.out.println(hodPojo);
        setTitle("XPRESSPASS department of " + hodBranch);
        lblCollege.setText("COLLEGE: " + hodCollege);
        getPasses(hodPojo);
        getAllStudentsList();
        if (adminMsg != null) {
            JOptionPane.showMessageDialog(null,"Message from Admin: "+ adminMsg+"\nPasses Left: "+remPassCount, "Inbox@"+hodBranch+"_"+hodCollege, JOptionPane.INFORMATION_MESSAGE,icon4);
        }
        lblPass.setText("PASSES LEFT: " + remPassCount);
        lblPass1.setText("PASSES LEFT: " + remPassCount);
        btnRefresh.setEnabled(false);
        btnPrint.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel27 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEnrollment = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReason = new javax.swing.JTextArea();
        jcbSemester = new javax.swing.JComboBox<>();
        btnApply = new javax.swing.JButton();
        lblPass = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        lblCollege = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnViewAll = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtPassId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblEnroll = new javax.swing.JLabel();
        lblSem = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnAllow = new javax.swing.JButton();
        lblPass1 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtEnroll1 = new javax.swing.JTextField();
        btnSearch1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();

        jLabel27.setText("©xpresspass");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 253));

        jTabbedPane1.setBackground(new java.awt.Color(255, 248, 253));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 248, 253));

        jPanel3.setBackground(new java.awt.Color(255, 248, 253));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XPRESSPASS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Enrollment");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Semester");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Reason");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Contact");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtEnrollment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtReason.setColumns(20);
        txtReason.setRows(5);
        jScrollPane1.setViewportView(txtReason);

        jcbSemester.setBackground(new java.awt.Color(255, 248, 253));
        jcbSemester.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));

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

        lblPass.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        lblPass.setText("PASSES LEFT: ");

        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout1.png"))); // NOI18N
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        txtContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblCollege.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        lblCollege.setText("COLLEGE: ");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel28.setText("©xpresspass");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addComponent(lblCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(306, 306, 306))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(67, 67, 67)
                                        .addComponent(txtContact, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(85, 85, 85)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(82, 82, 82)
                                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jcbSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtEnrollment, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1)))
                                    .addComponent(btnApply, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jcbSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogout)
                    .addComponent(jLabel28))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Generate Pass", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 248, 253));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XPRESSPASS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jTable.setBackground(new java.awt.Color(255, 248, 253));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Enrollment", "Sem", "Date", "Time", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable);

        btnViewAll.setBackground(new java.awt.Color(255, 248, 253));
        btnViewAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye20.png"))); // NOI18N
        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(255, 248, 253));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh16.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(255, 248, 253));
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel29.setText("©xpresspass");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305)
                        .addComponent(btnViewAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel29)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRefresh)
                        .addComponent(btnPrint))
                    .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addContainerGap())
        );

        jTabbedPane1.addTab("View All", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 248, 253));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XPRESSPASS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 36), new java.awt.Color(255, 0, 0))); // NOI18N

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Pass Id");

        txtPassId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblEnroll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEnroll.setForeground(new java.awt.Color(255, 0, 0));

        lblSem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAllow.setBackground(new java.awt.Color(77, 142, 234));
        btnAllow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAllow.setForeground(new java.awt.Color(255, 255, 255));
        btnAllow.setText("Allow");
        btnAllow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllowActionPerformed(evt);
            }
        });

        lblPass1.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        lblPass1.setText("PASSES LEFT: ");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel30.setText("©xpresspass");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAllow, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPassId))
                                .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEnroll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(lblPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPassId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnSearch)
                .addGap(75, 75, 75)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnAllow)
                .addGap(50, 50, 50)
                .addComponent(jLabel30)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Verify", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 248, 253));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XPRESSPASS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Enrollment");

        txtEnroll1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSearch1.setBackground(new java.awt.Color(77, 142, 234));
        btnSearch1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearch1.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnSearch1.setText("Search");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Name");

        txtName1.setEditable(false);
        txtName1.setBackground(new java.awt.Color(255, 248, 253));
        txtName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sno.", "Semester", "Date", "Issue Time", "Out  Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel31.setText("©xpresspass");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 232, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(26, 26, 26)
                                .addComponent(txtEnroll1))
                            .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(213, 213, 213))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEnroll1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnSearch1)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/images/brail.png")), jPanel6); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        updatePasses();
        this.dispose();
        WelcomeHod login = new WelcomeHod();
        login.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.red);
        Font f = new Font("Tahoma", Font.BOLD, 11);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(new Color(0, 0, 0));
        Font f = new Font("Tahoma", Font.PLAIN, 11);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        int isValid = validateInput();
        if (isValid == 0) {
            JOptionPane.showMessageDialog(null, "Please enter data into all the fields", "Oops!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (isValid == -1) {
            JOptionPane.showMessageDialog(null, "Please input correct Gmail account", "ERROR!", JOptionPane.ERROR_MESSAGE);
            txtEmail.requestFocus();
            return;
        }
        if (isValid == -2) {
            JOptionPane.showMessageDialog(null, "Contact number have 10 digits", "ERROR!", JOptionPane.ERROR_MESSAGE);
            txtContact.requestFocus();
            return;
        }
        String s = "\\d+";
        System.out.println(contact);
        if (contact.matches(s) == false) {
            JOptionPane.showMessageDialog(null, "Contact number must contain digits only", "ERROR!", JOptionPane.ERROR_MESSAGE);
            txtContact.requestFocus();
            return;
        }
        enrollType = getEnrollFormat();
        if (enroll.substring(0, 6).equals(enrollType) == false) {
            JOptionPane.showMessageDialog(null, "Enrollment number is invalid", "Oops!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        passId = generatePassId();
        isHodEnd = true;
        StudentPojo studPojo = new StudentPojo(passId, name, enroll, sem, hodBranch, hodCollege, email, reason, contact, passDate, passTime, "N");
        try {
            if (remPassCount < 1) {
                JOptionPane.showMessageDialog(null, "Sorry! No passes left", "Oops!", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (StudentDAO.generatePass(studPojo)) {
                if (isInternetAvailable() == false) {
                    JOptionPane.showMessageDialog(null, "Pass generated successfully\nInternet not available", "Oops!", JOptionPane.INFORMATION_MESSAGE,icon3);
                    printPass(studPojo);
                } else {
                    if (isMailSent()) {
                        int ans = JOptionPane.showConfirmDialog(null, "Pass generated successfully\nMail sent to: " + email + "\nDo you want to print the pass also?", "Success!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,icon);
                        if (ans == JOptionPane.YES_OPTION) {
                            printPass(studPojo);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Pass generated successfully\nMail not sent!\nyou must print your pass", "Oops!", JOptionPane.INFORMATION_MESSAGE,icon3);
                        printPass(studPojo);
                    }
                }
                remPassCount--;
                usedPassCount++;
                lblPass.setText("PASSES LEFT: " + remPassCount);
                lblPass1.setText("PASSES LEFT: " + remPassCount);
                clearAll();
                return;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnApplyActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        btnPrint.setEnabled(true);
        btnRefresh.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        try {
            ArrayList<StudentPojo> studList = StudentDAO.getAllStudents(hodPojo);
            if (studList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No pass allotted for " + hodPojo.getHodBranch() + "of" + hodPojo.getHodCollege(), "Oops", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            int length = studList.size();
            int cols = 6;
            Object[] obj = new Object[6];
            for (StudentPojo studPojo : studList) {
                obj[0] = studPojo.getStudName();
                obj[1] = studPojo.getEnroll();
                obj[2] = studPojo.getSem();
                obj[3] = studPojo.getStudDated();
                obj[4] = studPojo.getStudTime();
                obj[5] = studPojo.getStudMob();
                model.addRow(obj);
            }
            btnViewAll.setEnabled(false);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        try {
            ArrayList<StudentPojo> studList = StudentDAO.getAllStudents(hodPojo);
            if (studList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No pass allotted for " + hodPojo.getHodBranch() + "of" + hodPojo.getHodCollege(), "OOPS", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            int length = studList.size();
            int cols = 6;
            Object[] obj = new Object[6];
            for (StudentPojo studPojo : studList) {
                obj[0] = studPojo.getStudName();
                obj[1] = studPojo.getEnroll();
                obj[2] = studPojo.getSem();
                obj[3] = studPojo.getStudDated();
                obj[4] = studPojo.getStudTime();
                obj[5] = studPojo.getStudMob();
                model.addRow(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        MessageFormat header = new MessageFormat(hodPojo.getHodCollege() + " " + hodPojo.getHodBranch() + " Student Pass List");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            jTable.print(javax.swing.JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (java.awt.print.PrinterException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some exception occured", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        passId = txtPassId.getText();
        if(passId.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Enter PassId first!","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String verifyPassId = "X" + hodCollege.substring(hodCollege.length() - 1) + hodBranch.substring(0, 2);
        System.out.println(verifyPassId);
        if (hodCollege.equals("LNCT")) {
            if (passId.substring(0, 4).equals("XM" + hodBranch.substring(0, 2)) == false) {
                JOptionPane.showMessageDialog(null, "Pass has not generated from this department!", "Oops!", JOptionPane.ERROR_MESSAGE);
                txtPassId.requestFocus();
                return;
            }

        } else if (passId.substring(0, 4).equals(verifyPassId) == false) {
            JOptionPane.showMessageDialog(null, "Pass has not generated from this department!", "Oops!", JOptionPane.ERROR_MESSAGE);
            txtPassId.requestFocus();
            return;
        }
        try {
            if (passId.charAt(1) == 'M') {
                sPojo = CollegeDAO.searchLnctPass(passId);
            } else if (passId.charAt(1) == 'S') {
                sPojo = CollegeDAO.searchLnctsPass(passId);
            } else if (passId.charAt(1) == 'E') {
                sPojo = CollegeDAO.searchLnctePass(passId);
            }

            if (sPojo != null) {
                lblName.setText("Name: " + sPojo.getStudName());
                lblEnroll.setText("Enroll: " + sPojo.getEnroll());
                lblSem.setText("Sem: " + sPojo.getSem());
                lblEmail.setText("Email: " + sPojo.getStudEmail());
                lblContact.setText("Contact: " + sPojo.getStudMob());

            } else {
                JOptionPane.showMessageDialog(null, "Pass id is invalid!", "Oops!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAllowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllowActionPerformed
        Date d = new Date();
        String s = String.valueOf(d);
        String str[] = s.split(" ");
        currentTime = str[3] + " " + str[4];
        currentDate = str[1] + " " + str[2] + " " + str[5];
        sPojo.setPassId(passId);
        sPojo.setStudBranch(hodBranch);
        sPojo.setStudCollege(hodCollege);
        sPojo.setStudTime(currentTime);
        sPojo.setStudDated(passDate);
        sPojo.setStudUsed("N");
        if (email == null) {
            email = sPojo.getStudEmail();
        }
        try {
            if (remPassCount < 1) {
                JOptionPane.showMessageDialog(null, "Sorry! no passes left", "Oops!", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (StudentDAO.generatePass(sPojo)) {
                if (isInternetAvailable() == false) {
                    JOptionPane.showMessageDialog(null, "Pass generated successfully!\nInternet not available!", "Oops!", JOptionPane.INFORMATION_MESSAGE,icon3);
                    printPass(sPojo);
                } else {
                    if (isMailSent()) {
                        int ans = JOptionPane.showConfirmDialog(null, "Pass generated successfully!\nMail sent to: " + email + "\nDo you want to print your pass also?", "Success!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,icon);
                        if (ans == JOptionPane.YES_OPTION) {
                            printPass(sPojo);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Pass generated successfully!\nMail not sent!\nYou must print your pass", "Oops!", JOptionPane.INFORMATION_MESSAGE,icon3);
                        printPass(sPojo);
                    }
                }
                remPassCount--;
                usedPassCount++;
                lblPass.setText("PASSES LEFT: " + remPassCount);
                lblPass1.setText("PASSES LEFT: " + remPassCount);
                clearAllLabels();
                txtPassId.setText("");
                return;
            }
//            if(StudentDAO.generatePass(sPojo))
//            {
//                JOptionPane.showMessageDialog(null,"Used Time Updated Successfully!","Success!",JOptionPane.INFORMATION_MESSAGE);
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(null,"Used Time could not be Updated !","Failure!",JOptionPane.ERROR_MESSAGE);
//            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "Exception", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnAllowActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        String  enroll=txtEnroll1.getText().trim();
        if(enroll.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter enrollment", "Oops!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int count=0;
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        Object[] obj = new Object[5];
        String studName=null;
        System.out.println(studList);
        for (StudentPojo studPojo : studList) {
            System.out.println(studPojo.getEnroll()+" "+enroll);
            if((studPojo.getEnroll()).equals(enroll))
            {
                count++;
                studName= studPojo.getStudName();
                obj[0] = count;
                obj[1] = studPojo.getSem();
                obj[2] = studPojo.getStudDated();
                obj[3] = studPojo.getStudTime();
                obj[4]=  studPojo.getStudUsed();
                model.addRow(obj);
            }
        }
        System.out.println(count+" "+studName);
        if(count!=0)
        {
            txtName1.setText(studName);
            txtName1.setEditable(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No passes allotted for this student yet","Oops!",JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_btnSearch1ActionPerformed

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
            java.util.logging.Logger.getLogger(GatePassHod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GatePassHod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GatePassHod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GatePassHod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GatePassHod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllow;
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbSemester;
    private javax.swing.JLabel lblCollege;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnroll;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPass1;
    private javax.swing.JLabel lblSem;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnroll1;
    private javax.swing.JTextField txtEnrollment;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtPassId;
    private javax.swing.JTextArea txtReason;
    // End of variables declaration//GEN-END:variables

    public void updatePasses() {
        PassPojo passPojo = new PassPojo();
        passPojo.setRem_pass(remPassCount);
        passPojo.setUsed_pass(usedPassCount);
        passPojo.setAuthority_id(hodAuthorityId);
        passPojo.setDate_pass(passDate);
        passPojo.setTime_pass(passTime);
        passPojo.setMessage("");
        try {
            if (PassDAO.updatePass(passPojo)) {
//                JOptionPane.showMessageDialog(null, "Pass Count Updated Successfully!", "Success!", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);

        }

    }

    public static void getPasses(HodPojo hPojo) {
        try {
            PassPojo passPojo = PassDAO.getPass(hPojo);
            remPassCount = passPojo.getRem_pass();
            usedPassCount = passPojo.getUsed_pass();
            passDate = passPojo.getDate_pass();
            passTime = passPojo.getTime_pass();
            adminMsg = passPojo.getMessage();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);

        }

    }

    private int validateInput() {
        name = txtName.getText().trim();
        enroll = txtEnrollment.getText();
        sem = String.valueOf(jcbSemester.getSelectedItem());
        email = txtEmail.getText().trim();
        reason = txtReason.getText();
        contact = txtContact.getText();
        Date now = new Date();
        String s = String.valueOf(now);
        String[] str = s.split(" ");
        passDate = str[1] + " " + str[2] + ", " + str[5];
        passTime = str[3] + " " + str[4];

        if (name.isEmpty() || enroll.isEmpty() || sem.isEmpty() || reason.isEmpty() || email.isEmpty() || contact.isEmpty()) {
            return 0;
        }
        if (email.contains("@gmail.com") == false) {
            return -1;
        }
        if (contact.length() != 10) {
            return -2;
        }
        return 1;
    }

    private String generatePassId() {
        int count = 0;
        passCount++;
        try {
            count = StudentDAO.getTotalPassCount();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);

        }
        
        return "X" + hodCollege.substring(hodCollege.length() - 1) + enroll.substring(4, 6) + count+passCount;

    }

    private void clearAll() {
        txtName.setText("");
        txtEnrollment.setText("");
        txtEmail.setText("");
        txtReason.setText("");
        txtContact.setText("");

    }

    private void clearAllLabels() {
        lblName.setText("");
        lblEnroll.setText("");
        lblEmail.setText("");
        lblSem.setText("");
        lblContact.setText("");

    }

    private boolean isInternetAvailable() {
        try {
            String host = "redhat.com";
            int port = 80;
            int timeOutInMilliSec = 5000;// 5 Seconds
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(host, port), timeOutInMilliSec);
            System.out.println("Internet is Available");
            return true;
        } catch (Exception ex) {
            System.out.println("No Connectivity");
            JOptionPane.showMessageDialog(null, "Oops no internet found!", "ERROR!", JOptionPane.WARNING_MESSAGE,icon3);
            return false;
        }
    }

    private boolean isMailSent() {
        String sub = "XPRESSPASS";
        String to;
        String msg = "Your PassId is: " + passId + "\nDate: " + passDate + " Time: " + passTime + "\nIssued By: " + hodBranch + ", " + hodCollege + "\n\n©xpresspass";
        if (isHodEnd) {
            to = email;
        } else {
            to = sPojo.getStudEmail();
        }

        String from = "xpress0pass@gmail.com";
        String password = "Xpresspass_19";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        //get Session   
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });
        //compose message    
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(sub);
            message.setText(msg);
            //send message  
            Transport.send(message);
            //JOptionPane.showMessageDialog(null, "Mail sent!\nWe will contact you asap!☺", "Support@competition_pro", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("message sent successfully");
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occoured while contacting\nTry again later.!", "Support@XPRESSPASS", JOptionPane.ERROR_MESSAGE,icon3);
            return false;
        }
    }

    void printPass(StudentPojo sPojo) {
        new PrintPass(sPojo).setVisible(true);
//        this.dispose();

    }
    
    private void getAllStudentsList()
    {
        try{
            studList=StudentDAO.getAllStudents(hodPojo);
            
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Some error occured while connecting to Database","ERROR!",JOptionPane.ERROR_MESSAGE);
        }
    }

    private String getEnrollFormat() {
        if (hodCollege.equals("LNCT")) {
            return "0103" + hodBranch.substring(0, 2);
        } else if (hodCollege.equals("LNCT&S")) {
            return "0157" + hodBranch.substring(0, 2);
        }
        return "0176" + hodBranch.substring(0, 2);
    }

}
