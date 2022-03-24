/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectstart;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import backEnd.*;

public class EditEmployee extends javax.swing.JFrame {

    /**
     * Creates new form EditEmployee
     */
    public EditEmployee() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

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
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtLeave = new javax.swing.JTextField();
        txtQual = new javax.swing.JTextField();
        txtSal = new javax.swing.JTextField();
        ComboDesg = new javax.swing.JComboBox<>();
        ComboDept = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        curDesg = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        curDept = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        curQual = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        curSal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        curLeave = new javax.swing.JLabel();
        empName = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        empAge = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        empPhone = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 909));

        jPanel1.setBackground(new java.awt.Color(98, 99, 101));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Employee Name:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 100, 210, 46);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Enter Employee ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 50, 140, 46);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Edit Department:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 280, 210, 46);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("  Edit Designation:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 500, 210, 46);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("  Current Qualification:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 330, 210, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Edit Leaves:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(150, 700, 210, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Edit Salary:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 610, 210, 46);

        btnUpdate.setForeground(new java.awt.Color(51, 0, 51));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(483, 774, 142, 49);

        btnSearch.setForeground(new java.awt.Color(51, 0, 51));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(313, 774, 142, 49);
        jPanel1.add(txtID);
        txtID.setBounds(360, 50, 256, 42);
        jPanel1.add(txtLeave);
        txtLeave.setBounds(360, 700, 256, 40);

        txtQual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualActionPerformed(evt);
            }
        });
        jPanel1.add(txtQual);
        txtQual.setBounds(360, 380, 256, 46);
        jPanel1.add(txtSal);
        txtSal.setBounds(360, 610, 256, 46);

        ComboDesg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEO", "Manager", "Staff" }));
        jPanel1.add(ComboDesg);
        ComboDesg.setBounds(360, 500, 256, 37);

        ComboDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Finance", "HR", "Technical", "Marketing" }));
        jPanel1.add(ComboDept);
        ComboDept.setBounds(360, 280, 256, 37);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("  Current Designation:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 450, 200, 39);

        curDesg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(curDesg);
        curDesg.setBounds(360, 450, 256, 39);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("Current Department:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(150, 200, 180, 28);

        curDept.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(curDept);
        curDept.setBounds(360, 190, 250, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("    Edit Qualification:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(130, 380, 210, 46);

        curQual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(curQual);
        curQual.setBounds(360, 330, 250, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 51));
        jLabel11.setText("Current Salary:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(150, 560, 180, 40);

        curSal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(curSal);
        curSal.setBounds(360, 560, 260, 40);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 51));
        jLabel13.setText("  Current Leaves:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(140, 650, 130, 40);

        curLeave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(curLeave);
        curLeave.setBounds(360, 660, 260, 30);

        empName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(empName);
        empName.setBounds(360, 100, 260, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 51));
        jLabel12.setText("Age:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(150, 250, 180, 30);

        empAge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(empAge);
        empAge.setBounds(360, 240, 260, 40);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 0, 51));
        jLabel14.setText("Employee Phone:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(150, 150, 170, 40);
        jPanel1.add(empPhone);
        empPhone.setBounds(360, 140, 250, 50);

        btnHome.setForeground(new java.awt.Color(51, 0, 51));
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome);
        btnHome.setBounds(750, 0, 150, 50);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 0, 51));
        jLabel15.setText("                                       EDIT EMPLOYEE");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(150, 10, 570, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        AdminOperations op = new AdminOperations();
        DepartmentDec dc = new DepartmentDec();

        String id = txtID.getText();
        String age = empAge.getText();
        String phone = empPhone.getText();
        String name = empName.getText();
        String qual = txtQual.getText();
        String EditSal = txtSal.getText();
        String leave = txtLeave.getText();
        String Dept = null;
        String Desg = null;

        if (ComboDept.getSelectedItem().equals("HR")) {
            Dept = dc.HR.getDeptName();
        } else if (ComboDept.getSelectedItem() == "Finance") {
            Dept = dc.Finance.getDeptName();
        } else if (ComboDept.getSelectedItem() == "Technical") {
            Dept = dc.Technical.getDeptName();
        } else if (ComboDept.getSelectedItem() == "Marketing") {
            Dept = dc.Marketing.getDeptName();
        } else {
            JOptionPane.showMessageDialog(null, "Choose a department please!");
        }

        if (ComboDesg.getSelectedItem() == "CEO") {
            Desg = dc.CEO.getDesName();
        } else if (ComboDesg.getSelectedItem() == "Manager") {
            Desg = dc.Manager.getDesName();
        } else if (ComboDesg.getSelectedItem() == "Staff") {
            Desg = dc.Staff.getDesName();
        } else {
            JOptionPane.showMessageDialog(null, "Choose a Designation please!");
        }

        boolean access;
        try {
            access = op.adminEmpUpdate(id, name, age, phone, Dept, qual, Desg, EditSal, leave);
            if (access) {
                JOptionPane.showMessageDialog(null, "Record Updated!");
            } else {
                JOptionPane.showMessageDialog(null, "Error.");
            }
        } catch (Exception ex) {
            Logger.getLogger(EditEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        EmployeeOperations op = new EmployeeOperations();
        int id = Integer.parseInt(txtID.getText());
        boolean b;
        try {
            b = op.fetchUser(id);
            if (b) {
                empName.setText(op.Name);
                empAge.setText(op.Age);
                empPhone.setText(op.Phone);
                curDept.setText(op.Dept);
                curQual.setText(op.Qual);
                curDesg.setText(op.Desg);
                curSal.setText(op.Salary.toString());
                curLeave.setText(Integer.toString(op.AvLeaves));
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        } catch (Exception ex) {
            Logger.getLogger(EditEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtQualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        Admin ad = new Admin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboDept;
    private javax.swing.JComboBox<String> ComboDesg;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel curDept;
    private javax.swing.JLabel curDesg;
    private javax.swing.JLabel curLeave;
    private javax.swing.JLabel curQual;
    private javax.swing.JLabel curSal;
    private javax.swing.JLabel empAge;
    private javax.swing.JLabel empName;
    private javax.swing.JLabel empPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLeave;
    private javax.swing.JTextField txtQual;
    private javax.swing.JTextField txtSal;
    // End of variables declaration//GEN-END:variables
}
