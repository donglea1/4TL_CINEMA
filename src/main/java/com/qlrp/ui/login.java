/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlrp.ui;

import javax.swing.ImageIcon;
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
import javax.swing.UIManager;
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
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel2.setVisible(false);
        lbl_leftposter.setVisible(false);
        try {

            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");

        } catch (Exception ex) {
            System.err.println(ex);
        }
        ImageIcon img = new ImageIcon("C:\\Users\\duong\\OneDrive\\Máy tính\\4TL_CINEMA-main\\src\\main\\resources\\com\\qlrp\\icon\\Sys\\Icon_app.png");
        this.setIconImage(XImage.getAppIcon());
    }
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost:1433;databaseName=QLRP_NHOM1;encrypt=true;trustServerCertificate=true;";
    String user = "sa";
    String password = "caokhanhvy2084";
    Statement st;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1LEFT = new keeptoo.KGradientPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        btn_Login = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        lbl_leftposter = new javax.swing.JLabel();
        kGradientPanel2RIGHT = new keeptoo.KGradientPanel();
        jLabel13Sologan = new javax.swing.JLabel();
        lbl_rightposter = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("4TLIX CINEMAS");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1LEFT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
        kGradientPanel1LEFT.setkEndColor(new java.awt.Color(255, 204, 255));
        kGradientPanel1LEFT.setkGradientFocus(400);
        kGradientPanel1LEFT.setkStartColor(new java.awt.Color(153, 153, 255));
        kGradientPanel1LEFT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/hide.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1LEFT.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/user.png"))); // NOI18N
        kGradientPanel1LEFT.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/padlock (4).png"))); // NOI18N
        kGradientPanel1LEFT.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        txtTK.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtTK.setToolTipText("");
        txtTK.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTKActionPerformed(evt);
            }
        });
        kGradientPanel1LEFT.add(txtTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 261, 50));

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

        kGradientPanel1LEFT.add(btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 210, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUÊN MẬT KHẨU?");
        kGradientPanel1LEFT.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/logo-4tlix2.png"))); // NOI18N
        kGradientPanel1LEFT.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 110));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("TẠO TÀI KHOẢN MỚI");
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        kGradientPanel1LEFT.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 170, -1));

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordField1.setToolTipText("");
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        kGradientPanel1LEFT.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 260, 50));

        lbl_leftposter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/right.png"))); // NOI18N
        lbl_leftposter.setText("jLabel12");
        kGradientPanel1LEFT.add(lbl_leftposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 450, 580));

        jPanel1.add(kGradientPanel1LEFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 580));

        kGradientPanel2RIGHT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        kGradientPanel2RIGHT.setkEndColor(new java.awt.Color(153, 153, 255));
        kGradientPanel2RIGHT.setkGradientFocus(800);
        kGradientPanel2RIGHT.setkStartColor(new java.awt.Color(255, 204, 255));
        kGradientPanel2RIGHT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13Sologan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/4TLIX_Slogantest.png"))); // NOI18N
        kGradientPanel2RIGHT.add(jLabel13Sologan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 420, 210));

        lbl_rightposter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/left.png"))); // NOI18N
        kGradientPanel2RIGHT.add(lbl_rightposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 450, 580));

        jPanel2.setOpaque(false);

        txtsdt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtsdt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("SĐT");

        txtuser.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Họ tên");

        txtgmail.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtgmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Email");

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Mật khẩu");

        txtconfirm.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtconfirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nhập lại mật khẩu");

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

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/left-arrow.png"))); // NOI18N
        jButton4.setText("   TRỞ LẠI");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/logo-4tlix.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtconfirm)
                        .addComponent(txtpass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtgmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtuser, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtsdt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addComponent(txtgmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        kGradientPanel2RIGHT.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 570));

        jPanel1.add(kGradientPanel2RIGHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        showPass();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTKActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jLabel13Sologan.setVisible(true);
        lbl_leftposter.setVisible(false);
        lbl_rightposter.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(true);
        jLabel13Sologan.setVisible(false);
        lbl_leftposter.setVisible(true);
        lbl_rightposter.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed
    QLNVDAO qlnvdao = new QLNVDAO();
    QLKHDAO qlkhdao = new QLKHDAO();

    void dangNhap() {
        String tk = txtTK.getText();
        String matKhau = jPasswordField1.getText();
        NHANVIEN epl = qlnvdao.selectebyID(tk);

        if (epl == null) {
            JOptionPane.showMessageDialog(this, "Sai tên đăng nhập!", "Lỗi!!!!!!!!!!", JOptionPane.ERROR_MESSAGE);
        } else if (!matKhau.equals(epl.getMAT_KHAU())) {
            JOptionPane.showMessageDialog(this, "Sai mật khẩu!", "Lỗi!!!!!!!!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            Auth.user = epl;
            MsgBox.alert(this, "ĐĂNG NHẬP THÀNH CÔNG!");
            SplashScreen sp = new SplashScreen();
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
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, password);
            String sql = "insert into NHANVIEN values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, txtsdt.getText());
            ps.setString(2, txtuser.getText());
            ps.setString(3, txtgmail.getText());
            ps.setString(4, txtpass.getText());
            ps.setString(5, txtconfirm.getText());

            int n = ps.executeUpdate();

            if (txtsdt.getText().equals("") | txtuser.getText().equals("") | txtgmail.getText().equals("") | txtpass.getText().equals("") | txtconfirm.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "không để thông tin trống");
            } else if (n != 0) {
                JOptionPane.showMessageDialog(this, "Đăng ký thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Đăng ký thất bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    boolean isHidePass = true;
    File f = new File("");

    private void showPass() {
        String duongdanNHANVIEN = "\\src\\main\\resources\\com\\qlbh\\icon\\login\\";

        if (isHidePass) {
            jPasswordField1.setEchoChar((char) 0);
            jButton1.setIcon(new ImageIcon(f.getAbsolutePath() + duongdanNHANVIEN + "view.png"));
            isHidePass = false;
        } else {
            jPasswordField1.setEchoChar('*');
            jButton1.setIcon(new ImageIcon(f.getAbsolutePath() + duongdanNHANVIEN + "hide.png"));
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

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        jButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton5.setForeground(Color.white);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        jButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton5.setForeground(Color.red);
    }//GEN-LAST:event_jButton5MouseEntered

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
    private keeptoo.KGradientPanel btn_Login;
    private javax.swing.JLabel btndk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13Sologan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private keeptoo.KGradientPanel kGradientPanel1LEFT;
    private keeptoo.KGradientPanel kGradientPanel2RIGHT;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel lbl_leftposter;
    private javax.swing.JLabel lbl_rightposter;
    private javax.swing.JTextField txtTK;
    private javax.swing.JTextField txtconfirm;
    private javax.swing.JTextField txtgmail;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
