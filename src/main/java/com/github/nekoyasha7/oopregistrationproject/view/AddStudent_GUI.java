package com.github.nekoyasha7.oopregistrationproject.view;

//--+ Imports +--//
import com.github.nekoyasha7.oopregistrationproject.dao.StudentDAO;
import com.github.nekoyasha7.oopregistrationproject.model.Student;
import com.github.nekoyasha7.oopregistrationproject.controller.DataFormatValidator;

import java.time.LocalDate;

import javax.swing.JOptionPane;
//--+ END Imports +--//

/**
 *
 * @author GiovaneNeves
 */
public class AddStudent_GUI extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent_GUI
     */
    public AddStudent_GUI() {
        
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

        jPnlBackground = new javax.swing.JPanel();
        jPnlBackgroundTopMenu = new javax.swing.JPanel();
        jBtnMinimize = new javax.swing.JButton();
        jBtnClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        txtGrade1 = new javax.swing.JTextField();
        txtGrade2 = new javax.swing.JTextField();
        txtGrade3 = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtRegistrationNumber = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtAcademicYear = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPnlBackground.setLayout(null);

        jPnlBackgroundTopMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPnlBackgroundTopMenu.setLayout(null);

        jBtnMinimize.setBackground(new java.awt.Color(255, 139, 73));
        jBtnMinimize.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMinimize.setText("-");
        jBtnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinimizeActionPerformed(evt);
            }
        });
        jPnlBackgroundTopMenu.add(jBtnMinimize);
        jBtnMinimize.setBounds(510, 10, 40, 23);

        jBtnClose.setBackground(new java.awt.Color(255, 139, 73));
        jBtnClose.setForeground(new java.awt.Color(255, 255, 255));
        jBtnClose.setText("X");
        jBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCloseActionPerformed(evt);
            }
        });
        jPnlBackgroundTopMenu.add(jBtnClose);
        jBtnClose.setBounds(560, 10, 50, 22);

        jPnlBackground.add(jPnlBackgroundTopMenu);
        jPnlBackgroundTopMenu.setBounds(10, 0, 620, 40);

        jPanel1.setBackground(new java.awt.Color(255, 139, 73));

        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 139, 73));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtGrade1.setText("Grade 01");

        txtGrade2.setText("Grade 02");
        txtGrade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrade2ActionPerformed(evt);
            }
        });

        txtGrade3.setText("Grade 03");

        txtName.setText("Name");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtRegistrationNumber.setText("Registration Number");
        txtRegistrationNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrationNumberActionPerformed(evt);
            }
        });

        txtAcademicYear.setText("Academic Year");

        txtBirthDate.setText("Birth Date");
        txtBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(197, 197, 197))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRegistrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAcademicYear, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(txtBirthDate))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtGrade1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(txtGrade2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(txtGrade3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGrade2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrade1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrade3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPnlBackground.add(jPanel1);
        jPanel1.setBounds(10, 40, 620, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(639, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinimizeActionPerformed

        //--+ Minimizes the window +--//
        setState(javax.swing.JFrame.ICONIFIED);

    }//GEN-LAST:event_jBtnMinimizeActionPerformed

    private void jBtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCloseActionPerformed

        //--+ Closes the program +--//
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this window?", "Close Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        dispose();

    }//GEN-LAST:event_jBtnCloseActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtRegistrationNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrationNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistrationNumberActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        
        
        String[] textFieldContents = {txtName.getText(), txtRegistrationNumber.getText(), txtGrade1.getText(), txtGrade2.getText(), txtGrade3.getText()};
                                                   
        //--+ Checks if text fields are valid +--//
        if(!DataFormatValidator.isNull(textFieldContents)){
            
            LocalDate birthDate = DataFormatValidator.convertToLocalDate(txtBirthDate.getText());
                    
            //--+ Checks if 'birthDate' are valid. +--//
            if(birthDate != null){
                
                int academicYear = DataFormatValidator.convertToInt(txtAcademicYear.getText());
                
                //--+ Checks if 'academicYear' are valid +--//
                if(academicYear != -1){
                    
                    String[] stringGrades = {txtGrade1.getText(), txtGrade2.getText(), txtGrade3.getText()};
                    float[] convertedGrades = new float[stringGrades.length];

                    //--+ Converts the note strings to float +--//
                    for(int i = 0; i < stringGrades.length; i++){

                        convertedGrades[i] = DataFormatValidator.convertToFloat(stringGrades[i]);
                        if(convertedGrades[i] == -1) return;

                    }

                    //--+ Sets the student's grade point average +--//
                    float  sum = sumUpGrades(convertedGrades);
                    float average = (sum != 0) ? (sum / convertedGrades.length) : 0;

                    Student newStudent = new Student();

                    newStudent.setName(txtName.getText());
                    newStudent.setRegistrationNumber(txtRegistrationNumber.getText());
                    newStudent.setBirthDate(birthDate);
                    newStudent.setAcademicYear(academicYear);
                    newStudent.setGrades(convertedGrades);
                    newStudent.setAverageGrades(average);

                    StudentDAO newRegistration = new StudentDAO();

                    //--+ Registers the new student in the database +--//
                    newRegistration.add(newStudent);
                }
                
            }
                
            
        }
        
        
        
        
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    /**
     * 
     * @param grades to be that will be added up.
     * @return of all as grades.
     */
    private float sumUpGrades(float[] grades){
        
        float sum = 0;
        
        for(float grade : grades){
            sum += grade;
        }
        
        return sum;
    }
    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthDateActionPerformed

    private void txtGrade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrade2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrade2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jBtnClose;
    private javax.swing.JButton jBtnMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPnlBackground;
    private javax.swing.JPanel jPnlBackgroundTopMenu;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAcademicYear;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtGrade1;
    private javax.swing.JTextField txtGrade2;
    private javax.swing.JTextField txtGrade3;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRegistrationNumber;
    // End of variables declaration//GEN-END:variables
}
