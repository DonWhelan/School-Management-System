/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.SchoolManagmentSystem.GUI;

import java.awt.CardLayout;
import java.awt.LayoutManager;
import javax.swing.JOptionPane;

/**
 * ExamSchedulePanel.java
 * @author PatrickKing
 * JPANEL for viewing details for exam schedules
 */
public class ExamSchedulePanel extends javax.swing.JPanel {

    /**
     * Creates new form NewExamSchedule
     */
    public ExamSchedulePanel() {
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
        lblExamSchedule = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblSemester = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        comboSemester = new javax.swing.JComboBox();
        comboYear = new javax.swing.JComboBox();
        comboSubject = new javax.swing.JComboBox();
        lblDateOfExam = new javax.swing.JLabel();
        txtDateOfExam = new javax.swing.JTextField();
        lblTimeOfExam = new javax.swing.JLabel();
        txtTimeOfExam = new javax.swing.JTextField();
        lblRoom = new javax.swing.JLabel();
        txtRoom = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 800));
        jPanel1.setLayout(null);

        lblExamSchedule.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblExamSchedule.setForeground(new java.awt.Color(204, 204, 204));
        lblExamSchedule.setText("Exam Schedule");
        jPanel1.add(lblExamSchedule);
        lblExamSchedule.setBounds(150, 20, 210, 40);

        lblYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblYear.setForeground(new java.awt.Color(204, 204, 204));
        lblYear.setText("Year");
        jPanel1.add(lblYear);
        lblYear.setBounds(80, 110, 60, 17);

        lblSemester.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSemester.setForeground(new java.awt.Color(204, 204, 204));
        lblSemester.setText("Semester");
        jPanel1.add(lblSemester);
        lblSemester.setBounds(80, 160, 80, 17);

        lblSubject.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubject.setForeground(new java.awt.Color(204, 204, 204));
        lblSubject.setText("Subject");
        jPanel1.add(lblSubject);
        lblSubject.setBounds(80, 210, 70, 17);

        comboSemester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semester 1", "Semester 2" }));
        jPanel1.add(comboSemester);
        comboSemester.setBounds(150, 150, 300, 25);

        comboYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2012-2013", "2013-2014", "2014-2015" }));
        comboYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboYearActionPerformed(evt);
            }
        });
        jPanel1.add(comboYear);
        comboYear.setBounds(150, 100, 300, 25);

        comboSubject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mathematics", "Science", "Technology" }));
        comboSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSubjectActionPerformed(evt);
            }
        });
        jPanel1.add(comboSubject);
        comboSubject.setBounds(150, 200, 300, 25);

        lblDateOfExam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDateOfExam.setForeground(new java.awt.Color(204, 204, 204));
        lblDateOfExam.setText("Date of Exam:");
        jPanel1.add(lblDateOfExam);
        lblDateOfExam.setBounds(80, 350, 140, 30);

        txtDateOfExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfExamActionPerformed(evt);
            }
        });
        jPanel1.add(txtDateOfExam);
        txtDateOfExam.setBounds(190, 350, 190, 40);

        lblTimeOfExam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTimeOfExam.setForeground(new java.awt.Color(204, 204, 204));
        lblTimeOfExam.setText("Time of Exam:");
        jPanel1.add(lblTimeOfExam);
        lblTimeOfExam.setBounds(80, 410, 130, 30);

        txtTimeOfExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeOfExamActionPerformed(evt);
            }
        });
        jPanel1.add(txtTimeOfExam);
        txtTimeOfExam.setBounds(190, 410, 190, 40);

        lblRoom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRoom.setForeground(new java.awt.Color(204, 204, 204));
        lblRoom.setText("Room:");
        jPanel1.add(lblRoom);
        lblRoom.setBounds(80, 470, 120, 20);

        txtRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomActionPerformed(evt);
            }
        });
        jPanel1.add(txtRoom);
        txtRoom.setBounds(190, 470, 190, 40);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(130, 540, 214, 30);

        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 260, 65, 23);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ie/SchoolManagmentSystem/GUI/ExamsAppBackground.png"))); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(0, 0, 500, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboYearActionPerformed

    private void comboSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSubjectActionPerformed

    private void txtDateOfExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfExamActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDateOfExamActionPerformed

    private void txtTimeOfExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeOfExamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeOfExamActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "EXAMS");
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Saved", "Attention", JOptionPane.WARNING_MESSAGE);
        // TODO add your handling code here:
        //Object yearObj = comboYear.getSelectedItem();
        //String year = (String)yearObj;
        //Object semObj = comboSemester.getSelectedItem();
        //String semester = (String)semObj;
        String year = comboYear.getSelectedItem().toString();
        String semester =comboSemester.getSelectedItem().toString();
        String subject = comboSubject.getSelectedItem().toString();
        
       if(year.equals("2013-2014") && semester.equals("Semester 1"))
       {
           if(subject.equals("Science"))
           {
             txtDateOfExam.setText("December 18th");
             txtTimeOfExam.setText("11:00");
             txtRoom.setText("26");
           }
           else if(subject.equals("Technology"))
           {
               txtDateOfExam.setText("December 20th");
               txtTimeOfExam.setText("13:00");
               txtRoom.setText("1A");
           }
           else
           {
              txtDateOfExam.setText("December 10th");
              txtTimeOfExam.setText("15:00");
              txtRoom.setText("3C");
           }
           
           /*switch (subject)
            {
                case "Science":
                    txtDateOfExam.setText("December 18th");
                    break;
                case "Technology":
                    txtDateOfExam.setText("December 20th");
                    break;
                default:
                    txtDateOfExam.setText("December 10th");
                    break;
            }*/
       }
       else
       {
           if(subject.equals("Science"))
           {
            txtDateOfExam.setText("May 18th");
            txtTimeOfExam.setText("14:00");
            txtRoom.setText("2A");
           }
           else if(subject.equals("Technology"))
           {
               txtDateOfExam.setText("May 20th");
               txtTimeOfExam.setText("16:00");
               txtRoom.setText("4D");
           }
           else
           {
              txtDateOfExam.setText("May 10th");
              txtTimeOfExam.setText("17:00");
              txtRoom.setText("MPC");
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboSemester;
    private javax.swing.JComboBox comboSubject;
    private javax.swing.JComboBox comboYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDateOfExam;
    private javax.swing.JLabel lblExamSchedule;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblTimeOfExam;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtDateOfExam;
    private javax.swing.JTextField txtRoom;
    private javax.swing.JTextField txtTimeOfExam;
    // End of variables declaration//GEN-END:variables
}
