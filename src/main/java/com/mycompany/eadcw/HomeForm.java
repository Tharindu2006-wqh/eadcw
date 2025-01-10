/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.eadcw;

/**
 *
 * @author SKYLINE
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

        jMenuBar1 = new javax.swing.JMenuBar();
        homeClosepage = new javax.swing.JMenu();
        closetxt = new javax.swing.JMenu();
        deleteMemberMenu = new javax.swing.JMenu();
        addMemberMenu = new javax.swing.JMenuItem();
        deleteMemberemenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addBookmenu = new javax.swing.JMenuItem();
        deleteBook = new javax.swing.JMenuItem();
        searchBook = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        fineReport = new javax.swing.JMenuItem();
        bookReport = new javax.swing.JMenuItem();
        memberReport = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        changePassword = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library management system");

        homeClosepage.setText("Home");

        closetxt.setText("close");
        closetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closetxtActionPerformed(evt);
            }
        });
        homeClosepage.add(closetxt);

        jMenuBar1.add(homeClosepage);

        deleteMemberMenu.setText("Members");

        addMemberMenu.setText("Add member ");
        addMemberMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberMenuActionPerformed(evt);
            }
        });
        deleteMemberMenu.add(addMemberMenu);

        deleteMemberemenu.setText("Delete member");
        deleteMemberemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMemberemenuActionPerformed(evt);
            }
        });
        deleteMemberMenu.add(deleteMemberemenu);

        jMenuBar1.add(deleteMemberMenu);

        jMenu2.setText("Books");

        addBookmenu.setText(" Add Book");
        addBookmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookmenuActionPerformed(evt);
            }
        });
        jMenu2.add(addBookmenu);

        deleteBook.setText("Delete book");
        deleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookActionPerformed(evt);
            }
        });
        jMenu2.add(deleteBook);

        searchBook.setText("search book");
        searchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookActionPerformed(evt);
            }
        });
        jMenu2.add(searchBook);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Reports");

        fineReport.setText("Fine Reports");
        fineReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fineReportActionPerformed(evt);
            }
        });
        jMenu6.add(fineReport);

        bookReport.setText("Book Report");
        bookReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookReportActionPerformed(evt);
            }
        });
        jMenu6.add(bookReport);

        memberReport.setText("member Report");
        memberReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberReportActionPerformed(evt);
            }
        });
        jMenu6.add(memberReport);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Settings");

        changePassword.setText("change password");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });
        jMenu7.add(changePassword);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookmenuActionPerformed
        // TODO add your handling code here:
        Addbook f = new Addbook();
        f.show();
    }//GEN-LAST:event_addBookmenuActionPerformed

    private void fineReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fineReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fineReportActionPerformed

    private void memberReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberReportActionPerformed

    private void bookReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookReportActionPerformed

    private void deleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookActionPerformed
        // TODO add your handling code here:
        Deletebook f = new Deletebook();
        f.show();
    }//GEN-LAST:event_deleteBookActionPerformed

    private void addMemberMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberMenuActionPerformed
        // TODO add your handling code here:
        Addmember f = new Addmember();
        f.show();
    }//GEN-LAST:event_addMemberMenuActionPerformed

    private void deleteMemberemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMemberemenuActionPerformed
        // TODO add your handling code here:
        Deletememeber f = new Deletememeber();
        f.show();
    }//GEN-LAST:event_deleteMemberemenuActionPerformed

    private void searchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookActionPerformed
        // TODO add your handling code here:
        Searchbook f = new Searchbook();
        f.show();
    }//GEN-LAST:event_searchBookActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        // TODO add your handling code here:
        Changepassword f = new Changepassword();
        f.show();
    }//GEN-LAST:event_changePasswordActionPerformed

    private void closetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closetxtActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closetxtActionPerformed

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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addBookmenu;
    private javax.swing.JMenuItem addMemberMenu;
    private javax.swing.JMenuItem bookReport;
    private javax.swing.JMenuItem changePassword;
    private javax.swing.JMenu closetxt;
    private javax.swing.JMenuItem deleteBook;
    private javax.swing.JMenu deleteMemberMenu;
    private javax.swing.JMenuItem deleteMemberemenu;
    private javax.swing.JMenuItem fineReport;
    private javax.swing.JMenu homeClosepage;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem memberReport;
    private javax.swing.JMenuItem searchBook;
    // End of variables declaration//GEN-END:variables
}
