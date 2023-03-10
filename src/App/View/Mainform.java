/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App.View;

import App.Dao.BookDao;
import App.Model.User;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author sinic
 */
public class Mainform extends javax.swing.JFrame {

    private User user;
    private Book book;
    private Manager manager;
    private FreeChart freeChart;

    public Mainform() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        Login loginDialog = new Login(this, true);
        loginDialog.setVisible(true);
        this.user = loginDialog.getUser();
        if (this.user == null) {
            System.exit(0);
        } else {
            LoginSuccessful();
        }
    }

    private void LoginSuccessful() {
        if (this.user.getPosition().equals("quản lí")) {
            this.btn_Book.setEnabled(false);
            this.btn_manager.setEnabled(true);
            this.jMenu_manager.setEnabled(true);
            this.jButton_Chart.setEnabled(true);
        } else if (this.user.getPosition().equals("Thành viên")) {
            this.btn_Book.setEnabled(true);
            this.btn_manager.setEnabled(false);
            this.jMenu_manager.setEnabled(false);
            this.jButton_Chart.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        btn_Book = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        btn_manager = new javax.swing.JButton();
        jButton_Chart = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_Login = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu_manager = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\qlithuvien\\Icon\\logout-icon-32.png")); // NOI18N
        jButton1.setText("Đăng xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_Book.setIcon(new javax.swing.ImageIcon("C:\\Users\\sinic\\Downloads\\open-book (2).png")); // NOI18N
        btn_Book.setText("Sách");
        btn_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BookActionPerformed(evt);
            }
        });

        btn_manager.setIcon(new javax.swing.ImageIcon("C:\\Users\\sinic\\Downloads\\skills.png")); // NOI18N
        btn_manager.setText("Quản lý");
        btn_manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_managerActionPerformed(evt);
            }
        });

        jButton_Chart.setIcon(new javax.swing.ImageIcon("C:\\Users\\sinic\\Downloads\\imgonline-com-ua-resize-PTPdzN3XTVr5Vp.jpg")); // NOI18N
        jButton_Chart.setText("Biểu đồ");
        jButton_Chart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ChartActionPerformed(evt);
            }
        });

        jMenu1.setText("Hệ Thống");

        jMenuItem_Login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_Login.setIcon(new javax.swing.ImageIcon("D:\\qlithuvien\\Icon\\logout-icon-16.png")); // NOI18N
        jMenuItem_Login.setText("Đăng Xuất");
        jMenuItem_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_LoginActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Login);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon("D:\\qlithuvien\\Icon\\Button-Close-icon-16.png")); // NOI18N
        jMenuItem3.setText("Thoát");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu_manager.setText("Quản lý");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\sinic\\Downloads\\user (3).png")); // NOI18N
        jMenuItem6.setText("Quản lý ");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu_manager.add(jMenuItem6);
        jMenu_manager.add(jSeparator3);

        jMenuBar1.add(jMenu_manager);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btn_Book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_manager)
                .addGap(18, 18, 18)
                .addComponent(jButton_Chart, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btn_Book)
                        .addComponent(btn_manager))
                    .addComponent(jButton_Chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_LoginActionPerformed
        this.jTabbedPane1.removeAll();
        Login login = new Login(null, true);
        login.setVisible(true);
        this.user = login.getUser();
        if (this.user == null) {
            this.btn_Book.setEnabled(false);
            this.btn_manager.setEnabled(false);
            this.jMenu_manager.setEnabled(false);
        } else {
            LoginSuccessful();
        }
    }//GEN-LAST:event_jMenuItem_LoginActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        btn_managerActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jMenuItem_LoginActionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BookActionPerformed
        this.jTabbedPane1.remove(manager);
        this.jTabbedPane1.remove(freeChart);
        this.manager = null;
        this.freeChart = null;
        if (this.book == null) {
            book = new Book();
            BookDao dao = new BookDao();
            book.setUser(this.user);
            try {
                book.showBook(dao.selectBook());
            } catch (Exception ex) {
                Logger.getLogger(Mainform.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.jTabbedPane1.addTab("Sách", book);
        }
        this.jTabbedPane1.setSelectedComponent(book);
    }//GEN-LAST:event_btn_BookActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btn_managerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_managerActionPerformed
        this.jTabbedPane1.remove(book);
        this.jTabbedPane1.remove(freeChart);
        this.book = null;
        this.freeChart = null;
        BookDao dao = new BookDao();
        if (this.manager == null) {
            manager = new Manager();
            manager.setUser(user);
            try {
                manager.showTable(dao.selectBook());
            } catch (Exception ex) {
                Logger.getLogger(Mainform.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.jTabbedPane1.addTab("Quản Lý", manager);
        }
        this.jTabbedPane1.setSelectedComponent(manager);
    }//GEN-LAST:event_btn_managerActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton_ChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ChartActionPerformed
        this.jTabbedPane1.remove(book);
        this.jTabbedPane1.remove(manager);
        this.book = null;
        this.manager = null;
        if (freeChart == null) {
            try {
                freeChart = new FreeChart();
            } catch (Exception ex) {
                Logger.getLogger(Mainform.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.jTabbedPane1.addTab("Biểu đồ", freeChart);
        }
        this.jTabbedPane1.setSelectedComponent(freeChart);
    }//GEN-LAST:event_jButton_ChartActionPerformed

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
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Book;
    private javax.swing.JButton btn_manager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Chart;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem_Login;
    private javax.swing.JMenu jMenu_manager;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void processLoginSuccessful() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
