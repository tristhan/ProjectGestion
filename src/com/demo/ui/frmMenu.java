/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ui;

import com.sun.awt.AWTUtilities;
import javax.swing.JOptionPane;

/**
 *
 * @author Jona
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    int x, y;

    public frmMenu() {
        initComponents();
        //setTitle("Sistema de Inventario y Gestión - Center Techno - ");
        setSize(1050, 650);
        setLocationRelativeTo(null);

        // agregro el desktop al formulario padre
        escritorio.setSize(1050, 650);
        setContentPane(escritorio);
        escritorio.setLayout(null);

        //imagen
        Imagen_fondo.setBounds(348, 30, 550, 550);
        btnMinimizar.setToolTipText("Minimizar");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        Imagen_fondo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuRrhh = new javax.swing.JMenu();
        itemEmpleado = new javax.swing.JMenuItem();
        itemProveedor = new javax.swing.JMenuItem();
        itemCliente = new javax.swing.JMenuItem();
        itemArticulo = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuFactura = new javax.swing.JMenu();
        itemFacturar = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(1050, 360));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1050, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setBackground(new java.awt.Color(153, 153, 255));
        escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagen_fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/logo_center.png"))); // NOI18N
        Imagen_fondo.setFocusable(false);
        Imagen_fondo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        escritorio.add(Imagen_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 310, 250));

        lblId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblId.setText("id_user");
        escritorio.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblName.setText("Nombre");
        escritorio.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lblRol.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblRol.setText("rol");
        escritorio.add(lblRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/flecha-hacia-abajo.png"))); // NOI18N
        btnMinimizar.setToolTipText("");
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
        });
        escritorio.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 40, 30));

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 380));

        jMenuBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseDragged(evt);
            }
        });
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBar1MousePressed(evt);
            }
        });

        menuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/home.png"))); // NOI18N
        menuHome.setText("CENTER TECNO");
        menuHome.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jMenuBar1.add(menuHome);

        menuRrhh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/user.png"))); // NOI18N
        menuRrhh.setText("REGISTRO");
        menuRrhh.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N

        itemEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/cargose.png"))); // NOI18N
        itemEmpleado.setText("Empleado");
        itemEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEmpleadoActionPerformed(evt);
            }
        });
        menuRrhh.add(itemEmpleado);

        itemProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/proveedor.png"))); // NOI18N
        itemProveedor.setText("Proveedor");
        itemProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProveedorActionPerformed(evt);
            }
        });
        menuRrhh.add(itemProveedor);

        itemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/cliente.png"))); // NOI18N
        itemCliente.setText("Cliente");
        itemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClienteActionPerformed(evt);
            }
        });
        menuRrhh.add(itemCliente);

        itemArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/articulos.png"))); // NOI18N
        itemArticulo.setText("Articulo");
        itemArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemArticuloActionPerformed(evt);
            }
        });
        menuRrhh.add(itemArticulo);

        jMenuBar1.add(menuRrhh);

        menuConsulta.setText("CONSULTA");
        menuConsulta.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jMenuBar1.add(menuConsulta);

        menuFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/Form.png"))); // NOI18N
        menuFactura.setText("Factura");
        menuFactura.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N

        itemFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/factura.png"))); // NOI18N
        itemFacturar.setText("Facturar");
        itemFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFacturarActionPerformed(evt);
            }
        });
        menuFactura.add(itemFacturar);

        jMenuBar1.add(menuFactura);

        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/menusalir.png"))); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEmpleadoActionPerformed
        // TODO add your handling code here:
        frmIntEmpleado intEmpleado = new frmIntEmpleado();
        escritorio.add(intEmpleado);
        intEmpleado.setVisible(true);

    }//GEN-LAST:event_itemEmpleadoActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
    }//GEN-LAST:event_menuSalirActionPerformed

    private void itemProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProveedorActionPerformed
        // TODO add your handling code here:

        frmIntProveedor formularioProveedor = new frmIntProveedor();
        escritorio.add(formularioProveedor);
        formularioProveedor.setVisible(true);

    }//GEN-LAST:event_itemProveedorActionPerformed


    private void itemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClienteActionPerformed
        // TODO add your handling code here:
        frmIntCliente intCliente = new frmIntCliente();
        escritorio.add(intCliente);
        intCliente.setVisible(true);
    }//GEN-LAST:event_itemClienteActionPerformed

    private void itemArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemArticuloActionPerformed
        // TODO add your handling code here:
        frmIntArticulo formulario = new frmIntArticulo();
        escritorio.add(formulario);
        formulario.setVisible(true);


    }//GEN-LAST:event_itemArticuloActionPerformed

    private void itemFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFacturarActionPerformed
        // TODO add your handling code here:
        frmIntFactura formfactura = new frmIntFactura();
        escritorio.add(formfactura);
        formfactura.setVisible(true);

    }//GEN-LAST:event_itemFacturarActionPerformed

    private void jMenuBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jMenuBar1MousePressed

    private void jMenuBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jMenuBar1MouseDragged

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null, "Estás seguro de cerrar sesión", "Confirmación", 2);
        if (respuesta == 0) {
            frmMenu.this.dispose();
            frmLogin login = new frmLogin();
            login.toFront();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
        }
    }//GEN-LAST:event_menuSalirMouseClicked
    
    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizarMouseEntered
    
    /*
    
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmMenu().setVisible(true);
                frmMenu menu = new frmMenu();
                //menu.setExtendedState(MAXIMIZED_BOTH);
                menu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen_fondo;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemArticulo;
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JMenuItem itemEmpleado;
    private javax.swing.JMenuItem itemFacturar;
    private javax.swing.JMenuItem itemProveedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRol;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuFactura;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuRrhh;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
