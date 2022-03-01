import com.sun.awt.AWTUtilities;
import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaHacerAbono extends javax.swing.JFrame {
long ap = 0;
int k=0;
long numV;
Cliente n;
    public VentanaHacerAbono(Cliente x) throws IOException {
        initComponents();  
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        n=x;
        Venta.setVisible(false);
        VentaTexto.setVisible(false);
        VentaBoton.setVisible(false);
        Abono.setVisible(false);
        AbonoTexto.setVisible(false);
        AbonoBoton.setVisible(false);
        mostrar();
        
    }
    
    public void mostrar () throws IOException{
        try {
            RandomAccessFile archivo = new RandomAccessFile("Venta.dbf", "r" );
        archivo.seek(ap);
        String matris [][] = new String [10][4];
        for (int i=0; i<10; i++){
            Venta b = new Venta();
            if (archivo.getFilePointer() < archivo.length()){
                b.recuperarVenta(archivo);
            if ((n.getIdentificacion().equals(b.getCodigoCliente())) && (b.getDeuda()>0)){
                Comprador.setText("Cliente: " +b.getNombreCliente());
                Comprador.setVisible(true);
                String n = Long.toString(b.getNumeroVenta());
                String z = Long.toString(b.getValorCompra());
                String s = Long.toString(b.getDeuda());
                matris[i][0] = n;
                matris[i][1] = z;
                matris[i][2] = s;
                matris[i][3] = b.getFecha();}
            else 
                i--;
            }
            else {
                i=10;
                SiguienteAM.setVisible(false);
            }}
            ap = archivo.getFilePointer();
            archivo.close();
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String [] {
                        "Numero Venta", "Valor Inicial", "Deuda Actual", "Fecha"
                    }
            ));
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(VentanaAgotado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Abono = new javax.swing.JLabel();
        AbonoTexto = new javax.swing.JTextField();
        HacerAbono = new javax.swing.JButton();
        AbonoBoton = new javax.swing.JButton();
        Venta = new javax.swing.JLabel();
        VentaTexto = new javax.swing.JTextField();
        VentaBoton = new javax.swing.JButton();
        InicioAM = new javax.swing.JButton();
        SiguienteAM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Comprador = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Abono.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Abono.setForeground(new java.awt.Color(255, 255, 255));
        Abono.setText("Ingrese valor:");
        getContentPane().add(Abono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 170, 40));

        AbonoTexto.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        AbonoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbonoTextoActionPerformed(evt);
            }
        });
        AbonoTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AbonoTextoKeyTyped(evt);
            }
        });
        getContentPane().add(AbonoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 240, 30));

        HacerAbono.setBackground(new java.awt.Color(128, 0, 0));
        HacerAbono.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        HacerAbono.setForeground(new java.awt.Color(255, 255, 255));
        HacerAbono.setText("Hacer abono");
        HacerAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HacerAbonoActionPerformed(evt);
            }
        });
        getContentPane().add(HacerAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 180, 40));

        AbonoBoton.setBackground(new java.awt.Color(128, 0, 0));
        AbonoBoton.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        AbonoBoton.setForeground(new java.awt.Color(255, 255, 255));
        AbonoBoton.setText("Abonar");
        AbonoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbonoBotonActionPerformed(evt);
            }
        });
        getContentPane().add(AbonoBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 120, 40));

        Venta.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Venta.setForeground(new java.awt.Color(255, 255, 255));
        Venta.setText("Ingrese numero de venta:");
        getContentPane().add(Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 310, 40));

        VentaTexto.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        VentaTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaTextoActionPerformed(evt);
            }
        });
        VentaTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VentaTextoKeyTyped(evt);
            }
        });
        getContentPane().add(VentaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 200, 30));

        VentaBoton.setBackground(new java.awt.Color(128, 0, 0));
        VentaBoton.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        VentaBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        VentaBoton.setContentAreaFilled(false);
        VentaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaBotonActionPerformed(evt);
            }
        });
        getContentPane().add(VentaBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 30, 30));

        InicioAM.setBackground(new java.awt.Color(128, 0, 0));
        InicioAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        InicioAM.setForeground(new java.awt.Color(255, 255, 255));
        InicioAM.setText("Inicio");
        InicioAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioAMActionPerformed(evt);
            }
        });
        getContentPane().add(InicioAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 100, 40));

        SiguienteAM.setBackground(new java.awt.Color(128, 0, 0));
        SiguienteAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        SiguienteAM.setForeground(new java.awt.Color(255, 255, 255));
        SiguienteAM.setText("Siguiente");
        SiguienteAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteAMActionPerformed(evt);
            }
        });
        getContentPane().add(SiguienteAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 150, 40));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero Venta", "Valor Inicial", "Deuda Actual", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 540, 180));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Realizar Abono");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 300, 20));

        Comprador.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        Comprador.setForeground(new java.awt.Color(255, 255, 255));
        Comprador.setText("Cliente: ");
        getContentPane().add(Comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 820, 40));

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

    private void SiguienteAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteAMActionPerformed
            try {
                mostrar();
            } catch (IOException ex) {
                Logger.getLogger(VentanaAgotado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_SiguienteAMActionPerformed

    private void InicioAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioAMActionPerformed
        ap=0;
        SiguienteAM.setVisible(true);
        try {
            mostrar();
    } catch (IOException ex) {
        Logger.getLogger(VentanaAgotado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_InicioAMActionPerformed

    private void VentaTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentaTextoActionPerformed

    private void VentaTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VentaTextoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_VentaTextoKeyTyped

    private void VentaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaBotonActionPerformed
    try {
        boolean j = false;
        if (VentaTexto.getText().matches("[0-9]*")){
        long o = Long.parseLong(VentaTexto.getText());
        RandomAccessFile archivo = new RandomAccessFile("Venta.dbf", "r" );
        archivo.seek(0);
        String matris [][] = new String [1][6];
        Venta b = new Venta();
        while ((!j) && (archivo.getFilePointer() < archivo.length())){
            b.recuperarVenta(archivo);
            if ((b.getNumeroVenta()==o) && (b.getDeuda()>0) && (n.getIdentificacion().equals(b.getCodigoCliente()))){
                numV = b.getNumeroVenta();
                String m = Long.toString(b.getNumeroVenta());
                String z = Long.toString(b.getValorCompra());
                String s = Long.toString(b.getDeuda());
                matris[0][0] = m;
                matris[0][1] = z;
                matris[0][2] = s;
                matris[0][3] = b.getFecha();
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        matris,
                        new String [] {
                            "Numero Venta", "Valor Inicial", "Deuda Actual", "Fecha"
                    }
            ));
                j=true;
            }
        }
        archivo.close();}
        if (!j){
            numV=0;
            JOptionPane.showMessageDialog(null, "Deuda no encontrada");
        }
            } catch (IOException ex) {
        Logger.getLogger(VentanaHacerAbono.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_VentaBotonActionPerformed

    private void AbonoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbonoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbonoTextoActionPerformed

    private void AbonoTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AbonoTextoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_AbonoTextoKeyTyped

    private void AbonoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbonoBotonActionPerformed
    try {
        String j = AbonoTexto.getText();
        ManejoVenta m = new ManejoVenta();
        if (n.getDeuda()>=Long.parseLong(j)){
            m.editarVenta(Long.toString(numV), j);   
            ManejoCliente g = new ManejoCliente();
            g.modificarDeuda(n.getIdentificacion(), Long.toString(n.getDeuda()-Long.parseLong(j)));
            ManejoAbono d = new ManejoAbono();
            Date a = new Date();
            d.adicionarAbono(Long.toString(numV), a.toString(), Long.parseLong(j));
            JOptionPane.showMessageDialog(null, "ABONO EXITOSO");
            VentaTexto.setText(null);
            AbonoTexto.setText(null);
        }
        else 
            JOptionPane.showMessageDialog(null, "VALOR MUY ALTO");
    } catch (IOException ex) {
        Logger.getLogger(VentanaHacerAbono.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_AbonoBotonActionPerformed

    private void HacerAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HacerAbonoActionPerformed
        Venta.setVisible(true);
        VentaTexto.setVisible(true);
        VentaBoton.setVisible(true);
        Abono.setVisible(true);
        AbonoTexto.setVisible(true);
        AbonoBoton.setVisible(true);
    }//GEN-LAST:event_HacerAbonoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Abono;
    private javax.swing.JButton AbonoBoton;
    private javax.swing.JTextField AbonoTexto;
    private javax.swing.JLabel Comprador;
    private javax.swing.JButton HacerAbono;
    private javax.swing.JButton InicioAM;
    private javax.swing.JButton SiguienteAM;
    private javax.swing.JLabel Venta;
    private javax.swing.JButton VentaBoton;
    private javax.swing.JTextField VentaTexto;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
