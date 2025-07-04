/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ead.eadcw;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class HomeForm extends javax.swing.JFrame {

    /**
     * Creates new form HomeForm
     */
    public HomeForm() {
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

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        closeMenuItem = new javax.swing.JMenuItem();
        booksMenu = new javax.swing.JMenu();
        bManageMenuItem = new javax.swing.JMenuItem();
        brManageMenuItem = new javax.swing.JMenuItem();
        membersMenu = new javax.swing.JMenu();
        mManageMenuItem = new javax.swing.JMenuItem();
        fManageMenuItem = new javax.swing.JMenuItem();
        reportMenu = new javax.swing.JMenu();
        bReportMenuItem = new javax.swing.JMenuItem();
        fReportMenuItem = new javax.swing.JMenuItem();
        settingsMenu = new javax.swing.JMenu();
        pChangeMenuItem = new javax.swing.JMenuItem();

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Manager");
        setMinimumSize(new java.awt.Dimension(500, 100));
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mkt_public_library_a9dd768fad.jpg"))); // NOI18N
        getContentPane().add(jLabel1, "card2");

        fileMenu.setText("File");

        closeMenuItem.setText("Close");
        closeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(closeMenuItem);

        jMenuBar1.add(fileMenu);

        booksMenu.setText("Books");

        bManageMenuItem.setText("Manage books");
        bManageMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bManageMenuItemActionPerformed(evt);
            }
        });
        booksMenu.add(bManageMenuItem);

        brManageMenuItem.setText("Manage borrowing");
        brManageMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brManageMenuItemActionPerformed(evt);
            }
        });
        booksMenu.add(brManageMenuItem);

        jMenuBar1.add(booksMenu);

        membersMenu.setText("Members");

        mManageMenuItem.setText("Manage members");
        mManageMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mManageMenuItemActionPerformed(evt);
            }
        });
        membersMenu.add(mManageMenuItem);

        fManageMenuItem.setText("Manage fines");
        fManageMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fManageMenuItemActionPerformed(evt);
            }
        });
        membersMenu.add(fManageMenuItem);

        jMenuBar1.add(membersMenu);

        reportMenu.setText("Report");

        bReportMenuItem.setText("Book report");
        bReportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReportMenuItemActionPerformed(evt);
            }
        });
        reportMenu.add(bReportMenuItem);

        fReportMenuItem.setText("Fine report");
        fReportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fReportMenuItemActionPerformed(evt);
            }
        });
        reportMenu.add(fReportMenuItem);

        jMenuBar1.add(reportMenu);

        settingsMenu.setText("Settings");

        pChangeMenuItem.setText("Change password");
        pChangeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pChangeMenuItemActionPerformed(evt);
            }
        });
        settingsMenu.add(pChangeMenuItem);

        jMenuBar1.add(settingsMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeMenuItemActionPerformed

    private void bManageMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bManageMenuItemActionPerformed
        ManageBooks form = new ManageBooks();
        form.show();
    }//GEN-LAST:event_bManageMenuItemActionPerformed

    private void mManageMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mManageMenuItemActionPerformed
        ManageMembers form = new ManageMembers();
        form.show();
    }//GEN-LAST:event_mManageMenuItemActionPerformed

    private void brManageMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brManageMenuItemActionPerformed
        ManageBorrowing form = new ManageBorrowing();
        form.show();
    }//GEN-LAST:event_brManageMenuItemActionPerformed

    private void fManageMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fManageMenuItemActionPerformed
        ManageFines form = new ManageFines();
        form.show();
    }//GEN-LAST:event_fManageMenuItemActionPerformed

    private void pChangeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pChangeMenuItemActionPerformed
        PasswordForm form = new PasswordForm();
        form.show();
    }//GEN-LAST:event_pChangeMenuItemActionPerformed

    private void fReportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fReportMenuItemActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tharindu?zeroDateTimeBehavior=CONVERT_TO_NULL", "tharindupy", "tharindu")) {
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Fines.jrxml");
                JasperReport jr = JasperCompileManager.compileReport(inputStream);
                JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
                JasperViewer.viewReport(jp, false);
            }
        } catch (ClassNotFoundException | SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred while generating report.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_fReportMenuItemActionPerformed

    private void bReportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReportMenuItemActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tharindu?zeroDateTimeBehavior=CONVERT_TO_NULL", "tharindupy", "tharindu")) {
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Books.jrxml");
                JasperReport jr = JasperCompileManager.compileReport(inputStream);
                JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
                JasperViewer.viewReport(jp, false);
            }
        } catch (ClassNotFoundException | SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred while generating report.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bReportMenuItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bManageMenuItem;
    private javax.swing.JMenuItem bReportMenuItem;
    private javax.swing.JMenu booksMenu;
    private javax.swing.JMenuItem brManageMenuItem;
    private javax.swing.JMenuItem closeMenuItem;
    private javax.swing.JMenuItem fManageMenuItem;
    private javax.swing.JMenuItem fReportMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mManageMenuItem;
    private javax.swing.JMenu membersMenu;
    private javax.swing.JMenuItem pChangeMenuItem;
    private java.awt.Panel panel1;
    private javax.swing.JMenu reportMenu;
    private javax.swing.JMenu settingsMenu;
    // End of variables declaration//GEN-END:variables
}
