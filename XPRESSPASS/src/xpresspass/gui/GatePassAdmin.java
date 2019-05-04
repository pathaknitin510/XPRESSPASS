/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpresspass.gui;

import java.awt.event.ItemEvent;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import xpresspass.dao.HodDAO;
import xpresspass.dao.PassDAO;
import xpresspass.dao.StudentDAO;
import xpresspass.pojo.HodPojo;
import xpresspass.pojo.PassPojo;
import xpresspass.pojo.StudentPojo;

/**
 *
 * @author Rahul
 */
public class GatePassAdmin extends javax.swing.JFrame {

    private String name;
    private String college;
    private String branch;
    private String sem;
    private String hodCollege;
    private String hodBranch;
    private String hodMail;
    private String hodPwd;
    private String message;
    private String adminMsg;
    private String date;
    private int passAllowed;
    private ArrayList<StudentPojo> studList;
    private ArrayList<HodPojo> hodList;
    private ArrayList<String> clgList = new ArrayList();
    private ArrayList<String> branchList = new ArrayList();
    private ArrayList<String> semList = new ArrayList();
    private ArrayList<String> hodClgList = new ArrayList<>();
    private ArrayList<String> hodBranchList = new ArrayList<>();
    private static int count = 0, flag = 0, flagPass = 0, countPass = 0, countCon = 0, countRem = 0, flagRemove = 0, countDt = 0;
    ImageIcon icon, icon2, icon3;

    public GatePassAdmin() {
        initComponents();
        super.setLocationRelativeTo(null);

        setTitle("XPRESSPASS AuthorityEnd ");
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/ticket16.png"));
        icon = new ImageIcon(getClass().getResource("/images/gmailgif1.gif"));
        icon2 = new ImageIcon(getClass().getResource("/images/right1.gif"));
        icon3 = new ImageIcon(getClass().getResource("/images/dinogif1.gif"));
        setIconImage(icon1.getImage());
        setVisible(true);
        super.setResizable(false);
        getStudentPassList();
        addAllStudentLists();
        getAllHodList();
        addAllHodList();
    }

    public GatePassAdmin(String name) {
        this();
        this.name = name;

        btnPrint.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAll = new javax.swing.JTable();
        btnViewAll = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        dcDate = new datechooser.beans.DateChooserCombo();
        jLabel32 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbSemester = new javax.swing.JComboBox<>();
        jcbBranch = new javax.swing.JComboBox<>();
        jcbCollege = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbPassCollege = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbPassBranch = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jcbPass = new javax.swing.JComboBox<>();
        btnPassCountChange = new javax.swing.JButton();
        txtMsg = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcbCollegeCon = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jcbBranchCon = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        btnSend = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jcbCollegeRem = new javax.swing.JComboBox<>();
        jcbBranchRem = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableAllHod = new javax.swing.JTable();
        btnViewAllHod = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Email id");

        jPanel1.setBackground(new java.awt.Color(255, 248, 253));

        jTabbedPane1.setBackground(new java.awt.Color(255, 248, 253));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 248, 253));

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 248, 253));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XPRESSPASS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jTableAll.setBackground(new java.awt.Color(255, 248, 253));
        jTableAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Enrollment", "College", "Issued Time", "Out Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAll);

        btnViewAll.setBackground(new java.awt.Color(255, 248, 253));
        btnViewAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye20.png"))); // NOI18N
        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(255, 248, 253));
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Date");

        dcDate.setFormat(2);
        dcDate.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel32.setText("©xpresspass");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel20)
                .addGap(46, 46, 46)
                .addComponent(dcDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(btnViewAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel32)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(dcDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPrint)
                    .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addContainerGap())
        );

        jTabbedPane2.addTab("All", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 248, 253));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XPRESSPASS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("College");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Department");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Semester");

        jcbSemester.setBackground(new java.awt.Color(255, 248, 253));
        jcbSemester.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));

        jcbBranch.setBackground(new java.awt.Color(255, 248, 253));
        jcbBranch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "CSE", "CE", "CA", "EC", "EE", "EX", "IT", "ME", "MCA", "English", "Humanities", "Mathematics" }));

        jcbCollege.setBackground(new java.awt.Color(255, 248, 253));
        jcbCollege.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbCollege.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "LNCT", "LNCT&S", "LNCT&E", " " }));
        jcbCollege.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCollegeItemStateChanged(evt);
            }
        });
        jcbCollege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCollegeActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Enrollment", "Date", "Time", "Reason"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnView.setBackground(new java.awt.Color(255, 248, 253));
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye20.png"))); // NOI18N
        btnView.setText("View ");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel33.setText("©xpresspass");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbBranch, 0, 146, Short.MAX_VALUE)
                    .addComponent(jcbCollege, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(196, 196, 196))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbCollege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Department", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View ", new javax.swing.ImageIcon(getClass().getResource("/images/eye20.png")), jPanel2); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 248, 253));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XPRESSPASS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("**You can increase/decrease the number of passes.");

        jcbPassCollege.setBackground(new java.awt.Color(255, 248, 253));
        jcbPassCollege.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbPassCollege.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "LNCT", "LNCT&S", "LNCT&E", "LNCTU", "JNCT" }));
        jcbPassCollege.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPassCollegeItemStateChanged(evt);
            }
        });
        jcbPassCollege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPassCollegeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("College");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Department");

        jcbPassBranch.setBackground(new java.awt.Color(255, 248, 253));
        jcbPassBranch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbPassBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "CSE", "CE", "CA", "EC", "EE", "EX", "IT", "ME", "MCA", "English", "Humanities", "Mathematics" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Pass Allowed");

        jcbPass.setBackground(new java.awt.Color(255, 248, 253));
        jcbPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbPass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20" }));

        btnPassCountChange.setBackground(new java.awt.Color(77, 142, 234));
        btnPassCountChange.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPassCountChange.setForeground(new java.awt.Color(255, 255, 255));
        btnPassCountChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right.png"))); // NOI18N
        btnPassCountChange.setText("Done");
        btnPassCountChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassCountChangeActionPerformed(evt);
            }
        });

        txtMsg.setBackground(new java.awt.Color(255, 248, 253));
        txtMsg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMsg.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Message"));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel34.setText("©xpresspass");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jcbPassCollege, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jcbPassBranch, 0, 207, Short.MAX_VALUE)
                                            .addComponent(jcbPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnPassCountChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 145, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel34)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(95, 95, 95)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbPassCollege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcbPassBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcbPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnPassCountChange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addContainerGap())
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/images/brail.png")), jPanel3); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 248, 253));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XPRESSPASS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Communicate with Head of Department");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconfinder_Gmail_3721669 (1).png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("College");

        jcbCollegeCon.setBackground(new java.awt.Color(255, 248, 253));
        jcbCollegeCon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbCollegeCon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LNCT", "LNCT&S", "LNCT&E", "LNCTU", "JNCT" }));
        jcbCollegeCon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCollegeConItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Department");

        jcbBranchCon.setBackground(new java.awt.Color(255, 248, 253));
        jcbBranchCon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbBranchCon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.S.E.", "C.E.", "C.A.", "E.C.", "E.E.", "E.X.", "I.T.", "M.E.", "M.C.A.", "English", "Humanities", "Mathematics" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Password");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Email id");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPwd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSend.setBackground(new java.awt.Color(77, 142, 234));
        btnSend.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconfinder_Sed-09_2236081 (4).png"))); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("**Email & Password should be of Gmail");

        txtMessage.setBackground(new java.awt.Color(255, 248, 253));
        txtMessage.setColumns(20);
        txtMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMessage.setRows(5);
        txtMessage.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Message", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jScrollPane3.setViewportView(txtMessage);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel35.setText("©xpresspass");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel14))
                                            .addGap(36, 36, 36)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                                .addComponent(txtPwd)))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addGap(35, 35, 35))
                                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jcbBranchCon, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jcbCollegeCon, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3))))
                        .addGap(0, 178, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel35)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(101, 101, 101)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCollegeCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbBranchCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel35)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Connect", new javax.swing.ImageIcon(getClass().getResource("/images/g+.png")), jPanel6); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 248, 253));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XPRESSPASS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("College");

        jcbCollegeRem.setBackground(new java.awt.Color(255, 248, 253));
        jcbCollegeRem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbCollegeRem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LNCT", "LNCT&S", "LNCT&E", "LNCTU", "JNCT" }));
        jcbCollegeRem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCollegeRemItemStateChanged(evt);
            }
        });

        jcbBranchRem.setBackground(new java.awt.Color(255, 248, 253));
        jcbBranchRem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbBranchRem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "CE", "CA", "EC", "EE", "EX", "IT", "ME", "MCA", "English", "Humanities", "Mathematics" }));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Department");

        btnRemove.setBackground(new java.awt.Color(77, 142, 234));
        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Remove H.O.D. from XPRESSPASS");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel36.setText("©xpresspass");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(35, 35, 35))
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jcbBranchRem, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jcbCollegeRem, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel19)))
                        .addGap(0, 170, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel36)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(208, 208, 208)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCollegeRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbBranchRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(37, 37, 37)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Remove", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 248, 253));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XPRESSPASS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jTableAllHod.setBackground(new java.awt.Color(255, 248, 253));
        jTableAllHod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Branch", "College"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableAllHod);

        btnViewAllHod.setBackground(new java.awt.Color(255, 248, 253));
        btnViewAllHod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye20.png"))); // NOI18N
        btnViewAllHod.setText("View");
        btnViewAllHod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllHodActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel37.setText("©xpresspass");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(btnViewAllHod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewAllHod, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jTabbedPane1.addTab("All HOD's", jPanel8);

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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        btnPrint.setEnabled(true);

        DefaultTableModel model = (DefaultTableModel) jTableAll.getModel();
        model.setRowCount(0);
        if (studList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No passes allotted yet!", "Oops!", JOptionPane.INFORMATION_MESSAGE);
            return;

        }

//        Date d=new Date();
//        String str[]=(String.valueOf(d)).split(" ");
//        String dt=str[1]+" "+str[2]+", "+str[5];
        String[] chosedDate = (dcDate.getText()).split("-");
        for (String s : chosedDate) {
            System.out.println(s);
        }
 
        Object obj[] = new Object[5];
        for (StudentPojo sPojo : studList) {
            String issDate[] = (sPojo.getStudDated()).split(" ");
            System.out.println(issDate[0] + " " + (chosedDate[1].substring(0, chosedDate[1].length())) + " " + (issDate[1].substring(0, issDate[1].length() - 1)) + " " + (chosedDate[0]) + " "
                    + (issDate[2]) + " " + (chosedDate[2]));
            if (issDate[0].equals(chosedDate[1].substring(0, chosedDate[1].length())) && (issDate[1].substring(0, issDate[1].length()-1).equals(chosedDate[0]))
                    && (issDate[2].equals(chosedDate[2]))) {
                obj[0] = sPojo.getStudName();
                obj[1] = sPojo.getEnroll();
                obj[2] = sPojo.getStudCollege();
                obj[3] = sPojo.getStudTime();
                obj[4] = sPojo.getStudUsed();
                model.addRow(obj);
                countDt++;
            }
        }
        //btnViewAll.setEnabled(false);
        if (countDt == 0) {
            JOptionPane.showMessageDialog(null, "No Pass allotted on this date!", "oops!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            countDt = 0;
        }

    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        MessageFormat header = new MessageFormat("Student's Pass List");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            jTableAll.print(javax.swing.JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (java.awt.print.PrinterException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some exception occured", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        college = String.valueOf(jcbCollege.getSelectedItem());
        branch = String.valueOf(jcbBranch.getSelectedItem());
        sem = String.valueOf(jcbSemester.getSelectedItem());
        date = dcDate.getText();
        if (college.equals("All") && branch.equals("All") && sem.equals("All")) {
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

            if (studList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No passes allotted yet", "Oops!", JOptionPane.INFORMATION_MESSAGE);
                return;

            }
            Object obj[] = new Object[5];
            for (StudentPojo sPojo : studList) {
                obj[0] = sPojo.getStudName();
                obj[1] = sPojo.getEnroll();
                obj[2] = sPojo.getStudDated();
                obj[3] = sPojo.getStudTime();
                obj[4] = sPojo.getReason();

                model.addRow(obj);
            }
            // btnView.setEnabled(false);
        }

        StudentPojo sPojo = new StudentPojo();

        if (college.equals("All") == false && branch.equals("All") == false && sem.equals("All") == false) {
            flag = 1;
            sPojo.setStudCollege(college);
            sPojo.setStudBranch(branch);
            sPojo.setSem(sem);
            printStudentPassTable(sPojo);
        } else if (college.equals("All") == false && branch.equals("All") == false && sem.equals("All") == true) {
            flag = 2;
            sPojo.setStudCollege(college);
            sPojo.setStudBranch(branch);
            printStudentPassTable(sPojo);
        } else if (college.equals("All") == true && branch.equals("All") == false && sem.equals("All") == false) {
            flag = 3;
            sPojo.setStudBranch(branch);
            sPojo.setSem(sem);
            printStudentPassTable(sPojo);
        } else if (college.equals("All") == false && branch.equals("All") == true && sem.equals("All") == false) {
            flag = 4;
            sPojo.setStudCollege(college);

            sPojo.setSem(sem);
            printStudentPassTable(sPojo);
        } else if (college.equals("All") == false && branch.equals("All") == true && sem.equals("All") == true) {
            flag = 5;
            sPojo.setStudCollege(college);

            printStudentPassTable(sPojo);
        } else if (college.equals("All") == true && branch.equals("All") == false && sem.equals("All") == true) {
            flag = 6;

            sPojo.setStudBranch(branch);

            printStudentPassTable(sPojo);
        } else if (college.equals("All") == true && branch.equals("All") == true && sem.equals("All") == false) {
            flag = 7;
            sPojo.setStudCollege(college);
            sPojo.setStudBranch(branch);
            sPojo.setSem(sem);
            printStudentPassTable(sPojo);
        }

    }//GEN-LAST:event_btnViewActionPerformed

    private void jcbCollegeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCollegeItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            return;
        }
        // jcbCollege.removeAllItems();
        try {
            college = String.valueOf(jcbCollege.getSelectedItem());
            branch = String.valueOf(jcbBranch.getSelectedItem());
            sem = String.valueOf(jcbSemester.getSelectedItem());
            System.out.println(college + " " + branch + " " + sem);
            if (college.equals("All")) {
                count++;
                if (count > 1) {
                    jcbBranch.removeAllItems();
                    jcbSemester.removeAllItems();
                    //addAllLists();
                    System.out.println("svgbhsryjtesuk");
                    for (String s : branchList) {
                        jcbBranch.addItem(s);
                    }

                    for (String s : semList) {
                        jcbSemester.addItem(s);
                    }
                }

            } else {
                ArrayList<String> branchList = StudentDAO.getBranchByCollege(college);
                jcbBranch.removeAllItems();
                jcbSemester.removeAllItems();
                branchList.add("All");
                for (String s : branchList) {

                    jcbBranch.addItem(s);
                }
                ArrayList<String> semList = StudentDAO.getSemByCollege(college);
                semList.add("All");
                for (String s : semList) {

                    jcbSemester.addItem(s);
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jcbCollegeItemStateChanged

    private void jcbCollegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCollegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCollegeActionPerformed

    private void btnPassCountChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassCountChangeActionPerformed
        college = String.valueOf(jcbPassCollege.getSelectedItem());
        branch = String.valueOf(jcbPassBranch.getSelectedItem());
        passAllowed = Integer.valueOf((String) jcbPass.getSelectedItem());
        adminMsg = txtMsg.getText();
        PassPojo passPojo = new PassPojo();

        if (college.equals("All") == false && branch.equals("All") == false) {
            flagPass = 1;
            passPojo.setCollege_pass(college);
            passPojo.setBranch_pass(branch);
            updatePass(passPojo, passAllowed);
        } else if (college.equals("All") == true && branch.equals("All") == false) {
            flagPass = 2;
            passPojo.setBranch_pass(branch);
            updatePass(passPojo, passAllowed);
        } else if (college.equals("All") == false && branch.equals("All") == true) {
            flagPass = 3;
            passPojo.setCollege_pass(college);
            updatePass(passPojo, passAllowed);
        } else {
            flagPass = 4;
            updatePass(passPojo, passAllowed);
        }

    }//GEN-LAST:event_btnPassCountChangeActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        college = String.valueOf(jcbCollegeRem.getSelectedItem());
        branch = String.valueOf(jcbBranchRem.getSelectedItem());
        HodPojo hPojo = new HodPojo();

        int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want to Remove" + "\nH.O.D. of " + college + ", " + branch, "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (ans == JOptionPane.YES_OPTION) {
            if (college.equals("All") == false && branch.equals("All") == false) {
                flagRemove = 1;
                hPojo.setHodCollege(college);
                hPojo.setHodBranch(branch);
                removeHod(hPojo);
            } else if (college.equals("All") == true && branch.equals("All") == false) {
                flagRemove = 2;
                hPojo.setHodBranch(branch);
                removeHod(hPojo);
            } else if (college.equals("All") == false && branch.equals("All") == true) {
                flagRemove = 3;
                hPojo.setHodCollege(college);
                removeHod(hPojo);
            } else {
                flagRemove = 4;
                removeHod(hPojo);
            }
        }


    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jcbPassCollegeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPassCollegeItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            return;
        }
        try {
            hodCollege = String.valueOf(jcbPassCollege.getSelectedItem());
            hodBranch = String.valueOf(jcbPassBranch.getSelectedItem());

            System.out.println(hodCollege + " " + hodBranch);
            if (hodCollege.equals("All")) {
                countPass++;
                if (countPass > 1) {
                    jcbPassBranch.removeAllItems();
                    //addAllLists();
                    System.out.println("svgbhsryjtesuk");
                    for (String s : hodBranchList) {
                        jcbPassBranch.addItem(s);
                    }

                }

            } else {
                ArrayList<String> branchList = HodDAO.getBranchByCollege(hodCollege);
                jcbPassBranch.removeAllItems();
                branchList.add("All");
                for (String s : branchList) {

                    jcbPassBranch.addItem(s);
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jcbPassCollegeItemStateChanged

    private void jcbPassCollegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPassCollegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPassCollegeActionPerformed

    private void jcbCollegeConItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCollegeConItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            return;
        }
        try {
            hodCollege = String.valueOf(jcbCollegeCon.getSelectedItem());
            hodBranch = String.valueOf(jcbBranchCon.getSelectedItem());

            System.out.println(hodCollege + " " + hodBranch);
            if (hodCollege.equals("All")) {
                countCon++;
                if (countCon > 1) {
                    jcbBranchCon.removeAllItems();
                    //addAllLists();
                    System.out.println("svgbhsryjtesuk");
                    for (String s : hodBranchList) {
                        jcbBranchCon.addItem(s);
                    }

                }

            } else {
                ArrayList<String> branchList = HodDAO.getBranchByCollege(hodCollege);
                jcbBranchCon.removeAllItems();
                branchList.add("All");
                for (String s : branchList) {

                    jcbBranchCon.addItem(s);
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jcbCollegeConItemStateChanged

    private void jcbCollegeRemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCollegeRemItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            return;
        }
        try {
            hodCollege = String.valueOf(jcbCollegeRem.getSelectedItem());
            hodBranch = String.valueOf(jcbBranchRem.getSelectedItem());

            System.out.println(hodCollege + " " + hodBranch);
            if (hodCollege.equals("All")) {
                countRem++;
                if (countRem > 1) {
                    jcbBranchRem.removeAllItems();
                    //addAllLists();
                    System.out.println("svgbhsryjtesuk");
                    for (String s : hodBranchList) {
                        jcbBranchRem.addItem(s);
                    }

                }

            } else {
                ArrayList<String> branchList = HodDAO.getBranchByCollege(hodCollege);
                jcbBranchRem.removeAllItems();
                branchList.add("All");
                for (String s : branchList) {

                    jcbBranchRem.addItem(s);
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jcbCollegeRemItemStateChanged

    private void btnViewAllHodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllHodActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableAllHod.getModel();

        if (hodList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No H.O.D. exists!", "Oops!", JOptionPane.INFORMATION_MESSAGE);
            return;

        }
        Object obj[] = new Object[4];
        for (HodPojo hPojo : hodList) {
            obj[0] = hPojo.getHodName();
            obj[1] = hPojo.getHodEmail();
            obj[2] = hPojo.getHodBranch();
            obj[3] = hPojo.getHodCollege();

            model.addRow(obj);
        }
        btnViewAllHod.setEnabled(false);
    }//GEN-LAST:event_btnViewAllHodActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        hodCollege = String.valueOf(jcbCollegeCon.getSelectedItem());
        hodBranch = String.valueOf(jcbBranchCon.getSelectedItem());
        for (HodPojo hPojo : hodList) {
            if ((hPojo.getHodCollege()).equals(hodCollege) && (hPojo.getHodBranch()).equals(hodBranch)) {
                hodMail = hPojo.getHodEmail();
                break;
            }
        }
        if (hodMail != null) {
            if (isInternetAvailable()) {
                if (isMailSent(hodMail)) {
                    JOptionPane.showMessageDialog(null, "Mail sent to: " + hodMail, "Success!", JOptionPane.INFORMATION_MESSAGE, icon);

                } else {
                    JOptionPane.showMessageDialog(null, "Mail not sent", "ERROR!", JOptionPane.ERROR_MESSAGE,icon3);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Internet is not available!\nSorry, Mail can't be send!", "Oops!", JOptionPane.ERROR_MESSAGE,icon3);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Such H.O.D. exist", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSendActionPerformed

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
            java.util.logging.Logger.getLogger(GatePassAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GatePassAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GatePassAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GatePassAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GatePassAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPassCountChange;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JButton btnViewAllHod;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserCombo dcDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableAll;
    private javax.swing.JTable jTableAllHod;
    private javax.swing.JComboBox<String> jcbBranch;
    private javax.swing.JComboBox<String> jcbBranchCon;
    private javax.swing.JComboBox<String> jcbBranchRem;
    private javax.swing.JComboBox<String> jcbCollege;
    private javax.swing.JComboBox<String> jcbCollegeCon;
    private javax.swing.JComboBox<String> jcbCollegeRem;
    private javax.swing.JComboBox<String> jcbPass;
    private javax.swing.JComboBox<String> jcbPassBranch;
    private javax.swing.JComboBox<String> jcbPassCollege;
    private javax.swing.JComboBox<String> jcbSemester;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtMsg;
    private javax.swing.JPasswordField txtPwd;
    // End of variables declaration//GEN-END:variables

    private void getStudentPassList() {
        try {

            clearAllItems();
            clgList.add("All");
            branchList.add("All");
            semList.add("All");
            studList = StudentDAO.getAll();
            System.out.println(studList);
            for (StudentPojo sPojo : studList) {
                if (clgList.contains(sPojo.getStudCollege()) == false) {
                    clgList.add(sPojo.getStudCollege());
                }
                if (branchList.contains(sPojo.getStudBranch()) == false) {
                    branchList.add(sPojo.getStudBranch());
                }
                if (semList.contains(sPojo.getSem()) == false) {
                    semList.add(sPojo.getSem());
                }
            }

        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addAllStudentLists() {

        for (String s : clgList) {
            jcbCollege.addItem(s);
        }
        for (String s : branchList) {
            jcbBranch.addItem(s);
        }
        for (String s : semList) {
            jcbSemester.addItem(s);
        }
    }

    private void getAllHodList() {
        try {

            //clearAllItems();
            hodClgList.add("All");
            hodBranchList.add("All");

            hodList = HodDAO.getAll();
            System.out.println(hodList);
            for (HodPojo hPojo : hodList) {
                if (hodClgList.contains(hPojo.getHodCollege()) == false) {
                    hodClgList.add(hPojo.getHodCollege());
                }
                if (hodBranchList.contains(hPojo.getHodBranch()) == false) {
                    hodBranchList.add(hPojo.getHodBranch());
                }

            }

        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addAllHodList() {
        addHodListToPass();
        addHodListToConnect();
        addHodListToRemove();
    }

    private void clearAllItems() {
        jcbCollege.removeAllItems();
        jcbBranch.removeAllItems();
        jcbSemester.removeAllItems();
    }

    private void printStudentPassTable(StudentPojo studPojo) {
        System.out.println(studPojo);
        ArrayList<StudentPojo> studList = null;
        try {
            if (flag == 1) {
                studList = StudentDAO.getByCBS(studPojo);
            } else if (flag == 2) {
                studList = StudentDAO.getByCB(studPojo);
            } else if (flag == 3) {
                studList = StudentDAO.getByBS(studPojo);
            } else if (flag == 4) {
                studList = StudentDAO.getByCS(studPojo);
            } else if (flag == 5) {
                studList = StudentDAO.getByC(studPojo);
            } else if (flag == 6) {
                studList = StudentDAO.getByB(studPojo);
            } else if (flag == 7) {
                studList = StudentDAO.getByS(studPojo);
            }

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            System.out.println(studList);
            if (studList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No passes allotted yet", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                return;

            }
            Object obj[] = new Object[5];
            for (StudentPojo sPojo : studList) {
                obj[0] = sPojo.getStudName();
                obj[1] = sPojo.getEnroll();
                obj[2] = sPojo.getStudDated();
                obj[3] = sPojo.getStudTime();
                obj[4] = sPojo.getReason();

                model.addRow(obj);
            }
            //btnView.setEnabled(false);

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updatePass(PassPojo passPojo, int passAllowed) {
        try {
            if (flagPass == 1) {
                if (PassDAO.changePassByCB(passPojo, passAllowed, adminMsg)) {
                    JOptionPane.showMessageDialog(null, "Number of passes for: " + passPojo.getCollege_pass() + " " + passPojo.getBranch_pass()
                            + " has been successfully updated!", "Success!", JOptionPane.INFORMATION_MESSAGE,icon2);
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry! Number of passes could not be updated", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }

            } else if (flagPass == 2) {
                if (PassDAO.changePassByB(passPojo, passAllowed, adminMsg)) {
                    JOptionPane.showMessageDialog(null, "Number of passes for: " + " " + passPojo.getBranch_pass()
                            + " has been successfully updated!", "Success!", JOptionPane.INFORMATION_MESSAGE,icon2);
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry! Number of passes could not be updated! ", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }

            } else if (flagPass == 3) {
                if (PassDAO.changePassByC(passPojo, passAllowed, adminMsg)) {
                    JOptionPane.showMessageDialog(null, "Number of passes for: " + passPojo.getCollege_pass() + " "
                            + "has been successfully updated!", "Success", JOptionPane.INFORMATION_MESSAGE,icon2);
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry! Number of passes could not be updated! ", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (PassDAO.changePassCount(passAllowed, adminMsg)) {
                    JOptionPane.showMessageDialog(null, "Number of passes has been successfully updated!", "Success!", JOptionPane.INFORMATION_MESSAGE,icon2);
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry! Number of passes could not be updated! ", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void addHodListToPass() {
        jcbPassCollege.removeAllItems();
        jcbPassBranch.removeAllItems();
        System.out.println(hodClgList);
        System.out.println(hodBranchList);
        for (String s : hodClgList) {
            jcbPassCollege.addItem(s);
        }
        for (String s : hodBranchList) {
            jcbPassBranch.addItem(s);
        }

    }

    private void addHodListToConnect() {
        jcbCollegeCon.removeAllItems();
        jcbBranchCon.removeAllItems();
        for (String s : hodClgList) {
            jcbCollegeCon.addItem(s);
        }
        for (String s : hodBranchList) {
            jcbBranchCon.addItem(s);
        }
    }

    private void addHodListToRemove() {
        jcbCollegeRem.removeAllItems();
        jcbBranchRem.removeAllItems();
        for (String s : hodClgList) {
            jcbCollegeRem.addItem(s);
        }
        for (String s : hodBranchList) {
            jcbBranchRem.addItem(s);
        }

    }

    private void removeHod(HodPojo hPojo) {
        try {
            if (flagRemove == 1) {
                if (HodDAO.removeHodByCB(hPojo)) {
                    JOptionPane.showMessageDialog(null, "H.O.D. of " + college + " " + branch + " " + "has successfully removed", "Success!", JOptionPane.INFORMATION_MESSAGE,icon2);
                } else {
                    JOptionPane.showMessageDialog(null, "H.O.D. of " + college + " " + branch + " " + "couldn't be removed", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                }

            } else if (flagRemove == 2) {
                if (HodDAO.removeHodByC(hPojo)) {
                    JOptionPane.showMessageDialog(null, "H.O.D. of " + college + " has successfully been removed", "Success!", JOptionPane.INFORMATION_MESSAGE,icon2);
                } else {
                    JOptionPane.showMessageDialog(null, "H.O.D. of " + college + " couldn't be removed", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                }

            } else if (flagRemove == 3) {
                if (HodDAO.removeHodByB(hPojo)) {
                    JOptionPane.showMessageDialog(null, "H.O.D. of " + branch + " has successfully been removed", "Success!", JOptionPane.INFORMATION_MESSAGE,icon2);
                } else {
                    JOptionPane.showMessageDialog(null, "H.O.D. of " + branch + "couldn't be removed", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                }

            } else if (flagRemove == 4) {
                if (HodDAO.removeAllHod()) {
                    JOptionPane.showMessageDialog(null, "All H.O.D.'s " + "were successfully removed", "Success!", JOptionPane.INFORMATION_MESSAGE,icon2);
                } else {
                    JOptionPane.showMessageDialog(null, "No H.O.D. exists in the table", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some error occured while connecting to DataBase", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }

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
            JOptionPane.showMessageDialog(null, "Oops no internet found", "Error!", JOptionPane.WARNING_MESSAGE,icon3);
            return false;
        }
    }

    private boolean isMailSent(String hodMail) {
        String sub = "Message from admin@XPRESSPASS";

        String msg = txtMessage.getText();
        String to = hodMail;
        String from = txtEmail.getText().trim();
        String password = String.valueOf(txtPwd.getPassword());
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
            JOptionPane.showMessageDialog(null, "Error occoured while contacting \nTry again later!", "Support@XPRESSPASS", JOptionPane.ERROR_MESSAGE,icon3);
            return false;
        }
    }

}
