
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Pablo Guevara
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        btnsuma = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btnmult = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btnporce = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbls = new javax.swing.JLabel();
        lblp = new javax.swing.JLabel();
        lbln = new javax.swing.JLabel();
        lbli = new javax.swing.JLabel();
        lbld = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnsuma.setText("Suma");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });

        btnresta.setText("Resta");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });

        btnmult.setText("Multiplicacion");
        btnmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultActionPerformed(evt);
            }
        });

        btndiv.setText("Division");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        btnporce.setText("Porcentaje");
        btnporce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnporceActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lbls.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbld.setText("Datos del Resultado :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbld)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnresta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btndiv))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnsuma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmult))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(lbls)
                                .addGap(18, 18, 18)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpiar)
                                    .addComponent(btnporce)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lbli)
                                .addGap(60, 60, 60)
                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbln, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addComponent(lblp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbls)
                        .addComponent(lbli)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsuma)
                    .addComponent(btnmult)
                    .addComponent(btnporce))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnresta)
                    .addComponent(btndiv)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(lbld)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lblp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbln, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txt1.setText("");
        txt2.setText("");
        lblp.setText("");
        lbls.setText("");
        lbl1.setText("");
        lbln.setText("");
        lbli.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed

        int num1,num2,resultado;
        num1= Integer.parseInt(txt1.getText());
        num2= Integer.parseInt(txt2.getText());
        lbls.setText("+");
        resultado = num1+num2;
        lbl1.setText(Integer.toString(resultado));
        lbli.setText("=");
        
        if(resultado%2==0){
            lbl1.setForeground(Color.blue);
            lblp.setForeground(Color.blue);
            lblp.setText("Es par");
        }else{
            lbl1.setForeground(Color.red);
            lblp.setForeground(Color.red);
            lblp.setText("Es impar");
        }
        
        if(resultado==0){
            lbln.setForeground(Color.green);
            lbln.setText("Numero Neutro");
            }else{
            if(resultado>0){
            lbln.setForeground(Color.blue);
            lbln.setText("Numero Positivo");
            }else{  
            lbln.setForeground(Color.red);
            lbln.setText("Numero Negativo");
            }
        }
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
      
        
        int num1,num2,resultado;
           num1= Integer.parseInt(txt1.getText());
           num2= Integer.parseInt(txt2.getText());
           lbls.setText("-");
           resultado = num1-num2;
           lbl1.setText(Integer.toString(resultado));
           lbli.setText("=");
           
           if(resultado%2==0){
            lbl1.setForeground(Color.blue);
            lblp.setForeground(Color.blue);
            lblp.setText("Es par");
        }else{
            lbl1.setForeground(Color.red);
            lblp.setForeground(Color.red);
            lblp.setText("Es impar");
        }
           
               if(resultado==0){
            lbln.setForeground(Color.green);
            lbln.setText("Numero Neutro");
            }else{
            if(resultado>0){
            lbln.setForeground(Color.blue);
            lbln.setText("Numero Positivo");
            }else{  
            lbln.setForeground(Color.red);
            lbln.setText("Numero Negativo");
            }
        }
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultActionPerformed

           int num1,num2,resultado;
           num1= Integer.parseInt(txt1.getText());
           num2= Integer.parseInt(txt2.getText());
           lbls.setText("*");
           resultado = num1*num2;
           lbl1.setText(Integer.toString(resultado));
           lbli.setText("=");
           
           if(resultado%2==0){
            lbl1.setForeground(Color.blue);
            lblp.setForeground(Color.blue);
            lblp.setText("Es par");
        }else{
            lbl1.setForeground(Color.red);
            lblp.setForeground(Color.red);
            lblp.setText("Es impar");
        }
           
               if(resultado==0){
            lbln.setForeground(Color.green);
            lbln.setText("Numero Neutro");
            }else{
            if(resultado>0){
            lbln.setForeground(Color.blue);
            lbln.setText("Numero Positivo");
            }else{  
            lbln.setForeground(Color.red);
            lbln.setText("Numero Negativo");
            }
        }
        
    }//GEN-LAST:event_btnmultActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed

         double num1,num2,resultado;
                 
           num1= Double.parseDouble(txt1.getText());
           num2= Double.parseDouble(txt2.getText());
           lbls.setText("/");
         resultado = num1/num2;
        lbl1.setText(Double.toString(resultado));
        lbli.setText("=");
        
        if(resultado%2==0){
            lbl1.setForeground(Color.blue);
            lblp.setForeground(Color.blue);
            lblp.setText("Es par");
        }else{
            lbl1.setForeground(Color.red);
            lblp.setForeground(Color.red);
            lblp.setText("Es impar");
        }
        
            if(resultado==0){
            lbln.setForeground(Color.green);
            lbln.setText("Numero Neutro");
            }else{
            if(resultado>0){
            lbln.setForeground(Color.blue);
            lbln.setText("Numero Positivo");
            }else{  
            lbln.setForeground(Color.red);
            lbln.setText("Numero Negativo");
            }
        }
        
    }//GEN-LAST:event_btndivActionPerformed

    private void btnporceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnporceActionPerformed

double num1,num2,resultado;
                 
           num1= Double.parseDouble(txt1.getText());
           num2= Double.parseDouble(txt2.getText());
           lbls.setText("%");
         resultado = (num2*num1)/100;
        lbl1.setText(Double.toString(resultado));
        lbli.setText("=");
        
        if(resultado%2==0){
            lbl1.setForeground(Color.blue);
            lblp.setForeground(Color.blue);
            lblp.setText("Es par");
        }else{
            lbl1.setForeground(Color.red);
            lblp.setForeground(Color.red);
            lblp.setText("Es impar");
        }
    }//GEN-LAST:event_btnporceActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btnmult;
    private javax.swing.JButton btnporce;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbld;
    private javax.swing.JLabel lbli;
    private javax.swing.JLabel lbln;
    private javax.swing.JLabel lblp;
    private javax.swing.JLabel lbls;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
