/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectstart;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fazee
 */
public class Admin extends javax.swing.JFrame {

    String adminName;
    
    public Admin() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnAdd = new javax.swing.JButton();
        BtnAnnouncements = new javax.swing.JButton();
        BtnContact = new javax.swing.JButton();
        BtnLeave = new javax.swing.JButton();
        BtnSuggest = new javax.swing.JButton();
        BtnLogOut = new javax.swing.JButton();
        BtnSuggest1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(98, 99, 101));
        jPanel1.setLayout(null);

        BtnAdd.setBackground(new java.awt.Color(153, 153, 153));
        BtnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnAdd.setForeground(new java.awt.Color(51, 0, 51));
        BtnAdd.setText("Add Employee");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAdd);
        BtnAdd.setBounds(275, 264, 248, 54);

        BtnAnnouncements.setBackground(new java.awt.Color(153, 153, 153));
        BtnAnnouncements.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnAnnouncements.setForeground(new java.awt.Color(51, 0, 51));
        BtnAnnouncements.setText("Check Leave Applications");
        BtnAnnouncements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnnouncementsActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAnnouncements);
        BtnAnnouncements.setBounds(275, 601, 249, 54);

        BtnContact.setBackground(new java.awt.Color(153, 153, 153));
        BtnContact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnContact.setForeground(new java.awt.Color(51, 0, 51));
        BtnContact.setText("Make Announcement");
        BtnContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContactActionPerformed(evt);
            }
        });
        jPanel1.add(BtnContact);
        BtnContact.setBounds(275, 465, 249, 53);

        BtnLeave.setBackground(new java.awt.Color(153, 153, 153));
        BtnLeave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnLeave.setForeground(new java.awt.Color(51, 0, 51));
        BtnLeave.setText("Edit or Promote Employee");
        BtnLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLeaveActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLeave);
        BtnLeave.setBounds(275, 535, 249, 54);

        BtnSuggest.setBackground(new java.awt.Color(153, 153, 153));
        BtnSuggest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnSuggest.setForeground(new java.awt.Color(51, 0, 51));
        BtnSuggest.setText("Check Suggestions & Complaints");
        BtnSuggest.setMaximumSize(new java.awt.Dimension(163, 33));
        BtnSuggest.setMinimumSize(new java.awt.Dimension(163, 33));
        BtnSuggest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSuggestActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSuggest);
        BtnSuggest.setBounds(275, 393, 249, 53);

        BtnLogOut.setBackground(new java.awt.Color(153, 153, 153));
        BtnLogOut.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnLogOut.setForeground(new java.awt.Color(51, 0, 51));
        BtnLogOut.setText("Log Out");
        BtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLogOut);
        BtnLogOut.setBounds(638, 0, 99, 48);

        BtnSuggest1.setBackground(new java.awt.Color(153, 153, 153));
        BtnSuggest1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnSuggest1.setForeground(new java.awt.Color(51, 0, 51));
        BtnSuggest1.setText("View or Remove Employee");
        BtnSuggest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSuggest1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSuggest1);
        BtnSuggest1.setBounds(275, 324, 248, 54);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(275, 6, 232, 207);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("             ADMIN DASHBOARD");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(178, 219, 348, 43);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("Check Messages");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(275, 670, 249, 53);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 320, 59, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/announce.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 460, 61, 61);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contact.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 670, 60, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/suggestions.png"))); // NOI18N
        jLabel6.setText("jLabel2");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(200, 390, 60, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leave.png"))); // NOI18N
        jLabel7.setText("jLabel6");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(210, 600, 60, 61);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(210, 260, 59, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(210, 530, 59, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAnnouncementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnnouncementsActionPerformed
        LeaveApp la=new LeaveApp();
        la.setVisible(true);
        la.displayLeaveRequests();
        this.dispose();
    }//GEN-LAST:event_BtnAnnouncementsActionPerformed

    private void BtnContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContactActionPerformed
        AddAnnouncement ann=new AddAnnouncement();
        ann.adminName=this.adminName;
        ann.displayName();
        ann.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnContactActionPerformed

    private void BtnLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLeaveActionPerformed
       EditEmployee ed=new EditEmployee();
       ed.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BtnLeaveActionPerformed

    private void BtnSuggestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSuggestActionPerformed
        SuggestionsComplaints sc=new SuggestionsComplaints();
        sc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnSuggestActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        AddEmployee ad=new AddEmployee();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogOutActionPerformed
        LoginForm log = new LoginForm();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnLogOutActionPerformed

    private void BtnSuggest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSuggest1ActionPerformed
       ViewDelEmployee vd=new ViewDelEmployee();
       vd.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BtnSuggest1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Messages msg = new Messages();
        try {
            msg.displayTable();
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        msg.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnAnnouncements;
    private javax.swing.JButton BtnContact;
    private javax.swing.JButton BtnLeave;
    private javax.swing.JButton BtnLogOut;
    private javax.swing.JButton BtnSuggest;
    private javax.swing.JButton BtnSuggest1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
