import com.sun.awt.AWTUtilities;
import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaListarDeudas extends javax.swing.JFrame {
long ap = 0;
int k=0;
    public VentanaListarDeudas() throws IOException {
        initComponents();  
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        mostrar();
        
    }
    
    public void mostrar () throws IOException{
        try {
            RandomAccessFile archivo = new RandomAccessFile("Venta.dbf", "r" );
        archivo.seek(ap);
        String matris [][] = new String [21][6];
        for (int i=0; i<21; i++){
            Venta b = new Venta();
            if (archivo.getFilePointer() < archivo.length()){
                b.recuperarVenta(archivo);
            if (b.getDeuda()>0){
                String n = Long.toString(b.getNumeroVenta());
                String z = Long.toString(b.getValorCompra());
                String s = Long.toString(b.getDeuda());
                matris[i][0] = n;
                matris[i][1] = b.getCodigoCliente();
                matris[i][2] = b.getNombreCliente();
                matris[i][3] = z;
                matris[i][4] = s;
                matris[i][5] = b.getFecha();}
            else 
                i--;
            }
            else {
                i=21;
                SiguienteAM.setVisible(false);
            }}
            ap = archivo.getFilePointer();
            archivo.close();
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String [] {
                        "Numero Venta", "Codigo Deudor", "Nombre Deudor", "Valor Inicial", "Deuda Actual", "Fecha"
                    }
            ));
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(VentanaAgotado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InicioAM = new javax.swing.JButton();
        SiguienteAM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InicioAM.setBackground(new java.awt.Color(128, 0, 0));
        InicioAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        InicioAM.setForeground(new java.awt.Color(255, 255, 255));
        InicioAM.setText("Inicio");
        InicioAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioAMActionPerformed(evt);
            }
        });
        getContentPane().add(InicioAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, -1, 40));

        SiguienteAM.setBackground(new java.awt.Color(128, 0, 0));
        SiguienteAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        SiguienteAM.setForeground(new java.awt.Color(255, 255, 255));
        SiguienteAM.setText("Siguiente");
        SiguienteAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteAMActionPerformed(evt);
            }
        });
        getContentPane().add(SiguienteAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 530, 140, 40));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero Venta", "Codigo Deudor", "Nombre Deudor", "Valor Inicial", "Deuda Actual", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false
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
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1100, 360));

        Titulo.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Listado Completo de las Deudas");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 500, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 490, 20));

        jButton3.setBackground(new java.awt.Color(128, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 50, 50));

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InicioAM;
    private javax.swing.JButton SiguienteAM;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
