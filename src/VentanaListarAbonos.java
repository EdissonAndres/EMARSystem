import com.sun.awt.AWTUtilities;
import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaListarAbonos extends javax.swing.JFrame {
long ap = 0;
int k=0;
    public VentanaListarAbonos() throws IOException {
        initComponents();  
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        mostrar("");
        
    }
    
    public void mostrar (String j) throws IOException{
        try {
            RandomAccessFile archivo = new RandomAccessFile("Abonos.dbf", "r" );
        archivo.seek(ap);
        String matris [][] = new String [21][3];
        if (j.equals("")){
        for (int i=0; i<21; i++){
            Abonos b = new Abonos();
            if (archivo.getFilePointer() < archivo.length()){
                b.recuperarAbono(archivo);
                matris[i][0] = b.getNumeroVenta();
                matris[i][1] = b.getFecha();
                matris[i][2] = Long.toString(b.getAbono());
            }
            else {
                i=21;
                SiguienteAM.setVisible(false);
            }}}
        else {
        for (int i=0; i<21; i++){
            Abonos b = new Abonos();
            if (archivo.getFilePointer() < archivo.length()){
                b.recuperarAbono(archivo);
                if (b.getNumeroVenta().equals(j)){
                matris[i][0] = b.getNumeroVenta();
                matris[i][1] = b.getFecha();
                matris[i][2] = Long.toString(b.getAbono());
            }
            else
                    i--;
            }
            else {
                i=21;
                SiguienteAM.setVisible(false);
            }}}
            ap = archivo.getFilePointer();
            archivo.close();
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String [] {
                        "Numero Venta", "Fecha", "Abono"
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
        Cat = new javax.swing.JLabel();
        BDTexto = new javax.swing.JTextField();
        BD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        getContentPane().add(InicioAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 100, 40));

        SiguienteAM.setBackground(new java.awt.Color(128, 0, 0));
        SiguienteAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        SiguienteAM.setForeground(new java.awt.Color(255, 255, 255));
        SiguienteAM.setText("Siguiente");
        SiguienteAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteAMActionPerformed(evt);
            }
        });
        getContentPane().add(SiguienteAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, 140, 40));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero Venta", "Fecha", "Abono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1100, 360));

        Titulo.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Listado Completo de los Abonos");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 620, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 490, 20));

        jButton3.setBackground(new java.awt.Color(128, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 50, 50));

        Cat.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Cat.setForeground(new java.awt.Color(255, 255, 255));
        Cat.setText("Búsqueda por deuda:");
        getContentPane().add(Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, -1, 40));

        BDTexto.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        BDTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDTextoActionPerformed(evt);
            }
        });
        getContentPane().add(BDTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 260, 30));

        BD.setBackground(new java.awt.Color(128, 0, 0));
        BD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        BD.setBorderPainted(false);
        BD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDActionPerformed(evt);
            }
        });
        getContentPane().add(BD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 50, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SiguienteAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteAMActionPerformed
            try {
                mostrar(BDTexto.getText());
            } catch (IOException ex) {
                Logger.getLogger(VentanaAgotado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_SiguienteAMActionPerformed

    private void InicioAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioAMActionPerformed
        ap=0;
        SiguienteAM.setVisible(true);
        try {
            mostrar(BDTexto.getText());
    } catch (IOException ex) {
        Logger.getLogger(VentanaAgotado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_InicioAMActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BDTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BDTextoActionPerformed

    private void BDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDActionPerformed
        try {
            ap=0;
            mostrar(BDTexto.getText());
        } catch (IOException ex) {
            Logger.getLogger(VentanaDeudores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BD;
    private javax.swing.JTextField BDTexto;
    private javax.swing.JLabel Cat;
    private javax.swing.JButton InicioAM;
    private javax.swing.JButton SiguienteAM;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
