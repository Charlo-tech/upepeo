/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New_Member;

import Landing_Page.LandingPage;
import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class NewMember extends javax.swing.JFrame {

    /**
     * Creates new form NewMember
     */
    public NewMember() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxt_Name = new javax.swing.JTextField();
        jTxt_Pnum = new javax.swing.JTextField();
        jTxt_ID = new javax.swing.JTextField();
        jTxt_Email = new javax.swing.JTextField();
        jTxt_Address = new javax.swing.JTextField();
        jTxt_Occupation = new javax.swing.JTextField();
        jLbl_MemID = new javax.swing.JLabel();
        jButton_SAVE = new javax.swing.JButton();
        jButton_CLEAR = new javax.swing.JButton();
        jButton_CLOSE = new javax.swing.JButton();
        jRd_Paid = new javax.swing.JRadioButton();
        jRd_NotPaid = new javax.swing.JRadioButton();
        jButton_IDCARD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_ID = new javax.swing.JTextArea();
        jDateChooser_DATE = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NEW MEMBER");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPEPEO VIDEO LENDING SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Phone Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Occupation");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Member ID");

        jTxt_Pnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_PnumActionPerformed(evt);
            }
        });
        jTxt_Pnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxt_PnumKeyPressed(evt);
            }
        });

        jLbl_MemID.setToolTipText("autogenerated");
        jLbl_MemID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton_SAVE.setBackground(new java.awt.Color(102, 102, 255));
        jButton_SAVE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_SAVE.setText("SAVE");
        jButton_SAVE.setBorderPainted(false);

        jButton_CLEAR.setBackground(new java.awt.Color(0, 153, 153));
        jButton_CLEAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_CLEAR.setText("CLEAR");
        jButton_CLEAR.setBorderPainted(false);
        jButton_CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CLEARActionPerformed(evt);
            }
        });

        jButton_CLOSE.setBackground(new java.awt.Color(255, 51, 51));
        jButton_CLOSE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_CLOSE.setText("CLOSE");
        jButton_CLOSE.setBorderPainted(false);
        jButton_CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CLOSEActionPerformed(evt);
            }
        });

        jRd_Paid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRd_Paid.setText("Paid");
        jRd_Paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRd_PaidActionPerformed(evt);
            }
        });

        jRd_NotPaid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRd_NotPaid.setText("Not Paid");
        jRd_NotPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRd_NotPaidActionPerformed(evt);
            }
        });

        jButton_IDCARD.setBackground(new java.awt.Color(204, 204, 204));
        jButton_IDCARD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_IDCARD.setText("ID CARD");
        jButton_IDCARD.setBorderPainted(false);
        jButton_IDCARD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IDCARDActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 204));

        jTextArea_ID.setColumns(20);
        jTextArea_ID.setRows(5);
        jScrollPane1.setViewportView(jTextArea_ID);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("MEMBERSHIP CARD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTxt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxt_Pnum, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxt_ID)
                            .addComponent(jTxt_Email)))
                    .addComponent(jRd_Paid, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRd_NotPaid)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton_IDCARD)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_SAVE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_CLEAR)
                        .addGap(37, 37, 37)
                        .addComponent(jButton_CLOSE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLbl_MemID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(jTxt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxt_Occupation)
                                .addComponent(jDateChooser_DATE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jTxt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jTxt_Pnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt_Occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8)
                                .addComponent(jTxt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser_DATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jTxt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_MemID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jRd_Paid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 32, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_SAVE)
                                    .addComponent(jButton_CLEAR)
                                    .addComponent(jButton_CLOSE)
                                    .addComponent(jButton_IDCARD)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRd_NotPaid)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CLEARActionPerformed
        jTxt_Address.setText(null);
        jTxt_Name.setText(null);
        jTxt_Occupation.setText(null);
        jTxt_Pnum.setText(null);
        jTxt_ID.setText(null);
        jTxt_Email.setText(null);
        jLbl_MemID.setText(null);
        jRd_Paid.setSelected(false);
        jRd_NotPaid.setSelected(false);
        jTxt_Address.setText(null);
        jTextArea_ID.setText(null);
        jDateChooser_DATE.setDate(null);
    }//GEN-LAST:event_jButton_CLEARActionPerformed

    private void jButton_CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CLOSEActionPerformed
        LandingPage pi = new LandingPage();
        pi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_CLOSEActionPerformed

    private void jTxt_PnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_PnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt_PnumActionPerformed

    private void jTxt_PnumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxt_PnumKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            jTxt_Pnum.setEditable(false);
        }
        else{
            jTxt_Pnum.setEditable(true);
        }
    }//GEN-LAST:event_jTxt_PnumKeyPressed

    private void jButton_IDCARDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IDCARDActionPerformed
        String Name = (jTxt_Name.getText());
        String Number = (jTxt_Pnum.getText());
        String ID = (jTxt_ID.getText());
        String Email = (jTxt_Email.getText());
        String Address = (jTxt_Address.getText());
        String Occupation = (jTxt_Occupation.getText());
        String MemberID = (jLbl_MemID.getText());
        
        
        
        jTextArea_ID.append("\tUPEPEO VIDEOS CARD:\n"
            +"\n~~~~~~~~~~~~~~~~~~~"
            +"\nName:\t" + Name
            +"\nNumber:\t" + Number
            +"\nID:\t" + ID
            +"\nEmail:\t" + Email
            +"\nAddress:\t" + Address
            +"\nOccupation:\t" + Occupation
            +"\nMemberID:\t" +MemberID
            +"\n~~~~~~~~~~~~~~~~~~~"
            +"\n\n\tUPEPEO VIDEOS CARD:"
        );
    }//GEN-LAST:event_jButton_IDCARDActionPerformed

    private void jRd_PaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRd_PaidActionPerformed
        // TODO add your handling code here:
        if (jRd_Paid.isSelected())
            jRd_NotPaid.setSelected(false);
        jButton_IDCARD.setEnabled(true);
            jButton_SAVE.setEnabled(true);
    }//GEN-LAST:event_jRd_PaidActionPerformed

    private void jRd_NotPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRd_NotPaidActionPerformed
        // TODO add your handling code here:
        if (jRd_NotPaid.isSelected())
            jRd_Paid.setSelected(false);
           jButton_IDCARD.setEnabled(false);
            jButton_SAVE.setEnabled(false);
    }//GEN-LAST:event_jRd_NotPaidActionPerformed

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
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CLEAR;
    private javax.swing.JButton jButton_CLOSE;
    private javax.swing.JButton jButton_IDCARD;
    private javax.swing.JButton jButton_SAVE;
    private com.toedter.calendar.JDateChooser jDateChooser_DATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbl_MemID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRd_NotPaid;
    private javax.swing.JRadioButton jRd_Paid;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_ID;
    private javax.swing.JTextField jTxt_Address;
    private javax.swing.JTextField jTxt_Email;
    private javax.swing.JTextField jTxt_ID;
    private javax.swing.JTextField jTxt_Name;
    private javax.swing.JTextField jTxt_Occupation;
    private javax.swing.JTextField jTxt_Pnum;
    // End of variables declaration//GEN-END:variables
}
