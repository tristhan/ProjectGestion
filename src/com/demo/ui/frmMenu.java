/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ui;

import java.util.Locale;

/**
 *
 * @author Jona
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents();
        setTitle("Sistema de Inventario y Gestión - Center Techno - ");
        setSize(1050, 550);
        setLocationRelativeTo(null);
        // agregro el desktop al formulario padre
        escritorio.setSize(1050, 550);
        setContentPane(escritorio);
        escritorio.setLayout(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuRrhh = new javax.swing.JMenu();
        itemEmpleado = new javax.swing.JMenuItem();
        menuFactura = new javax.swing.JMenu();
        itemFacturar = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenu();
        menuConsulta = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setBackground(new java.awt.Color(102, 102, 255));
        escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 260));

        menuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/home.png"))); // NOI18N
        menuHome.setText("SIFI");
        menuHome.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jMenuBar1.add(menuHome);

        menuRrhh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/user.png"))); // NOI18N
        menuRrhh.setText("R.R.H.H");
        menuRrhh.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N

        itemEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/cargose.png"))); // NOI18N
        itemEmpleado.setText("Empleado");
        itemEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEmpleadoActionPerformed(evt);
            }
        });
        menuRrhh.add(itemEmpleado);

        jMenuBar1.add(menuRrhh);

        menuFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/Form.png"))); // NOI18N
        menuFactura.setText("Factura");
        menuFactura.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N

        itemFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/factura.png"))); // NOI18N
        itemFacturar.setText("Facturar");
        menuFactura.add(itemFacturar);

        jMenuBar1.add(menuFactura);

        menuConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/configuracion.png"))); // NOI18N
        menuConfiguracion.setText("Configuración");
        menuConfiguracion.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jMenuBar1.add(menuConfiguracion);

        menuConsulta.setText("Consulta");
        menuConsulta.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jMenuBar1.add(menuConsulta);

        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/menusalir.png"))); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
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
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemEmpleado;
    private javax.swing.JMenuItem itemFacturar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuFactura;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuRrhh;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
