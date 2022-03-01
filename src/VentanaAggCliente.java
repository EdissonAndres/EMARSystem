import com.sun.awt.AWTUtilities;
import java.awt.Component;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaAggCliente extends javax.swing.JFrame {

    public VentanaAggCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DireccionTextoAC = new javax.swing.JTextField();
        CedulaTextoAC = new javax.swing.JTextField();
        NombreTextoAC = new javax.swing.JTextField();
        TelefonoTextoAC = new javax.swing.JTextField();
        IngresarAC = new javax.swing.JButton();
        CodigoEC = new javax.swing.JLabel();
        NombreEC = new javax.swing.JLabel();
        TelefonoEC = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DireccionTextoAC.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        DireccionTextoAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionTextoACActionPerformed(evt);
            }
        });
        getContentPane().add(DireccionTextoAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 350, 30));

        CedulaTextoAC.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        CedulaTextoAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaTextoACActionPerformed(evt);
            }
        });
        getContentPane().add(CedulaTextoAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 350, 30));

        NombreTextoAC.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        NombreTextoAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextoACActionPerformed(evt);
            }
        });
        getContentPane().add(NombreTextoAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 350, 30));

        TelefonoTextoAC.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        TelefonoTextoAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoTextoACActionPerformed(evt);
            }
        });
        getContentPane().add(TelefonoTextoAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 350, 30));

        IngresarAC.setBackground(new java.awt.Color(128, 0, 0));
        IngresarAC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        IngresarAC.setForeground(new java.awt.Color(255, 255, 255));
        IngresarAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar1.png"))); // NOI18N
        IngresarAC.setText(" Guardar");
        IngresarAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarACActionPerformed(evt);
            }
        });
        getContentPane().add(IngresarAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 190, 50));

        CodigoEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CodigoEC.setForeground(new java.awt.Color(255, 255, 255));
        CodigoEC.setText("CC/NIT:");
        getContentPane().add(CodigoEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        NombreEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        NombreEC.setForeground(new java.awt.Color(255, 255, 255));
        NombreEC.setText("Nombre:");
        getContentPane().add(NombreEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        TelefonoEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        TelefonoEC.setForeground(new java.awt.Color(255, 255, 255));
        TelefonoEC.setText("Telefono:");
        getContentPane().add(TelefonoEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        Direccion.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Direccion.setForeground(new java.awt.Color(255, 255, 255));
        Direccion.setText("Direccion:");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 320, 20));

        jButton2.setBackground(new java.awt.Color(128, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 50, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CedulaTextoACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaTextoACActionPerformed
        
    }//GEN-LAST:event_CedulaTextoACActionPerformed

    private void NombreTextoACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextoACActionPerformed
        
    }//GEN-LAST:event_NombreTextoACActionPerformed

    private void IngresarACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarACActionPerformed
        String c, n, t, d;
        ManejoCliente z = new ManejoCliente();
        c=CedulaTextoAC.getText();
        n=NombreTextoAC.getText();
        t=TelefonoTextoAC.getText();
        d=DireccionTextoAC.getText();
        try {
            if (z.consultarCliente(c) == null){
                z.adicionarCliente(c, n, d, t,"0");
                z.listarCliente();
            }
            else 
                JOptionPane.showMessageDialog(rootPane, "ESTE CLIENTE YA EXISTE");
        CedulaTextoAC.setText(null);
        NombreTextoAC.setText(null);
        TelefonoTextoAC.setText(null);
        DireccionTextoAC.setText(null);
        } catch (IOException ex) {
            Logger.getLogger(VentanaAggCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IngresarACActionPerformed

    private void TelefonoTextoACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoTextoACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoTextoACActionPerformed

    private void DireccionTextoACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionTextoACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionTextoACActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CedulaTextoAC;
    private javax.swing.JLabel CodigoEC;
    private javax.swing.JLabel Direccion;
    private javax.swing.JTextField DireccionTextoAC;
    private javax.swing.JButton IngresarAC;
    private javax.swing.JLabel NombreEC;
    private javax.swing.JTextField NombreTextoAC;
    private javax.swing.JLabel TelefonoEC;
    private javax.swing.JTextField TelefonoTextoAC;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
