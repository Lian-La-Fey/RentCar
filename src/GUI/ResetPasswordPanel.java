/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Business.RentCarSystem;
import Entities.Abstract.User;
import Entities.Concrete.Customer;
import Entities.Concrete.GalleryOwner;
import Helper.HelperMethods;

/**
 *
 * @author Lian La-Fey
 */
public final class ResetPasswordPanel extends javax.swing.JFrame {

    /**
     * Creates new form ResetPassword
     */
    
    private User user;
    
    public ResetPasswordPanel() {
        initComponents();
        f1();
    }
    
    public ResetPasswordPanel(GalleryOwner galleryOwner) {
        initComponents();
        f1();
        
        user = galleryOwner;
        HelperMethods.changePage(secondPage, jLayeredPane1);
        rstPasswordQue_JText.setText( user.getResetPasswordQuestion() );
    }
    
    public ResetPasswordPanel(Customer customer) {
        initComponents();
        f1();
        
        user = customer;
        HelperMethods.changePage(secondPage, jLayeredPane1);
        rstPasswordQue_JText.setText( user.getResetPasswordQuestion() );
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        firstPage = new javax.swing.JPanel();
        mail_jLabel = new javax.swing.JLabel();
        mail_JText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        firstPageContinue_JButton = new javax.swing.JButton();
        secondPage = new javax.swing.JPanel();
        rstPasswordQue_JLabel = new javax.swing.JLabel();
        rstPasswordQue_JText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        rstPasswordAns_JLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        secondPageContinue_JButton = new javax.swing.JButton();
        rstPasswrdAns_JPass = new javax.swing.JPasswordField();
        hideShowPass_Btn2 = new javax.swing.JToggleButton();
        thirdPage = new javax.swing.JPanel();
        thirdPageContinue_JBut = new javax.swing.JButton();
        newPassword_JLabel = new javax.swing.JLabel();
        newPassword_JPass = new javax.swing.JPasswordField();
        hideShowPass_Btn3 = new javax.swing.JToggleButton();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        closeLogin_JLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        firstPage.setBackground(new java.awt.Color(46, 49, 49));

        mail_jLabel.setBackground(new java.awt.Color(255, 255, 255));
        mail_jLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        mail_jLabel.setForeground(new java.awt.Color(250, 233, 60));
        mail_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mail_jLabel.setText("Enter Your Email Address");
        mail_jLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        mail_JText.setBackground(new java.awt.Color(46, 49, 49));
        mail_JText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mail_JText.setForeground(new java.awt.Color(255, 255, 255));
        mail_JText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mail_JText.setText("ibr.glmz19@gmail.com");
        mail_JText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mail_JText.setOpaque(true);

        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));

        firstPageContinue_JButton.setBackground(new java.awt.Color(46, 49, 49));
        firstPageContinue_JButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        firstPageContinue_JButton.setForeground(new java.awt.Color(250, 233, 60));
        firstPageContinue_JButton.setText("Continue");
        firstPageContinue_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        firstPageContinue_JButton.setOpaque(true);
        firstPageContinue_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstPageContinue_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout firstPageLayout = new javax.swing.GroupLayout(firstPage);
        firstPage.setLayout(firstPageLayout);
        firstPageLayout.setHorizontalGroup(
            firstPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPageLayout.createSequentialGroup()
                .addGroup(firstPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstPageLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(firstPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(mail_JText)
                            .addComponent(mail_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(firstPageLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(firstPageContinue_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        firstPageLayout.setVerticalGroup(
            firstPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPageLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(mail_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mail_JText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(firstPageContinue_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jLayeredPane1.add(firstPage, "card2");

        secondPage.setBackground(new java.awt.Color(46, 49, 49));

        rstPasswordQue_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        rstPasswordQue_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        rstPasswordQue_JLabel.setForeground(new java.awt.Color(250, 233, 60));
        rstPasswordQue_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rstPasswordQue_JLabel.setText("Reset Password Question");
        rstPasswordQue_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        rstPasswordQue_JText.setEditable(false);
        rstPasswordQue_JText.setBackground(new java.awt.Color(46, 49, 49));
        rstPasswordQue_JText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rstPasswordQue_JText.setForeground(new java.awt.Color(255, 255, 255));
        rstPasswordQue_JText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rstPasswordQue_JText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rstPasswordQue_JText.setOpaque(true);

        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));

        rstPasswordAns_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        rstPasswordAns_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        rstPasswordAns_JLabel.setForeground(new java.awt.Color(250, 233, 60));
        rstPasswordAns_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rstPasswordAns_JLabel.setText("Reset Password Answer");
        rstPasswordAns_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jSeparator3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));

        secondPageContinue_JButton.setBackground(new java.awt.Color(46, 49, 49));
        secondPageContinue_JButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        secondPageContinue_JButton.setForeground(new java.awt.Color(250, 233, 60));
        secondPageContinue_JButton.setText("Continue");
        secondPageContinue_JButton.setOpaque(true);
        secondPageContinue_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondPageContinue_JButtonActionPerformed(evt);
            }
        });

        rstPasswrdAns_JPass.setBackground(new java.awt.Color(46, 49, 49));
        rstPasswrdAns_JPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rstPasswrdAns_JPass.setForeground(new java.awt.Color(255, 255, 255));
        rstPasswrdAns_JPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rstPasswrdAns_JPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7));
        rstPasswrdAns_JPass.setOpaque(true);

        hideShowPass_Btn2.setBackground(new java.awt.Color(46, 49, 49));
        hideShowPass_Btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeEye2.png"))); // NOI18N
        hideShowPass_Btn2.setBorder(null);
        hideShowPass_Btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hideShowPass_Btn2.setOpaque(true);
        hideShowPass_Btn2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hideShowPass_Btn2İtemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout secondPageLayout = new javax.swing.GroupLayout(secondPage);
        secondPage.setLayout(secondPageLayout);
        secondPageLayout.setHorizontalGroup(
            secondPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPageLayout.createSequentialGroup()
                .addGroup(secondPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(secondPageLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(secondPageContinue_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(secondPageLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(secondPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(secondPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator3)
                                .addComponent(rstPasswordAns_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(secondPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2)
                                .addComponent(rstPasswordQue_JText)
                                .addComponent(rstPasswordQue_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPageLayout.createSequentialGroup()
                                .addComponent(rstPasswrdAns_JPass, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(hideShowPass_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        secondPageLayout.setVerticalGroup(
            secondPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPageLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(rstPasswordQue_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rstPasswordQue_JText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rstPasswordAns_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(secondPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rstPasswrdAns_JPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hideShowPass_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondPageContinue_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLayeredPane1.add(secondPage, "card3");

        thirdPage.setBackground(new java.awt.Color(46, 49, 49));

        thirdPageContinue_JBut.setBackground(new java.awt.Color(46, 49, 49));
        thirdPageContinue_JBut.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        thirdPageContinue_JBut.setForeground(new java.awt.Color(250, 233, 60));
        thirdPageContinue_JBut.setText("Complete");
        thirdPageContinue_JBut.setOpaque(true);
        thirdPageContinue_JBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdPageContinue_JButActionPerformed(evt);
            }
        });

        newPassword_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        newPassword_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        newPassword_JLabel.setForeground(new java.awt.Color(250, 233, 60));
        newPassword_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newPassword_JLabel.setText("New Password");
        newPassword_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        newPassword_JPass.setBackground(new java.awt.Color(46, 49, 49));
        newPassword_JPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newPassword_JPass.setForeground(new java.awt.Color(255, 255, 255));
        newPassword_JPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newPassword_JPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7));
        newPassword_JPass.setOpaque(true);

        hideShowPass_Btn3.setBackground(new java.awt.Color(46, 49, 49));
        hideShowPass_Btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeEye2.png"))); // NOI18N
        hideShowPass_Btn3.setBorder(null);
        hideShowPass_Btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hideShowPass_Btn3.setOpaque(true);
        hideShowPass_Btn3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hideShowPass_Btn3İtemStateChanged(evt);
            }
        });

        jSeparator4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));

        javax.swing.GroupLayout thirdPageLayout = new javax.swing.GroupLayout(thirdPage);
        thirdPage.setLayout(thirdPageLayout);
        thirdPageLayout.setHorizontalGroup(
            thirdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thirdPageLayout.createSequentialGroup()
                .addGroup(thirdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thirdPageLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(thirdPageContinue_JBut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(thirdPageLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(thirdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(thirdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator4)
                                .addComponent(newPassword_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thirdPageLayout.createSequentialGroup()
                                .addComponent(newPassword_JPass, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(hideShowPass_Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        thirdPageLayout.setVerticalGroup(
            thirdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thirdPageLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(newPassword_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(thirdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newPassword_JPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hideShowPass_Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(thirdPageContinue_JBut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jLayeredPane1.add(thirdPage, "card4");

        jPanel1.setBackground(new java.awt.Color(46, 49, 49));

        closeLogin_JLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        closeLogin_JLabel.setForeground(new java.awt.Color(255, 255, 255));
        closeLogin_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLogin_JLabel.setText("X");
        closeLogin_JLabel.setToolTipText("");
        closeLogin_JLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeLogin_JLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLogin_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLogin_JLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeLogin_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeLogin_JLabel)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeLogin_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLogin_JLabelMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeLogin_JLabelMouseClicked

    private void hideShowPass_Btn2İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hideShowPass_Btn2İtemStateChanged
        // TODO add your handling code here:
        HelperMethods.hideShowPass(evt, hideShowPass_Btn2, rstPasswrdAns_JPass);
    }//GEN-LAST:event_hideShowPass_Btn2İtemStateChanged

    private void hideShowPass_Btn3İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hideShowPass_Btn3İtemStateChanged
        // TODO add your handling code here:
        HelperMethods.hideShowPass(evt, hideShowPass_Btn3, newPassword_JPass);
    }//GEN-LAST:event_hideShowPass_Btn3İtemStateChanged

    private void firstPageContinue_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstPageContinue_JButtonActionPerformed
        // TODO add your handling code here:
        user =  RentCarSystem.getUserByMailName( mail_JText.getText() );
        
        if ( user != null ) {
            HelperMethods.changePage(secondPage, jLayeredPane1);
            rstPasswordQue_JText.setText( user.getResetPasswordQuestion() );
        } else {
            HelperMethods.showErrorMessage("We cannot found your email!", "Unregistered Email");
        }
    }//GEN-LAST:event_firstPageContinue_JButtonActionPerformed

    private void secondPageContinue_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondPageContinue_JButtonActionPerformed
        // TODO add your handling code here:
        if ( String.valueOf( rstPasswrdAns_JPass.getPassword() ).equals( user.getResetPasswordAnswer() ) ) {
            HelperMethods.changePage(thirdPage, jLayeredPane1);
        } else {
            HelperMethods.showErrorMessage("Unmatched Answer", "Wrong");
        }
    }//GEN-LAST:event_secondPageContinue_JButtonActionPerformed

    private void thirdPageContinue_JButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdPageContinue_JButActionPerformed
       // TODO add your handling code here:
       boolean isSuccesful = false;
        try {
            
            if ( user instanceof Customer ) 
                RentCarSystem.updateCustomerPassword(user.getMailAdress().getName(), String.valueOf(newPassword_JPass.getPassword()) );
            else if ( user instanceof GalleryOwner )
                RentCarSystem.updateGalleryOwnerPassword(user.getMailAdress().getName(), String.valueOf(newPassword_JPass.getPassword()) );
            
            isSuccesful = true;
        } catch (IllegalArgumentException exception) {
            HelperMethods.showErrorMessage(exception.getMessage(), "Invalid Password");
        }
        
        if ( isSuccesful )
            dispose();
    }//GEN-LAST:event_thirdPageContinue_JButActionPerformed

    public void f1() {
        rstPasswrdAns_JPass.setEchoChar((char)'\u2022');
        newPassword_JPass.setEchoChar((char)'\u2022');
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeLogin_JLabel;
    private javax.swing.JPanel firstPage;
    private javax.swing.JButton firstPageContinue_JButton;
    private javax.swing.JToggleButton hideShowPass_Btn2;
    private javax.swing.JToggleButton hideShowPass_Btn3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField mail_JText;
    private javax.swing.JLabel mail_jLabel;
    private javax.swing.JLabel newPassword_JLabel;
    private javax.swing.JPasswordField newPassword_JPass;
    private javax.swing.JLabel rstPasswordAns_JLabel;
    private javax.swing.JLabel rstPasswordQue_JLabel;
    private javax.swing.JTextField rstPasswordQue_JText;
    private javax.swing.JPasswordField rstPasswrdAns_JPass;
    private javax.swing.JPanel secondPage;
    private javax.swing.JButton secondPageContinue_JButton;
    private javax.swing.JPanel thirdPage;
    private javax.swing.JButton thirdPageContinue_JBut;
    // End of variables declaration//GEN-END:variables
}
