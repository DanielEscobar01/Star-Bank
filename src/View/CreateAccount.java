/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.Cashier;
import java.awt.event.KeyEvent;

/**
 *
 * @author danielescobar
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
        initComponents();
        id.setTransferHandler(null); // This method does not let the user copy and paste into the id field
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalLable = new javax.swing.JLabel();
        idLabel1 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        principalLable1 = new javax.swing.JLabel();
        createLabel = new javax.swing.JLabel();
        idLabel2 = new javax.swing.JLabel();
        accountIdLabel = new javax.swing.JLabel();
        accountTypeLabel = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        accountId = new javax.swing.JTextField();
        submit1 = new javax.swing.JButton();
        accountType = new javax.swing.JComboBox<>();

        principalLable.setFont(new java.awt.Font("PT Serif Caption", 3, 24)); // NOI18N
        principalLable.setText("PRINCIPAL BRANCH OFFICE");

        idLabel1.setFont(new java.awt.Font("PT Serif Caption", 3, 18)); // NOI18N
        idLabel1.setText("ENTER YOUR ID:");

        submit.setFont(new java.awt.Font("PT Serif Caption", 3, 18)); // NOI18N
        submit.setText("CREATE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Account");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        titleLabel.setFont(new java.awt.Font("PT Serif Caption", 3, 48)); // NOI18N
        titleLabel.setText("STAR BANK");

        principalLable1.setFont(new java.awt.Font("PT Serif Caption", 3, 24)); // NOI18N
        principalLable1.setText("PRINCIPAL BRANCH OFFICE");

        createLabel.setFont(new java.awt.Font("PT Serif Caption", 3, 24)); // NOI18N
        createLabel.setText("CREATION OF  ACCOUNT");

        idLabel2.setFont(new java.awt.Font("PT Serif Caption", 3, 18)); // NOI18N
        idLabel2.setText("ENTER YOUR ID:");

        accountIdLabel.setFont(new java.awt.Font("PT Serif Caption", 3, 18)); // NOI18N
        accountIdLabel.setText("ENTER ACCOUNT ID:");

        accountTypeLabel.setFont(new java.awt.Font("PT Serif Caption", 3, 18)); // NOI18N
        accountTypeLabel.setText("SELECT TYPE OF ACCOUNT:");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        submit1.setFont(new java.awt.Font("PT Serif Caption", 3, 18)); // NOI18N
        submit1.setText("CREATE");
        submit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit1MouseClicked(evt);
            }
        });

        accountType.setFont(new java.awt.Font("PT Serif Caption", 3, 14)); // NOI18N
        accountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings Account", "Checkings Account" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submit1)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountIdLabel)
                            .addComponent(idLabel2)
                            .addComponent(accountTypeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountId)
                            .addComponent(id)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(accountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(titleLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(principalLable1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(createLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(313, 313, 313))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(principalLable1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(idLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accountTypeLabel)
                            .addComponent(accountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(accountId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        // The next instructions will not let the user type non numeric values
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_idKeyTyped

    private void submit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit1MouseClicked
        // Create account button
        String id = this.id.getText();
        String titularId = accountId.getText();
        String kindOfAccount = accountType.getSelectedItem().toString();
        Cashier account = new Cashier();
        account.addAccount(id, titularId, kindOfAccount);
        this.setVisible(false);
        CashierWindow cashierWindow = new CashierWindow();
        cashierWindow.setVisible(true);

    }//GEN-LAST:event_submit1MouseClicked

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountId;
    private javax.swing.JLabel accountIdLabel;
    private javax.swing.JComboBox<String> accountType;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JLabel createLabel;
    private javax.swing.JTextField id;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLabel idLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel principalLable;
    private javax.swing.JLabel principalLable1;
    private javax.swing.JButton submit;
    private javax.swing.JButton submit1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
