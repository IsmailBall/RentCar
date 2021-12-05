package GUI;

import java.awt.Font;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Lian La-Fey
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        pass_JPass.setEchoChar((char)'\u2022');
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 2;
                while ( true ) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                    girisGorsel.setIcon(new ImageIcon(getClass().getResource("/images/girisGorsel" + i + ".png")));
                    
                    i++;
                    if ( i == 4 )
                        i = 1;
                }
            }
            
        }).start();
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        biligi_jPanel = new javax.swing.JPanel();
        logo_label = new javax.swing.JLabel();
        mail_JText = new javax.swing.JTextField();
        pass_JPass = new javax.swing.JPasswordField();
        hideShowPass_Btn = new javax.swing.JToggleButton();
        register_btn = new javax.swing.JButton();
        login_btn = new javax.swing.JButton();
        resetPassword_btn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        email_jLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        password_JLabel = new javax.swing.JLabel();
        guest_JLabel = new javax.swing.JLabel();
        tanitim_JPanel = new javax.swing.JPanel();
        girisGorsel = new javax.swing.JLabel();
        loginPic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        closeLogin_JLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        biligi_jPanel.setBackground(new java.awt.Color(50, 45, 44));

        logo_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoSmall.png"))); // NOI18N

        mail_JText.setBackground(new java.awt.Color(50, 45, 44));
        mail_JText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mail_JText.setForeground(new java.awt.Color(255, 255, 255));
        mail_JText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mail_JText.setText("ibr.glmz19@gmail.com");
        mail_JText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mail_JText.setOpaque(true);

        pass_JPass.setBackground(new java.awt.Color(50, 45, 44));
        pass_JPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pass_JPass.setForeground(new java.awt.Color(255, 255, 255));
        pass_JPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass_JPass.setText("adskasdkas");
        pass_JPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7));
        pass_JPass.setOpaque(true);

        hideShowPass_Btn.setBackground(new java.awt.Color(50, 45, 44));
        hideShowPass_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeEye.png"))); // NOI18N
        hideShowPass_Btn.setBorder(null);
        hideShowPass_Btn.setOpaque(true);
        hideShowPass_Btn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hideShowPass_BtnİtemStateChanged(evt);
            }
        });

        register_btn.setBackground(new java.awt.Color(51, 204, 0));
        register_btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        register_btn.setText("REGISTER");

        login_btn.setBackground(new java.awt.Color(51, 204, 255));
        login_btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        login_btn.setText("LOGIN");

        resetPassword_btn.setBackground(new java.awt.Color(255, 102, 102));
        resetPassword_btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        resetPassword_btn.setText("RESET PASSWORD");

        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));

        email_jLabel.setBackground(new java.awt.Color(255, 255, 255));
        email_jLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        email_jLabel.setForeground(new java.awt.Color(250, 233, 60));
        email_jLabel.setText("Email");
        email_jLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        password_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        password_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        password_JLabel.setForeground(new java.awt.Color(250, 233, 60));
        password_JLabel.setText("Password");
        password_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        guest_JLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        guest_JLabel.setForeground(new java.awt.Color(255, 255, 255));
        guest_JLabel.setText("Enter application as a guest");
        guest_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guest_JLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout biligi_jPanelLayout = new javax.swing.GroupLayout(biligi_jPanel);
        biligi_jPanel.setLayout(biligi_jPanelLayout);
        biligi_jPanelLayout.setHorizontalGroup(
            biligi_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(biligi_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(biligi_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, biligi_jPanelLayout.createSequentialGroup()
                        .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(biligi_jPanelLayout.createSequentialGroup()
                        .addGroup(biligi_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(biligi_jPanelLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(password_JLabel))
                            .addGroup(biligi_jPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(biligi_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator2)
                                    .addGroup(biligi_jPanelLayout.createSequentialGroup()
                                        .addComponent(pass_JPass, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(hideShowPass_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(biligi_jPanelLayout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(email_jLabel))
                            .addGroup(biligi_jPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(mail_JText, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(logo_label)
                            .addGroup(biligi_jPanelLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(resetPassword_btn))
                            .addGroup(biligi_jPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(guest_JLabel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        biligi_jPanelLayout.setVerticalGroup(
            biligi_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(biligi_jPanelLayout.createSequentialGroup()
                .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mail_JText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(biligi_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pass_JPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hideShowPass_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(biligi_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(resetPassword_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guest_JLabel)
                .addGap(45, 45, 45))
        );

        tanitim_JPanel.setBackground(new java.awt.Color(50, 45, 44));

        loginPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/girisGorsel1.png"))); // NOI18N

        javax.swing.GroupLayout tanitim_JPanelLayout = new javax.swing.GroupLayout(tanitim_JPanel);
        tanitim_JPanel.setLayout(tanitim_JPanelLayout);
        tanitim_JPanelLayout.setHorizontalGroup(
            tanitim_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tanitim_JPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(girisGorsel)
                .addGap(94, 94, 94))
            .addGroup(tanitim_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPic, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tanitim_JPanelLayout.setVerticalGroup(
            tanitim_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tanitim_JPanelLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(girisGorsel)
                .addGap(60, 60, 60)
                .addComponent(loginPic, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        jPanel1.setBackground(new java.awt.Color(50, 45, 44));

        closeLogin_JLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        closeLogin_JLabel.setForeground(new java.awt.Color(255, 255, 255));
        closeLogin_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLogin_JLabel.setText("X");
        closeLogin_JLabel.setToolTipText("");
        closeLogin_JLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                .addGap(0, 482, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(biligi_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanitim_JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tanitim_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(biligi_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hideShowPass_BtnİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hideShowPass_BtnİtemStateChanged
        // TODO add your handling code here:
        if ( evt.getStateChange() == ItemEvent.SELECTED ) {
            hideShowPass_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/openEye.png")));
            pass_JPass.setEchoChar((char)0);
        } else if ( evt.getStateChange() == ItemEvent.DESELECTED ) {
            hideShowPass_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeEye.png")));
            pass_JPass.setEchoChar((char)'\u2022');
        }
    }//GEN-LAST:event_hideShowPass_BtnİtemStateChanged

    private void closeLogin_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLogin_JLabelMouseClicked
        // TODO add your handling code here:
        System.exit( 0 );
    }//GEN-LAST:event_closeLogin_JLabelMouseClicked

    private void guest_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guest_JLabelMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_guest_JLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel biligi_jPanel;
    private javax.swing.JLabel closeLogin_JLabel;
    private javax.swing.JLabel email_jLabel;
    private javax.swing.JLabel girisGorsel;
    private javax.swing.JLabel guest_JLabel;
    private javax.swing.JToggleButton hideShowPass_Btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel loginPic;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel logo_label;
    private javax.swing.JTextField mail_JText;
    private javax.swing.JPasswordField pass_JPass;
    private javax.swing.JLabel password_JLabel;
    private javax.swing.JButton register_btn;
    private javax.swing.JButton resetPassword_btn;
    private javax.swing.JPanel tanitim_JPanel;
    // End of variables declaration//GEN-END:variables
}