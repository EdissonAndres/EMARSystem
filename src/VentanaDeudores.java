import com.sun.awt.AWTUtilities;
import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaDeudores extends javax.swing.JFrame {
long ap = 0;
    public VentanaDeudores() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        mostrar("1");
        
    }
    
    public void mostrar (String rango) throws IOException{
        try {
            if (rango.equals(""))
                rango="1";
            RandomAccessFile archivo = new RandomAccessFile("Clientes.dbf", "r" );
        archivo.seek(ap);
        String matris [][] = new String [23][4];
        for (int i=0; i<23; i++){
            Cliente b = new Cliente();
            if (archivo.getFilePointer() < archivo.length()){
                b.recuperarCliente(archivo);
            String s = Long.toString(b.getDeuda());
            if (b.getDeuda()>= Long.parseLong(rango)){
                matris[i][0] = b.getIdentificacion();
                matris[i][1] = b.getNombre();
                matris[i][2] = b.getTelefono();
                matris[i][3] = s;}
            else 
                i--;
            }
            else {
                i=23;
                SiguienteAM.setVisible(false);
            }}
            ap = archivo.getFilePointer();
            archivo.close();
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String [] {
                        "Cedula", "Nombre", "Telefono", "Deuda"
                    }
            ));
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(VentanaAgotado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SiguienteAM = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Cat = new javax.swing.JLabel();
        BDTexto = new javax.swing.JTextField();
        BD = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inicio.setBackground(new java.awt.Color(128, 0, 0));
        Inicio.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setText("Inicio");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        getContentPane().add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, -1, 40));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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
                "Cedula", "Nombre", "Telefono", "Deuda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
        }
        jTable1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1100, 380));

        SiguienteAM.setBackground(new java.awt.Color(128, 0, 0));
        SiguienteAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        SiguienteAM.setForeground(new java.awt.Color(255, 255, 255));
        SiguienteAM.setText("Siguiente");
        SiguienteAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteAMActionPerformed(evt);
            }
        });
        getContentPane().add(SiguienteAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 530, -1, 40));

        Titulo.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Listado Completo de los Deudores");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 620, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 520, 20));

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
        BD.setContentAreaFilled(false);
        BD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDActionPerformed(evt);
            }
        });
        getContentPane().add(BD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 50, 30));

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

    private void SiguienteAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteAMActionPerformed
    try {
        mostrar(BDTexto.getText());
    } catch (IOException ex) {
        Logger.getLogger(VentanaAgotado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_SiguienteAMActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        ap=0;
        SiguienteAM.setVisible(true);
    try {
        mostrar(BDTexto.getText());
    } catch (IOException ex) {
        Logger.getLogger(VentanaAgotado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_InicioActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BD;
    private javax.swing.JTextField BDTexto;
    private javax.swing.JLabel Cat;
    private javax.swing.JButton Inicio;
    private javax.swing.JButton SiguienteAM;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
