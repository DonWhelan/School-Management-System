/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.SchoolManagmentSystem.GUI;

import java.awt.CardLayout;
import java.awt.LayoutManager;

/**
 * CourseContentCAPanel.java
 * @author H. Alabi
 * JPANEL for viewing CA deadlines and exam dates
 */
public class CourseContentCAPanel extends javax.swing.JPanel {

    /**
     * Creates new form Screen2Panel
     */
    public CourseContentCAPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        scrollCADates = new javax.swing.JScrollPane();
        tableCADates = new javax.swing.JTable();
        lblCADateIntro = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(500, 700));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("CA Dates");
        add(jLabel1);
        jLabel1.setBounds(182, 29, 136, 29);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(139, 292, 214, 30);

        tableCADates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CA1 25% 06/01/2015", "CA1 20% 02/02/2015", "LAB 20% 02/11/2015"},
                {"CA2 25% 11/01/2015", "LAB 30% 17/02/2015", "CA 30% 16/03/2015"},
                {"EXAM 50% 25/06/2015", "EXAM 50% 26/06/2015", "EXAM 50% 27/06/2015"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mathematics", "Science", "Technology"
            }
        ));
        scrollCADates.setViewportView(tableCADates);
        if (tableCADates.getColumnModel().getColumnCount() > 0) {
            tableCADates.getColumnModel().getColumn(0).setResizable(false);
            tableCADates.getColumnModel().getColumn(1).setResizable(false);
            tableCADates.getColumnModel().getColumn(2).setResizable(false);
        }

        add(scrollCADates);
        scrollCADates.setBounds(45, 111, 403, 151);

        lblCADateIntro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCADateIntro.setForeground(new java.awt.Color(204, 204, 204));
        lblCADateIntro.setText("Record of course assignment deadlines:");
        add(lblCADateIntro);
        lblCADateIntro.setBounds(45, 76, 273, 17);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ie/SchoolManagmentSystem/GUI/ExamsAppBackground.png"))); // NOI18N
        lblBackground.setPreferredSize(new java.awt.Dimension(500, 700));
        add(lblBackground);
        lblBackground.setBounds(0, 0, 500, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "COURSE CONTENT");
        }
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCADateIntro;
    private javax.swing.JScrollPane scrollCADates;
    private javax.swing.JTable tableCADates;
    // End of variables declaration//GEN-END:variables
}
