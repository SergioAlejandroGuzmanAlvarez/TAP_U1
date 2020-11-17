
import java.applet.AudioClip;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Calculadora extends javax.swing.JPanel {
    AudioClip sound;
    /**
     * Creates new form NewJPanel
     */
    public Calculadora() {
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

        pnlFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtValorU = new javax.swing.JTextField();
        txtValorD = new javax.swing.JTextField();
        btnRestar = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();

        pnlFondo.setBackground(new java.awt.Color(51, 51, 51));
        pnlFondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Valor 1");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Valor 2");

        txtValorU.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        txtValorD.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        btnRestar.setBackground(new java.awt.Color(204, 255, 204));
        btnRestar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnSumar.setBackground(new java.awt.Color(102, 102, 255));
        btnSumar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnMulti.setBackground(new java.awt.Color(0, 255, 255));
        btnMulti.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMulti.setText("X");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(255, 255, 204));
        btnDividir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        lblValor.setForeground(new java.awt.Color(255, 255, 255));
        lblValor.setText("jLabel3");

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtValorU, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(104, 104, 104)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(btnMulti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDividir))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(btnSumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(btnRestar)))
                .addGap(46, 46, 46))
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(lblValor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRestar)
                            .addComponent(btnSumar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValorU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMulti))
                    .addComponent(btnDividir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblValor)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
       sound = java.applet.Applet.newAudioClip(getClass().getResource("/click.WAV"));
       sound.play();
       if(txtValorU.getText().equals("")&& txtValorD.getText().equals("")) {showMessageDialog(null,"Ingresa valores"); txtValorU.requestFocus();}
       else{
           int v1,v2;
           v1=Integer.parseInt(txtValorU.getText());
           v2=Integer.parseInt(txtValorD.getText());
           lblValor.setText("El valor es: "+(v1+v2)+"");
           txtValorU.setText("");
           txtValorD.setText("");
           txtValorU.requestFocus();
       }
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/click.WAV"));
        sound.play();
        if(txtValorU.getText().equals("")&& txtValorD.getText().equals("")) {showMessageDialog(null,"Ingresa valores"); txtValorU.requestFocus();}
       else{
           int v1,v2;
           v1=Integer.parseInt(txtValorU.getText());
           v2=Integer.parseInt(txtValorD.getText());
           lblValor.setText("El valor es: "+(v1-v2)+"");
           txtValorU.setText("");
           txtValorD.setText("");
           txtValorU.requestFocus();
       }
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/click.WAV"));
        sound.play();
        if(txtValorU.getText().equals("")&& txtValorD.getText().equals("")) {showMessageDialog(null,"Ingresa valores"); txtValorU.requestFocus();}
        else{
           int v1,v2;
           v1=Integer.parseInt(txtValorU.getText());
           v2=Integer.parseInt(txtValorD.getText());
           lblValor.setText("El valor es: "+(v1*v2)+"");
           txtValorU.setText("");
           txtValorD.setText("");
           txtValorU.requestFocus();
       }
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/click.WAV"));
        sound.play();
        if(txtValorU.getText().equals("")&& txtValorD.getText().equals("")) {showMessageDialog(null,"Ingresa valores"); txtValorU.requestFocus();}
        else{
           int v1,v2;
           v1=Integer.parseInt(txtValorU.getText());
           v2=Integer.parseInt(txtValorD.getText());
           lblValor.setText("El valor es: "+(v1/v2)+"");
           txtValorU.setText("");
           txtValorD.setText("");
           txtValorU.requestFocus();
       }
    }//GEN-LAST:event_btnDividirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextField txtValorD;
    private javax.swing.JTextField txtValorU;
    // End of variables declaration//GEN-END:variables
}