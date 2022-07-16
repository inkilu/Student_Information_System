package student_information_system;
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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author INKILU
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        setAttendaceTableData();
        setTimeTableTableData();
        setTerm1Marks();
        setTerm2Marks();
    }

    // Database Connection
public static Connection myConnection(){
 Connection con = null;
try{
Class.forName("com.mysql.jdbc.Driver"); // load the  JDBC driver for MySQL.

String connectionUrl="jdbc:mysql://localhost:3306/sis?"+"user=root&password=root"; //    
con = DriverManager.getConnection(connectionUrl);

        } catch (ClassNotFoundException ex) {
     Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {

     Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
         return con;
    }
        
    // Attendace Table Code

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
    // Display Term 1 Marks
    
    private void setTerm1Marks(){

    Connection con = myConnection();

       try{

PreparedStatement prest;

String sql ="select student_info.sid,name,eng,sci,ss,math,mal,grade from marks,student_info where marks.sid = student_info.sid";

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);

while(rs.next()){

   String mid  = String.valueOf(rs.getInt("sid"));
   String fn = rs.getString("name");
   String mn = rs.getString("eng");
   String jul = rs.getString("sci");
   String aug = rs.getString("ss");
   String sept = rs.getString("math");
   String mal = rs.getString("mal");
   String grd = rs.getString("grade");

            String tbData[]={mid,fn,mn,jul,aug,sept,mal,grd};

            DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();

            tblModel.addRow(tbData);

       }

       }catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }

}
    
    // Display Term 2 Marks
    
    private void setTerm2Marks(){

    Connection con = myConnection();

       try{

PreparedStatement prest;

String sql ="select student_info.sid,name,eng_t2,sci_t2,ss_t2,math_t2,mal_t2,grade_t2 from marks,student_info where marks.sid = student_info.sid;";

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);

while(rs.next()){

   String mid  = String.valueOf(rs.getInt("sid"));
   String fn = rs.getString("name");
   String mn = rs.getString("eng_t2");
   String jul = rs.getString("sci_t2");
   String aug = rs.getString("ss_t2");
   String sept = rs.getString("math_t2");
   String mal = rs.getString("mal_t2");
   String grd = rs.getString("grade_t2");

            String tbData[]={mid,fn,mn,jul,aug,sept,mal,grd};

            DefaultTableModel tblModel=(DefaultTableModel)jTable2.getModel();

            tblModel.addRow(tbData);

       }

       }catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }

}
    
    // Display Time Table
    
        private void setTimeTableTableData(){

    Connection con = myConnection();

       try{

PreparedStatement prest;

String sql ="select * from time_table";

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);

while(rs.next()){

   String h1  =rs.getString("h1");
   String h2 = rs.getString("h2");
   String h3 = rs.getString("h3");
   String h4 = rs.getString("h4");
   String h5 = rs.getString("h5");
   String h6 = rs.getString("h6");
   String h7 = rs.getString("h7");

            String tbData[]={h1,h2,h3,h4,h5,h6,h7};

            DefaultTableModel tblModel=(DefaultTableModel)jTable4.getModel();

            tblModel.addRow(tbData);

       }

       }catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }

}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Attendance of Students");

        jTable3.setBackground(new java.awt.Color(60, 63, 65));
        jTable3.setForeground(new java.awt.Color(255, 255, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stu_id", "Name", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec", "Jan", "Feb", "Mar"
            }
        ));
        jTable3.setFocusable(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Update Attendance");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Jun");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Jul");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Aug");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Sept");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Oct");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nov");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Dec");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Jan");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Feb");

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Mar");

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Update!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(268, 268, 268))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(311, 311, 311))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addComponent(jTextField8)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(156, 156, 156))
        );

        jTabbedPane2.addTab("Attendance", jPanel2);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jTable1.setBackground(new java.awt.Color(60, 63, 65));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stu_Id", "Name", "English", "Science", "Social Science", "Maths", "Malayalam", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setBackground(new java.awt.Color(60, 63, 65));
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Std_Id", "Name", "English", "Science", "Social Science", "Maths", "Malayalam", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Term-1 Marks");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Term-2 Marks");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("English");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Science");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("SS");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Maths");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Malayalam");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Grade");

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Term 1");

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Term 2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jTextField17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField18)
                            .addComponent(jTextField19))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField20, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jTextField21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(357, 357, 357))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jRadioButton1)
                        .addGap(5, 5, 5)
                        .addComponent(jRadioButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Marks", jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Info Field"));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Class");

        jLabel6.setText("Address");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel7.setText("DOB");

        jLabel8.setText("Phone No");

        jLabel9.setText("Guardian's Name");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(122, 122, 122)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel10.setText("Add a New Student");
        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel10)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add student", jPanel3);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Time Table");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hour 1", "Hour  2", "Hour  3", "Hour  4", "Hour 5", "Hour 6", "Hour 7"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(539, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Time Table", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con = myConnection();
       try{
           String sql="INSERT INTO student_info(`name`,`class`,`address`,`phno`,`dob`,`Gname`) VALUES (?,?,?,?,?,?)";
           PreparedStatement prest;
           prest = con.prepareStatement(sql);
           prest.setString(1,jTextField1.getText()); // n is the variable name for the text field. To add variable name right click the text field->change variablename.
           prest.setString(2,jTextField2.getText());
           prest.setString(3,jTextArea1.getText());
           prest.setString(4,jTextField3.getText());
           prest.setString(5,jTextField4.getText());
           prest.setString(6,jTextField5.getText());
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
        
    }//GEN-LAST:event_jButton1ActionPerformed
int id;
    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:

 id=Integer.parseInt(jTable3.getValueAt(jTable3.getSelectedRow(),0).toString());
System.out.println(id);
 Connection con = myConnection();

try{

PreparedStatement prest;

String sql ="select * from attendance where sid="+id;

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);// PreparedStatement object’s executeQuery () method is called to execute the SQL SELECT statement, returning a ResultSet into rs.

while(rs.next()){

    jTextField6.setText(rs.getString("jun"));// Retrieves value of the second column in the current row, which is the username field

    jTextField7.setText(rs.getString("jul"));

    jTextField8.setText(rs.getString("aug"));

    jTextField9.setText(rs.getString("sept"));
    
    jTextField10.setText(rs.getString("oct"));
    
    jTextField11.setText(rs.getString("nov"));
    
    jTextField12.setText(rs.getString("dece"));
    
    jTextField13.setText(rs.getString("jan"));
    
    jTextField14.setText(rs.getString("feb"));
    
    jTextField15.setText(rs.getString("mar")); 

}

 rs.close();

 prest.close();

   

}       catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }

      
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

   /* private void resetData(){

     fn.setText("");

     ln.setText("");

     sn.setText("");

 } */
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
     Connection con = myConnection();

        if(id !=0){

           String junval= jTextField6.getText();
           String julval= jTextField7.getText();
           String augval= jTextField8.getText();
           String septval= jTextField9.getText();
           String octval= jTextField10.getText();
           String novval= jTextField11.getText();
           String decval= jTextField12.getText();
           String janval= jTextField13.getText();
           String febval= jTextField14.getText();
           String marval= jTextField15.getText();

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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:                                              
        // TODO add your handling code here:
     Connection con = myConnection();

        if(id !=0){

           String junval= jTextField16.getText();
           String julval= jTextField17.getText();
           String augval= jTextField18.getText();
           String septval= jTextField19.getText();
           String octval= jTextField20.getText();
           String novval= jTextField21.getText();
try{
   String sql ="";  
   PreparedStatement prest;

//String sql ="update marks set jun='"+junval+"',jul='"+julval+"',aug='"+augval+"',sept='"+septval+"',oct='"+octval+"',nov='"+novval+"',dece='"+decval+"',jan='"+janval+"',feb='"+febval+"',mar='"+marval+"'where sid='"+id+"'";
//String sql ="update marks set eng='"+junval+"',sci='"+julval+"',ss='"+augval+"',math='"+septval+"',mal='"+octval+"',grade='"+novval+"'where sid='"+id+"'";
        if(jRadioButton1.isSelected()){
        sql="update marks set eng='"+junval+"',sci='"+julval+"',ss='"+augval+"',math='"+septval+"',mal='"+octval+"',grade='"+novval+"'where sid='"+id+"'";
        }
        if(jRadioButton2.isSelected()){
        sql="update marks set eng_t2='"+junval+"',sci_t2='"+julval+"',ss_t2='"+augval+"',math_t2='"+septval+"',mal_t2='"+octval+"',grade_t2='"+novval+"'where sid='"+id+"'";
        }
        System.out.println(sql);
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
    }//GEN-LAST:event_jButton3ActionPerformed

    // Term 1 mark click
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
 id=Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
System.out.println(id);
 Connection con = myConnection();

try{

PreparedStatement prest;

String sql ="select eng,sci,ss,math,mal,grade from marks where sid="+id;

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);// PreparedStatement object’s executeQuery () method is called to execute the SQL SELECT statement, returning a ResultSet into rs.

while(rs.next()){

    jTextField16.setText(rs.getString("eng"));// Retrieves value of the second column in the current row, which is the username field

    jTextField17.setText(rs.getString("sci"));

    jTextField18.setText(rs.getString("ss"));

    jTextField19.setText(rs.getString("math"));
    
    jTextField20.setText(rs.getString("mal"));
    
    jTextField21.setText(rs.getString("grade"));


}

 rs.close();

 prest.close();

   

}       catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // Term 2 marks to the fields                                   
 id=Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(),0).toString());
System.out.println(id);
 Connection con = myConnection();

try{

PreparedStatement prest;

String sql ="select eng_t2,sci_t2,ss_t2,math_t2,mal_t2,grade_t2 from marks where sid="+id;

prest= con.prepareStatement(sql);

ResultSet rs = prest.executeQuery(sql);// PreparedStatement object’s executeQuery () method is called to execute the SQL SELECT statement, returning a ResultSet into rs.

while(rs.next()){

    jTextField16.setText(rs.getString("eng_t2"));// Retrieves value of the second column in the current row, which is the username field

    jTextField17.setText(rs.getString("sci_t2"));

    jTextField18.setText(rs.getString("ss_t2"));

    jTextField19.setText(rs.getString("math_t2"));
    
    jTextField20.setText(rs.getString("mal_t2"));
    
    jTextField21.setText(rs.getString("grade_t2"));


}

 rs.close();

 prest.close();

   

}       catch (SQLException ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jTable2MouseClicked
public static int okcancel(String theMessage){

int result=JOptionPane.showConfirmDialog((Component)null,theMessage,"alert",JOptionPane.OK_CANCEL_OPTION);

        return result;

    }

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
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
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
