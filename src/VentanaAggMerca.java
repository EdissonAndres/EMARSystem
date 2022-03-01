import com.sun.awt.AWTUtilities;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaAggMerca extends javax.swing.JFrame {

    public VentanaAggMerca() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            AWTUtilities.setWindowOpaque(this, false);
            combo();
        } catch (IOException ex) {
            Logger.getLogger(VentanaAggMerca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void combo() throws IOException
    {
        ManejoCombo x = new ManejoCombo();
        for (int i=0 ;i<=x.numeroCategoria();i++)
        {
            combo.addItem(x.consultarCategoria(i)); 
        }
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MarcaTextoAM = new javax.swing.JTextField();
        NombreTextoAM = new javax.swing.JTextField();
        CodigoTextoAM = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        PrecioTextoAM = new javax.swing.JTextField();
        CantidadTextoAM = new javax.swing.JTextField();
        IngresarAM = new javax.swing.JButton();
        NombreAM = new javax.swing.JLabel();
        CodigoAM = new javax.swing.JLabel();
        MarcaAM = new javax.swing.JLabel();
        PrecioAM = new javax.swing.JLabel();
        CantidadAM = new javax.swing.JLabel();
        CategoriaAM = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MarcaTextoAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        MarcaTextoAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaTextoAMActionPerformed(evt);
            }
        });
        getContentPane().add(MarcaTextoAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 360, 30));

        NombreTextoAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        NombreTextoAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextoAMActionPerformed(evt);
            }
        });
        getContentPane().add(NombreTextoAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 360, 30));

        CodigoTextoAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        CodigoTextoAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoTextoAMActionPerformed(evt);
            }
        });
        getContentPane().add(CodigoTextoAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 360, 30));

        combo.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 360, 30));

        PrecioTextoAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        PrecioTextoAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioTextoAMActionPerformed(evt);
            }
        });
        getContentPane().add(PrecioTextoAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 360, 30));

        CantidadTextoAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        getContentPane().add(CantidadTextoAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 360, 30));

        IngresarAM.setBackground(new java.awt.Color(128, 0, 0));
        IngresarAM.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        IngresarAM.setForeground(new java.awt.Color(255, 255, 255));
        IngresarAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar1.png"))); // NOI18N
        IngresarAM.setText(" Guardar");
        IngresarAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarAMActionPerformed(evt);
            }
        });
        getContentPane().add(IngresarAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 210, 50));

        NombreAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        NombreAM.setForeground(new java.awt.Color(255, 255, 255));
        NombreAM.setText("Nombre:");
        getContentPane().add(NombreAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        CodigoAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CodigoAM.setForeground(new java.awt.Color(255, 255, 255));
        CodigoAM.setText("Codigo:");
        getContentPane().add(CodigoAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        MarcaAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        MarcaAM.setForeground(new java.awt.Color(255, 255, 255));
        MarcaAM.setText("Marca:");
        getContentPane().add(MarcaAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        PrecioAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        PrecioAM.setForeground(new java.awt.Color(255, 255, 255));
        PrecioAM.setText("Precio:");
        getContentPane().add(PrecioAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 80, -1));

        CantidadAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CantidadAM.setForeground(new java.awt.Color(255, 255, 255));
        CantidadAM.setText("Cantidad:");
        getContentPane().add(CantidadAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        CategoriaAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CategoriaAM.setForeground(new java.awt.Color(255, 255, 255));
        CategoriaAM.setText("Categoria:");
        getContentPane().add(CategoriaAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 360, 20));

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

    private void NombreTextoAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextoAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextoAMActionPerformed

    private void CodigoTextoAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoTextoAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoTextoAMActionPerformed

    private void PrecioTextoAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioTextoAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioTextoAMActionPerformed

    private void IngresarAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarAMActionPerformed
        String d, m, c, cat, cant, vu;
        ManejoProducto Mer = new ManejoProducto();
        d=NombreTextoAM.getText();
        m=MarcaTextoAM.getText();
        c=CodigoTextoAM.getText();
        vu=PrecioTextoAM.getText();
        cant=CantidadTextoAM.getText();
        cat=combo.getSelectedItem().toString();
        try {
            if ((Mer.consultarProducto(c) == null) && (Mer.consultarProductoAgg(d,m) == null)){
                Mer.adicionarProducto(c, d, m, cat, cant, vu);
                JOptionPane.showMessageDialog(null, "CREADO EXITOSAMENTE");
                Mer.listarMerca();
            }
            else
                JOptionPane.showMessageDialog(null, "ESTE PRODUCTO YA EXISTE");
        NombreTextoAM.setText(null);
        MarcaTextoAM.setText(null);
        CodigoTextoAM.setText(null);
        PrecioTextoAM.setText(null);
        CantidadTextoAM.setText(null);
        } catch (IOException ex) {
            Logger.getLogger(VentanaAggMerca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IngresarAMActionPerformed

    private void MarcaTextoAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaTextoAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaTextoAMActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        
    }//GEN-LAST:event_comboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CantidadAM;
    private javax.swing.JTextField CantidadTextoAM;
    private javax.swing.JLabel CategoriaAM;
    private javax.swing.JLabel CodigoAM;
    private javax.swing.JTextField CodigoTextoAM;
    private javax.swing.JButton IngresarAM;
    private javax.swing.JLabel MarcaAM;
    private javax.swing.JTextField MarcaTextoAM;
    private javax.swing.JLabel NombreAM;
    private javax.swing.JTextField NombreTextoAM;
    private javax.swing.JLabel PrecioAM;
    private javax.swing.JTextField PrecioTextoAM;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
