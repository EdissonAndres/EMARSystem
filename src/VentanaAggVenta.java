import com.sun.awt.AWTUtilities;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.TableColumnModel;


public class VentanaAggVenta extends javax.swing.JFrame {
    Cliente n;
    int i;
    String matris[][]= new String [13][5];
    long TOTAL=0;
    Date d = new Date();
    String s = d.toString();
    String barra = File.separator;
    String ubicacion = System.getProperty("user.dir")+barra+"\\EMAR"+barra;
    File contenedor = new File (ubicacion);
    public VentanaAggVenta() {
        initComponents();
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14));
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        ManoObra.setVisible(false);
        ManoObraTexto.setVisible(false);  
        Valor.setVisible(false);
        ValorText.setVisible(false);
        AggTabla1.setVisible(false);
        jLabelFecha.setText(s);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BuscarP = new javax.swing.JButton();
        PlacaTexto = new javax.swing.JTextField();
        Cant = new javax.swing.JLabel();
        CuotaInicialTexto = new javax.swing.JTextField();
        Placa = new javax.swing.JLabel();
        CuotaI = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        CantTexto = new javax.swing.JTextField();
        ProductoAV = new javax.swing.JLabel();
        Imprimir = new javax.swing.JButton();
        AggTabla = new javax.swing.JButton();
        CodigoAC = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabelcc = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        sub = new javax.swing.JLabel();
        jLabelPlaca = new javax.swing.JLabel();
        Deuda1 = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CedulaTextoAC = new javax.swing.JTextField();
        ProductoTextoAC = new javax.swing.JTextField();
        PrecioTexto = new javax.swing.JTextField();
        IngresarAC = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ManoObra = new javax.swing.JLabel();
        ManoObraTexto = new javax.swing.JTextField();
        Valor = new javax.swing.JLabel();
        ValorText = new javax.swing.JTextField();
        AggTabla1 = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BuscarP.setBackground(new java.awt.Color(128, 0, 0));
        BuscarP.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        BuscarP.setForeground(new java.awt.Color(255, 255, 255));
        BuscarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        BuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, 40, 30));

        PlacaTexto.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        PlacaTexto.setCaretColor(new java.awt.Color(255, 255, 255));
        PlacaTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacaTextoActionPerformed(evt);
            }
        });
        getContentPane().add(PlacaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 280, 30));

        Cant.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Cant.setForeground(new java.awt.Color(255, 255, 255));
        Cant.setText("Cantidad:");
        getContentPane().add(Cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, -1, -1));

        CuotaInicialTexto.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        CuotaInicialTexto.setCaretColor(new java.awt.Color(255, 255, 255));
        CuotaInicialTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuotaInicialTextoActionPerformed(evt);
            }
        });
        getContentPane().add(CuotaInicialTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 280, 30));

        Placa.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Placa.setForeground(new java.awt.Color(255, 255, 255));
        Placa.setText("Placa o Dirección:");
        getContentPane().add(Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        CuotaI.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CuotaI.setForeground(new java.awt.Color(255, 255, 255));
        CuotaI.setText("Ingrese cuota inicial:");
        getContentPane().add(CuotaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, -1, -1));

        Precio.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Precio.setForeground(new java.awt.Color(255, 255, 255));
        Precio.setText("Precio de venta:");
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, -1));

        CantTexto.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        CantTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantTextoActionPerformed(evt);
            }
        });
        getContentPane().add(CantTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 90, 40));

        ProductoAV.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        ProductoAV.setForeground(new java.awt.Color(255, 255, 255));
        ProductoAV.setText("Buscar Producto:");
        getContentPane().add(ProductoAV, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        Imprimir.setBackground(new java.awt.Color(128, 0, 0));
        Imprimir.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Imprimir.setForeground(new java.awt.Color(255, 255, 255));
        Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imprimir1.png"))); // NOI18N
        Imprimir.setText(" Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 650, 200, 50));

        AggTabla.setBackground(new java.awt.Color(128, 0, 0));
        AggTabla.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        AggTabla.setForeground(new java.awt.Color(255, 255, 255));
        AggTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito.png"))); // NOI18N
        AggTabla.setText(" Añadir");
        AggTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AggTablaActionPerformed(evt);
            }
        });
        getContentPane().add(AggTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, 180, 40));

        CodigoAC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        CodigoAC.setForeground(new java.awt.Color(255, 255, 255));
        CodigoAC.setText("Cedula ó NIT:");
        getContentPane().add(CodigoAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 120, 400, -1));

        jLabelTel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jLabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 160, 220, -1));

        jLabelcc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jLabelcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 160, 340, -1));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 140, 350, -1));

        sub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 540, 120, 30));

        jLabelPlaca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jLabelPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 180, 280, 20));

        Deuda1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(Deuda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 625, 170, 30));

        iva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 565, 110, 30));

        Total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 110, 30));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setPreferredSize(new java.awt.Dimension(460, 336));
        jTable1.setRowHeight(26);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 215, 460, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 455, 670));

        CedulaTextoAC.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        CedulaTextoAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaTextoACActionPerformed(evt);
            }
        });
        getContentPane().add(CedulaTextoAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 280, 30));

        ProductoTextoAC.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        ProductoTextoAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoTextoACActionPerformed(evt);
            }
        });
        getContentPane().add(ProductoTextoAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 240, 30));

        PrecioTexto.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        PrecioTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioTextoActionPerformed(evt);
            }
        });
        getContentPane().add(PrecioTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 280, 30));

        IngresarAC.setBackground(new java.awt.Color(128, 0, 0));
        IngresarAC.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        IngresarAC.setForeground(new java.awt.Color(255, 255, 255));
        IngresarAC.setText("Ingresar");
        IngresarAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarACActionPerformed(evt);
            }
        });
        getContentPane().add(IngresarAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, -1, 40));

        jButton2.setBackground(new java.awt.Color(128, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 100, 50, 50));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Mano de Obra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 360, -1, -1));

        ManoObra.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        ManoObra.setForeground(new java.awt.Color(255, 255, 255));
        ManoObra.setText("Mano de Obra:");
        getContentPane().add(ManoObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        ManoObraTexto.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        ManoObraTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManoObraTextoActionPerformed(evt);
            }
        });
        getContentPane().add(ManoObraTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 240, 30));

        Valor.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Valor.setForeground(new java.awt.Color(255, 255, 255));
        Valor.setText("Valor:");
        getContentPane().add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, -1, 70));

        ValorText.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        ValorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorTextActionPerformed(evt);
            }
        });
        getContentPane().add(ValorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 280, 30));

        AggTabla1.setBackground(new java.awt.Color(128, 0, 0));
        AggTabla1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        AggTabla1.setForeground(new java.awt.Color(255, 255, 255));
        AggTabla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito.png"))); // NOI18N
        AggTabla1.setText(" Añadir");
        AggTabla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AggTabla1ActionPerformed(evt);
            }
        });
        getContentPane().add(AggTabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 180, 40));

        check.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("Incluir IVA");
        check.setContentAreaFilled(false);
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 170, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CedulaTextoACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaTextoACActionPerformed
        
    }//GEN-LAST:event_CedulaTextoACActionPerformed

    private void IngresarACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarACActionPerformed
        String c;
        ManejoCliente z = new ManejoCliente();
        c=CedulaTextoAC.getText();
        String j = PlacaTexto.getText();
        try {
            n = z.consultarCliente(c);
            if (n!= null){
                jLabelNombre.setText(n.getNombre());
                jLabelcc.setText(n.getIdentificacion());
                jLabelTel.setText(n.getTelefono());
                jLabelPlaca.setText(j);
                JOptionPane.showMessageDialog(null, "AGREGADO EXITOSAMENTE");
            }
            else 
                JOptionPane.showMessageDialog(null, "CLIENTE NO ENCONTRADO");
            
        } catch (IOException ex) {
            Logger.getLogger(VentanaAggCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IngresarACActionPerformed

    private void ProductoTextoACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoTextoACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoTextoACActionPerformed

    private void AggTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AggTablaActionPerformed
        try {
            Producto x;
            String c = ProductoTextoAC.getText();
            ManejoProducto z = new ManejoProducto();
            x = z.consultarProducto(c);
            if ((x != null)&&(i<12)){
                mostrar(x);
            }
            if (x==null) 
                JOptionPane.showMessageDialog(null, "PRODUCTO NO ENCONTRADO");
            if (i>11)
                JOptionPane.showMessageDialog(null, "FACTURA LLENA"); 
        } catch (IOException ex) {
            Logger.getLogger(VentanaAggCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_AggTablaActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
            ManejoCliente j = new ManejoCliente();
            ManejoProducto z = new ManejoProducto();
            String c = CedulaTextoAC.getText();
            String l = CuotaInicialTexto.getText();
            try{
            for (int p=0; p<12; p++){
                long q = Long.parseLong(matris[p][0]);
                if (!(matris[p][0].equals("0")))
                    z.adicionarCantidad(matris[p][4], 1, -q);
                if (matris[p+1][0] == null)
                        p=12;
            }
            if (l.equals("")){
                l="0";
                CuotaInicialTexto.setText(l);}
            long h = Long.parseLong(l);
            if (TOTAL-h>=0)
            {
                j.modificarDeuda(c, Long.toString(TOTAL-h));
                ManejoVenta k = new ManejoVenta();
                k.adicionarVenta(c, s, n.getNombre(), Long.toString(TOTAL), Long.toString(TOTAL-h));
                Deuda1.setText(" Deuda: "+Long.toString((long) (TOTAL - h)));
                ManejoVenta q = new ManejoVenta();
                q.listarVenta();
                crearImagen (jPanel1);
                try {
                    imprimir();
                }
                catch(IOException ex){
                    Logger.getLogger(VentanaAggCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                j.modificarDeuda(n.getIdentificacion(), Long.toString(n.getDeuda()+TOTAL-h));
                j.listarCliente();  
                
                dispose();
                JOptionPane.showMessageDialog(null, "VENTA EXITOSA");
            }
            else
                JOptionPane.showMessageDialog(null, "CUOTA INICIAL INVALIDA");
            }
                 catch (IOException ex) {
                    Logger.getLogger(VentanaAggVenta.class.getName()).log(Level.SEVERE, null, ex);
                }

        
    }//GEN-LAST:event_ImprimirActionPerformed

    private void CantTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantTextoActionPerformed

    private void BuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPActionPerformed
        String c = ProductoTextoAC.getText();
        ManejoProducto z = new ManejoProducto ();
        Producto x ;
        try {
            x = z.consultarProducto(c);
            if (x != null)
                JOptionPane.showMessageDialog(null, ("El precio sugerido de " +x.getDescripcion()+" es de " +x.getValorUnitario()+" y hay " +x.getCantidad()+" unidades"));
            else 
                JOptionPane.showMessageDialog(null, "NO EXISTE");
            
        } catch (IOException ex) {
            Logger.getLogger(VentanaAggVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuscarPActionPerformed

    private void PrecioTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioTextoActionPerformed

    private void CuotaInicialTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuotaInicialTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuotaInicialTextoActionPerformed

    private void PlacaTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacaTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlacaTextoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AggTabla.setVisible(false);
        Cant.setVisible(false);
        CantTexto.setVisible(false);
        PrecioTexto.setVisible(false);
        Precio.setVisible(false);
        ProductoAV.setVisible(false);
        ProductoTextoAC.setVisible(false);
        BuscarP.setVisible(false);
        ManoObra.setVisible(true);
        ManoObraTexto.setVisible(true);  
        Valor.setVisible(true);
        ValorText.setVisible(true);
        AggTabla1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AggTabla.setVisible(true);
        Cant.setVisible(true);
        CantTexto.setVisible(true);
        PrecioTexto.setVisible(true);
        Precio.setVisible(true);
        ProductoAV.setVisible(true);
        ProductoTextoAC.setVisible(true);
        BuscarP.setVisible(true);
        ManoObra.setVisible(false);
        ManoObraTexto.setVisible(false);  
        Valor.setVisible(false);
        ValorText.setVisible(false);
        AggTabla1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ManoObraTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManoObraTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManoObraTextoActionPerformed

    private void ValorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorTextActionPerformed

    private void AggTabla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AggTabla1ActionPerformed
        if (i<12){
        String mano = ManoObraTexto.getText();
        long precioMano = Long.parseLong(ValorText.getText());
        matris[i][0] = "0";
            matris[i][1] = mano;
            matris[i][2] = "";
            matris[i][3] = ValorText.getText();
            matris[i][4] = " ";
            i++;
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String [] {
                        " ", "    ", "   ", "  "
                    }
            )); 
            TableColumnModel columna = jTable1.getColumnModel();
            columna.getColumn(0).setPreferredWidth(40);
            columna.getColumn(1).setPreferredWidth(208);
            columna.getColumn(2).setPreferredWidth(82);
            columna.getColumn(3).setPreferredWidth(120);
            if (check.isSelected()){
            TOTAL = (long) (TOTAL + precioMano*1.19);
            sub.setText(Long.toString((long) (TOTAL/1.19)));
            iva.setText(Long.toString((long) (TOTAL/1.19*0.19)));
            String b = Long.toString((long) (TOTAL));
            Total.setText(b);
            ProductoTextoAC.setText(null);
            PrecioTexto.setText(null);
            CantTexto.setText(null);
            ManoObraTexto.setText(null);
            ValorText.setText(null);
            JOptionPane.showMessageDialog(null, "AGREGADO EXITOSAMENTE");}
            else{
            TOTAL = (long) (TOTAL + precioMano);
            sub.setText(Long.toString((long) (TOTAL)));
            String b = Long.toString((long) (TOTAL));
            Total.setText(b);
            ProductoTextoAC.setText(null);
            PrecioTexto.setText(null);
            CantTexto.setText(null);
            ManoObraTexto.setText(null);
            ValorText.setText(null);
            
            JOptionPane.showMessageDialog(null, "AGREGADO EXITOSAMENTE");
            }
        }
        if (i>11)
                JOptionPane.showMessageDialog(null, "FACTURA LLENA"); 
    }//GEN-LAST:event_AggTabla1ActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkActionPerformed

    public void mostrar(Producto x) throws IOException{
        long cantidad = Long.parseLong(CantTexto.getText());
        String precio = PrecioTexto.getText();
        long vu = Long.parseLong(precio)*cantidad;
        String vi = Long.toString((long)vu);
        if (cantidad<=x.getCantidad()){
            matris[i][0] = Long.toString(cantidad);
            matris[i][1] = x.getDescripcion();
            matris[i][2] = precio;
            matris[i][3] = vi;
            matris[i][4] = x.getCodProducto();
            i++;
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String [] {
                        " ", "    ", "   ", "  "
                    }
            )); 
            TableColumnModel columna = jTable1.getColumnModel();
            columna.getColumn(0).setPreferredWidth(40);
            columna.getColumn(1).setPreferredWidth(208);
            columna.getColumn(2).setPreferredWidth(83);
            columna.getColumn(3).setPreferredWidth(120);
            if (check.isSelected()){
            TOTAL = (long) (TOTAL + vu*1.19);
            sub.setText(Long.toString((long) (TOTAL/1.19)));
            iva.setText(Long.toString((long) (TOTAL/1.19*0.19)));
            String b = Long.toString((long) (TOTAL));
            Total.setText(b);
            ProductoTextoAC.setText(null);
            PrecioTexto.setText(null);
            CantTexto.setText(null);
            JOptionPane.showMessageDialog(null, "AGREGADO EXITOSAMENTE");}
            else{
            TOTAL = (long) (TOTAL + vu);
            sub.setText(Long.toString((long) (TOTAL)));
            String b = Long.toString((long) (TOTAL));
            Total.setText(b);
            ProductoTextoAC.setText(null);
            PrecioTexto.setText(null);
            CantTexto.setText(null);
            JOptionPane.showMessageDialog(null, "AGREGADO EXITOSAMENTE");
            }
        }
        else {
            ProductoTextoAC.setText(null);
            PrecioTexto.setText(null);
            CantTexto.setText(null);
            JOptionPane.showMessageDialog(null, ("Solo hay " +x.getCantidad()+" unidades disponibles"));}
    }
 private void crearImagen(JPanel p) {
        try {
            int w = p.getWidth(), h = p.getHeight();
            BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics g = image.createGraphics();
            p.setVisible(true);
            p.paint(g);
            ImageIO.write(image, "png", new File("factura.png"));
        } 
        catch (IOException e) {
            System.err.println(e);
        }
    }
 public void imprimir() throws IOException{
   File fileToPrint = new File("C:\\Users\\jhoana\\Desktop\\EMAR\\factura.png");
		Desktop.getDesktop().print(fileToPrint);
	

 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AggTabla;
    private javax.swing.JButton AggTabla1;
    private javax.swing.JButton BuscarP;
    private javax.swing.JLabel Cant;
    private javax.swing.JTextField CantTexto;
    private javax.swing.JTextField CedulaTextoAC;
    private javax.swing.JLabel CodigoAC;
    private javax.swing.JLabel CuotaI;
    private javax.swing.JTextField CuotaInicialTexto;
    private javax.swing.JLabel Deuda1;
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton IngresarAC;
    private javax.swing.JLabel ManoObra;
    private javax.swing.JTextField ManoObraTexto;
    private javax.swing.JLabel Placa;
    private javax.swing.JTextField PlacaTexto;
    private javax.swing.JLabel Precio;
    private javax.swing.JTextField PrecioTexto;
    private javax.swing.JLabel ProductoAV;
    private javax.swing.JTextField ProductoTextoAC;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Valor;
    private javax.swing.JTextField ValorText;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel iva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelcc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel sub;
    // End of variables declaration//GEN-END:variables
}
