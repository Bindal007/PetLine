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
import models.Hospital;
import models.Person;

/**
 *
 * @author vicken
 */
public class VetCreate extends javax.swing.JPanel {

    Validations validations;
    City city;
//    Community community;
    Hospital hospital;
    
    public VetCreate() {
        initComponents();
        AutoCompleteDecorator.decorate(cityCombo);
        AutoCompleteDecorator.decorate(communityCombo);
        AutoCompleteDecorator.decorate(hospitalCombo);
        
//        cityCombo.remove AllItems();
//        cityCombo.addItem("");
//        for (City c : MainJFrame.cityDirectory.getCityList()){
//            cityCombo.addItem(c.getName());
//        }
//        
//        ddCity.getSelectedItem("");
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

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jButton3.setText("Logout");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton3)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(60, 60, 60))
        );

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Vet");

        nameLbl.setText("Name");

        cellLbl.setText("Cell Number");

        emailLbl.setText("Email");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        cellTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellTxtActionPerformed(evt);
            }
        });

        createBtn.setBackground(new java.awt.Color(0, 0, 102));
        createBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createBtn.setForeground(new java.awt.Color(204, 204, 204));
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboActionPerformed(evt);
            }
        });

        hospitalLbl.setText("Hospital");

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

        communityLbl.setText("Community");

        closeBtn.setBackground(new java.awt.Color(0, 0, 102));
        closeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(204, 204, 204));
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(134, 134, 134)
                                    .addComponent(ssnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ssnLbl)
                                            .addComponent(cellLbl)
                                            .addComponent(ageLbl)
                                            .addComponent(nameLbl)
                                            .addComponent(communityLbl))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cellTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                            .addComponent(communityCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hospitalLbl)
                                    .addComponent(cityLbl))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hospitalCombo, 0, 152, Short.MAX_VALUE)
                                    .addComponent(cityCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameLbl)
                                        .addComponent(emailLbl))
                                    .addComponent(passwordLbl))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(closeBtn)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(closeBtn)
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailLbl)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameLbl)))
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospitalLbl)
                            .addComponent(hospitalCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityLbl)
                            .addComponent(communityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(communityLbl))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cellLbl)
                            .addComponent(cellTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)))
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
        
//        if (ddCity.getSelectedItem(). == null || ddCity.getSelectedItem().toString.isEmpty()){
//            cityLbl.setText("Please select city");
//            valid = false;
//        }
//
//        if (ddCommunity.getSelectedItem(). == null || ddCommunity.getSelectedItem().toString.isEmpty()){
//            communityLbl.setText("Please select community");
//            valid = false;
//        }
//        
//        if (ddHospital.getSelectedItem(). == null || ddHospital.getSelectedItem().toString.isEmpty()){
//            hospitalLbl.setText("Please select hospital");
//            valid = false;
//        }
        
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
        
//        String password = String.valueOf(passwordTxt.getPassword());
//        if (!this.validations.ValidatePassword(password)){
//            passwordLbl.setText("Password should be 5-12 characters long");
//            valid = false;
//        }
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

    private void setTextNull(){
//        ddCity.setSelectedItem("");
//        ddCommuity.setSelectedItem("");
//        ddHospital.setSelectedItem("");
        nameTxt.setText(null);
        ageTxt.setText(null);
        ssnTxt.setText(null);
        cellTxt.setText(null);
        emailTxt.setText(null);
        usernameTxt.setText(null);
        passwordTxt.setText(null);
    }
    
    private void setValidationNull(){
//        ddCity.setText(null);
//        ddCommuity.setText(null);
//        ddHospital.setText(null);
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
