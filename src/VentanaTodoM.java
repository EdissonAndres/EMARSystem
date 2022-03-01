import com.sun.awt.AWTUtilities;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VentanaTodoM extends javax.swing.JFrame {
long ap = 0;
int k=0;
int sig=0;
String buscar;
    public VentanaTodoM() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        mostrar();
        combo.addItem("Todos"); 
        combo();
    }
    
    public void combo() throws IOException
    {
        ManejoCombo x = new ManejoCombo();
        for (int i=0 ;i<=x.numeroCategoria();i++)
        {
            combo.addItem(x.consultarCategoria(i)); 
        }
    }
    
    public void mostrar () throws IOException{
        try {
            RandomAccessFile archivo = new RandomAccessFile("Productos.dbf", "r" );
            sig=0;
        archivo.seek(ap);
        String matris [][] = new String [23][6];
        for (int i=0; i<23; i++){
            Producto b = new Producto();
            if (archivo.getFilePointer() < archivo.length()){
                b.recuperarProducto(archivo);
                if (b.getCantidad()!=-1){
                    String z = Long.toString(b.getCantidad());
                    String s = Long.toString(b.getValorUnitario());
                    matris[i][0] = b.getDescripcion();
                    matris[i][1] = b.getMarca();
                    matris[i][2] = b.getCodProducto();
                    matris[i][3] = s;
                    matris[i][4] = z;
                    matris[i][5] = b.getCategoria();}
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
                        "Nombre", "Marca", "Codgio", "Precio", "Cantidad", "Categoria"
                    }
            ));
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(VentanaTodoM.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        Cat = new javax.swing.JLabel();
        Inicio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SiguienteAM = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Listado Completo de la Mercancia");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 620, 50));

        combo.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 200, 30));

        Cat.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        Cat.setForeground(new java.awt.Color(255, 255, 255));
        Cat.setText("Búsqueda por categoria:");
        getContentPane().add(Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, 40));

        Inicio.setBackground(new java.awt.Color(128, 0, 0));
        Inicio.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setText("Inicio");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        getContentPane().add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 530, 100, 40));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Marca", "Codigo", "Precio", "Cantidad", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }
        jTable1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 1100, 380));

        SiguienteAM.setBackground(new java.awt.Color(128, 0, 0));
        SiguienteAM.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        SiguienteAM.setForeground(new java.awt.Color(255, 255, 255));
        SiguienteAM.setText("Siguiente");
        SiguienteAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteAMActionPerformed(evt);
            }
        });
        getContentPane().add(SiguienteAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 530, 140, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 530, 20));

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
        if (sig==0)
            mostrar();
        else 
            mostrar1(buscar);
    } catch (IOException ex) {
        Logger.getLogger(VentanaAgotado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_SiguienteAMActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        ap=0;
        SiguienteAM.setVisible(true);
    try {
        if (sig==0)
            mostrar();
        else 
            mostrar1(buscar);
    } catch (IOException ex) {
        Logger.getLogger(VentanaAgotado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_InicioActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
    try {
        buscar = combo.getSelectedItem().toString();
        ap=0;
        SiguienteAM.setVisible(true);
        if (buscar.equals("Todos"))
            mostrar();
        else
        mostrar1(buscar);
    } catch (IOException ex) {
        Logger.getLogger(VentanaTodoM.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_comboActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void mostrar1 (String buscar) throws IOException{
        try {
            RandomAccessFile archivo = new RandomAccessFile("Productos.dbf", "r" );
            sig =1;
        archivo.seek(ap);
        String matris [][] = new String [23][6];
        for (int i=0; i<23; i++){
            Producto b = new Producto();
            if (archivo.getFilePointer() < archivo.length()){
                b.recuperarProducto(archivo);
                if ((b.getCantidad()!=-1) && (b.getCategoria().equalsIgnoreCase(buscar))){
                    String z = Long.toString(b.getCantidad());
                    String s = Long.toString(b.getValorUnitario());
                    matris[i][0] = b.getDescripcion();
                    matris[i][1] = b.getMarca();
                    matris[i][2] = b.getCodProducto();
                    matris[i][3] = s;
                    matris[i][4] = z;
                    matris[i][5] = b.getCategoria();}
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
                        "Nombre", "Marca", "Codgio", "Precio", "Cantidad", "Categoria"
                    }
            ));
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(VentanaAgotado.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cat;
    private javax.swing.JButton Inicio;
    private javax.swing.JButton SiguienteAM;
    private javax.swing.JLabel Titulo;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
