/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.SchoolManagmentSystem.GUI;

import java.awt.CardLayout;
import java.awt.LayoutManager;

/**
 * ImportantNewsPanel.java
 * @author R. Yson
 * JPANEL for viewing news and other announcements
 */
public class ImportantNewsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ImportantNewsMainPanel
     */
    public ImportantNewsPanel() {
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

        lblImportantNews = new javax.swing.JLabel();
        scrollImportantNews = new javax.swing.JScrollPane();
        listNewsItems = new javax.swing.JList();
        lblSelectInstructions = new javax.swing.JLabel();
        scrollMessage = new javax.swing.JScrollPane();
        txtAreaMessage = new javax.swing.JTextArea();
        lblMessage = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(500, 700));
        setLayout(null);

        lblImportantNews.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblImportantNews.setForeground(new java.awt.Color(204, 204, 204));
        lblImportantNews.setText("Important News");
        add(lblImportantNews);
        lblImportantNews.setBounds(149, 29, 197, 29);

        listNewsItems.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "13/03/2015 @ 19:00 \"REMINDER - Intro to Multimedia CA1 Due 14/03/2015\"", "13/03/2015 @ 20:00 \"REMINDER - Object Oriented Programming CA2 Due 14/03/2015\"", "13/03/2015 @ 21:00 \"Reading Week - 14/03/2015 to 20/03/2015\"" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollImportantNews.setViewportView(listNewsItems);

        add(scrollImportantNews);
        scrollImportantNews.setBounds(85, 111, 330, 155);

        lblSelectInstructions.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSelectInstructions.setForeground(new java.awt.Color(204, 204, 204));
        lblSelectInstructions.setText("Select item below to read message:");
        add(lblSelectInstructions);
        lblSelectInstructions.setBounds(125, 76, 243, 17);

        txtAreaMessage.setColumns(20);
        txtAreaMessage.setRows(5);
        txtAreaMessage.setText("Message content appears here...\n\n\n\n\n\n\n\n");
        scrollMessage.setViewportView(txtAreaMessage);

        add(scrollMessage);
        scrollMessage.setBounds(85, 349, 330, 173);

        lblMessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(204, 204, 204));
        lblMessage.setText("Your Message:");
        add(lblMessage);
        lblMessage.setBounds(195, 314, 101, 17);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("Done");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(143, 540, 214, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ie/SchoolManagmentSystem/GUI/ExamsAppBackground.png"))); // NOI18N
        lblBackground.setPreferredSize(new java.awt.Dimension(500, 700));
        add(lblBackground);
        lblBackground.setBounds(0, 0, 500, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "COMMUNICATIONS");
        }
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblImportantNews;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblSelectInstructions;
    private javax.swing.JList listNewsItems;
    private javax.swing.JScrollPane scrollImportantNews;
    private javax.swing.JScrollPane scrollMessage;
    private javax.swing.JTextArea txtAreaMessage;
    // End of variables declaration//GEN-END:variables
}