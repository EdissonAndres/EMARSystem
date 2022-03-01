import com.sun.awt.AWTUtilities;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaEditarMerca extends javax.swing.JFrame {
Producto x = new Producto();

    public VentanaEditarMerca(Producto m) {
    try {
        initComponents();
        x=m;
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        NombreTextoAM.setText(x.getDescripcion());
        MarcaTextoAM.setText(x.getMarca());
        CodigoTextoAM.setText(x.getCodProducto());
        PrecioTextoAM.setText(Long.toString(x.getValorUnitario()));
        CantidadTextoAM.setText(Long.toString(x.getCantidad()));
        combo();
        combo.setSelectedItem(x.getCategoria());
    } catch (IOException ex) {
        Logger.getLogger(VentanaEditarMerca.class.getName()).log(Level.SEVERE, null, ex);
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

        MarcaAM = new javax.swing.JLabel();
        NombreAM = new javax.swing.JLabel();
        CategoriaAM = new javax.swing.JLabel();
        CodigoAM = new javax.swing.JLabel();
        PrecioAM = new javax.swing.JLabel();
        CantidadAM = new javax.swing.JLabel();
        MarcaTextoAM = new javax.swing.JTextField();
        NombreTextoAM = new javax.swing.JTextField();
        CodigoTextoAM = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        PrecioTextoAM = new javax.swing.JTextField();
        CantidadTextoAM = new javax.swing.JTextField();
        IngresarAM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MarcaAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        MarcaAM.setForeground(new java.awt.Color(255, 255, 255));
        MarcaAM.setText("Marca:");
        getContentPane().add(MarcaAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        NombreAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        NombreAM.setForeground(new java.awt.Color(255, 255, 255));
        NombreAM.setText("Nombre:");
        getContentPane().add(NombreAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        CategoriaAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CategoriaAM.setForeground(new java.awt.Color(255, 255, 255));
        CategoriaAM.setText("Categoria:");
        getContentPane().add(CategoriaAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        CodigoAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CodigoAM.setForeground(new java.awt.Color(255, 255, 255));
        CodigoAM.setText("Codigo:");
        getContentPane().add(CodigoAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        PrecioAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        PrecioAM.setForeground(new java.awt.Color(255, 255, 255));
        PrecioAM.setText("Precio:");
        getContentPane().add(PrecioAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 80, -1));

        CantidadAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CantidadAM.setForeground(new java.awt.Color(255, 255, 255));
        CantidadAM.setText("Cantidad:");
        getContentPane().add(CantidadAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        MarcaTextoAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        MarcaTextoAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaTextoAMActionPerformed(evt);
            }
        });
        getContentPane().add(MarcaTextoAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 400, 30));

        NombreTextoAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        NombreTextoAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextoAMActionPerformed(evt);
            }
        });
        getContentPane().add(NombreTextoAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 400, 30));

        CodigoTextoAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        CodigoTextoAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoTextoAMActionPerformed(evt);
            }
        });
        getContentPane().add(CodigoTextoAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 400, 30));

        combo.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 400, 30));

        PrecioTextoAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        PrecioTextoAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioTextoAMActionPerformed(evt);
            }
        });
        getContentPane().add(PrecioTextoAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 400, 30));

        CantidadTextoAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        getContentPane().add(CantidadTextoAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 400, 30));

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
        getContentPane().add(IngresarAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 210, 50));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 370, 20));

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
        ManejoProducto b = new ManejoProducto();
        d=NombreTextoAM.getText();
        m=MarcaTextoAM.getText();
        c=CodigoTextoAM.getText();
        vu=PrecioTextoAM.getText();
        cant=CantidadTextoAM.getText();
        cat=combo.getSelectedItem().toString();
        try {
            if ((b.consultarProducto(c) == null) || (x.getCodProducto().equals(c))){
                b.adicionarCantidad(x.getCodProducto(), 1, -x.getCantidad()-1); 
                b.adicionarProducto(c, d, m, cat, cant, vu);
                b.listarMerca();
                dispose();
                JOptionPane.showMessageDialog(null, "EDITADO EXITOSAMENTE");
            }
            else
                JOptionPane.showMessageDialog(null, "ESTE CLIENTE YA EXITE");         
        } catch (IOException ex) {
            Logger.getLogger(VentanaEditarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IngresarAMActionPerformed

    private void MarcaTextoAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaTextoAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaTextoAMActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


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
