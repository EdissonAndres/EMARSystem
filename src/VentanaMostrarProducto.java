
import com.sun.awt.AWTUtilities;
import java.io.FileNotFoundException;


public class VentanaMostrarProducto extends javax.swing.JFrame {

    public VentanaMostrarProducto(Producto x) throws FileNotFoundException {
        initComponents();
        Producto m = new Producto();
        m=x;
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        CodigoEC1.setText(m.getCodProducto());
        Marca1.setText(m.getMarca());
        NombreEC1.setText(m.getDescripcion());
        String t = Long.toString(m.getValorUnitario());
        String d = Long.toString(m.getCantidad());
        TelefonoEC1.setText(t);
        DeudaEC1.setText(d);
        Categoria1.setText(m.getCategoria());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreEC1 = new javax.swing.JLabel();
        Marca1 = new javax.swing.JLabel();
        Marca = new javax.swing.JLabel();
        NombreEC = new javax.swing.JLabel();
        TelefonoEC1 = new javax.swing.JLabel();
        Categoria = new javax.swing.JLabel();
        TelefonoEC = new javax.swing.JLabel();
        CodigoEC1 = new javax.swing.JLabel();
        Categoria1 = new javax.swing.JLabel();
        CodigoEC = new javax.swing.JLabel();
        DeudaEC = new javax.swing.JLabel();
        DeudaEC1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreEC1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        NombreEC1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NombreEC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 670, 30));

        Marca1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Marca1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Marca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 680, 30));

        Marca.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Marca.setForeground(new java.awt.Color(255, 255, 255));
        Marca.setText("Marca:");
        getContentPane().add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        NombreEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        NombreEC.setForeground(new java.awt.Color(255, 255, 255));
        NombreEC.setText("Descripcion:");
        getContentPane().add(NombreEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        TelefonoEC1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        TelefonoEC1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TelefonoEC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 680, 30));

        Categoria.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Categoria.setForeground(new java.awt.Color(255, 255, 255));
        Categoria.setText("Categoria:");
        getContentPane().add(Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 130, -1));

        TelefonoEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        TelefonoEC.setForeground(new java.awt.Color(255, 255, 255));
        TelefonoEC.setText("Precio:");
        getContentPane().add(TelefonoEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        CodigoEC1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CodigoEC1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CodigoEC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 680, 30));

        Categoria1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Categoria1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Categoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 670, 30));

        CodigoEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CodigoEC.setForeground(new java.awt.Color(255, 255, 255));
        CodigoEC.setText("Codigo:");
        getContentPane().add(CodigoEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 250, -1, -1));

        DeudaEC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        DeudaEC.setForeground(new java.awt.Color(255, 255, 255));
        DeudaEC.setText("Cantidad:");
        getContentPane().add(DeudaEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 450, -1, -1));

        DeudaEC1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        DeudaEC1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DeudaEC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 670, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 110, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 100, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 70, 30));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 130, 30));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 70, 20));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 70, 10));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 370, 20));

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
    private javax.swing.JLabel Categoria;
    private javax.swing.JLabel Categoria1;
    private javax.swing.JLabel CodigoEC;
    private javax.swing.JLabel CodigoEC1;
    private javax.swing.JLabel DeudaEC;
    private javax.swing.JLabel DeudaEC1;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Marca1;
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
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
