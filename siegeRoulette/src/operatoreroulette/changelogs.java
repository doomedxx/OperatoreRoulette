/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatoreroulette;

/**
 *
 * @author wesle
 */
public class changelogs extends javax.swing.JDialog {

    /**
     * Creates new form changelogs
     */
    public changelogs(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        list = new operatorList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bebas Neue Regular", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Version 0.5");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 89, 25);

        jLabel2.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("- Added \"Unique Operator Mode\". Prevents you from getting the same operator twice");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 80, 520, 19);

        jLabel3.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("- Voice Lines from operators when roll is complete");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 190, 302, 19);

        jLabel4.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("- started using r6: siege sound effects for the app");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 210, 298, 19);

        jLabel5.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("- Added recruits (Requested by a friend)");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 230, 234, 19);

        jLabel6.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("- Added options menu!");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 250, 127, 19);

        jLabel7.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("- After two rolls, a dialog pops up explaining that sound can be disabled");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 270, 430, 19);

        jLabel8.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("- Made a reddit post! Hello /r/Rainbow6!");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 290, 237, 19);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Bebas Neue Regular", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Okay!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 450, 143, 41);

        jLabel9.setFont(new java.awt.Font("Bebas Neue Regular", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Version 0.3");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 330, 89, 25);

        jLabel10.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("- started using operator emblems rather than names");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 420, 320, 19);

        jLabel11.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("- dice will slow down before it reaches the end for extra tension!!");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 360, 394, 19);

        jLabel12.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("- Added selectable wallpapers");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 400, 181, 19);

        jLabel13.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("- Added a changelog button");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(50, 380, 163, 19);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/R6-operators-fuze_229117.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(400, 380, 200, 130);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 130, 540, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 320, 540, 10);

        jLabel15.setFont(new java.awt.Font("Bebas Neue Regular", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Version 0.4");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 140, 90, 25);

        jLabel16.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("- Added Challenges");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(50, 170, 112, 19);

        jLabel17.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("- Added ''Disable Recruit'' button [Suggested by chankamaster]");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(50, 40, 450, 19);

        jLabel18.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("- Added \"Instant Roll Mode\" button [Suggested by chankamaster]");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(50, 60, 430, 19);

        jLabel19.setFont(new java.awt.Font("Bebas Neue Regular", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("- Code optimization. It's a mess.");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(50, 100, 430, 19);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        ui.playSoundEffect(list.buttonClick);
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
            java.util.logging.Logger.getLogger(changelogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changelogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changelogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changelogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                changelogs dialog = new changelogs(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    private UI ui;
    private operatorList list;
}
