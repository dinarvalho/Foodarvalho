/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodarvalho;

/**
 *
 * @author João Pedro
 */
public class Tela_Medição extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Medição
     */
    public Tela_Medição() {
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

        jPanel1 = new javax.swing.JPanel();
        RBntMasculino = new javax.swing.JRadioButton();
        RBtnFeminino = new javax.swing.JRadioButton();
        LblSexo = new javax.swing.JLabel();
        LblPeso = new javax.swing.JLabel();
        TxtPeso = new javax.swing.JTextField();
        LblIdade = new javax.swing.JLabel();
        TxtIdade = new javax.swing.JTextField();
        LblAltura = new javax.swing.JLabel();
        TxtAltura = new javax.swing.JTextField();
        BtnContinuar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        RBntMasculino.setBackground(new java.awt.Color(255, 255, 255));
        RBntMasculino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RBntMasculino.setText("Masculino");
        RBntMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBntMasculinoActionPerformed(evt);
            }
        });

        RBtnFeminino.setBackground(new java.awt.Color(255, 255, 255));
        RBtnFeminino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RBtnFeminino.setText("Feminino");

        LblSexo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblSexo.setText("Sexo :");

        LblPeso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblPeso.setText("Peso");

        TxtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LblIdade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblIdade.setText("Idade");

        TxtIdade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LblAltura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblAltura.setText("Altura");

        TxtAltura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnContinuar.setBackground(new java.awt.Color(0, 0, 0));
        BtnContinuar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BtnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        BtnContinuar.setText("Continuar");
        BtnContinuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        BtnVoltar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BtnVoltar.setText("Voltar");
        BtnVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblPeso)
                    .addComponent(LblAltura)
                    .addComponent(LblIdade)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblSexo)
                        .addGap(32, 32, 32)
                        .addComponent(RBntMasculino)
                        .addGap(33, 33, 33)
                        .addComponent(RBtnFeminino))
                    .addComponent(TxtPeso)
                    .addComponent(TxtIdade)
                    .addComponent(TxtAltura))
                .addContainerGap(127, Short.MAX_VALUE))
            .addComponent(BtnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBntMasculino)
                    .addComponent(RBtnFeminino)
                    .addComponent(LblSexo))
                .addGap(45, 45, 45)
                .addComponent(LblPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblAltura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(BtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void RBntMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBntMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBntMasculinoActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        dispose();  
    }//GEN-LAST:event_BtnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Medição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Medição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Medição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Medição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Medição().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContinuar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JLabel LblAltura;
    private javax.swing.JLabel LblIdade;
    private javax.swing.JLabel LblPeso;
    private javax.swing.JLabel LblSexo;
    private javax.swing.JRadioButton RBntMasculino;
    private javax.swing.JRadioButton RBtnFeminino;
    private javax.swing.JTextField TxtAltura;
    private javax.swing.JTextField TxtIdade;
    private javax.swing.JTextField TxtPeso;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
