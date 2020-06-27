/**
 * Copyright © 2017 Infest Developer Team.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 * * Neither the name of the copyright holder nor the names of its contributors
 *   may be used to endorse or promote products derived from this software 
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.jogjadamai.infest.configurationmanager;

/**
 * <h1>class <code>Program</code></h1>
 * <p><code>Program</code> is class defining <code>main()</code> to run the
 * application.</p>
 * <br>
 * <p><b><i>Coded, built, and packaged with passion by Danang Galuh Tegar P for Infest.</i></b></p>
 * 
 * @author Danang Galuh Tegar P
 * @version 2017.03.10.0001
 */
public class Program extends javax.swing.JFrame {
    
    /**
     * Creates new form Program
     */
    public Program() {
        initComponents();
        initValues();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serverAddressLabel = new javax.swing.JLabel();
        credentialSaltLabel = new javax.swing.JLabel();
        serverAddressField = new javax.swing.JTextField();
        saltField = new javax.swing.JTextField();
        saveConfigurationButton = new javax.swing.JButton();
        noticeLabel = new javax.swing.JLabel();
        isValidServerAddressLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INFEST: Configuration Manager");
        setAlwaysOnTop(true);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/jogjadamai/infest/assets/InfestIcon.png")).getImage());
        setMaximumSize(new java.awt.Dimension(413, 300));
        setMinimumSize(new java.awt.Dimension(413, 300));
        setName("settingFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(413, 300));

        serverAddressLabel.setText("Server Address");
        serverAddressLabel.setDoubleBuffered(true);

        credentialSaltLabel.setText("Credentials Salt");
        credentialSaltLabel.setDoubleBuffered(true);

        serverAddressField.setDoubleBuffered(true);
        serverAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverAddressFieldActionPerformed(evt);
            }
        });
        serverAddressField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serverAddressFieldKeyReleased(evt);
            }
        });

        saltField.setDoubleBuffered(true);
        saltField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saltFieldActionPerformed(evt);
            }
        });
        saltField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                saltFieldKeyReleased(evt);
            }
        });

        saveConfigurationButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveConfigurationButton.setText("Save Configuration");
        saveConfigurationButton.setDoubleBuffered(true);
        saveConfigurationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveConfigurationButtonActionPerformed(evt);
            }
        });

        noticeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        noticeLabel.setText("<html>\nNOTICE:<br>\nSaving configuration with a new Credentials Salt that is not match with Infest Administrator Credentials Salt will result in an error.<br>\n<br>\nPlease make sure to verify the matchness of your new Credentials Salt before proceeding.");
        noticeLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        noticeLabel.setDoubleBuffered(true);

        isValidServerAddressLabel.setText("{isValid}");
        isValidServerAddressLabel.setDoubleBuffered(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(serverAddressLabel)
                        .addGap(18, 18, 18)
                        .addComponent(serverAddressField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(credentialSaltLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saltField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isValidServerAddressLabel)))
                            .addComponent(saveConfigurationButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noticeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverAddressLabel)
                    .addComponent(serverAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(isValidServerAddressLabel)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(credentialSaltLabel)
                    .addComponent(saltField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noticeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveConfigurationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveConfigurationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveConfigurationButtonActionPerformed
        // TODO add your handling code here:
        if(isServerAddressValid) {
            saveConfiguration();
            javax.swing.JOptionPane.showMessageDialog(this, "Infest Configuration has been saved!", "INFEST: Program Configuration Manager", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            if(javax.swing.JOptionPane.showConfirmDialog(this,
                    "We detected that Server Address is not a Valid URL.\n"
                            + "\n"
                            + "Do you want to proceed anyway?", 
                    "INFEST: Program Configuration Manager", 
                    javax.swing.JOptionPane.YES_NO_OPTION, 
                    javax.swing.JOptionPane.WARNING_MESSAGE) == javax.swing.JOptionPane.YES_OPTION) {
                saveConfiguration();
                javax.swing.JOptionPane.showMessageDialog(this, "Infest Configuration has been saved!", "INFEST: Program Configuration Manager", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_saveConfigurationButtonActionPerformed

    private void serverAddressFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serverAddressFieldKeyReleased
        // TODO add your handling code here:
        verifyServerAddressValidity();
        isServerAddressNew = !serverAddressField.getText().equals(currentServerAddress);
        serverAddressLabel.setForeground(isServerAddressNew ? java.awt.Color.BLUE : java.awt.Color.BLACK);
    }//GEN-LAST:event_serverAddressFieldKeyReleased

    private void serverAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverAddressFieldActionPerformed
        // TODO add your handling code here:
        if(isServerAddressValid) {
            saveConfiguration();
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Infest Configuration has been saved!\n"
                            + "Please restart Infest Program to take effect.",
                    "INFEST: Program Configuration Manager",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            if(javax.swing.JOptionPane.showConfirmDialog(this,
                    "We detected that Server Address is not a Valid URL.\n"
                            + "\n"
                            + "Do you want to proceed anyway?", 
                    "INFEST: Program Configuration Manager", 
                    javax.swing.JOptionPane.YES_NO_OPTION, 
                    javax.swing.JOptionPane.WARNING_MESSAGE) == javax.swing.JOptionPane.YES_OPTION) {
                saveConfiguration();
                javax.swing.JOptionPane.showMessageDialog(this, "Infest Configuration has been saved!", "INFEST: Program Configuration Manager", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_serverAddressFieldActionPerformed

    private void saltFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saltFieldActionPerformed
        // TODO add your handling code here:
        if(isServerAddressValid) {
            saveConfiguration();
            javax.swing.JOptionPane.showMessageDialog(this, "Infest Configuration has been saved!", "INFEST: Program Configuration Manager", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            if(javax.swing.JOptionPane.showConfirmDialog(this,
                    "We detected that Server Address is not a Valid URL.\n"
                            + "\n"
                            + "Do you want to proceed anyway?", 
                    "INFEST: Program Configuration Manager", 
                    javax.swing.JOptionPane.YES_NO_OPTION, 
                    javax.swing.JOptionPane.WARNING_MESSAGE) == javax.swing.JOptionPane.YES_OPTION) {
                saveConfiguration();
                javax.swing.JOptionPane.showMessageDialog(this, "Infest Configuration has been saved!", "INFEST: Program Configuration Manager", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_saltFieldActionPerformed

    private void saltFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saltFieldKeyReleased
        // TODO add your handling code here:
        isSaltNew = !saltField.getText().equals(currentSalt);
        noticeLabel.setVisible(isSaltNew);
        credentialSaltLabel.setForeground(isSaltNew ? java.awt.Color.BLUE : java.awt.Color.BLACK);
    }//GEN-LAST:event_saltFieldKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Program().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel credentialSaltLabel;
    private javax.swing.JLabel isValidServerAddressLabel;
    private javax.swing.JLabel noticeLabel;
    private javax.swing.JTextField saltField;
    private javax.swing.JButton saveConfigurationButton;
    private javax.swing.JTextField serverAddressField;
    private javax.swing.JLabel serverAddressLabel;
    // End of variables declaration//GEN-END:variables

    private Boolean isServerAddressValid;
    private Boolean isServerAddressNew, isSaltNew;
    private String currentServerAddress, currentSalt;
    private com.jogjadamai.infest.service.ProgramPropertiesManager ppm;
    
    private void initValues() {
        setLocationRelativeTo(null);
        ppm = com.jogjadamai.infest.service.ProgramPropertiesManager.getInstance();
        try {
            currentServerAddress = ppm.getProperty("serveraddress");
        } catch(NullPointerException ex) {
            System.err.println("[INFEST] " + ex + " on Server Address.");
            currentServerAddress = "";
        }
        try {
            currentSalt = ppm.getProperty("salt");
        } catch(NullPointerException ex) {
            System.err.println("[INFEST] " + ex + " on Salt.");
            currentSalt = "";
        }
        serverAddressField.setText(currentServerAddress);
        saltField.setText(currentSalt);
        isServerAddressNew = false;
        isSaltNew = false;
        noticeLabel.setVisible(isSaltNew);
        serverAddressLabel.setForeground(isServerAddressNew ? java.awt.Color.BLUE : java.awt.Color.BLACK);
        credentialSaltLabel.setForeground(isSaltNew ? java.awt.Color.BLUE : java.awt.Color.BLACK);
        verifyServerAddressValidity();
        System.err.println("[INFEST] " + "Current Server Address   : " + currentServerAddress);
        System.err.println("[INFEST] " + "Current Credentials Salt : " + currentSalt);
    }
    
    private void verifyServerAddressValidity() {
        if(serverAddressField.getText().length() != 0) {      
            org.apache.commons.validator.UrlValidator urlValidator = new org.apache.commons.validator.UrlValidator();
            if (urlValidator.isValid("http://" + serverAddressField.getText())) {
               isValidServerAddressLabel.setText("Valid URL.");
               isValidServerAddressLabel.setForeground(java.awt.Color.BLUE);
               isServerAddressValid = true;
            } else {
               isValidServerAddressLabel.setText("Invalid URL.");
               isValidServerAddressLabel.setForeground(java.awt.Color.RED);
               isServerAddressValid = false;
            }
        } else {
            isValidServerAddressLabel.setText("");
            isServerAddressValid = false;
        }
    }
    
    private void saveConfiguration() {
        String serverAddress = (serverAddressField.getText().length() != 0) ? serverAddressField.getText() : null;
        String salt = (saltField.getText().length() != 0) ? saltField.getText() : null;
        if(serverAddress != null) {
            ppm.setProperty("serveraddress", serverAddress.trim());
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "You left Server Address blank. Nothing will be change in current Server Address configuration.", "INFEST: Program Configuration Manager", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
        if(isSaltNew) {
            java.io.File administratorCredentials = new java.io.File("administrator.crd");
            java.io.File operatorCredentials = new java.io.File("operator.crd");
            if (administratorCredentials.delete()) System.err.println("[INFEST] " + "Administrator Credentials file deleted.");
            if (operatorCredentials.delete()) System.err.println("[INFEST] " + "Operator Credentials file deleted.");
            
        }
        if(salt != null) {
            ppm.setProperty("salt", salt.trim());
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "You left Salt blank. Credentials cannot be saved without Salt.", "INFEST: Program Configuration Manager", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
        ppm.setProperty("autoconfiguration", "true");
        System.err.println("[INFEST] " + "New configuration has been saved!");
        initValues();
    }
    
}
