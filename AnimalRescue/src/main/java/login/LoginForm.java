/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import javax.swing.JOptionPane;
import database.Db;
import delivery.DeliveryPartner;
import delivery.DeliveryPerson;
import hospitalAdmin.HospitalAdminLandingPage;
import models.Person;
import ngo.NGOLandingPage;
import systemadmin.SysAdminHome;
import user_ui.UserLandingPage;
import vendor.VendorLandingPage;

/**
 *
 * @author nikhilbindal
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Person person = new Person();
    Db database = new Db();
    public LoginForm() {
        database.getConnect();
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

        loginPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblRole = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        lblLoginAs = new javax.swing.JLabel();
        comboLoginAs = new javax.swing.JComboBox<>();
        lblNewUser = new javax.swing.JLabel();
        lblLoginAs1 = new javax.swing.JLabel();
        comboSignupAs = new javax.swing.JComboBox<>();
        btnSignup = new javax.swing.JButton();
        btnLogin2 = new javax.swing.JButton();
        valCreds = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        headerPanel.setBackground(new java.awt.Color(0, 0, 102));
        headerPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login Here!");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)))
                .addGap(26, 26, 26))
        );

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(153, 153, 153));
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblPassword.setText("Password:");

        txtUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 153, 102)));

        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 153, 102)));

        btnLogin.setBackground(new java.awt.Color(0, 0, 102));
        btnLogin.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(204, 204, 204));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblRole.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblRole.setForeground(new java.awt.Color(153, 153, 153));
        lblRole.setText("Role:");

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Administrator", "Others" }));
        comboRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRoleActionPerformed(evt);
            }
        });

        lblLoginAs.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblLoginAs.setForeground(new java.awt.Color(153, 153, 153));
        lblLoginAs.setText("Login As:");

        lblNewUser.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblNewUser.setForeground(new java.awt.Color(153, 153, 153));
        lblNewUser.setText("New User? ");

        lblLoginAs1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblLoginAs1.setForeground(new java.awt.Color(153, 153, 153));
        lblLoginAs1.setText("Signup As:");

        comboSignupAs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "NGO", "Vendor", "Delivery Partner" }));
        comboSignupAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSignupAsActionPerformed(evt);
            }
        });

        btnSignup.setBackground(new java.awt.Color(0, 0, 102));
        btnSignup.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(204, 204, 204));
        btnSignup.setText("Sign Up");
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignupMouseClicked(evt);
            }
        });
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        btnLogin2.setBackground(new java.awt.Color(255, 0, 51));
        btnLogin2.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        btnLogin2.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin2.setText("SOS!!!");
        btnLogin2.setAlignmentX(0.5F);
        btnLogin2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin2ActionPerformed(evt);
            }
        });

        valCreds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(valCreds, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPassword)
                                .addComponent(lblPassword)
                                .addComponent(comboLoginAs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLoginAs)
                                .addComponent(comboRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblRole)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUsername))
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblNewUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLoginAs1))
                            .addComponent(comboSignupAs, 0, 181, Short.MAX_VALUE)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLogin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(lblRole)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblLoginAs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboLoginAs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLoginAs1)
                            .addComponent(lblNewUser))
                        .addGap(14, 14, 14)
                        .addComponent(comboSignupAs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valCreds, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(btnLogin2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if(comboRole.getSelectedItem().toString().equals("Select")) {
            valCreds.setText("Role is required!");
        } else if(comboLoginAs.getSelectedItem().toString().equals("")) {
            valCreds.setText("Login As is required!");
        } else if (txtUsername.getText().equals("")) {
            valCreds.setText("Username is required!");
        } else if (String.valueOf(txtPassword.getPassword()).equals("")) {
            valCreds.setText("Password is required!");
        } else {
            String userType = comboLoginAs.getSelectedItem().toString();
            String username = txtUsername.getText();
            String password = String.valueOf(txtPassword.getPassword());
            
            Person p = person.checkPersonCreds(userType, username, password);
            System.out.println("value of p is:  " + p);
            if(p != null) {
                if(userType.equals("System Administrator")) {
                    SysAdminHome adminPage = new SysAdminHome();
                    adminPage.setVisible(true);
                    this.dispose();
                }
                if(userType.equals("Vendor")) {
                    VendorLandingPage vendorPage = new VendorLandingPage();
                    vendorPage.setVisible(true);
                }
                if(userType.equals("NGO")) {
                    NGOLandingPage ngoPage = new NGOLandingPage();
                    ngoPage.setVisible(true);
                }
                if(userType.equals("Delivery Partner")) {
                    DeliveryPartner deliveryPartnerPage = new DeliveryPartner();
                    deliveryPartnerPage.setVisible(true);
                }
                if(userType.equals("Driver")) {
                    DeliveryPerson deliveryPersonPage = new DeliveryPerson();
                    deliveryPersonPage.setVisible(true);
                }
                if(userType.equals("Hospital Manager")) {
                    HospitalAdminLandingPage hospitalAdminPage = new HospitalAdminLandingPage();
                    hospitalAdminPage.setVisible(true);
                }
                if(userType.equals("Vet")) {
                    SysAdminHome adminPage = new SysAdminHome();
                    adminPage.setVisible(true);
                }
                if(userType.equals("User")) {
                    UserLandingPage userPage = new UserLandingPage();
                    userPage.setVisible(true);
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials!");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin2ActionPerformed
        // TODO add your handling code here:
        SOSForm sos= new SOSForm(this, true);
        sos.setVisible(true);
    }//GEN-LAST:event_btnLogin2ActionPerformed

    private void comboRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRoleActionPerformed
        // TODO add your handling code here:
        comboLoginAs.removeAllItems();
        if(comboRole.getSelectedItem().toString().equals("Administrator")) {
            comboLoginAs.addItem("System Administrator");
            comboLoginAs.addItem("Hospital Manager");
            comboLoginAs.addItem("Vendor");
            comboLoginAs.addItem("Delivery Partner");
        }
        
        if(comboRole.getSelectedItem().toString().equals("Others")) {
            comboLoginAs.addItem("User");
            comboLoginAs.addItem("Vet");
            comboLoginAs.addItem("Driver");
            comboLoginAs.addItem("NGO");
        }
    }//GEN-LAST:event_comboRoleActionPerformed

    private void comboSignupAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSignupAsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboSignupAsActionPerformed

    private void btnSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseClicked
        // TODO add your handling code here:
        String usertype = comboSignupAs.getSelectedItem().toString();
        if(usertype.equals("")) {
            JOptionPane.showMessageDialog(this, "Please select the user type!");
        } else {
            SignupForm signup = new SignupForm(usertype);
            signup.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSignupMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin2;
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox<String> comboLoginAs;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JComboBox<String> comboSignupAs;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLoginAs;
    private javax.swing.JLabel lblLoginAs1;
    private javax.swing.JLabel lblNewUser;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel valCreds;
    // End of variables declaration//GEN-END:variables
}
