/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbn;

/**
 *
 * @author Tien Nguyen
 */
public class Main_1 extends javax.swing.JFrame {

    /**
     * Creates new form Main_1
     */
    public Main_1() {
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

        btnThemThongTinBenhNhanLao = new javax.swing.JButton();
        btnTimKiemThongTin = new javax.swing.JButton();
        btnThongTinSanPham = new javax.swing.JButton();
        btnThemLoaiBenhNhan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnThemLoaiThuoc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThemThongTinBenhNhanLao.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThemThongTinBenhNhanLao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/user (2).png"))); // NOI18N
        btnThemThongTinBenhNhanLao.setText("THÊM THÔNG TIN BỆNH NHÂN");
        btnThemThongTinBenhNhanLao.setAlignmentX(5.0F);
        btnThemThongTinBenhNhanLao.setAlignmentY(5.0F);
        btnThemThongTinBenhNhanLao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemThongTinBenhNhanLaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnThemThongTinBenhNhanLao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 320, 110));

        btnTimKiemThongTin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTimKiemThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/menu (1).png"))); // NOI18N
        btnTimKiemThongTin.setText("TÌM KIẾM - SỬA - XOÁ  THÔNG TIN ");
        btnTimKiemThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemThongTinActionPerformed(evt);
            }
        });
        getContentPane().add(btnTimKiemThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 320, 110));

        btnThongTinSanPham.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThongTinSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/question.png"))); // NOI18N
        btnThongTinSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinSanPhamActionPerformed(evt);
            }
        });
        getContentPane().add(btnThongTinSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 70, 60));

        btnThemLoaiBenhNhan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThemLoaiBenhNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/add.png"))); // NOI18N
        btnThemLoaiBenhNhan.setText("THÊM LOẠI BỆNH NHÂN");
        btnThemLoaiBenhNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLoaiBenhNhanActionPerformed(evt);
            }
        });
        getContentPane().add(btnThemLoaiBenhNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 320, 110));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PHẦN MỀM QUẢN LÝ BỆNH NHÂNH LAO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 600, 80));

        btnThemLoaiThuoc.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThemLoaiThuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/plus.png"))); // NOI18N
        btnThemLoaiThuoc.setText("THÊM LOẠI THUỐC");
        btnThemLoaiThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLoaiThuocActionPerformed(evt);
            }
        });
        getContentPane().add(btnThemLoaiThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 320, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlbn/pngtree-background-with-pills-frame-for-write-text-inside-png-image_3670178.jpg"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -560, 1070, 1060));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemThongTinBenhNhanLaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemThongTinBenhNhanLaoActionPerformed
        // TODO add your handling code here:
         Them frm = new Them();
        //this.setVisible(false);
        frm.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnThemThongTinBenhNhanLaoActionPerformed

    private void btnTimKiemThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemThongTinActionPerformed
        // TODO add your handling code here:
          TimXoaSua frm = new TimXoaSua();
        frm.setVisible(true);
    }//GEN-LAST:event_btnTimKiemThongTinActionPerformed

    private void btnThemLoaiBenhNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiBenhNhanActionPerformed
        // TODO add your handling code here:
          ThemLoaiBenhNhan frm = new ThemLoaiBenhNhan();
        frm.setVisible(true);
    }//GEN-LAST:event_btnThemLoaiBenhNhanActionPerformed

    private void btnThongTinSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinSanPhamActionPerformed
        // TODO add your handling code here:
        GiaoDienThongTinVePhanMem a = new GiaoDienThongTinVePhanMem();
        a.setVisible(true);
        
    }//GEN-LAST:event_btnThongTinSanPhamActionPerformed

    private void btnThemLoaiThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiThuocActionPerformed
        ThemLoaiThuoc frm = new ThemLoaiThuoc();
        //this.setVisible(false);
        frm.setVisible(rootPaneCheckingEnabled);
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
            java.util.logging.Logger.getLogger(Main_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main_1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemLoaiBenhNhan;
    private javax.swing.JButton btnThemLoaiThuoc;
    private javax.swing.JButton btnThemThongTinBenhNhanLao;
    private javax.swing.JButton btnThongTinSanPham;
    private javax.swing.JButton btnTimKiemThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
