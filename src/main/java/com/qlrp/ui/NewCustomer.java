/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlrp.ui;

import com.qlrp.dao.QLKHDAO;
import com.qlrp.entity.KHACHHANG;
import com.qlrp.utils.MsgBox;
import com.qlrp.utils.XImage;
import com.qlrp.utils.getInfo;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author duong
 */
public class NewCustomer extends javax.swing.JFrame {

    /**
     * Creates new form NewCustomer
     */
    public NewCustomer() {
        initComponents();
        this.setAlwaysOnTop(true);
        this.setIconImage(XImage.getAppIcon());
        this.setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        btn_edit.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbl_Image = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_ShowComfirnPass = new javax.swing.JButton();
        txt_ConfirmPassword = new javax.swing.JPasswordField();
        txt_Gmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_FullName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_ShowPass = new javax.swing.JButton();
        txt_Password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txt_Phone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Address = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rdo_Male = new javax.swing.JRadioButton();
        rdo_Female = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        btn_Add = new com.k33ptoo.components.KButton();
        btn_edit = new com.k33ptoo.components.KButton();
        btn_Delete = new com.k33ptoo.components.KButton();
        btn_Clear = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("GMAIL:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, -1, 28));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/logo-4tlix2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(lbl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_Image, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 58, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ShowComfirnPass.setBorderPainted(false);
        btn_ShowComfirnPass.setContentAreaFilled(false);
        btn_ShowComfirnPass.setFocusPainted(false);
        btn_ShowComfirnPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowComfirnPassActionPerformed(evt);
            }
        });
        jPanel7.add(btn_ShowComfirnPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 40, 30));

        txt_ConfirmPassword.setMargin(new java.awt.Insets(2, 5, 2, 35));
        jPanel7.add(txt_ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 152, -1, -1));

        txt_Gmail.setMargin(new java.awt.Insets(2, 5, 2, 6));
        txt_Gmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GmailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 297, 270, 28));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("XÁC NHẬN MẬT KHẨU:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 152, -1, 28));

        txt_FullName.setMargin(new java.awt.Insets(2, 5, 2, 6));
        txt_FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FullNameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 58, 270, 28));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ShowPass.setBorderPainted(false);
        btn_ShowPass.setContentAreaFilled(false);
        btn_ShowPass.setFocusPainted(false);
        btn_ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowPassActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 40, 30));

        txt_Password.setMargin(new java.awt.Insets(2, 5, 2, 35));
        jPanel2.add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 104, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("HỌ TÊN:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, 28));

        txt_Phone.setMargin(new java.awt.Insets(2, 5, 2, 6));
        txt_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PhoneActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 201, 270, 28));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("MẬT KHẨU:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("SĐT:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 199, -1, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("ĐỊA CHỈ:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 247, -1, 28));

        txt_Address.setMargin(new java.awt.Insets(2, 5, 2, 6));
        txt_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AddressActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 249, 270, 28));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("KHÁCH HÀNG");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GENDER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        rdo_Male.setBackground(new java.awt.Color(255, 255, 255));
        rdo_Male.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdo_Male.setSelected(true);
        rdo_Male.setText("NAM");

        rdo_Female.setBackground(new java.awt.Color(255, 255, 255));
        rdo_Female.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdo_Female.setText("NỮ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(rdo_Male)
                .addGap(18, 18, 18)
                .addComponent(rdo_Female)
                .addContainerGap(735, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo_Male)
                    .addComponent(rdo_Female))
                .addGap(20, 20, 20))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        btn_Add.setText("ADD");
        btn_Add.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_Add.setkEndColor(new java.awt.Color(0, 112, 192));
        btn_Add.setkHoverEndColor(new java.awt.Color(0, 30, 153));
        btn_Add.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_Add.setkHoverStartColor(new java.awt.Color(0, 30, 153));
        btn_Add.setkPressedColor(new java.awt.Color(153, 153, 153));
        btn_Add.setkStartColor(new java.awt.Color(0, 79, 174));
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel8.add(btn_Add);

        btn_edit.setText("EDIT");
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_edit.setkEndColor(new java.awt.Color(0, 112, 192));
        btn_edit.setkHoverEndColor(new java.awt.Color(0, 30, 153));
        btn_edit.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_edit.setkHoverStartColor(new java.awt.Color(0, 30, 153));
        btn_edit.setkPressedColor(new java.awt.Color(153, 153, 153));
        btn_edit.setkStartColor(new java.awt.Color(0, 79, 174));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel8.add(btn_edit);

        btn_Delete.setText("DELETE");
        btn_Delete.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_Delete.setkEndColor(new java.awt.Color(0, 112, 192));
        btn_Delete.setkHoverEndColor(new java.awt.Color(0, 30, 153));
        btn_Delete.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_Delete.setkHoverStartColor(new java.awt.Color(0, 30, 153));
        btn_Delete.setkPressedColor(new java.awt.Color(153, 153, 153));
        btn_Delete.setkStartColor(new java.awt.Color(0, 79, 174));
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        jPanel8.add(btn_Delete);

        btn_Clear.setText("CLEAR");
        btn_Clear.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_Clear.setkEndColor(new java.awt.Color(0, 112, 192));
        btn_Clear.setkHoverEndColor(new java.awt.Color(0, 30, 153));
        btn_Clear.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_Clear.setkHoverStartColor(new java.awt.Color(0, 30, 153));
        btn_Clear.setkPressedColor(new java.awt.Color(153, 153, 153));
        btn_Clear.setkStartColor(new java.awt.Color(0, 79, 174));
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });
        jPanel8.add(btn_Clear);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(358, 358, 358))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public void setForm(KHACHHANG khl) {
//        try {
//            txt_Password.setText(khl.getMAT_KHAU());
//            txt_ConfirmPassword.setText(khl.getMAT_KHAU());
//            txt_FullName.setText(khl.getHO_TEN());
//            txt_Phone.setText(khl.getSDT());
//            txt_Address.setText(khl.getDIA_CHI());
//            txt_Gmail.setText(khl.getEMAIL());
//            if (khl.isGIOI_TINH()) {
//                rdo_Male.setSelected(true);
//            } else {
//                rdo_Female.setSelected(true);
//            }
//        } catch (Exception e) {
//        }
//
//    }
//    private KHACHHANG getForm() {
//        KHACHHANG khl = new KHACHHANG();
//        if (validateForm()) {
//            khl.setMAT_KHAU(txt_Password.getText());
//            khl.setHO_TEN(txt_FullName.getText());
//            khl.setSDT(txt_Phone.getText());
//            khl.setDIA_CHI(txt_Address.getText());
//            khl.setEMAIL(txt_Gmail.getText());
//            if (rdo_Male.isSelected()) {
//                khl.setGIOI_TINH(true);
//            }
//        } else {
//            return null;
//        }
//        return khl;
//    }
//    public void setEnableButton(String addorEdit) {
//        if (addorEdit.equalsIgnoreCase("add")) {
//            btn_Edit.setEnabled(false);
//            btn_Delete.setEnabled(false);
//            btn_Edit.setVisible(false);
//            btn_Delete.setVisible(false);
//        } else {
//            btn_Add.setEnabled(false);
//            btn_Add.setVisible(false);
//        }
//    }
//    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        // TODO add your handling code here:
//        if (btn_Edit.isEnabled()) {
//            KHACHHANG khl = getForm();
//            if (khl != null) {
//                if(qlkhdao.selectebyID(khl.getSDT()) != null) {
//                    qlkhdao.update(khl);
//                    MsgBox.alert(this, "Update Successfully!");
//                    this.dispose();
//                } else {
//                    JOptionPane.showMessageDialog(this, "Employee doesn't exist!", "ERROR", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        } else {
//            MsgBox.alert(this, "You can only Add. If you want to edit please choose again!");
//        }
//
//    }                                        

    private void btn_ShowComfirnPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowComfirnPassActionPerformed
        // TODO add your handling code here:
        showConfirmPass();
    }//GEN-LAST:event_btn_ShowComfirnPassActionPerformed

    private void txt_GmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GmailActionPerformed
    File f = new File("");
    QLKHDAO qlkhdao = new QLKHDAO();
    List<KHACHHANG> listKH = qlkhdao.selectAll();

    private boolean validateForm() {
        String Error = "";
        if (txt_Password.getText().equals("")) {
            Error += "Password not null! \n";
        } else if (!txt_Password.getText().equalsIgnoreCase(txt_ConfirmPassword.getText())) {
            Error += "Confirm password is Wrong! \n";
        }
        if (txt_FullName.getText().equalsIgnoreCase("")) {
            Error += "Fullname not null! \n";
        }
        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        if (txt_Phone.getText().equals("")) {
            Error += "Phone not null! \n";
        } else if (!txt_Phone.getText().matches(reg)) {
            Error += "phone is not in the correct format! \n";
        }
        if (txt_Address.getText().equals("")) {
            Error += "Address not null! \n";
        }
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (txt_Gmail.getText().equals("")) {
            Error += "Gmail not null! \n";
        } else if (!txt_Gmail.getText().matches(EMAIL_PATTERN)) {
            Error += "Gmail is not in the correct format! \n";
        }
        if (!Error.equals("")) {
            JOptionPane.showMessageDialog(this, Error, "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

//    private void init() {
//        this.setIconImage(XImage.getAppIcon());
//        this.setResizable(false);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//    }
    private void clearAll() {
        txt_Password.setText("");
        txt_ConfirmPassword.setText("");
        txt_FullName.setText("");
        txt_Phone.setText("");
        txt_Address.setText("");
        txt_Gmail.setText("");
        rdo_Male.setSelected(true);
    }

    private void clearEdit() {
        txt_Password.setText("");
        txt_ConfirmPassword.setText("");
        txt_FullName.setText("");
        txt_Phone.setText("");
        txt_Address.setText("");
        txt_Gmail.setText("");
        rdo_Male.setSelected(true);
    }
    private void clearform() {
        txt_FullName.setText("");
        txt_Password.setText("");
        txt_ConfirmPassword.setText("");
        txt_Gmail.setText("");
        txt_Address.setText("");
        txt_Phone.setText("");

    }
    int row = -1;
    QLKHDAO dao = new QLKHDAO();

    void insert() {
        KHACHHANG cus = getForm();
        //    System.out.print("da add");

        try {
            dao.insert(cus);

            this.clearform();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại");
        }

    }

    public void fillToForm() {
        KHACHHANG kh = getInfo.cus;
        if (kh != null) {
            txt_Phone.setText(kh.getSDT());
            txt_FullName.setText(kh.getHO_TEN());
            txt_Address.setText(kh.getDIA_CHI());
            txt_Gmail.setText(kh.getEMAIL());
            txt_Password.setText(kh.getMAT_KHAU());
        }
    }

    KHACHHANG getForm() {
        KHACHHANG cus = new KHACHHANG();
        if (validateForm()) {

            cus.setSDT(txt_Phone.getText());
            cus.setHO_TEN(txt_FullName.getText());
            cus.setDIA_CHI(txt_Address.getText());
            cus.setEMAIL(txt_Gmail.getText());
            cus.setMAT_KHAU(txt_Password.getText());

        } else {
            return null;
        }
        return cus;
    }

    void setForm(KHACHHANG cus) {
        txt_Phone.setText(cus.getSDT());
        txt_FullName.setText(cus.getHO_TEN());
        txt_Address.setText(cus.getDIA_CHI());
        txt_Gmail.setText(cus.getEMAIL());
        txt_Password.setText(cus.getMAT_KHAU());
    }

    public void setEnableButton(String addorEdit) {
        if (addorEdit.equalsIgnoreCase("add")) {
            btn_edit.setEnabled(false);
            btn_edit.setVisible(false);
            btn_Delete.setEnabled(false);
            btn_Delete.setVisible(false);
            clearAll();
        } else if (addorEdit.equalsIgnoreCase("edit")) {
            btn_Add.setEnabled(false);
            btn_Add.setVisible(false);
            txt_Phone.setEditable(false);
            btn_edit.setEnabled(true);
            btn_edit.setVisible(true);
            btn_Delete.setEnabled(true);
            btn_Delete.setVisible(true);
        }
    }
    private void txt_FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FullNameActionPerformed

    private void btn_ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowPassActionPerformed
        // TODO add your handling code here:
        showPass();
    }//GEN-LAST:event_btn_ShowPassActionPerformed

    private void txt_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PhoneActionPerformed

    private void txt_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AddressActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        // TODO add your handling code here:
        if (btn_edit.isEnabled()) {
            clearEdit();
        } else {
            this.clearAll();
        }
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // TODO add your handling code here:
        if (btn_edit.isEnabled()) {
            if (txt_Phone.getText() != null && !txt_Phone.getText().equals("")) {
                if (qlkhdao.selectebyID(txt_Phone.getText()) != null) {
                    qlkhdao.delete(txt_Phone.getText());
                    MsgBox.alert(this, "Xóa thành công!");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Món ăn không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tên món ăn không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            MsgBox.alert(this, "You can only Add. If you want to edit, please choose again!");
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        if (btn_edit.isEnabled()) {
            KHACHHANG khl = getForm();
            if (khl != null) {
                if (qlkhdao.selectebyID(khl.getSDT()) != null) {
                    qlkhdao.update(khl);
                    MsgBox.alert(this, "Update Successfully!");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Customner doesn't exist!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            MsgBox.alert(this, "You can only Add. If you want to edit please choose again!");
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        // TODO add your handling code here:
        if (btn_Add.isEnabled()) {
            KHACHHANG kh = getForm();
            if (kh != null) {
                if (qlkhdao.selectebyID(kh.getSDT()) == null) {
                    qlkhdao.insert(kh);
                    MsgBox.alert(this, "Thêm thành công!");
//                    hm.fillToTable_CUSTOMER(listKH);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Món ăn đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            MsgBox.alert(this, "You can only edit. If you want to add, please choose again!");
        }
    }//GEN-LAST:event_btn_AddActionPerformed
    boolean isHidePass = true;
    boolean isHideConfirmPass = true;

    private void showPass() {
        String duongdanEmployee = "\\src\\main\\resources\\com\\qlrp\\icon\\Employee\\";
        if (isHidePass) {
            txt_Password.setEchoChar((char) 0);
            btn_ShowPass.setIcon(new ImageIcon(f.getAbsolutePath() + duongdanEmployee + "icons8_eye_25px.png"));
            isHidePass = false;
        } else {
            txt_Password.setEchoChar('*');
            btn_ShowPass.setIcon(new ImageIcon(f.getAbsolutePath() + duongdanEmployee + "icons8_hide_25px.png"));
            isHidePass = true;
        }
    }

    private void showConfirmPass() {
        String duongdanEmployee = "\\src\\main\\resources\\com\\qlrp\\icon\\Employee\\";
        if (isHideConfirmPass) {
            txt_ConfirmPassword.setEchoChar((char) 0);
            btn_ShowComfirnPass.setIcon(new ImageIcon(f.getAbsolutePath() + duongdanEmployee + "icons8_eye_25px.png"));
            isHideConfirmPass = false;
        } else {
            txt_ConfirmPassword.setEchoChar('*');
            btn_ShowComfirnPass.setIcon(new ImageIcon(f.getAbsolutePath() + duongdanEmployee + "icons8_hide_25px.png"));
            isHideConfirmPass = true;
        }
    }

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
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn_Add;
    private com.k33ptoo.components.KButton btn_Clear;
    private com.k33ptoo.components.KButton btn_Delete;
    private javax.swing.JButton btn_ShowComfirnPass;
    private javax.swing.JButton btn_ShowPass;
    private com.k33ptoo.components.KButton btn_edit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbl_Image;
    private javax.swing.JRadioButton rdo_Female;
    private javax.swing.JRadioButton rdo_Male;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JPasswordField txt_ConfirmPassword;
    private javax.swing.JTextField txt_FullName;
    private javax.swing.JTextField txt_Gmail;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Phone;
    // End of variables declaration//GEN-END:variables
}
