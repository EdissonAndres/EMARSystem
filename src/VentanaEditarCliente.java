
import com.sun.awt.AWTUtilities;
import java.awt.Component;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaEditarCliente extends javax.swing.JFrame {

    Cliente x = new Cliente();
    public VentanaEditarCliente(Cliente m) {
        initComponents();
        x = m;
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        CodigoTexto.setText(x.getIdentificacion());
        NombreTexto.setText(x.getNombre());
        String d = Long.toString(x.getDeuda());
        TelefonoTexto.setText(x.getTelefono());
        Direccion1.setText(x.getDireccion());
        DeudaEC1.setText(d);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Direccion = new javax.swing.JLabel();
        DeudaEC1 = new javax.swing.JTextField();
        Direccion1 = new javax.swing.JTextField();
        TelefonoTexto = new javax.swing.JTextField();
        CodigoTexto = new javax.swing.JTextField();
        NombreTexto = new javax.swing.JTextField();
        NombreEC = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        TelefonoEC = new javax.swing.JLabel();
        CodigoEC = new javax.swing.JLabel();
        DeudaEC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Direccion.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Direccion.setForeground(new java.awt.Color(255, 255, 255));
        Direccion.setText("Direccion:");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        DeudaEC1.setEditable(false);
        DeudaEC1.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        getContentPane().add(DeudaEC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 400, 30));

        Direccion1.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        getContentPane().add(Direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 400, 30));

        TelefonoTexto.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        getContentPane().add(TelefonoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 400, 30));

        CodigoTexto.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        getContentPane().add(CodigoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 400, 30));

        NombreTexto.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        getContentPane().add(NombreTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 400, 30));

        NombreEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        NombreEC.setForeground(new java.awt.Color(255, 255, 255));
        NombreEC.setText("Nombre:");
        getContentPane().add(NombreEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        Guardar.setBackground(new java.awt.Color(128, 0, 0));
        Guardar.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar1.png"))); // NOI18N
        Guardar.setText(" Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 190, 50));

        TelefonoEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        TelefonoEC.setForeground(new java.awt.Color(255, 255, 255));
        TelefonoEC.setText("Telefono:");
        getContentPane().add(TelefonoEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        CodigoEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CodigoEC.setForeground(new java.awt.Color(255, 255, 255));
        CodigoEC.setText("CC/NIT:");
        getContentPane().add(CodigoEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        DeudaEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        DeudaEC.setForeground(new java.awt.Color(255, 255, 255));
        DeudaEC.setText("Deuda: ");
        getContentPane().add(DeudaEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 330, 20));

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

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        try {
            String n = NombreTexto.getText();
            String c = CodigoTexto.getText();
            String t = TelefonoTexto.getText();
            String d = Direccion1.getText();
            ManejoCliente b = new ManejoCliente();
            if ((b.consultarCliente(c) == null) || (x.getIdentificacion().equals(c))){
                b.modificarDeuda(x.getIdentificacion(), "-1"); 
                b.adicionarCliente(c, n, d, t, Long.toString(x.getDeuda()));
                b.listarCliente();
                dispose();
                JOptionPane.showMessageDialog(null, "EDITADO EXITOSAMENTE");
            }
            else
                JOptionPane.showMessageDialog(null, "ESTE CLIENTE YA EXITE");         
        } catch (IOException ex) {
            Logger.getLogger(VentanaEditarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodigoEC;
    private javax.swing.JTextField CodigoTexto;
    private javax.swing.JLabel DeudaEC;
    private javax.swing.JTextField DeudaEC1;
    private javax.swing.JLabel Direccion;
    private javax.swing.JTextField Direccion1;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel NombreEC;
    private javax.swing.JTextField NombreTexto;
    private javax.swing.JLabel TelefonoEC;
    private javax.swing.JTextField TelefonoTexto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
