/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_information_system;
import java.util.regex.*;
import java.awt.Color;
import java.awt.Font;

import java.text.SimpleDateFormat;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author INKILU
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form admin3
     */
    public Admin() {
        initComponents();
        jPanel6.setBackground(new Color(0,0,0,80));
         d.setBackground(new Color(0,0,0,80));
        f.setBackground(new Color(0,0,0,80));
        setAttendaceTableData();
        setTerm1Marks();
        setTerm2Marks();
        setTimeTableTableData();
        jTable3.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        jTable3.getTableHeader().setOpaque(false);
        jTable3.setRowHeight(25);
        jTable2.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.setRowHeight(25);
        jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.setRowHeight(25);
    }

    /**
     CUSTOM CODES
     */
    @SuppressWarnings("unchecked")
    
    public static Connection myConnection(){
 Connection con = null;
try{
Class.forName("com.mysql.jdbc.Driver"); // load the  JDBC driver for MySQL.

String connectionUrl="jdbc:mysql://localhost:3306/sis?"+"user=root&password=root"; //    
con = DriverManager.getConnection(connectionUrl);

        } catch (ClassNotFoundException ex) {
     Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {

     Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }
         return con;
    }
      
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        b = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        f = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        d = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jPanel6.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 170, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                                               STUDENT INFORMATION SYSTEM");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 644, 29));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NAME :");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, 20));
        jPanel6.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 170, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 170, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 170, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CLASS :");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 20));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ADDRESS :");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 20));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DOB :");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, 20));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("PHONE NO :");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 90, 20));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 170, -1));

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 170, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("GUARDIAN :");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 80, 30));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jLabel3.setForeground(new java.awt.Color(135, 135, 135));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_information_system/N.png"))); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 379, 393));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("DATE OF BIRTH :");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_information_system/a_small.png"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));
        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 170, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 640, 430));

        jButton2.setText("VIEW STUDENT DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 290, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_information_system/si_bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 590));

        b.addTab("STUDENT INFORMATION", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("UPDATE ATTENDANCE");
        f.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 40));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("JUN");
        f.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        f.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 100, -1));

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("JUL");
        f.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 30, 20));
        f.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 100, -1));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("AUG");
        f.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 30, -1));

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        f.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, -1));

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("SEP");
        f.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 40, 20));

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        f.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, -1));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("OCT");
        f.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 30, -1));

        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        f.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, -1));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("NOV");
        f.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 40, 20));
        f.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, -1));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("DEC");
        f.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 40, 20));
        f.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 100, -1));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("JAN");
        f.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 40, 20));

        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });
        f.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 100, -1));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("FEB");
        f.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 40, 20));
        f.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, -1));

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("MAR");
        f.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));
        f.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 100, -1));

        jButton6.setText("UPDATE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        f.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jPanel2.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 170, 540));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STU_ID", "NAME", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC", "JAN", "FEB", "MAR"
            }
        ));
        jTable3.setFocusable(false);
        jTable3.setRowHeight(25);
        jTable3.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jTable3.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 590, 380));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("ATTENDANCE OF STUDENTS");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 200, 30));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_information_system/a_bg.jpg"))); // NOI18N
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        b.addTab("ATTENDANCE", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STU_ID", "NAME", "ENGLISH", "SCIENCE", "SS", "MATHS", "MALAYALAM", "GRAND TOTAL"
            }
        ));
        jTable2.setRowHeight(25);
        jTable2.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jTable2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 660, 160));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0,130));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TERM I");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(296, 296, 296))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 660, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TERM II");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 205, -1, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STU_ID", "NAME", "ENGLISH", "SCIENCE", "SS", "MATHS", "MALAYALAM", "GRAND TOTAL"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 660, 170));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0,130));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 660, 30));

        jPanel7.setBackground(new java.awt.Color(153, 153, 255,100));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ENTER MARKS");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("TERM II");
        jPanel7.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("TERM I");
        jPanel7.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ENG :");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 40, 20));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 70, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("SCI :");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 30, 20));
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 80, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("SS :");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 46, -1, 30));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 80, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("MAT :");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, 20));
        jPanel7.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 80, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("MAL :");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, 20));
        jPanel7.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 80, -1));

        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jButton4.setText("CLICK HERE TO SEE TERM III");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 660, 140));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_information_system/m_bg.jpg"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        b.addTab("MARKS", jPanel3);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Day", "Hour 1", "Hour 2", "Hour 3", "Hour 4", "Hour 5", "Hour 6", "Hour 7"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setRowHeight(25);
        jTable4.setSelectionBackground(new java.awt.Color(0, 204, 0));
        jTable4.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 520, 160));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("HOUR 1");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("HOUR 2");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("HOUR 3");

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("HOUR 4");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("HOUR 5");

        jTextField12.setBackground(new java.awt.Color(255, 255, 255));

        jTextField13.setBackground(new java.awt.Color(255, 255, 255));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField14.setBackground(new java.awt.Color(255, 255, 255));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField15.setBackground(new java.awt.Color(255, 255, 255));

        jTextField16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("HOUR 6");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("HOUR 7");

        jTextField17.setBackground(new java.awt.Color(255, 255, 255));

        jTextField18.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dLayout = new javax.swing.GroupLayout(d);
        d.setLayout(dLayout);
        dLayout.setHorizontalGroup(
            dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dLayout.createSequentialGroup()
                .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dLayout.createSequentialGroup()
                        .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dLayout.createSequentialGroup()
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dLayout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton5)))
                        .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField15)))
                        .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dLayout.createSequentialGroup()
                        .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dLayout.createSequentialGroup()
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)))
                        .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        dLayout.setVerticalGroup(
            dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel27))
                    .addGroup(dLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel5.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 540, 210));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51,151));
        jPanel8.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 600, 510));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_information_system/t_bg.jpg"))); // NOI18N
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        b.addTab("TIME TABLE", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(b)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(b)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int id;
// Attendance Table
    private void setAttendaceTableData(){

    Connection con = myConnection();

       try{

PreparedStatement prest;

String sql ="select student_info.sid,name,jun,jul,aug,sept,oct,nov,dece,jan,feb,mar from attendance,student_info where attendance.sid = student_info.sid;";

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);

while(rs.next()){

   String id  = String.valueOf(rs.getInt("sid"));
   String fn = rs.getString("name");
   String mn = rs.getString("jun");
   String jul = rs.getString("jul");
   String aug = rs.getString("aug");
   String sept = rs.getString("sept");
   String oct = rs.getString("oct");
   String nov = rs.getString("nov");
   String dec = rs.getString("dece");
   String jan = rs.getString("jan");
   String feb = rs.getString("feb");
   String mar = rs.getString("mar");

            String tbData[]={id,fn,mn,jul,aug,sept,oct,nov,dec,jan,feb,mar};

            DefaultTableModel tblModel=(DefaultTableModel)jTable3.getModel();

            tblModel.addRow(tbData);

       }

       }catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }

}    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   // Insert new student
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
     String date = sdf.format(jDateChooser1.getDate());
        Connection con = myConnection();
        String name= jTextField1.getText();
        String _class= jTextField2.getText();
        String address= jTextArea1.getText();
        String phno= jTextField5.getText();
        String guar= jTextField6.getText();
  // REGEX
    Pattern p = Pattern.compile("^[A-Z a-z]+$");//. represents single character  
    Matcher m = p.matcher(name);
    Matcher n = p.matcher(_class);
    Matcher ph = p.matcher(phno);
    Matcher g = p.matcher(guar);
    boolean nm = m.matches();
    boolean cls = n.matches();
    boolean phchk = ph.matches();
    boolean gu = g.matches();
    if(!nm){
    okcancel("Enter a valid name!");
    }else if(cls){
    okcancel("Enter a valid class!");
    } else if(phchk){
    okcancel("Enter Valid Phone Number!");
    }else if(!gu){
    okcancel("Enter a Valid Guardian Name!");
    }
    else{
       try{
           String sql="INSERT INTO student_info(`name`,`class`,`address`,`dob`,`phno`,`Gname`) VALUES (?,?,?,?,?,?)";
           PreparedStatement prest;
           prest = con.prepareStatement(sql);
           prest.setString(1,name); // n is the variable name for the text field. To add variable name right click the text field->change variablename.
           prest.setString(2,_class);
           prest.setString(3,address);
           prest.setString(4,date);
           prest.setString(5,phno);
           prest.setString(6,guar);
         int count = prest.executeUpdate();
           if(count>0){

               int i = okcancel("Student has been Added");

               System.out.println("ret:"+i);
                  //optio/nPane.setVisible(true);
                  new Admin().setVisible(true);
                  dispose();
                  con.close();

           }

       } catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }           
     } 
    }//GEN-LAST:event_jButton1ActionPerformed
public static int okcancel(String theMessage){

int result=JOptionPane.showConfirmDialog((Component)null,theMessage,"alert",JOptionPane.OK_CANCEL_OPTION);

        return result;

    }

    
    private void setTerm1Marks(){
 Connection con = myConnection();
  try{
PreparedStatement prest;

String sql ="select student_info.sid,name,eng,sci,ss,math,mal,total from marks,student_info where marks.sid = student_info.sid";

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);

while(rs.next()){

   String mid  = String.valueOf(rs.getInt("sid"));
   String nm = rs.getString("name");
   String eng = rs.getString("eng");
   String sci = rs.getString("sci");
   String ss = rs.getString("ss");
   String math = rs.getString("math");
   String mal = rs.getString("mal");
   String grd = rs.getString("total");

            String tbData[]={mid,nm,eng,sci,ss,math,mal,grd};

            DefaultTableModel tblModel=(DefaultTableModel)jTable2.getModel();

            tblModel.addRow(tbData);

       }

       }catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }

}
private void setTerm2Marks(){

    Connection con = myConnection();

       try{

PreparedStatement prest;

String sql ="select student_info.sid,name,eng_t2,sci_t2,ss_t2,math_t2,mal_t2,total_t2 from marks,student_info where marks.sid = student_info.sid;";

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);

while(rs.next()){

   String mid  = String.valueOf(rs.getInt("sid"));
   String nm = rs.getString("name");
   String engt2 = rs.getString("eng_t2");
   String scit2= rs.getString("sci_t2");
   String sst2 = rs.getString("ss_t2");
   String matht2 = rs.getString("math_t2");
   String malt2 = rs.getString("mal_t2");
   String grdt2 = rs.getString("total_t2");

            String tbData[]={mid,nm,engt2,scit2,sst2,matht2,malt2,grdt2};

            DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();

            tblModel.addRow(tbData);

       }

       }catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }

}
// Time table

private void setTimeTableTableData(){

    Connection con = myConnection();

       try{

PreparedStatement prest;

String sql ="select * from time_table";

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);

while(rs.next()){
   String tid = rs.getString("t_id");
   String da  =rs.getString("day");
   String h1  =rs.getString("h1");
   String h2 = rs.getString("h2");
   String h3 = rs.getString("h3");
   String h4 = rs.getString("h4");
   String h5 = rs.getString("h5");
   String h6 = rs.getString("h6");
   String h7 = rs.getString("h7");

            String tbData[]={tid,da,h1,h2,h3,h4,h5,h6,h7};

            DefaultTableModel tblModel=(DefaultTableModel)jTable4.getModel();

            tblModel.addRow(tbData);

       }

       }catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }

}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    dispose();
    studentDetails a = new studentDetails();
    a.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
    // Get attendance data to update text fields
 id=Integer.parseInt(jTable3.getValueAt(jTable3.getSelectedRow(),0).toString());
System.out.println(id);
 Connection con = myConnection();

try{

PreparedStatement prest;

String sql ="select * from attendance where sid="+id;

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);// PreparedStatement object’s executeQuery () method is called to execute the SQL SELECT statement, returning a ResultSet into rs.

while(rs.next()){

    jTextField19.setText(rs.getString("jun"));// Retrieves value of the second column in the current row, which is the username field

    jTextField20.setText(rs.getString("jul"));

    jTextField21.setText(rs.getString("aug"));

    jTextField22.setText(rs.getString("sept"));
    
    jTextField23.setText(rs.getString("oct"));
    
    jTextField24.setText(rs.getString("nov"));
    
    jTextField25.setText(rs.getString("dece"));
    
    jTextField26.setText(rs.getString("jan"));
    
    jTextField27.setText(rs.getString("feb"));
    
    jTextField28.setText(rs.getString("mar")); 

}

 rs.close();

 prest.close();

   

}       catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   // Update attendance
     Connection con = myConnection();

        if(id !=0){

           String junval= jTextField19.getText();
           String julval= jTextField20.getText();
           String augval= jTextField21.getText();
           String septval= jTextField22.getText();
           String octval= jTextField23.getText();
           String novval= jTextField24.getText();
           String decval= jTextField25.getText();
           String janval= jTextField26.getText();
           String febval= jTextField27.getText();
           String marval= jTextField28.getText();
          if( Integer.parseInt(junval)>23||Integer.parseInt(julval)>23||Integer.parseInt(augval)>23
            ||Integer.parseInt(septval)>23||Integer.parseInt(octval)>23||Integer.parseInt(novval)>23
            ||Integer.parseInt(decval)>23||Integer.parseInt(janval)>23||Integer.parseInt(febval)>23
            ||Integer.parseInt(marval)>23){
          okcancel("Max value for attendance is 23!");
          }
          else{
try{

   PreparedStatement prest;

 String sql ="update attendance set jun='"+junval+"',jul='"+julval+"',aug='"+augval+"',sept='"+septval+"',oct='"+octval+"',nov='"+novval+"',dece='"+decval+"',jan='"+janval+"',feb='"+febval+"',mar='"+marval+"'where sid='"+id+"'";
// +"',sept'"+
  prest= con.prepareStatement(sql);

 prest.execute(sql);

  dispose();
Admin a = new Admin();
 a.show();
 con.close();

//resetData();

id =0;

} catch (SQLException ex) {
 Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
 }
          }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                                      
     Connection con = myConnection();

        if(id !=0){

           String eng= jTextField7.getText();
           String sci= jTextField8.getText();
           String ss= jTextField9.getText();
           String maths= jTextField10.getText();
           String mal= jTextField11.getText();
        //   String novval= jTextField12.getText();
        if( Integer.parseInt(eng)>100||Integer.parseInt(sci)>100||Integer.parseInt(ss)>100
            ||Integer.parseInt(maths)>100||Integer.parseInt(mal)>100){
          okcancel("Max mark is 100!");
          }
          else{
try{
    int total1 = Integer.parseInt(eng)+Integer.parseInt(sci)+Integer.parseInt(ss)+Integer.parseInt(maths)+Integer.parseInt(mal);
    int total2 = Integer.parseInt(eng)+Integer.parseInt(sci)+Integer.parseInt(ss)+Integer.parseInt(maths)+Integer.parseInt(mal);
   String sql ="";  
   PreparedStatement prest;
        if(jRadioButton4.isSelected()){
        sql="update marks set eng='"+eng+"',sci='"+sci+"',ss='"+ss+"',math='"+maths+"',mal='"+mal+"',total='"+total1+"'where sid='"+id+"'";
        }
        if(jRadioButton3.isSelected()){
        sql="update marks set eng_t2='"+eng+"',sci_t2='"+sci+"',ss_t2='"+ss+"',math_t2='"+maths+"',mal_t2='"+mal+"',total_t2='"+total2+"'where sid='"+id+"'";
        }
  prest= con.prepareStatement(sql);

 prest.execute(sql);

  dispose();
Admin a = new Admin();
 a.show();
 con.close();

id =0;

} catch (SQLException ex) {
 Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
 }

        }    
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
   id=Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(),0).toString());
  System.out.println(id);
 Connection con = myConnection();

try{

PreparedStatement prest;

String sql ="select eng,sci,ss,math,mal,total from marks where sid="+id;

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);// PreparedStatement object’s executeQuery () method is called to execute the SQL SELECT statement, returning a ResultSet into rs.

while(rs.next()){

    jTextField7.setText(rs.getString("eng"));// Retrieves value of the second column in the current row, which is the username field

    jTextField8.setText(rs.getString("sci"));

    jTextField9.setText(rs.getString("ss"));

    jTextField10.setText(rs.getString("math"));
    
    jTextField11.setText(rs.getString("mal"));
    
    jTextField12.setText(rs.getString("total"));


}

 rs.close();

 prest.close();

   

}       catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
  id=Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
  System.out.println(id);
 Connection con = myConnection();

try{

PreparedStatement prest;

String sql ="select eng_t2,sci_t2,ss_t2,math_t2,mal_t2,total_t2 from marks where sid="+id;

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);// PreparedStatement object’s executeQuery () method is called to execute the SQL SELECT statement, returning a ResultSet into rs.

while(rs.next()){

    jTextField7.setText(rs.getString("eng_t2"));// Retrieves value of the second column in the current row, which is the username field

    jTextField8.setText(rs.getString("sci_t2"));

    jTextField9.setText(rs.getString("ss_t2"));

    jTextField10.setText(rs.getString("math_t2"));
    
    jTextField11.setText(rs.getString("mal_t2"));
    
    jTextField12.setText(rs.getString("total_t2"));


}

 rs.close();

 prest.close();

   

}       catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // Time Table Mouse Clicked Event
 id=Integer.parseInt(jTable4.getValueAt(jTable4.getSelectedRow(),0).toString());
System.out.println(id);
 Connection con = myConnection();

try{

PreparedStatement prest;

String sql ="select * from time_table where t_id="+id;

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);// PreparedStatement object’s executeQuery () method is called to execute the SQL SELECT statement, returning a ResultSet into rs.

while(rs.next()){

    jTextField12.setText(rs.getString("h1"));// Retrieves value of the second column in the current row, which is the username field

    jTextField13.setText(rs.getString("h2"));

    jTextField14.setText(rs.getString("h3"));

    jTextField15.setText(rs.getString("h4"));
    
    jTextField16.setText(rs.getString("h5"));
    
    jTextField17.setText(rs.getString("h6"));
    
    jTextField18.setText(rs.getString("h7"));
} 

 rs.close();

 prest.close();

   

}       catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }

 
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          dispose();
    term3 a = new term3();
    a.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
     Connection con = myConnection();

        if(id !=0){

           String hour1= jTextField12.getText();
           String hour2= jTextField13.getText();
           String hour3= jTextField14.getText();
           String hour4=jTextField15.getText();
           String hour5= jTextField16.getText();
           String hour6= jTextField17.getText();
           String hour7= jTextField18.getText();

try{

   PreparedStatement prest;

 String sql ="update time_table set h1='"+hour1+"',h2='"+hour2+"',h3='"+hour3+"',h4='"+hour4+"',h5='"+hour5+"',h6='"+hour6+"',h7='"+hour7+"'where t_id='"+id+"'";
// +"',sept'"+
  prest= con.prepareStatement(sql);

 prest.execute(sql);

  dispose();
Admin a = new Admin();
 a.show();
 con.close();

//resetData();

id =0;

} catch (SQLException ex) {
 Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
 }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel d;
    private javax.swing.JPanel f;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
