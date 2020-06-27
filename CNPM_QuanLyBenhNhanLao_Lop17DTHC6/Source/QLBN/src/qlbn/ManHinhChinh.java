/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbn;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tien Nguyen
 */
public class ManHinhChinh extends javax.swing.JFrame {

    /**
     * Creates new form Main_1
     */
    public ManHinhChinh() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnThemLoaiBN = new javax.swing.JButton();
        btnQLTTBN = new javax.swing.JButton();
        btnThemLoaiThuoc = new javax.swing.JButton();
        btnLienHe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Màn Hình Chính");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThemLoaiBN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThemLoaiBN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/iconthem.png"))); // NOI18N
        btnThemLoaiBN.setText("QUẢN LÝ LOẠI BỆNH NHÂN");
        btnThemLoaiBN.setAlignmentX(5.0F);
        btnThemLoaiBN.setAlignmentY(5.0F);
        btnThemLoaiBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLoaiBNActionPerformed(evt);
            }
        });
        getContentPane().add(btnThemLoaiBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 320, 110));

        btnQLTTBN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnQLTTBN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/icontimxoasua.png"))); // NOI18N
        btnQLTTBN.setText("QUẢN LÝ THÔNG TIN BỆNH NHÂN");
        btnQLTTBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTTBNActionPerformed(evt);
            }
        });
        getContentPane().add(btnQLTTBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 320, 110));

        btnThemLoaiThuoc.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThemLoaiThuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/drug.png"))); // NOI18N
        btnThemLoaiThuoc.setText("QUẢN LÝ LOẠI THUỐC");
        btnThemLoaiThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLoaiThuocActionPerformed(evt);
            }
        });
        getContentPane().add(btnThemLoaiThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 320, 110));

        btnLienHe.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnLienHe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/iconquestion.png"))); // NOI18N
        btnLienHe.setText("LIÊN HỆ");
        btnLienHe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLienHeActionPerformed(evt);
            }
        });
        getContentPane().add(btnLienHe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 320, 110));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("PHẦN MỀM QUẢN LÝ BỆNH NHÂN LAO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 600, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/hinhnen_main.jpg"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemLoaiBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiBNActionPerformed
        // TODO add your handling code here:
        ThemLoaiBenhNhan themLoaiBN = new ThemLoaiBenhNhan();
        themLoaiBN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnThemLoaiBNActionPerformed

    private void btnQLTTBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTTBNActionPerformed
        try {
            // TODO add your handling code here:
            TimXoaSua frm = new TimXoaSua();
            frm.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(ManHinhChinh.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManHinhChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQLTTBNActionPerformed

    private void btnLienHeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLienHeActionPerformed
        GiaoDienThongTinVePhanMem frm = new GiaoDienThongTinVePhanMem();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_btnLienHeActionPerformed

    private void btnThemLoaiThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiThuocActionPerformed
        // TODO add your handling code here:
        ThemLoaiThuoc tlt = new ThemLoaiThuoc();
        this.setVisible(false);
        tlt.setVisible(true);
    }//GEN-LAST:event_btnThemLoaiThuocActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManHinhChinh().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLienHe;
    private javax.swing.JButton btnQLTTBN;
    private javax.swing.JButton btnThemLoaiBN;
    private javax.swing.JButton btnThemLoaiThuoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
