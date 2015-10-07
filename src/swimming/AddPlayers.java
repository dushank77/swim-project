/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import java.util.ArrayList;

/**
 *
 * @author Dushan
 */
public class AddPlayers extends javax.swing.JFrame {

    private ArrayList<Person> persons;
    private Judge judge;

    /**
     * Creates new form AddPlayers
     */
    public AddPlayers() {
        initComponents();
    }

    private void createSwimmers() {
        String gender;
        if (p1mRadioButton.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        Swimmer swimmer1 = new Swimmer(player1NameText.getText(), Integer.parseInt(player1AgeText.getText()), gender);
        persons.add(swimmer1);

        if (p2mRadioButton.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        Swimmer swimmer2 = new Swimmer(player2NameText.getText(), Integer.parseInt(player2AgeText.getText()), gender);
        persons.add(swimmer2);
        if (p3mRadioButton.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        Swimmer swimmer3 = new Swimmer(player3NameText.getText(), Integer.parseInt(player3AgeText.getText()), gender);
        persons.add(swimmer3);
        if (p4mRadioButton.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        Swimmer swimmer4 = new Swimmer(player4NameText.getText(), Integer.parseInt(player4AgeText.getText()), gender);
        persons.add(swimmer4);
    }

    private void createJudge() {
        judge = new Judge(judgeNameText.getText());
        persons.add(judge);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        player1NameText = new javax.swing.JTextField();
        player2NameText = new javax.swing.JTextField();
        player3NameText = new javax.swing.JTextField();
        player4NameText = new javax.swing.JTextField();
        player1AgeText = new javax.swing.JTextField();
        player2AgeText = new javax.swing.JTextField();
        player4AgeText = new javax.swing.JTextField();
        player3AgeText = new javax.swing.JTextField();
        p1mRadioButton = new javax.swing.JRadioButton();
        p1fRadioButton = new javax.swing.JRadioButton();
        p2mRadioButton = new javax.swing.JRadioButton();
        p2fRadioButton = new javax.swing.JRadioButton();
        p3fRadioButton = new javax.swing.JRadioButton();
        p3mRadioButton = new javax.swing.JRadioButton();
        p4mRadioButton = new javax.swing.JRadioButton();
        p4fRadioButton = new javax.swing.JRadioButton();
        judgeNameText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player 1");

        jLabel2.setFont(new java.awt.Font("sansserif", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD PLAYERS");

        jLabel3.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Player 2");

        jLabel4.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Player 3");

        jLabel5.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Player 4");

        jLabel6.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Judge");

        jLabel7.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Age");

        jLabel9.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Gender");

        player4AgeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player4AgeTextActionPerformed(evt);
            }
        });

        buttonGroup1.add(p1mRadioButton);
        p1mRadioButton.setText("Male");

        buttonGroup1.add(p1fRadioButton);
        p1fRadioButton.setText("Female");
        p1fRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1fRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(p2mRadioButton);
        p2mRadioButton.setText("Male");

        buttonGroup2.add(p2fRadioButton);
        p2fRadioButton.setText("Female");
        p2fRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2fRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(p3fRadioButton);
        p3fRadioButton.setText("Female");
        p3fRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3fRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(p3mRadioButton);
        p3mRadioButton.setText("Male");

        buttonGroup4.add(p4mRadioButton);
        p4mRadioButton.setText("Male");

        buttonGroup4.add(p4fRadioButton);
        p4fRadioButton.setText("Female");
        p4fRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4fRadioButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jButton1.setText("Next>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(judgeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(player2NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(player3NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(player4NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(player1NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(player2AgeText, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(player3AgeText)
                                    .addComponent(player1AgeText)
                                    .addComponent(player4AgeText))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(p4mRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p4fRadioButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(p3mRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p3fRadioButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(p2mRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p2fRadioButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(p1mRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p1fRadioButton))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(player1NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player1AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1mRadioButton)
                    .addComponent(p1fRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(player2NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2mRadioButton)
                    .addComponent(p2fRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(player3NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player3AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3mRadioButton)
                    .addComponent(p3fRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(player4NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player4AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4mRadioButton)
                    .addComponent(p4fRadioButton))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(judgeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void p1fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1fRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1fRadioButtonActionPerformed

    private void p2fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2fRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2fRadioButtonActionPerformed

    private void p3fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3fRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3fRadioButtonActionPerformed

    private void p4fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4fRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4fRadioButtonActionPerformed

    private void player4AgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player4AgeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player4AgeTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        persons = new ArrayList<>();
        createSwimmers();
        createJudge();
        new SwimGUI(persons).setVisible(true);
        AddPlayers.this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPlayers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField judgeNameText;
    private javax.swing.JRadioButton p1fRadioButton;
    private javax.swing.JRadioButton p1mRadioButton;
    private javax.swing.JRadioButton p2fRadioButton;
    private javax.swing.JRadioButton p2mRadioButton;
    private javax.swing.JRadioButton p3fRadioButton;
    private javax.swing.JRadioButton p3mRadioButton;
    private javax.swing.JRadioButton p4fRadioButton;
    private javax.swing.JRadioButton p4mRadioButton;
    private javax.swing.JTextField player1AgeText;
    private javax.swing.JTextField player1NameText;
    private javax.swing.JTextField player2AgeText;
    private javax.swing.JTextField player2NameText;
    private javax.swing.JTextField player3AgeText;
    private javax.swing.JTextField player3NameText;
    private javax.swing.JTextField player4AgeText;
    private javax.swing.JTextField player4NameText;
    // End of variables declaration//GEN-END:variables
}