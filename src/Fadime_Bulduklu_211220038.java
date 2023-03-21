
import javax.swing.DefaultListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Fadime
 */
public class Fadime_Bulduklu_211220038 extends javax.swing.JFrame {

    /**
     * Creates new form Fadime_Bulduklu_211220038
     */
    public Fadime_Bulduklu_211220038() {
        initComponents();
        fb38_myModel =new DefaultListModel();
        fb38_jList1.setModel(fb38_myModel);
    }

    DefaultListModel fb38_myModel;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fb38_buttonGroup1 = new javax.swing.ButtonGroup();
        fb38_jLabel1 = new javax.swing.JLabel();
        fb38_jComboBox1 = new javax.swing.JComboBox<>();
        fb38_jTextField1 = new javax.swing.JTextField();
        fb38_jButton1 = new javax.swing.JButton();
        fb38_jLabel2 = new javax.swing.JLabel();
        fb38_jLabel3 = new javax.swing.JLabel();
        fb38_jLabel4 = new javax.swing.JLabel();
        fb38_jCheckBox1 = new javax.swing.JCheckBox();
        fb38_jCheckBox2 = new javax.swing.JCheckBox();
        fb38_jCheckBox3 = new javax.swing.JCheckBox();
        fb38_jCheckBox4 = new javax.swing.JCheckBox();
        fb38_jRadioButton1 = new javax.swing.JRadioButton();
        fb38_jRadioButton2 = new javax.swing.JRadioButton();
        fb38_jRadioButton3 = new javax.swing.JRadioButton();
        fb38_jButton2 = new javax.swing.JButton();
        fb38_jButton3 = new javax.swing.JButton();
        fb38_jButton4 = new javax.swing.JButton();
        fb38_jScrollPane2 = new javax.swing.JScrollPane();
        fb38_jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fb38_jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fb38_jLabel1.setText("kategori");

        fb38_jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daire", "Müstakil Ev", "Villa", "Çiftlik Evi", "Yalı", "Yazlık", "Prefabrik Ev", "Kooperatif " }));

        fb38_jButton1.setText("kategori ekle");
        fb38_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb38_jButton1ActionPerformed(evt);
            }
        });

        fb38_jLabel2.setText("konutlar");

        fb38_jLabel3.setText("konut tipi");

        fb38_jLabel4.setText("kimden");

        fb38_jCheckBox1.setText("satılık");

        fb38_jCheckBox2.setText("kiralık");
        fb38_jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb38_jCheckBox2ActionPerformed(evt);
            }
        });

        fb38_jCheckBox3.setText("günlük kiralık");
        fb38_jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb38_jCheckBox3ActionPerformed(evt);
            }
        });

        fb38_jCheckBox4.setText("devren satılık");

        fb38_buttonGroup1.add(fb38_jRadioButton1);
        fb38_jRadioButton1.setText("sahibinden");

        fb38_buttonGroup1.add(fb38_jRadioButton2);
        fb38_jRadioButton2.setText("emlak ofisinden");

        fb38_buttonGroup1.add(fb38_jRadioButton3);
        fb38_jRadioButton3.setText("inşaat firmasından");

        fb38_jButton2.setText("konut ekle");
        fb38_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb38_jButton2ActionPerformed(evt);
            }
        });

        fb38_jButton3.setText("konut kaldır");
        fb38_jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb38_jButton3ActionPerformed(evt);
            }
        });

        fb38_jButton4.setText("konutları sıfırla");

        fb38_jScrollPane2.setViewportView(fb38_jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fb38_jCheckBox1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fb38_jCheckBox2)
                                    .addComponent(fb38_jCheckBox3)
                                    .addComponent(fb38_jCheckBox4)
                                    .addComponent(fb38_jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fb38_jButton3)
                                .addGap(54, 54, 54))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fb38_jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fb38_jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fb38_jRadioButton1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(fb38_jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(fb38_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(fb38_jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(fb38_jButton1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(fb38_jRadioButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(fb38_jRadioButton3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(fb38_jButton4)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fb38_jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fb38_jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fb38_jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fb38_jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fb38_jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fb38_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fb38_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fb38_jButton1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(fb38_jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fb38_jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fb38_jCheckBox1)
                            .addComponent(fb38_jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fb38_jCheckBox2)
                            .addComponent(fb38_jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fb38_jCheckBox3)
                            .addComponent(fb38_jRadioButton3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fb38_jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fb38_jButton2)
                    .addComponent(fb38_jButton3)
                    .addComponent(fb38_jButton4))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fb38_jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb38_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb38_jCheckBox2ActionPerformed

    private void fb38_jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb38_jButton3ActionPerformed

        fb38_myModel.removeElementAt(fb38_jList1.getSelectedIndex());
    }//GEN-LAST:event_fb38_jButton3ActionPerformed

    private void fb38_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb38_jButton1ActionPerformed
        fb38_jComboBox1.addItem(fb38_jTextField1.getText());
    }//GEN-LAST:event_fb38_jButton1ActionPerformed

    private void fb38_jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb38_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb38_jCheckBox3ActionPerformed

    private void fb38_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb38_jButton2ActionPerformed
        String fb38_konutTipi="";
        String fb38_kimden="";
        
        if(fb38_jCheckBox1.isSelected()){
            fb38_konutTipi="satılık";
        }
        if(fb38_jCheckBox2.isSelected()){
            fb38_konutTipi= fb38_konutTipi +" " +"kiralık";
        }
        if(fb38_jCheckBox3.isSelected()){
            fb38_konutTipi=fb38_konutTipi +" " +"günlük kiralık";
        }
        if(fb38_jCheckBox4.isSelected()){
            fb38_konutTipi=fb38_konutTipi +" " +"devren satılık";
        }
        
        if(fb38_jRadioButton1.isSelected()){
            fb38_kimden="(sahibinden)";
        }
        
        if(fb38_jRadioButton2.isSelected()){
            fb38_kimden="(emlak ofisinden)";
        }
        
        if(fb38_jRadioButton3.isSelected()){
            fb38_kimden="(inşaat firmasından)";
        }
        
        Object fb38_kategori= fb38_jComboBox1.getSelectedItem();
        
        String sonuc;
        sonuc= fb38_kategori +" , " + fb38_konutTipi +" , " + fb38_kimden;
        fb38_myModel.addElement(sonuc);
    }//GEN-LAST:event_fb38_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Fadime_Bulduklu_211220038.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fadime_Bulduklu_211220038.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fadime_Bulduklu_211220038.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fadime_Bulduklu_211220038.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fadime_Bulduklu_211220038().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup fb38_buttonGroup1;
    private javax.swing.JButton fb38_jButton1;
    private javax.swing.JButton fb38_jButton2;
    private javax.swing.JButton fb38_jButton3;
    private javax.swing.JButton fb38_jButton4;
    private javax.swing.JCheckBox fb38_jCheckBox1;
    private javax.swing.JCheckBox fb38_jCheckBox2;
    private javax.swing.JCheckBox fb38_jCheckBox3;
    private javax.swing.JCheckBox fb38_jCheckBox4;
    private javax.swing.JComboBox<String> fb38_jComboBox1;
    private javax.swing.JLabel fb38_jLabel1;
    private javax.swing.JLabel fb38_jLabel2;
    private javax.swing.JLabel fb38_jLabel3;
    private javax.swing.JLabel fb38_jLabel4;
    private javax.swing.JList<String> fb38_jList1;
    private javax.swing.JRadioButton fb38_jRadioButton1;
    private javax.swing.JRadioButton fb38_jRadioButton2;
    private javax.swing.JRadioButton fb38_jRadioButton3;
    private javax.swing.JScrollPane fb38_jScrollPane2;
    private javax.swing.JTextField fb38_jTextField1;
    // End of variables declaration//GEN-END:variables
}
