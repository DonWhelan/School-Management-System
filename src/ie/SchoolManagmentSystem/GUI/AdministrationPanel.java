/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.SchoolManagmentSystem.GUI;

import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


/**
 * AdministrationPanel.java
 * @author D. Whelan
 * JPANEL for viewing "Administration" navigation page
 */
public class AdministrationPanel extends javax.swing.JPanel {

    /**
     * Creates new form Screen2Panel
     */
    public AdministrationPanel() {
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

        lblAdministration = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnUploads = new javax.swing.JButton();
        btnAttendance = new javax.swing.JButton();
        btnGrades = new javax.swing.JButton();
        btnEditStudents = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setLayout(null);

        lblAdministration.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAdministration.setForeground(new java.awt.Color(204, 204, 204));
        lblAdministration.setText("Administration");
        add(lblAdministration);
        lblAdministration.setBounds(170, 40, 210, 30);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(140, 570, 228, 65);

        btnUploads.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUploads.setText("Uploads");
        btnUploads.setFocusCycleRoot(true);
        btnUploads.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadsActionPerformed(evt);
            }
        });
        add(btnUploads);
        btnUploads.setBounds(140, 130, 228, 65);

        btnAttendance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAttendance.setText("Attendance");
        btnAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendanceActionPerformed(evt);
            }
        });
        add(btnAttendance);
        btnAttendance.setBounds(140, 240, 228, 65);

        btnGrades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGrades.setText("Grades");
        btnGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradesActionPerformed(evt);
            }
        });
        add(btnGrades);
        btnGrades.setBounds(140, 350, 228, 65);

        btnEditStudents.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditStudents.setText("Edit Students");
        btnEditStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditStudentsActionPerformed(evt);
            }
        });
        add(btnEditStudents);
        btnEditStudents.setBounds(140, 460, 228, 65);

        lblBackground.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBackground.setForeground(new java.awt.Color(204, 204, 204));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ie/SchoolManagmentSystem/GUI/ExamsAppBackground.png"))); // NOI18N
        lblBackground.setPreferredSize(new java.awt.Dimension(500, 700));
        add(lblBackground);
        lblBackground.setBounds(0, 0, 500, 700);
    }// </editor-fold>//GEN-END:initComponents

//Back button    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_btnBackActionPerformed

//Grades    
    private void btnGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradesActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "GRADES");
        }
    }//GEN-LAST:event_btnGradesActionPerformed

//Uploads
    private void btnUploadsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadsActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "UPLOADS");
        }
    }//GEN-LAST:event_btnUploadsActionPerformed

//Attendance    
    private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendanceActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "ATTENDANCE");
        }
    }//GEN-LAST:event_btnAttendanceActionPerformed

//EditStudents    
    private void btnEditStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditStudentsActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "ADDREMOVE");
        }
    }//GEN-LAST:event_btnEditStudentsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttendance;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditStudents;
    private javax.swing.JButton btnGrades;
    private javax.swing.JButton btnUploads;
    private javax.swing.JLabel lblAdministration;
    private javax.swing.JLabel lblBackground;
    // End of variables declaration//GEN-END:variables
}