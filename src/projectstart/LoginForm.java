/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectstart;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import backEnd.*;
import javax.swing.JFrame;

/**
 *
 * @author fazee
 */
public class LoginForm extends javax.swing.JFrame {

    EmployeeDashboard emp = new EmployeeDashboard();
    DBConnection con = new DBConnection();

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        BtnLogin = new javax.swing.JButton();
        upass = new javax.swing.JPasswordField();
        chkBoxPassword = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(563, 574));

        jPanel2.setBackground(new java.awt.Color(98, 99, 101));
        jPanel2.setLayout(null);
        jPanel2.add(txtID);
        txtID.setBounds(210, 210, 210, 50);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(230, 430, 120, 30);

        BtnLogin.setBackground(new java.awt.Color(153, 153, 153));
        BtnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnLogin.setText("LOGIN");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(BtnLogin);
        BtnLogin.setBounds(210, 470, 160, 40);
        jPanel2.add(upass);
        upass.setBounds(210, 310, 210, 50);

        chkBoxPassword.setText("Show Password");
        chkBoxPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(chkBoxPassword);
        chkBoxPassword.setBounds(210, 390, 160, 24);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Password.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(140, 310, 60, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/username.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(140, 210, 60, 60);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText(" PASSWORD:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(210, 270, 200, 40);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("  USERNAME:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(210, 170, 200, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Daco_2735205.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(230, 20, 160, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        // TODO add your handling code here:
//        String ID=txtID.getText();
        if (jComboBox1.getSelectedItem().equals("Admin")) {
            con.EstablishConnection();
            String UN = txtID.getText();
            String UP = upass.getText();

            Login log = new Login();
            boolean b;
            try {
                b = log.AdminLogin(UN, UP);
                if (b) {
                    JOptionPane.showMessageDialog(null, "Admin Logged In!");

                    dispose();
                    Admin ad = new Admin();
                    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ad.adminName = txtID.getText();
                    ad.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Log In Denied!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            con.EstablishConnection();
            String id = txtID.getText();
            String UP = upass.getText();

            Login log = new Login();
            boolean b;
            try {
                b = log.EmpLogin(id, UP);
                if (b) {
                    emp.EmpID = txtID.getText();
                    JOptionPane.showMessageDialog(null, "Employee Logged In!");
//                emp.setEmployeeID(ID);
                    emp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                    emp.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Log In Denied!");

                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_BtnLoginActionPerformed

    private void chkBoxPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxPasswordActionPerformed
        if (chkBoxPassword.isSelected()) {
            upass.setEchoChar((char) 0);
        } else {
            upass.setEchoChar('*');
        }
    }//GEN-LAST:event_chkBoxPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JCheckBox chkBoxPassword;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField upass;
    // End of variables declaration//GEN-END:variables
}
