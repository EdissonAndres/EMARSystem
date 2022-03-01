import com.sun.awt.AWTUtilities;
import java.io.FileNotFoundException;

public class VentanaMostrarCliente extends javax.swing.JFrame {

    Cliente m;
    public VentanaMostrarCliente(Cliente x) throws FileNotFoundException {
        m=x;
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        CodigoEC1.setText(m.getIdentificacion());
        NombreEC1.setText(m.getNombre());
        String d = Long.toString(m.getDeuda());
        TelefonoEC1.setText(m.getTelefono());
        Direccion1.setText(m.getDireccion());
        DeudaEC1.setText(d); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreEC1 = new javax.swing.JLabel();
        NombreEC = new javax.swing.JLabel();
        Direccion1 = new javax.swing.JLabel();
        TelefonoEC1 = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        TelefonoEC = new javax.swing.JLabel();
        CodigoEC1 = new javax.swing.JLabel();
        CodigoEC = new javax.swing.JLabel();
        DeudaEC = new javax.swing.JLabel();
        DeudaEC1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreEC1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        NombreEC1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NombreEC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 800, 30));

        NombreEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        NombreEC.setForeground(new java.awt.Color(255, 255, 255));
        NombreEC.setText("Nombre:");
        getContentPane().add(NombreEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        Direccion1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Direccion1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 800, 30));

        TelefonoEC1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        TelefonoEC1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TelefonoEC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 800, 30));

        Direccion.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Direccion.setForeground(new java.awt.Color(255, 255, 255));
        Direccion.setText("Dirrecion: ");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        TelefonoEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        TelefonoEC.setForeground(new java.awt.Color(255, 255, 255));
        TelefonoEC.setText("Telefono:");
        getContentPane().add(TelefonoEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        CodigoEC1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CodigoEC1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CodigoEC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 800, 30));

        CodigoEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CodigoEC.setForeground(new java.awt.Color(255, 255, 255));
        CodigoEC.setText("CC/NIT:");
        getContentPane().add(CodigoEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        DeudaEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        DeudaEC.setForeground(new java.awt.Color(255, 255, 255));
        DeudaEC.setText("Deuda: ");
        getContentPane().add(DeudaEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        DeudaEC1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        DeudaEC1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DeudaEC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 800, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 80, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 110, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 100, 30));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 90, 30));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 90, 20));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, -1));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 330, 20));

        jButton3.setBackground(new java.awt.Color(128, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 50, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodigoEC;
    private javax.swing.JLabel CodigoEC1;
    private javax.swing.JLabel DeudaEC;
    private javax.swing.JLabel DeudaEC1;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Direccion1;
    private javax.swing.JLabel NombreEC;
    private javax.swing.JLabel NombreEC1;
    private javax.swing.JLabel TelefonoEC;
    private javax.swing.JLabel TelefonoEC1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
