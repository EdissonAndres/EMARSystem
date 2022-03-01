
import com.sun.awt.AWTUtilities;
import java.io.FileNotFoundException;


public class VentanaMostrarVenta extends javax.swing.JFrame {

    Venta m = new Venta();
    public VentanaMostrarVenta(Venta x) throws FileNotFoundException {
        initComponents();
        m=x;
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        NV1.setText(Long.toString(m.getNumeroVenta()));
        CC1.setText(m.getCodigoCliente());
        NC1.setText(m.getNombreCliente());
        Fecha1.setText(m.getFecha());
        CI1.setText(Long.toString(m.getValorCompra()));
        DA1.setText(Long.toString(m.getDeuda()));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NC1 = new javax.swing.JLabel();
        CC1 = new javax.swing.JLabel();
        CC = new javax.swing.JLabel();
        NC = new javax.swing.JLabel();
        Fecha1 = new javax.swing.JLabel();
        DA = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        NV1 = new javax.swing.JLabel();
        DA1 = new javax.swing.JLabel();
        NV = new javax.swing.JLabel();
        CI = new javax.swing.JLabel();
        CI1 = new javax.swing.JLabel();
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
        setPreferredSize(new java.awt.Dimension(1100, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NC1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        NC1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 670, 30));

        CC1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CC1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 750, 30));

        CC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CC.setForeground(new java.awt.Color(255, 255, 255));
        CC.setText("Codigo Comprador:");
        getContentPane().add(CC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        NC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        NC.setForeground(new java.awt.Color(255, 255, 255));
        NC.setText("Nombre del Compradror:");
        getContentPane().add(NC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        Fecha1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Fecha1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 900, 30));

        DA.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        DA.setForeground(new java.awt.Color(255, 255, 255));
        DA.setText("Deuda Actual:");
        getContentPane().add(DA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        Fecha.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Fecha.setForeground(new java.awt.Color(255, 255, 255));
        Fecha.setText("Fecha:");
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        NV1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        NV1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 760, 30));

        DA1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        DA1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 810, 30));

        NV.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        NV.setForeground(new java.awt.Color(255, 255, 255));
        NV.setText("Numero de Venta:");
        getContentPane().add(NV, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        CI.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CI.setForeground(new java.awt.Color(255, 255, 255));
        CI.setText("Compra Inicial:");
        getContentPane().add(CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        CI1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CI1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 810, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 160, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, 20));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 70, 20));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 210, 20));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 280, 30));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 170, 20));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar Venta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 310, 20));

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
    private javax.swing.JLabel CC;
    private javax.swing.JLabel CC1;
    private javax.swing.JLabel CI;
    private javax.swing.JLabel CI1;
    private javax.swing.JLabel DA;
    private javax.swing.JLabel DA1;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Fecha1;
    private javax.swing.JLabel NC;
    private javax.swing.JLabel NC1;
    private javax.swing.JLabel NV;
    private javax.swing.JLabel NV1;
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
