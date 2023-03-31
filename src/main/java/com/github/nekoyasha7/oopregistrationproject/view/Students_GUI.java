package com.github.nekoyasha7.oopregistrationproject.view;

import com.github.nekoyasha7.oopregistrationproject.controller.StudentDAO;
import com.github.nekoyasha7.oopregistrationproject.model.StudentsTableModel;
import com.github.nekoyasha7.oopregistrationproject.view.ui.CustomCellRenderer;

import javax.swing.JOptionPane;

/**
 *
 * @author GiovaneNeves
 */
public class Students_GUI extends javax.swing.JFrame {

    StudentsTableModel tableModel = new StudentsTableModel();
    
    public Students_GUI() {

        initComponents();

        StudentDAO studentDAO = new StudentDAO();
        tableModel.getStudentList().add(studentDAO.findById(1));

        this.jTblStudents.setModel(tableModel);

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
        jPnlBackgroundOptionsMenu = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        lblOptions = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblStudents = new javax.swing.JTable();
        jBtnHomeScreen = new javax.swing.JButton();
        jBtnAddNewEntry = new javax.swing.JButton();
        jBtnClose = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        jPnlBackground.setLayout(null);

        jPnlBackgroundTopMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPnlBackgroundTopMenu.setLayout(null);

        jBtnMinimize.setBackground(new java.awt.Color(255, 139, 73));
        jBtnMinimize.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMinimize.setText("-");
        jBtnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinimizeActionPerformed(evt);
            }
        });
        jPnlBackgroundTopMenu.add(jBtnMinimize);
        jBtnMinimize.setBounds(530, 10, 80, 20);

        jPnlBackground.add(jPnlBackgroundTopMenu);
        jPnlBackgroundTopMenu.setBounds(10, 0, 620, 40);

        jPnlBackgroundOptionsMenu.setBackground(new java.awt.Color(255, 139, 73));
        jPnlBackgroundOptionsMenu.setLayout(null);

        jTextField1.setText("Pesquisar");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPnlBackgroundOptionsMenu.add(jTextField1);
        jTextField1.setBounds(91, 9, 530, 30);

        lblOptions.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblOptions.setForeground(new java.awt.Color(255, 255, 255));
        lblOptions.setText("Options");
        jPnlBackgroundOptionsMenu.add(lblOptions);
        lblOptions.setBounds(10, 10, 70, 17);

        jPnlBackground.add(jPnlBackgroundOptionsMenu);
        jPnlBackgroundOptionsMenu.setBounds(10, 40, 620, 40);

        jTblStudents.setBackground(new java.awt.Color(255, 139, 73));
        jTblStudents.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTblStudents.setForeground(new java.awt.Color(255, 255, 255));
        jTblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTblStudents);

        jPnlBackground.add(jScrollPane1);
        jScrollPane1.setBounds(100, 90, 530, 270);

        jBtnHomeScreen.setBackground(new java.awt.Color(255, 139, 73));
        jBtnHomeScreen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtnHomeScreen.setForeground(new java.awt.Color(255, 255, 255));
        jBtnHomeScreen.setText("Home");
        jPnlBackground.add(jBtnHomeScreen);
        jBtnHomeScreen.setBounds(10, 270, 60, 40);

        jBtnAddNewEntry.setBackground(new java.awt.Color(255, 139, 73));
        jBtnAddNewEntry.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBtnAddNewEntry.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAddNewEntry.setText("+");
        jBtnAddNewEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddNewEntryActionPerformed(evt);
            }
        });
        jPnlBackground.add(jBtnAddNewEntry);
        jBtnAddNewEntry.setBounds(10, 90, 60, 40);

        jBtnClose.setBackground(new java.awt.Color(255, 139, 73));
        jBtnClose.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtnClose.setForeground(new java.awt.Color(255, 255, 255));
        jBtnClose.setText("X");
        jBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCloseActionPerformed(evt);
            }
        });
        jPnlBackground.add(jBtnClose);
        jBtnClose.setBounds(10, 320, 60, 40);

        btnDelete.setBackground(new java.awt.Color(255, 139, 73));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        jPnlBackground.add(btnDelete);
        btnDelete.setBounds(10, 190, 60, 40);

        btnEdit.setBackground(new java.awt.Color(255, 139, 73));
        btnEdit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asmodeus di Laplace.png"))); // NOI18N
        btnEdit.setText("edit");
        jPnlBackground.add(btnEdit);
        btnEdit.setBounds(10, 140, 60, 40);

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
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close the program?", "Close Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
        
    }//GEN-LAST:event_jBtnCloseActionPerformed

    private void jBtnAddNewEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddNewEntryActionPerformed
        
        new AddStudent_GUI().setVisible(true);
    }//GEN-LAST:event_jBtnAddNewEntryActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Students_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton jBtnAddNewEntry;
    private javax.swing.JButton jBtnClose;
    private javax.swing.JButton jBtnHomeScreen;
    private javax.swing.JButton jBtnMinimize;
    private javax.swing.JPanel jPnlBackground;
    private javax.swing.JPanel jPnlBackgroundOptionsMenu;
    private javax.swing.JPanel jPnlBackgroundTopMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblStudents;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblOptions;
    // End of variables declaration//GEN-END:variables
}
