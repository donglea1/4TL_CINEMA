/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlrp.ui;

import com.qlrp.dao.QLNVDAO;
import com.qlrp.dao.QLKHDAO;
import com.qlrp.entity.KHACHHANG;
import com.qlrp.entity.NHANVIEN;
import com.qlrp.utils.XImage;
import com.qlrp.utils.Auth;
import com.qlrp.utils.MsgBox;
import java.awt.Color;
import java.awt.Cursor;
import java.io.File;
import java.net.URL;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author duong
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    File file = new File("");

    public login() {
        initComponents();
        init();
        this.setLocationRelativeTo(null);

    }

    private void init() {
        pnl_containerRight.setVisible(false);
        lbl_leftposter.setVisible(false);
        lbl_sologanLeft.setVisible(false);
        try {

            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");

        } catch (Exception ex) {
        }
        this.setIconImage(XImage.getAppIcon());
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
        pnl_left = new keeptoo.KGradientPanel();
        pnl_containerLeft = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Account = new javax.swing.JTextField();
        btn_Login = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_newAcc = new javax.swing.JButton();
        btn_HidePass = new javax.swing.JButton();
        txt_Password = new javax.swing.JPasswordField();
        lbl_sologanLeft = new javax.swing.JLabel();
        lbl_leftposter = new javax.swing.JLabel();
        pnl_right = new keeptoo.KGradientPanel();
        pnl_containerRight = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtsdt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtgmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtconfirm = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        btndk = new javax.swing.JLabel();
        btn_TroLai = new javax.swing.JButton();
        txtconfirm1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_sologanRight = new javax.swing.JLabel();
        lbl_rightposter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("4TLIX CINEMAS");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
        pnl_left.setkEndColor(new java.awt.Color(204, 255, 204));
        pnl_left.setkGradientFocus(400);
        pnl_left.setkStartColor(new java.awt.Color(153, 153, 153));
        pnl_left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_containerLeft.setOpaque(false);
        pnl_containerLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/user.png"))); // NOI18N
        pnl_containerLeft.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 238, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/padlock (4).png"))); // NOI18N
        pnl_containerLeft.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 338, -1, -1));

        txt_Account.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_Account.setToolTipText("");
        txt_Account.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txt_Account.setMargin(new java.awt.Insets(2, 20, 2, 6));
        txt_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AccountActionPerformed(evt);
            }
        });
        pnl_containerLeft.add(txt_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 228, 261, 50));

        btn_Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LoginMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ĐĂNG NHẬP");

        javax.swing.GroupLayout btn_LoginLayout = new javax.swing.GroupLayout(btn_Login);
        btn_Login.setLayout(btn_LoginLayout);
        btn_LoginLayout.setHorizontalGroup(
            btn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_LoginLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        btn_LoginLayout.setVerticalGroup(
            btn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        pnl_containerLeft.add(btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("QUÊN MẬT KHẨU?");
        pnl_containerLeft.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 388, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/logo-4tlix2.png"))); // NOI18N
        pnl_containerLeft.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 68, -1, 110));

        btn_newAcc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_newAcc.setText("TẠO TÀI KHOẢN MỚI");
        btn_newAcc.setContentAreaFilled(false);
        btn_newAcc.setFocusPainted(false);
        btn_newAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_newAccMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_newAccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_newAccMouseExited(evt);
            }
        });
        btn_newAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newAccActionPerformed(evt);
            }
        });
        pnl_containerLeft.add(btn_newAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 170, -1));

        btn_HidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/hide.png"))); // NOI18N
        btn_HidePass.setContentAreaFilled(false);
        btn_HidePass.setFocusPainted(false);
        btn_HidePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HidePassActionPerformed(evt);
            }
        });
        pnl_containerLeft.add(btn_HidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 40, 50));

        txt_Password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_Password.setToolTipText("");
        txt_Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txt_Password.setMargin(new java.awt.Insets(2, 10, 2, 6));
        pnl_containerLeft.add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 328, 260, 50));

        pnl_left.add(pnl_containerLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 580));

        lbl_sologanLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/4TLIX_Slogantest.png"))); // NOI18N
        pnl_left.add(lbl_sologanLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 420, 210));

        lbl_leftposter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/right.png"))); // NOI18N
        lbl_leftposter.setText("jLabel12");
        pnl_left.add(lbl_leftposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 450, 590));

        jPanel1.add(pnl_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 580));

        pnl_right.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        pnl_right.setkEndColor(new java.awt.Color(255, 204, 204));
        pnl_right.setkGradientFocus(800);
        pnl_right.setkStartColor(new java.awt.Color(255, 255, 204));
        pnl_right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_containerRight.setOpaque(false);
        pnl_containerRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/padlock (4).png"))); // NOI18N
        pnl_containerRight.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, 37));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/unlock.png"))); // NOI18N
        pnl_containerRight.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 40, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/email.png"))); // NOI18N
        pnl_containerRight.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 180, 40, 37));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/sex.png"))); // NOI18N
        pnl_containerRight.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, 37));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/home.png"))); // NOI18N
        pnl_containerRight.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, 37));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/user.png"))); // NOI18N
        pnl_containerRight.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 110, 40, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/telephone-call.png"))); // NOI18N
        pnl_containerRight.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, 37));

        txtsdt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtsdt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_containerRight.add(txtsdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 310, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("SĐT");
        pnl_containerRight.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        txtuser.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        pnl_containerRight.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 310, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Họ tên");
        pnl_containerRight.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        txtgmail.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtgmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtgmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgmailActionPerformed(evt);
            }
        });
        pnl_containerRight.add(txtgmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 310, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Email");
        pnl_containerRight.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_containerRight.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 310, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Mật khẩu");
        pnl_containerRight.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        txtconfirm.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtconfirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfirmActionPerformed(evt);
            }
        });
        pnl_containerRight.add(txtconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 310, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Nhập lại mật khẩu");
        pnl_containerRight.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, 16));

        kGradientPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kGradientPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kGradientPanel4MouseExited(evt);
            }
        });

        btndk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndk.setForeground(new java.awt.Color(255, 255, 255));
        btndk.setText("ĐĂNG KÝ");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btndk)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btndk, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        pnl_containerRight.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        btn_TroLai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_TroLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/left-arrow.png"))); // NOI18N
        btn_TroLai.setText("   TRỞ LẠI");
        btn_TroLai.setBorder(null);
        btn_TroLai.setBorderPainted(false);
        btn_TroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TroLaiActionPerformed(evt);
            }
        });
        pnl_containerRight.add(btn_TroLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 129, 40));

        txtconfirm1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtconfirm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtconfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfirm1ActionPerformed(evt);
            }
        });
        pnl_containerRight.add(txtconfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 310, 40));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox1.setText("Nam");
        pnl_containerRight.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, 30));

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox2.setText("Nữ");
        pnl_containerRight.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Giới tính");
        pnl_containerRight.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 71, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Địa chỉ");
        pnl_containerRight.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 71, 20));

        pnl_right.add(pnl_containerRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 580));

        lbl_sologanRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/4TLIX_Slogantest.png"))); // NOI18N
        pnl_right.add(lbl_sologanRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 420, 210));

        lbl_rightposter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/left.png"))); // NOI18N
        pnl_right.add(lbl_rightposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 450, 590));

        jPanel1.add(pnl_right, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_HidePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HidePassActionPerformed
        // TODO add your handling code here:
        showPass();
    }//GEN-LAST:event_btn_HidePassActionPerformed

    private void txt_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AccountActionPerformed

    private void btn_TroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TroLaiActionPerformed
        // TODO add your handling code here:
        //Show panel container
        pnl_containerRight.setVisible(false);
        pnl_containerLeft.setVisible(true);

        //show sologan + poster
        lbl_sologanLeft.setVisible(false);
        lbl_leftposter.setVisible(false);
        lbl_sologanRight.setVisible(true);
        lbl_rightposter.setVisible(true);
    }//GEN-LAST:event_btn_TroLaiActionPerformed

    private void btn_newAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newAccActionPerformed
        // TODO add your handling code here:
        //Show panel container
        pnl_containerRight.setVisible(true);
        pnl_containerLeft.setVisible(false);

        //show sologan + poster
        lbl_sologanLeft.setVisible(true);
        lbl_leftposter.setVisible(true);
        lbl_sologanRight.setVisible(false);
        lbl_rightposter.setVisible(false);
    }//GEN-LAST:event_btn_newAccActionPerformed
    QLNVDAO qlnvdao = new QLNVDAO();
    QLKHDAO qlkhdao = new QLKHDAO();

    void dangNhap() {
        String tk = txt_Account.getText();
        String matKhau = txt_Password.getText();
        NHANVIEN epl = qlnvdao.selectebyID(tk);
        KHACHHANG cus = qlkhdao.selectebyID(tk);

        if (epl == null) {
            JOptionPane.showMessageDialog(this, "Sai tên đăng nhập!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
        } else if (!matKhau.equals(epl.getMAT_KHAU())) {
            JOptionPane.showMessageDialog(this, "Sai mật khẩu!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
        } else {
            MsgBox.alert(this, "ĐĂNG NHẬP THÀNH CÔNG!");
            SplashScreen sp = new SplashScreen();
            Auth.user = epl;
            sp.setVisible(true);
            this.setVisible(false);

        }
//        KHACHHANG cus = qlkhdao.selectebyID(tk);
//        if (cus == null ) {
//            JOptionPane.showMessageDialog(this, "Sai tên đăng nhập!", "Lỗi!!!!!!!!!!", JOptionPane.ERROR_MESSAGE);
//        } else if (!matKhau.equals(cus.getMAT_KHAU())) {
//            JOptionPane.showMessageDialog(this, "Sai mật khẩu!", "Lỗi!!!!!!!!!!", JOptionPane.ERROR_MESSAGE);
//        } else {
//            Auth.cus = cus;
//            MsgBox.alert(this, "Login successfully!");
////            this.dispose();
//        }
    }

    void dangKy() {
        int dk = JOptionPane.showConfirmDialog(this, "bạn có muốn đăng ký không?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (dk != JOptionPane.YES_OPTION) {
            return;
        }
//        try {
//            Class.forName(driver);
//            Connection con = DriverManager.getConnection(url, user, password);
//            String sql = "insert into NHANVIEN values (?,?,?,?,?)";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, txtsdt.getText());
//            ps.setString(2, txtuser.getText());
//            ps.setString(3, txtgmail.getText());
//            ps.setString(4, txtpass.getText());
//            ps.setString(5, txtconfirm.getText());
//
//            int n = ps.executeUpdate();
//
//            if (txtsdt.getText().equals("") | txtuser.getText().equals("") | txtgmail.getText().equals("") | txtpass.getText().equals("") | txtconfirm.getText().equals("")) {
//                JOptionPane.showMessageDialog(this, "không để thông tin trống");
//            } else if (n != 0) {
//                JOptionPane.showMessageDialog(this, "Đăng ký thành công");
//            } else {
//                JOptionPane.showMessageDialog(this, "Đăng ký thất bại");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
    boolean isHidePass = true;
    File f = new File("");

    private void showPass() {
        String duongdanNHANVIEN = "\\src\\main\\resources\\com\\qlbh\\icon\\login\\";

        if (isHidePass) {
            txt_Password.setEchoChar((char) 0);
            btn_HidePass.setIcon(new ImageIcon(f.getAbsolutePath() + duongdanNHANVIEN + "view.png"));
            isHidePass = false;
        } else {
            txt_Password.setEchoChar('*');
            btn_HidePass.setIcon(new ImageIcon(f.getAbsolutePath() + duongdanNHANVIEN + "hide.png"));
            isHidePass = true;
        }
    }

    private void btn_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LoginMouseEntered
        // TODO add your handling code here:
        jLabel4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel4.setForeground(Color.green);
    }//GEN-LAST:event_btn_LoginMouseEntered

    private void btn_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LoginMouseExited
        // TODO add your handling code here:
        jLabel4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel4.setForeground(Color.white);
    }//GEN-LAST:event_btn_LoginMouseExited

    private void btn_newAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newAccMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_newAccMouseClicked

    private void btn_newAccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newAccMouseExited
        // TODO add your handling code here:
        btn_newAcc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_newAcc.setForeground(Color.black);
    }//GEN-LAST:event_btn_newAccMouseExited

    private void btn_newAccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newAccMouseEntered
        // TODO add your handling code here:
        btn_newAcc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_newAcc.setForeground(Color.red);
    }//GEN-LAST:event_btn_newAccMouseEntered

    private void kGradientPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel4MouseEntered
        // TODO add your handling code here:
        btndk.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btndk.setForeground(Color.green);
    }//GEN-LAST:event_kGradientPanel4MouseEntered

    private void kGradientPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel4MouseExited
        // TODO add your handling code here:
        btndk.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btndk.setForeground(Color.white);
    }//GEN-LAST:event_kGradientPanel4MouseExited

    private void btn_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LoginMouseClicked
        // TODO add your handling code here:
        dangNhap();
    }//GEN-LAST:event_btn_LoginMouseClicked

    private void kGradientPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel4MouseClicked
        // TODO add your handling code here:
        dangKy();

    }//GEN-LAST:event_kGradientPanel4MouseClicked

    private void txtgmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgmailActionPerformed

    private void txtconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmActionPerformed

    private void txtconfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfirm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirm1ActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_HidePass;
    private keeptoo.KGradientPanel btn_Login;
    private javax.swing.JButton btn_TroLai;
    private javax.swing.JButton btn_newAcc;
    private javax.swing.JLabel btndk;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel lbl_leftposter;
    private javax.swing.JLabel lbl_rightposter;
    private javax.swing.JLabel lbl_sologanLeft;
    private javax.swing.JLabel lbl_sologanRight;
    private javax.swing.JPanel pnl_containerLeft;
    private javax.swing.JPanel pnl_containerRight;
    private keeptoo.KGradientPanel pnl_left;
    private keeptoo.KGradientPanel pnl_right;
    private javax.swing.JTextField txt_Account;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txtconfirm;
    private javax.swing.JTextField txtconfirm1;
    private javax.swing.JTextField txtgmail;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
