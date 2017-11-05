import java.sql.*;
import java.io.*;
public class NewJFrame extends javax.swing.JFrame {

    /** Creates new form NewJFrame */
    public NewJFrame() {
        initComponents();
         disable1();
    }
    String q,p,r,str;
    int s,t=2,j=1,x=0,y=1;
    int []z=new int[20];

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField7 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jDialog4 = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jDialog5 = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jDialog6 = new javax.swing.JDialog();
        jLabel19 = new javax.swing.JLabel();
        jDialog7 = new javax.swing.JDialog();
        jLabel20 = new javax.swing.JLabel();
        jDialog8 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jDialog9 = new javax.swing.JDialog();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jDialog10 = new javax.swing.JDialog();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jDialog11 = new javax.swing.JDialog();
        jLabel29 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();

        jFrame2.setMinimumSize(new java.awt.Dimension(8000, 750));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 3, 11));
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 3, 11));
        jRadioButton2.setText("jRadioButton1");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 3, 11));
        jRadioButton3.setText("jRadioButton1");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 3, 11));
        jRadioButton4.setText("jRadioButton1");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addGap(70, 70, 70)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(161, 161, 161))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setText("question");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox1.setText("5,000");
        jCheckBox1.setEnabled(false);

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox2.setText("10,000");
        jCheckBox2.setEnabled(false);

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox3.setText("20,000");
        jCheckBox3.setEnabled(false);

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox4.setText("40,000");
        jCheckBox4.setEnabled(false);

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox5.setText("80,000");
        jCheckBox5.setEnabled(false);

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox6.setText("1,60,000");
        jCheckBox6.setEnabled(false);

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox7.setText("3,20,000");
        jCheckBox7.setEnabled(false);

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox8.setText("6,40,000");
        jCheckBox8.setEnabled(false);

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox9.setText("12,50,000");
        jCheckBox9.setEnabled(false);

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox10.setText("25,00,000");
        jCheckBox10.setEnabled(false);

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox11.setText("50,00,000");
        jCheckBox11.setEnabled(false);

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox12.setText("1,00,00,000");
        jCheckBox12.setEnabled(false);

        jCheckBox13.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox13.setText("5,00,00,000");
        jCheckBox13.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox13))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1))
        );

        jButton1.setText("50/50");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("double dip");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("audiense pole");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("expert advice");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kbc_pic2.png"))); // NOI18N

        jButton13.setText("NEXT");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jButton13)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addContainerGap())
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialog1.setAlwaysOnTop(true);
        jDialog1.setMinimumSize(new java.awt.Dimension(500, 450));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A.jpeg"))); // NOI18N

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 467, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jDialog2.setAlwaysOnTop(true);
        jDialog2.setMinimumSize(new java.awt.Dimension(550, 500));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/B-4.jpg"))); // NOI18N

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jDialog3.setAlwaysOnTop(true);
        jDialog3.setMinimumSize(new java.awt.Dimension(500, 450));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c2.png"))); // NOI18N

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jDialog4.setAlwaysOnTop(true);
        jDialog4.setMinimumSize(new java.awt.Dimension(500, 450));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d_1_lg.gif"))); // NOI18N

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jDialog5.setAlwaysOnTop(true);
        jDialog5.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opb.jpg"))); // NOI18N

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel18)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog5Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jDialog6.setAlwaysOnTop(true);
        jDialog6.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opc.jpg"))); // NOI18N

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog6Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(68, 68, 68))
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog6Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jDialog7.setAlwaysOnTop(true);
        jDialog7.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opd.jpg"))); // NOI18N

        javax.swing.GroupLayout jDialog7Layout = new javax.swing.GroupLayout(jDialog7.getContentPane());
        jDialog7.getContentPane().setLayout(jDialog7Layout);
        jDialog7Layout.setHorizontalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel20)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jDialog7Layout.setVerticalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );

        jDialog8.setAlwaysOnTop(true);
        jDialog8.setMinimumSize(new java.awt.Dimension(560, 400));

        jLabel6.setFont(new java.awt.Font("Trajan Pro", 3, 36));
        jLabel6.setText("YOU WON");

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 3, 48));
        jLabel11.setText("RS");

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel24.setText("I.Q. LEVEL %");

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel25.setText("x");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 3, 18));
        jLabel27.setText("Opps....WRONG ANSWER");

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jButton6.setText("SAVE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog8Layout = new javax.swing.GroupLayout(jDialog8.getContentPane());
        jDialog8.getContentPane().setLayout(jDialog8Layout);
        jDialog8Layout.setHorizontalGroup(
            jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jDialog8Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog8Layout.createSequentialGroup()
                .addContainerGap(608, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(41, 41, 41))
            .addGroup(jDialog8Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jDialog8Layout.setVerticalGroup(
            jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jLabel25))
                .addGap(26, 26, 26)
                .addComponent(jButton6))
        );

        jDialog9.setMinimumSize(new java.awt.Dimension(700, 600));

        jLabel21.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36));
        jLabel21.setText("Top Ten Scores");

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel22.setText("NAME------>");

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 18));
        jLabel23.setText("SCORE");

        jTextArea3.setColumns(20);
        jTextArea3.setEditable(false);
        jTextArea3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane5.setViewportView(jTextArea3);

        jButton7.setText("SHOW");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("close");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog9Layout = new javax.swing.GroupLayout(jDialog9.getContentPane());
        jDialog9.getContentPane().setLayout(jDialog9Layout);
        jDialog9Layout.setHorizontalGroup(
            jDialog9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog9Layout.createSequentialGroup()
                .addGroup(jDialog9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog9Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog9Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton8))
                    .addGroup(jDialog9Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jDialog9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jDialog9Layout.setVerticalGroup(
            jDialog9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog9Layout.createSequentialGroup()
                .addGroup(jDialog9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog9Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addGap(4, 4, 4)
                        .addGroup(jDialog9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog9Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jButton8)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jDialog10.setMinimumSize(new java.awt.Dimension(440, 300));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 3, 36));
        jLabel26.setText("CORRECT ANSWER");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bingo.gif"))); // NOI18N

        javax.swing.GroupLayout jDialog10Layout = new javax.swing.GroupLayout(jDialog10.getContentPane());
        jDialog10.getContentPane().setLayout(jDialog10Layout);
        jDialog10Layout.setHorizontalGroup(
            jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel28)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );
        jDialog10Layout.setVerticalGroup(
            jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog10Layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE)))
        );

        jDialog11.setAlwaysOnTop(true);
        jDialog11.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel29.setIcon(new javax.swing.ImageIcon("D:\\JavaApplication5\\JavaApplication5\\JavaApplication5\\src\\opa.png")); // NOI18N
        jLabel29.setText("a option");

        javax.swing.GroupLayout jDialog11Layout = new javax.swing.GroupLayout(jDialog11.getContentPane());
        jDialog11.getContentPane().setLayout(jDialog11Layout);
        jDialog11Layout.setHorizontalGroup(
            jDialog11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jDialog11Layout.setVerticalGroup(
            jDialog11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36));
        jLabel1.setText("Kaun Banega Crorepati");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setText("Registration form");

        jLabel3.setText("First Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Mobile number");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Last Name");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel7.setText("state");

        jLabel8.setText("Email");

        jLabel9.setText("Address");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel10.setText("area of intrest");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kbc_pic2.png"))); // NOI18N
        jLabel12.setText("jLabel12");

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 36));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kbc1.jpeg"))); // NOI18N
        jButton5.setText("---->GO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setRows(5);
        jTextArea2.setText("1.sports,social\n2.sports,political\n3.social,g.k.");
        jScrollPane2.setViewportView(jTextArea2);

        jRadioButton5.setText("1");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("2");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setText("3");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel12.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
       
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try
            {
            String connectionURL = "jdbc:mysql://localhost:3306/KBC";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection(connectionURL,"root","password");
                    Statement st=con.createStatement();
                    str=jTextField2.getText();
                   int x =st.executeUpdate("insert into player(fname,lname,mobileno,address,state,emailid) values('"+jTextField1.getText()+"','"+jTextField3.getText()+"','"+jTextField2.getText()+"','"+jTextArea1.getText()+"','"+jTextField6.getText()+"','"+jTextField5.getText()+"')");
           if(x>0)
           {
            
           }
        }
            catch(Exception e)
            {System.out.println(e);
            }
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        jCheckBox6.setEnabled(false);
        jCheckBox7.setEnabled(false);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(false);
        jCheckBox10.setEnabled(false);
        jCheckBox11.setEnabled(false);
        jCheckBox12.setEnabled(false);
        jCheckBox13.setEnabled(false);

        jButton13.setEnabled(false);

        int i=(int)((Math.random()*16)+1);
        z[i]=i;
        String fname="D:\\JavaApplication5\\JavaApplication5\\JavaApplication5\\kbc\\"+j+"\\"+y+"\\("+i+").txt";
        jFrame2.setVisible(true);

    jButton13.setEnabled(false);
   try{
      BufferedReader  br = new BufferedReader(new FileReader(fname));

        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

jTextField7.setText(line);

         line = br.readLine();
         jRadioButton1.setText(line);
          line = br.readLine();
          jRadioButton2.setText(line);
           line = br.readLine();
           jRadioButton3.setText(line);
           line = br.readLine();
           jRadioButton4.setText(line);
           line = br.readLine();
           p=line;

           line = br.readLine();
           r=line;
           br.close();
    } catch(IOException e) {

    }



    }//GEN-LAST:event_jButton5ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
       t++;
       q="4";
       jDialog1.setVisible(false);
       jDialog2.setVisible(false);
       jDialog3.setVisible(false);
       jDialog4.setVisible(false);
       jDialog5.setVisible(false);
       jDialog6.setVisible(false);
       jDialog7.setVisible(false);
       jDialog11.setVisible(false);
    if(t==2)
       {
       jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton1.setEnabled(false);
    }

    check(); // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        q="1";t++;
        jDialog1.setVisible(false);
       jDialog2.setVisible(false);
       jDialog3.setVisible(false);
       jDialog4.setVisible(false);
       jDialog5.setVisible(false);
       jDialog6.setVisible(false);
       jDialog7.setVisible(false);
       jDialog11.setVisible(false);
    if(t==2)
       {
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
       
    }

    check(); // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
      q="2";t++;
      jDialog1.setVisible(false);
       jDialog2.setVisible(false);
       jDialog3.setVisible(false);
       jDialog4.setVisible(false);
       jDialog5.setVisible(false);
       jDialog6.setVisible(false);
       jDialog7.setVisible(false);
       jDialog11.setVisible(false);
       if(t==2)
       {
      jRadioButton1.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
      }check();  // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        q="3";t++;
        jDialog1.setVisible(false);
       jDialog2.setVisible(false);
       jDialog3.setVisible(false);
       jDialog4.setVisible(false);
       jDialog5.setVisible(false);
       jDialog6.setVisible(false);
       jDialog7.setVisible(false);
       jDialog11.setVisible(false);
       if(t==2)
       {
       jRadioButton2.setEnabled(false);
        jRadioButton1.setEnabled(false);
        jRadioButton4.setEnabled(false);}
       check();  // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int i=(int)((Math.random()*16)+1);
        while(z[i]==i)
        i=(int)((Math.random()*16)+1);

           z[i]=i;
         jRadioButton1.setEnabled(true);
         jRadioButton1.setSelected(false);
         jRadioButton2.setEnabled(true);
         jRadioButton2.setSelected(false);
         jRadioButton3.setEnabled(true);
         jRadioButton3.setSelected(false);
         jRadioButton4.setEnabled(true);
         jRadioButton4.setSelected(false);
 String fname="D:\\JavaApplication5\\JavaApplication5\\JavaApplication5\\kbc\\"+j+"\\"+y+"\\("+i+").txt";
    jDialog10.setVisible(false);
    jButton13.setEnabled(false);
   try{
      BufferedReader  br = new BufferedReader(new FileReader(fname));

        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

jTextField7.setText(line);

         line = br.readLine();
         jRadioButton1.setText(line);
          line = br.readLine();
          jRadioButton2.setText(line);
           line = br.readLine();
           jRadioButton3.setText(line);
           line = br.readLine();
           jRadioButton4.setText(line);
           line = br.readLine();
           p=line;
           line = br.readLine();
           r=line;
           br.close();
    } catch(IOException e) {

    }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i=0;

      if(!r.equals(jRadioButton1.getText()))
       {
           i++;
        if(i<3)
       jRadioButton1.setEnabled(false);
       }
        if(!r.equals(jRadioButton2.getText()))
       {
           i++;
        if(i<3)
       jRadioButton2.setEnabled(false);
       }
        if(!r.equals(jRadioButton3.getText()))
       {
           i++;
        if(i<3)
       jRadioButton3.setEnabled(false);
       }
        if(!r.equals(jRadioButton4.getText()))
       {
           i++;
        if(i<3)
       jRadioButton4.setEnabled(false);
       }
      jButton1.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        if(r.equals(jRadioButton1.getText()))
       { jDialog1.setVisible(true);
           
       }
        if(r.equals(jRadioButton2.getText()))
       {
          jDialog2.setVisible(true);
       }
        if(r.equals(jRadioButton3.getText()))
       {
          jDialog3.setVisible(true);
       }
        if(r.equals(jRadioButton4.getText()))
       {
          jDialog4.setVisible(true);
       }

        jButton4.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        t=0;
jButton2.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
      j=2;
jButton5.setEnabled(true);
jRadioButton6.setEnabled(false);
jRadioButton7.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
       j=1;
       jButton5.setEnabled(true);
       jRadioButton5.setEnabled(false);
jRadioButton7.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        j=3;
       jButton5.setEnabled(true);
       jRadioButton6.setEnabled(false);
jRadioButton5.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(x==0){
       if(r.equals(jRadioButton1.getText()))
       { jDialog11.setVisible(true);

       }
        if(r.equals(jRadioButton2.getText()))
       {
          jDialog5.setVisible(true);
       }
        if(r.equals(jRadioButton3.getText()))
       {
          jDialog6.setVisible(true);
       }
        if(r.equals(jRadioButton4.getText()))
       {
          jDialog7.setVisible(true);
       }
        }
 else{
 if(r.equals(jRadioButton1.getText()))
       { jDialog5.setVisible(true);

       }
        if(r.equals(jRadioButton2.getText()))
       {
          jDialog11.setVisible(true);
       }
        if(r.equals(jRadioButton3.getText()))
       {
          jDialog7.setVisible(true);
       }
        if(r.equals(jRadioButton4.getText()))
       {
          jDialog6.setVisible(true);
       }
 }
        jButton3.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try
            {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/KBC","root","password");
                    Statement st=con.createStatement();
                    int x=st.executeUpdate("update player set score="+s+"  where mobileno='"+str+"'");
                    if(x>0)
                    {
                    }
 else
                    {

 }
            }
            catch(Exception e)
            {System.out.println(e);
            }
       jDialog9.setVisible(true);
       jDialog8.setVisible(false);
       jFrame2.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        StringBuilder c=new StringBuilder();
        try
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/KBC","root","password");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select fname,score from player order by score desc");
            int i=0;
            while(rs.next())
            {
                c.append(rs.getString(1));
                c.append("\r\n");
                c.append("\t"+rs.getString(2));
                c.append("\r\n");
                i++;
                if(i==10)
                break;
            }
            }
            catch(Exception e)
            {//System.out.println(e);
            }
        jTextArea3.setText(c.toString());
        //TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jDialog9.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

     int score()
    {
    if(jCheckBox13.isSelected()==true)
    {
    s=50000000;
    jLabel25.setText("130");
    }
 else if (jCheckBox12.isSelected() == true)
    {
    s=10000000;
    jLabel25.setText("120");
    }
     else if (jCheckBox11.isSelected() == true)
    {
    s=5000000;
    jLabel25.setText("110");
    } else if (jCheckBox10.isSelected() == true)
    {
    s=2500000;
    jLabel25.setText("100");
    } else if (jCheckBox9.isSelected() == true)
    {
    s=1250000;
    jLabel25.setText("90");
    } else if (jCheckBox8.isSelected() == true)
    {
    s=640000;
    jLabel25.setText("80");
    } else if (jCheckBox7.isSelected() == true)
    {
    s=320000;
    jLabel25.setText("70");
    } else if (jCheckBox6.isSelected() == true)
    {
    s=160000;
    jLabel25.setText("60");
    } else if (jCheckBox5.isSelected() == true)
    {
    s=80000;
    jLabel25.setText("50");
    } else if (jCheckBox4.isSelected() == true)
    {
    s=40000;
    jLabel25.setText("40");
    } else if (jCheckBox3.isSelected() == true)
    {
    s=20000;
    jLabel25.setText("30");
    } else if (jCheckBox2.isSelected() == true)
    {
    s=10000;
    jLabel25.setText("20");
    } else if (jCheckBox1.isSelected() == true)
    {
    s=5000;
    jLabel25.setText("10");
    } else
    {
    s=0;
    jLabel25.setText("0");
    }
    return s;

    }
    void check()
    {
      if(q.equals(p))
      {
        if(jRadioButton1.isSelected()==true)
        {
         jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        }
        if(jRadioButton2.isSelected()==true)
        {
         jRadioButton1.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        }
        if(jRadioButton3.isSelected()==true)
        {
         jRadioButton2.setEnabled(false);
        jRadioButton1.setEnabled(false);
        jRadioButton4.setEnabled(false);
        }
        if(jRadioButton4.isSelected()==true)
        {
         jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton1.setEnabled(false);
        }


          jButton13.setEnabled(true);
        jDialog10.setVisible(true);
          jButton13.setText("Click for the next question");


     if(jCheckBox1.isSelected()==false)
     {
     jCheckBox1.setSelected(true);
     }
 else if(jCheckBox2.isSelected()==false)
     {
     jCheckBox2.setSelected(true);
     }
   else if(jCheckBox3.isSelected()==false)
     {
     jCheckBox3.setSelected(true);
     }
        else if(jCheckBox4.isSelected()==false)
     {
     jCheckBox4.setSelected(true);
     }
        else if(jCheckBox5.isSelected()==false)
     {
     jCheckBox5.setSelected(true);
     }
        else if(jCheckBox6.isSelected()==false)
     {y=2;
     jCheckBox6.setSelected(true);
     }
        else if(jCheckBox7.isSelected()==false)
     {
     jCheckBox7.setSelected(true);
     }
        else if(jCheckBox8.isSelected()==false)
     {
     jCheckBox8.setSelected(true);
     }
        else if(jCheckBox9.isSelected()==false)
     {
     jCheckBox9.setSelected(true);
     }
        else if(jCheckBox10.isSelected()==false)
     {
       x=1;y=3;
     jCheckBox10.setSelected(true);
     }
      else if(jCheckBox11.isSelected()==false)
     {
     jCheckBox11.setSelected(true);
     }
        else if(jCheckBox12.isSelected()==false)
     {
     jCheckBox12.setSelected(true);
     }
        else if(jCheckBox13.isSelected()==false)
     {
     jDialog10.setVisible(false);
     jDialog8.setVisible(true);
     jCheckBox13.setSelected(true);
     jLabel27.setText("WOW YOU WON THE JACKPOT");
     jLabel11.setText("Rs."+score());
     jLabel25.setText("130");
     jButton13.setText("Game over");
 jButton13.setEnabled(false);
     }
 else{
 jDialog10.setVisible(false);
     jDialog8.setVisible(true);
     jCheckBox13.setSelected(true);
     jLabel27.setText("WOW YOU WON THE JACKPOT");
     jLabel11.setText("Rs."+score());
     jLabel25.setText("130");
     jButton13.setText("Game over");
 jButton13.setEnabled(false);

 }



      }
 else if(t<2)
      {
 if(jRadioButton1.isSelected()==true)
 {  jRadioButton1.setSelected(false);
    jRadioButton1.setEnabled(false);
          }
          if (jRadioButton2.isSelected() == true){
    jRadioButton2.setEnabled(false);jRadioButton1.setSelected(false);}
 if(jRadioButton3.isSelected()==true){
    jRadioButton3.setEnabled(false);jRadioButton1.setSelected(false);}
 if(jRadioButton4.isSelected()==true){
    jRadioButton4.setEnabled(false);jRadioButton1.setSelected(false);}

 }
 else
      {
          if(jRadioButton1.isSelected()==true)
        {
         jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        }
        if(jRadioButton2.isSelected()==true)
        {
         jRadioButton1.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        }
        if(jRadioButton3.isSelected()==true)
        {
         jRadioButton2.setEnabled(false);
        jRadioButton1.setEnabled(false);
        jRadioButton4.setEnabled(false);
        }
        if(jRadioButton4.isSelected()==true)
        {
         jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton1.setEnabled(false);
        }
  //jButton13.setEnabled(true);
        jButton13.setText("Wrong Anwer");
        jDialog8.setVisible(true);
        jLabel11.setText("RS."+score());

    /*        try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
     */
       // jButton13.setText("You Won Rs."+score());
     jButton13.setEnabled(false);

 }

  }

  void disable1()
    {
  jButton5.setEnabled(false);
  }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog10;
    private javax.swing.JDialog jDialog11;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JDialog jDialog7;
    private javax.swing.JDialog jDialog8;
    private javax.swing.JDialog jDialog9;
    private javax.swing.JFrame jFrame2;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

}
