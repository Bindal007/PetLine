/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hospitalAdmin;

import javax.swing.SwingUtilities;
import resources.Validations;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import javax.swing.JOptionPane;
import models.City;
import models.Community;
import models.Hospital;
import models.Person;

/**
 *
 * @author vicken
 */
public class VetCreate extends javax.swing.JPanel {

    Validations validations;
    City city;
    Community community;
    Hospital hospital;
    
    public VetCreate() {
        initComponents();
        AutoCompleteDecorator.decorate(cityCombo);
        AutoCompleteDecorator.decorate(communityCombo);
        AutoCompleteDecorator.decorate(hospitalCombo);
        
        cityCombo.remove AllItems();
        cityCombo.addItem("");
        for (City c : MainJFrame.cityDirectory.getCityList()){
            cityCombo.addItem(c.getName());
        }
        
        ddCity.getSelectedItem("");
        validations = new Validations();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        allDeliveriesBtn1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        ssnLbl = new javax.swing.JLabel();
        cellLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        cellTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        ssnTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        hospitalCombo = new javax.swing.JComboBox<>();
        hospitalLbl = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        cityCombo = new javax.swing.JComboBox<>();
        communityCombo = new javax.swing.JComboBox<>();
        communityLbl = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(218, 228, 230));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        allDeliveriesBtn1.setBackground(new java.awt.Color(0, 0, 51));
        allDeliveriesBtn1.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        allDeliveriesBtn1.setForeground(new java.awt.Color(240, 240, 240));
        allDeliveriesBtn1.setText("View Profile");
        allDeliveriesBtn1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        allDeliveriesBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allDeliveriesBtn1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 51));
        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(240, 240, 240));
        jButton3.setText("Logout");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(allDeliveriesBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(allDeliveriesBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Vet");

        nameLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(51, 51, 51));
        nameLbl.setText("Name");

        passwordLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(51, 51, 51));
        passwordLbl.setText("Password");

        usernameLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        usernameLbl.setForeground(new java.awt.Color(51, 51, 51));
        usernameLbl.setText("Username");

        ageLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        ageLbl.setForeground(new java.awt.Color(51, 51, 51));
        ageLbl.setText("Age");

        ssnLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        ssnLbl.setForeground(new java.awt.Color(51, 51, 51));
        ssnLbl.setText("SSN");

        cellLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        cellLbl.setForeground(new java.awt.Color(51, 51, 51));
        cellLbl.setText("Cell Number");

        emailLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(51, 51, 51));
        emailLbl.setText("Email");

        nameTxt.setText("name");

        passwordTxt.setText("password");

        emailTxt.setText("email");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        cellTxt.setText("cell number");
        cellTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellTxtActionPerformed(evt);
            }
        });

        ageTxt.setText("age");

        ssnTxt.setText("ssn");

        usernameTxt.setText("username");

        createBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        createBtn.setForeground(new java.awt.Color(0, 0, 0));
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        hospitalCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalComboActionPerformed(evt);
            }
        });

        hospitalLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        hospitalLbl.setForeground(new java.awt.Color(51, 51, 51));
        hospitalLbl.setText("Hospital");

        cityLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        cityLbl.setForeground(new java.awt.Color(51, 51, 51));
        cityLbl.setText("City");

        cityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboActionPerformed(evt);
            }
        });

        communityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityComboActionPerformed(evt);
            }
        });

        communityLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        communityLbl.setForeground(new java.awt.Color(51, 51, 51));
        communityLbl.setText("Community");

        closeBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(0, 0, 0));
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(closeBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ageLbl)
                                        .addGap(46, 46, 46)
                                        .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(usernameLbl)
                                        .addGap(29, 29, 29)
                                        .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(nameLbl)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(ssnLbl)
                                                    .addGap(46, 46, 46)
                                                    .addComponent(ssnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(communityLbl)
                                                    .addComponent(cellLbl))
                                                .addGap(37, 37, 37)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cellTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                                    .addComponent(communityCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(emailLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(hospitalLbl)
                                                    .addComponent(passwordLbl)
                                                    .addComponent(cityLbl))
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(hospitalCombo, 0, 154, Short.MAX_VALUE)
                                                    .addComponent(cityCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(passwordTxt)))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(createBtn)))
                        .addGap(76, 76, 76)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(258, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(250, 250, 250)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailLbl)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameLbl)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLbl)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLbl)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ssnLbl)
                        .addComponent(ssnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cellLbl)
                        .addComponent(cellTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hospitalLbl)
                                .addComponent(hospitalCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(70, 70, 70))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(communityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(communityLbl))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cityLbl)))))
                .addGap(50, 50, 50)
                .addComponent(createBtn)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(334, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        var valid = true;
        
        if (ddCity.getSelectedItem(). == null || ddCity.getSelectedItem().toString.isEmpty()){
            cityLbl.setText("Please select city");
            valid = false;
        }

        if (ddCommunity.getSelectedItem(). == null || ddCommunity.getSelectedItem().toString.isEmpty()){
            communityLbl.setText("Please select community");
            valid = false;
        }
        
        if (ddHospital.getSelectedItem(). == null || ddHospital.getSelectedItem().toString.isEmpty()){
            hospitalLbl.setText("Please select hospital");
            valid = false;
        }
        
        if (!this.validations.ValidateName(nameTxt.getText())){
            nameLbl.setText("Invalid Name");
            valid = false;
        }
        
        if (!this.validations.ValidateAge(ageTxt.getText())){
            ageLbl.setText("Invalid Age");
            valid = false;
        }
        
        if (!this.validations.ValidateSSN(ssnTxt.getText())){
            ssnLbl.setText("Invalid SSN");
            valid = false;
        }
        
        if (!this.validations.ValidatePhoneNumber(cellTxt.getText())){
            cellLbl.setText("Invalid Cell Number");
            valid = false;
        }
        
        if (!this.validations.ValidateEmail(emailTxt.getText())){
            emailLbl.setText("Invalid Email");
            valid = false;
        }
        
        if (!this.validations.ValidateUsername(usernameTxt.getText())){
            usernameLbl.setText("Invalid Username");
            valid = false;
        }
        
        String password = String.valueOf(passwordTxt.getPassword());
        if (!this.validations.ValidatePassword(password)){
            passwordLbl.setText("Password should be 5-12 characters long");
            valid = false;
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void cellTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellTxtActionPerformed

    private void communityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityComboActionPerformed
        // ***enter code with database here
    }//GEN-LAST:event_communityComboActionPerformed

    private void hospitalComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalComboActionPerformed
        // ***enter code with database here
    }//GEN-LAST:event_hospitalComboActionPerformed

    private void cityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboActionPerformed
        // ***enter code with database here
    }//GEN-LAST:event_cityComboActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        System.out.println("Closing the application");
        System.exit(0);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void allDeliveriesBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allDeliveriesBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allDeliveriesBtn1ActionPerformed

    private void setTextNull(){
        ddCity.setSelectedItem("");
        ddCommuity.setSelectedItem("");
        ddHospital.setSelectedItem("");
        nameTxt.setText(null);
        ageTxt.setText(null);
        ssnTxt.setText(null);
        cellTxt.setText(null);
        emailTxt.setText(null);
        usernameTxt.setText(null);
        passwordTxt.setText(null);
    }
    
    private void setValidationNull(){
        ddCity.setText(null);
        ddCommuity.setText(null);
        ddHospital.setText(null);
        nameLbl.setText(null);
        ageLbl.setText(null);
        ssnLbl.setText(null);
        cellLbl.setText(null);
        emailLbl.setText(null);
        usernameLbl.setText(null);
        passwordLbl.setText(null);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton allDeliveriesBtn1;
    private javax.swing.JLabel cellLbl;
    private javax.swing.JTextField cellTxt;
    private javax.swing.JComboBox<String> cityCombo;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JButton closeBtn;
    private javax.swing.JComboBox<String> communityCombo;
    private javax.swing.JLabel communityLbl;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox<String> hospitalCombo;
    private javax.swing.JLabel hospitalLbl;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JLabel ssnLbl;
    private javax.swing.JTextField ssnTxt;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
