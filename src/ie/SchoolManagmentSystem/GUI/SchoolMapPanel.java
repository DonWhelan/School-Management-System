/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.SchoolManagmentSystem.GUI;

import java.awt.CardLayout;
import java.awt.LayoutManager;

/**
 * SchoolMapMainScreenPanel.java
 * @author R. Yson
 * JPANEL for viewing "School Map" navigation page
 */
public class SchoolMapPanel extends javax.swing.JPanel {

    /**
     * Creates new form SchoolMapMainScreenPanel
     */
    public SchoolMapPanel() {
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

        lblSchoolMapMainScreen = new javax.swing.JLabel();
        btnBuildings = new javax.swing.JButton();
        btnDirections = new javax.swing.JButton();
        lblSchoolMap = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(500, 700));
        setLayout(null);

        lblSchoolMapMainScreen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSchoolMapMainScreen.setForeground(new java.awt.Color(204, 204, 204));
        lblSchoolMapMainScreen.setText("School Map");
        add(lblSchoolMapMainScreen);
        lblSchoolMapMainScreen.setBounds(181, 29, 137, 51);

        btnBuildings.setText("Buildings");
        btnBuildings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuildingsActionPerformed(evt);
            }
        });
        add(btnBuildings);
        btnBuildings.setBounds(50, 550, 130, 30);

        btnDirections.setText("Directions");
        btnDirections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirectionsActionPerformed(evt);
            }
        });
        add(btnDirections);
        btnDirections.setBounds(330, 550, 130, 30);

        lblSchoolMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ie/SchoolManagmentSystem/GUI/harrypottermap_sml.jpg"))); // NOI18N
        lblSchoolMap.setPreferredSize(new java.awt.Dimension(400, 300));
        add(lblSchoolMap);
        lblSchoolMap.setBounds(94, 86, 313, 407);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(190, 550, 130, 30);
        add(lblBackground);
        lblBackground.setBounds(0, 0, 500, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuildingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuildingsActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "BUILDINGS");
        }
    }//GEN-LAST:event_btnBuildingsActionPerformed

    private void btnDirectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirectionsActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "DIRECTIONS");
        }
    }//GEN-LAST:event_btnDirectionsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "STUDENT");
        }
    }//GEN-LAST:event_btnBackActionPerformed
                                                          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuildings;
    private javax.swing.JButton btnDirections;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblSchoolMap;
    private javax.swing.JLabel lblSchoolMapMainScreen;
    // End of variables declaration//GEN-END:variables
}

/*ERROR BANK
* 1.) Did not double-click on JButtons in Design mode - need Netbeans to 
* automatically generate ActionEvent codes or it won't understand perfectly
* fine hard-coded ActionEvents!!!
*/