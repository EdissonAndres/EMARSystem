
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaPrinci extends javax.swing.JFrame 
{
    int e;
    public VentanaPrinci(int v) 
    {
        e=v;
        initComponents();
        this.setLocationRelativeTo(null);
        User.setVisible(false);
        Usuario.setVisible(false);
        UsuarioText.setVisible(false);
        Contraseña.setVisible(false);
        ContraseñaText.setVisible(false);
        Ingresar.setVisible(false);
        jMenu2.disable();
        jMenu3.disable();
        jMenu4.disable();
        jMenu5.disable();
        jMenu6.disable();
        CerrarSesion.setVisible(false);     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        UsuarioText = new javax.swing.JTextField();
        Usuario = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        ContraseñaText = new javax.swing.JPasswordField();
        Ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        IniciarSesion = new javax.swing.JMenuItem();
        CerrarSesion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        RegProd = new javax.swing.JMenuItem();
        IngProd = new javax.swing.JMenuItem();
        ConProd = new javax.swing.JMenuItem();
        EditProd = new javax.swing.JMenuItem();
        ElimProd = new javax.swing.JMenuItem();
        ListProd = new javax.swing.JMenuItem();
        ListProdAgot = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        RegClie = new javax.swing.JMenuItem();
        ConClie = new javax.swing.JMenuItem();
        ModClie = new javax.swing.JMenuItem();
        ElimClie = new javax.swing.JMenuItem();
        ListClie = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        RegVent = new javax.swing.JMenuItem();
        ConVent = new javax.swing.JMenuItem();
        ListVent = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ConDeudor = new javax.swing.JMenuItem();
        ListDeudores = new javax.swing.JMenuItem();
        RegAbono = new javax.swing.JMenuItem();
        ListAbo = new javax.swing.JMenuItem();
        ConDeu = new javax.swing.JMenuItem();
        ListDeu = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("SERVIELECTRICOS TAMAYO S.A.S");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, 50));

        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/User.png"))); // NOI18N
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        UsuarioText.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        UsuarioText.setToolTipText("");
        UsuarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioTextActionPerformed(evt);
            }
        });
        getContentPane().add(UsuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 250, 30));

        Usuario.setBackground(new java.awt.Color(255, 255, 255));
        Usuario.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Usuario:");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        Contraseña.setBackground(new java.awt.Color(255, 255, 255));
        Contraseña.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setText("Contraseña:");
        getContentPane().add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        ContraseñaText.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        ContraseñaText.setToolTipText("");
        ContraseñaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaTextActionPerformed(evt);
            }
        });
        getContentPane().add(ContraseñaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 250, 30));

        Ingresar.setBackground(new java.awt.Color(128, 0, 0));
        Ingresar.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar.setText("Ingresar");
        Ingresar.setToolTipText("");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 170, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wallpaper.jpg"))); // NOI18N
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(100, 55));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuarios.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(115, 40));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        IniciarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        IniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciarS.png"))); // NOI18N
        IniciarSesion.setText("Iniciar Sesion");
        IniciarSesion.setContentAreaFilled(false);
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(IniciarSesion);

        CerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        CerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarS.png"))); // NOI18N
        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(CerrarSesion);
        jMenu1.add(jSeparator1);

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Salir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mercancia.png"))); // NOI18N
        jMenu2.setText("Mercancia");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        RegProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Adicionar.png"))); // NOI18N
        RegProd.setText("Registrar Producto");
        RegProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegProdActionPerformed(evt);
            }
        });
        jMenu2.add(RegProd);

        IngProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IngProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IngMerca.png"))); // NOI18N
        IngProd.setText("Ingresar Mercancia");
        IngProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngProdActionPerformed(evt);
            }
        });
        jMenu2.add(IngProd);

        ConProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        ConProd.setText("Consultar Producto");
        ConProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConProdActionPerformed(evt);
            }
        });
        jMenu2.add(ConProd);

        EditProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EditProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        EditProd.setText("Editar Producto");
        EditProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProdActionPerformed(evt);
            }
        });
        jMenu2.add(EditProd);

        ElimProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ElimProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        ElimProd.setText("Eliminar Producto");
        ElimProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimProdActionPerformed(evt);
            }
        });
        jMenu2.add(ElimProd);

        ListProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar.png"))); // NOI18N
        ListProd.setText("Listar Productos");
        ListProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListProdActionPerformed(evt);
            }
        });
        jMenu2.add(ListProd);

        ListProdAgot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListProdAgot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agotado.png"))); // NOI18N
        ListProdAgot.setText("Listar Productos Agotados");
        ListProdAgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListProdAgotActionPerformed(evt);
            }
        });
        jMenu2.add(ListProdAgot);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.png"))); // NOI18N
        jMenu4.setText("Clientes");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        RegClie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Adicionar.png"))); // NOI18N
        RegClie.setText("Registrar ");
        RegClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegClieActionPerformed(evt);
            }
        });
        jMenu4.add(RegClie);

        ConClie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        ConClie.setText("Consultar");
        ConClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConClieActionPerformed(evt);
            }
        });
        jMenu4.add(ConClie);

        ModClie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ModClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        ModClie.setText("Modificar ");
        ModClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModClieActionPerformed(evt);
            }
        });
        jMenu4.add(ModClie);

        ElimClie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ElimClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        ElimClie.setText("Eliminar");
        ElimClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimClieActionPerformed(evt);
            }
        });
        jMenu4.add(ElimClie);

        ListClie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar.png"))); // NOI18N
        ListClie.setText("Listar");
        ListClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListClieActionPerformed(evt);
            }
        });
        jMenu4.add(ListClie);

        jMenuBar1.add(jMenu4);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventas.png"))); // NOI18N
        jMenu3.setText("Ventas");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        RegVent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegVent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Venta.png"))); // NOI18N
        RegVent.setText("Realizar");
        RegVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegVentActionPerformed(evt);
            }
        });
        jMenu3.add(RegVent);

        ConVent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConVent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        ConVent.setText("Consultar");
        ConVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConVentActionPerformed(evt);
            }
        });
        jMenu3.add(ConVent);

        ListVent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListVent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar.png"))); // NOI18N
        ListVent.setText("Listar");
        ListVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListVentActionPerformed(evt);
            }
        });
        jMenu3.add(ListVent);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Deudores.png"))); // NOI18N
        jMenu5.setText("Deudas");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ConDeudor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConDeudor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        ConDeudor.setText("Consultar Deudor");
        ConDeudor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConDeudorActionPerformed(evt);
            }
        });
        jMenu5.add(ConDeudor);

        ListDeudores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListDeudores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar.png"))); // NOI18N
        ListDeudores.setText("Listar Deudores");
        ListDeudores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListDeudoresActionPerformed(evt);
            }
        });
        jMenu5.add(ListDeudores);

        RegAbono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegAbono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReaAbono.png"))); // NOI18N
        RegAbono.setText("Realizar Abono");
        RegAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegAbonoActionPerformed(evt);
            }
        });
        jMenu5.add(RegAbono);

        ListAbo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListAbo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar.png"))); // NOI18N
        ListAbo.setText("Listar Abonos");
        ListAbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListAboActionPerformed(evt);
            }
        });
        jMenu5.add(ListAbo);

        ConDeu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConDeu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        ConDeu.setText("Consultar Deuda");
        ConDeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConDeuActionPerformed(evt);
            }
        });
        jMenu5.add(ConDeu);

        ListDeu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListDeu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar.png"))); // NOI18N
        ListDeu.setText("Listar Deudas");
        ListDeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListDeuActionPerformed(evt);
            }
        });
        jMenu5.add(ListDeu);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Herramientas.png"))); // NOI18N
        jMenu6.setText("Herramientas");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Adicionar.png"))); // NOI18N
        jMenuItem1.setText("Añadir Categoria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setText("Registrar Nuevo Usuario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setText("Modificar Usuario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
        User.setVisible(true);
        Usuario.setVisible(true);
        UsuarioText.setVisible(true);
        Contraseña.setVisible(true);
        ContraseñaText.setVisible(true);
        Ingresar.setVisible(true);
    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        dispose();
        new VentanaPrinci(2).setVisible(true);
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void RegProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegProdActionPerformed
        new VentanaAggMerca().setVisible(true);
    }//GEN-LAST:event_RegProdActionPerformed

    private void IngProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngProdActionPerformed
        try {
            String a = JOptionPane.showInputDialog(null, "DIGITE CODIGO DEL CLIENTE:");
            Producto x;
            ManejoProducto b = new ManejoProducto();
            x = b.consultarProducto(a);
            if (x != null){
                String k = JOptionPane.showInputDialog(null, "DEL PRODUCTO " +x.getDescripcion() +" HAY " +x.getCantidad() +" UNIDADES\n\n" +"DIGITE EL NUMERO DE UNIDADES A INGRESAR:");
                Excepciones Exp = new Excepciones();
                boolean h = Exp.numero(k);
                if (h){
                    b.adicionarCantidad(x.getCodProducto(), 1, Long.parseLong(k));
                    JOptionPane.showMessageDialog(null, "¡INGRESADO EXITOSAMENTE!");}
                else
                    JOptionPane.showMessageDialog(null, "¡ERROR!");
            }
            else 
                JOptionPane.showMessageDialog(null, "¡NO ENCONTRADO!");
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IngProdActionPerformed

    private void ConProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConProdActionPerformed
       try {
            String a = JOptionPane.showInputDialog(null, "DIGITE CODIGO DEL CLIENTE:");
            Producto x;
            ManejoProducto b = new ManejoProducto();
            x = b.consultarProducto(a);
            if (x != null)
                new VentanaMostrarProducto(x).setVisible(true);
            else 
                JOptionPane.showMessageDialog(null, "¡NO ENCONTRADO!");
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConProdActionPerformed

    private void RegClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegClieActionPerformed
      new VentanaAggCliente().setVisible(true);
    }//GEN-LAST:event_RegClieActionPerformed

    private void ConClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConClieActionPerformed
       try {
            String a = JOptionPane.showInputDialog(null, "DIGITE CODIGO DEL CLIENTE:");
            Cliente x;
            ManejoCliente b = new ManejoCliente();
            x = b.consultarCliente(a);
            if (x != null)
                new VentanaMostrarCliente(x).setVisible(true);
            else 
                JOptionPane.showMessageDialog(null, "¡NO ENCONTRADO!");
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConClieActionPerformed

    private void ModClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModClieActionPerformed
       try {
            String a = JOptionPane.showInputDialog(null, "DIGITE CODIGO DEL CLIENTE:");
            Cliente x;
            ManejoCliente b = new ManejoCliente();
            x = b.consultarCliente(a);
            if (x != null)
                new VentanaEditarCliente(x).setVisible(true);
            else 
                JOptionPane.showMessageDialog(null, "¡NO ENCONTRADO!");
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModClieActionPerformed

    private void ElimClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimClieActionPerformed
        try {
            String a = JOptionPane.showInputDialog(null, "DIGITE CODIGO DEL CLIENTE:");
            Cliente x;
            ManejoCliente b = new ManejoCliente();
            x = b.consultarCliente(a);
            if (x != null){
                b.eliminarCliente(a, -1);
                JOptionPane.showMessageDialog(null, "¡ELIMINADO EXITOSAMENTE!");
                b.listarCliente();
            }
            else 
                JOptionPane.showMessageDialog(null, "¡NO ENCONTRADO!");
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ElimClieActionPerformed

    private void RegVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegVentActionPerformed
        new VentanaAggVenta().setVisible(true);
    }//GEN-LAST:event_RegVentActionPerformed

    private void UsuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioTextActionPerformed

    }//GEN-LAST:event_UsuarioTextActionPerformed

    private void ContraseñaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaTextActionPerformed

    }//GEN-LAST:event_ContraseñaTextActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        try {
            String usuario, contra;
            usuario=UsuarioText.getText();
            contra=ContraseñaText.getText();
            ManejoUsuario p =new ManejoUsuario();
            Usuario j;
            j = p.consultarUsuario(usuario);
            if (j != null)
            {
                String co = p.desencriptar(j.getContraseña());
                String car = p.desencriptar(j.getCargo());
            if ((co.equals(contra)) && (car.equals("Administrador"))) 
             {
                IniciarSesion.setVisible(false);
                User.setVisible(false);
                Usuario.setVisible(false);
                UsuarioText.setVisible(false);
                Contraseña.setVisible(false);
                ContraseñaText.setVisible(false);
                Ingresar.setVisible(false);
                jMenu2.enable();
                jMenu3.enable();
                jMenu4.enable();
                jMenu5.enable();
                jMenu6.enable();
                CerrarSesion.setVisible(true);
                e=1;
            }
            if ((co.equals(contra) && car.equals("Empleado")))
            {
                IniciarSesion.setVisible(false);
                User.setVisible(false);
                Usuario.setVisible(false);
                UsuarioText.setVisible(false);
                Contraseña.setVisible(false);
                ContraseñaText.setVisible(false);
                Ingresar.setVisible(false);
                jMenu2.enable();
                jMenu3.enable();
                jMenu4.enable();
                jMenu5.enable();
                CerrarSesion.enable();
                RegProd.setVisible(false);
                IngProd.setVisible(false);
                EditProd.setVisible(false);
                ElimProd.setVisible(false);
                ElimClie.setVisible(false);
                CerrarSesion.setVisible(true);
                e=0;
            }
            if (!co.equals(contra))
            {
                JOptionPane.showMessageDialog(null, "¡CONTRASEÑA INVALIDA!");
            }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "¡USUARIO INVALIDO!");
            }
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IngresarActionPerformed

    private void EditProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProdActionPerformed
        try {
            String a = JOptionPane.showInputDialog(null, "DIGITE CODIGO DEL PRODUCTO:");
            Producto x;
            ManejoProducto b = new ManejoProducto();
            x = b.consultarProducto(a);
            if (x != null)
                new VentanaEditarMerca(x).setVisible(true);
            else 
                JOptionPane.showMessageDialog(null, "¡NO ENCONTRADO!");
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditProdActionPerformed

    private void ElimProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimProdActionPerformed
      try {
            String a = JOptionPane.showInputDialog(null, "DIGITE CODIGO DEL PRODUCTO:");
            Producto x;
            ManejoProducto b = new ManejoProducto();
            x = b.consultarProducto(a);
            if (x != null){
                b.adicionarCantidad(a, 1, -(x.getCantidad()+1));
                JOptionPane.showMessageDialog(null, "!PRODUCTO ELIMINADO EXITOSAMENTE!");
            }
            else 
                JOptionPane.showMessageDialog(null, "¡NO ENCONTRADO!");
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ElimProdActionPerformed

    private void ListProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListProdActionPerformed
        try {
            new VentanaTodoM().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListProdActionPerformed

    private void ListClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListClieActionPerformed
        try {
            new VentanaTodoC().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListClieActionPerformed

    private void ListProdAgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListProdAgotActionPerformed
        try {
            new VentanaAgotado().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListProdAgotActionPerformed

    private void ConDeudorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConDeudorActionPerformed
        try {
            String a = JOptionPane.showInputDialog(null, "DIGITE CODIGO DEL CLIENTE:");
            Cliente x;
            ManejoCliente b = new ManejoCliente();
            x = b.consultarCliente(a);
            if ((x != null) && (x.getDeuda()>0))
                new VentanaMostrarCliente(x).setVisible(true);
            if ((x != null) && (x.getDeuda()==0))
                JOptionPane.showMessageDialog(null, "!EL CLIENTE ESTA A PAZ Y SALVO!");
            if (x == null) 
                JOptionPane.showMessageDialog(null, "¡NO ENCONTRADO!");
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConDeudorActionPerformed

    private void ConDeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConDeuActionPerformed
try {
            String a = JOptionPane.showInputDialog(null, "DIGITE CODIGO DEL CLIENTE");
            Venta x = new Venta();
            Excepciones Exp = new Excepciones();
            ManejoVenta b = new ManejoVenta();
            boolean d = Exp.numero(a);
            if (d){
            x = b.consultarVenta(a);
            if ((x != null) && (x.getDeuda()>0))
                new VentanaMostrarDeuda(x).setVisible(true);
            if (x == null) 
                JOptionPane.showMessageDialog(null, "¡VENTA NO ENCONTRADA!");
            if (x.getDeuda()==0)
                JOptionPane.showMessageDialog(null, "¡ESTA DEUDA YA ESTA PAGADA!");
            }
            else 
                JOptionPane.showMessageDialog(null, "¡VENTA NO ENCONTRADA!");
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_ConDeuActionPerformed

    private void ListDeudoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListDeudoresActionPerformed
        try {
            new VentanaDeudores().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListDeudoresActionPerformed

    private void RegAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegAbonoActionPerformed
        try {
            String a = JOptionPane.showInputDialog(null, "DIGITE CODIGO DEL CLIENTE:");
            Cliente x;
            ManejoCliente b = new ManejoCliente();
            x = b.buscarDeudor(a);
            if (x != null){
                new VentanaHacerAbono(x).setVisible(true);
            }
            else 
                JOptionPane.showMessageDialog(null, "¡CLIENTE NO ENCONTRADO!");
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RegAbonoActionPerformed

    private void ConVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConVentActionPerformed
       try {
            String a = JOptionPane.showInputDialog(null, "DIGITE CODIGO DEL CLIENTE:");
            Venta x = new Venta();
            Excepciones Exp = new Excepciones();
            ManejoVenta b = new ManejoVenta();
            boolean d = Exp.numero(a);
            if (d){
            x = b.consultarVenta(a);
            if (x != null)
                new VentanaMostrarVenta(x).setVisible(true);
            else 
                JOptionPane.showMessageDialog(null, "¡VENTA NO ENCONTRADA!");
            }
            else 
                JOptionPane.showMessageDialog(null, "¡VENTA NO ENCONTRADA!");
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConVentActionPerformed

    private void ListVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListVentActionPerformed
        try {
            new VentanaListarVentas().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListVentActionPerformed

    private void ListAboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListAboActionPerformed
        try {
            new VentanaListarAbonos().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListAboActionPerformed

    private void ListDeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListDeuActionPerformed
        try {
            new VentanaListarDeudas().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListDeuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String cat = JOptionPane.showInputDialog(null, "DIGITE NOMBRE DE LA CATEGORIA");
        ManejoCombo x = new ManejoCombo();
        try {
            x.adicionarCategoria(cat);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new RegUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String usu = JOptionPane.showInputDialog("INGRESE SU NOMBRE DE  USUARIO:");
        String con = JOptionPane.showInputDialog("DIGITE SU CONTRASEÑA:");
        try {
            ManejoUsuario p =new ManejoUsuario();
            Usuario j;
            j = p.consultarUsuario(usu);
            if (j != null)
            {
                String co = p.desencriptar(j.getContraseña());
                String car = p.desencriptar(j.getCargo());
            if ((co.equals(con)) || (con.equals("ERAWTFOSRAME"))) 
             {
                new ResetContraseña(usu).setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "¡CONTRASEÑA INVALIDA!");
            }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "¡USUARIO INVALIDO!");
            }
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrinci.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CerrarSesion;
    private javax.swing.JMenuItem ConClie;
    private javax.swing.JMenuItem ConDeu;
    private javax.swing.JMenuItem ConDeudor;
    private javax.swing.JMenuItem ConProd;
    private javax.swing.JMenuItem ConVent;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JPasswordField ContraseñaText;
    private javax.swing.JMenuItem EditProd;
    private javax.swing.JMenuItem ElimClie;
    private javax.swing.JMenuItem ElimProd;
    private javax.swing.JMenuItem IngProd;
    private javax.swing.JButton Ingresar;
    private javax.swing.JMenuItem IniciarSesion;
    private javax.swing.JMenuItem ListAbo;
    private javax.swing.JMenuItem ListClie;
    private javax.swing.JMenuItem ListDeu;
    private javax.swing.JMenuItem ListDeudores;
    private javax.swing.JMenuItem ListProd;
    private javax.swing.JMenuItem ListProdAgot;
    private javax.swing.JMenuItem ListVent;
    private javax.swing.JMenuItem ModClie;
    private javax.swing.JMenuItem RegAbono;
    private javax.swing.JMenuItem RegClie;
    private javax.swing.JMenuItem RegProd;
    private javax.swing.JMenuItem RegVent;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JLabel User;
    private javax.swing.JLabel Usuario;
    private javax.swing.JTextField UsuarioText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
