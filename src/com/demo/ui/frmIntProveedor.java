/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ui;

/**
 *
 * @author Jona
 */
public class frmIntProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmIntProveedor
     */
    public frmIntProveedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistroProveedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombreProv = new javax.swing.JTextField();
        txt_apellidoProv = new javax.swing.JTextField();
        txt_empresaProv = new javax.swing.JTextField();
        txt_rucProv = new javax.swing.JTextField();
        txt_telefonoProv = new javax.swing.JTextField();
        txt_celularProv = new javax.swing.JTextField();
        txt_direccionProv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_correoProv = new javax.swing.JTextField();
        btn_nuevoProv = new javax.swing.JButton();
        btn_guardarProv = new javax.swing.JButton();
        btn_actualizarProv = new javax.swing.JButton();
        panelConsultaProv = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_busquedaProv = new javax.swing.JTextField();
        btn_buscEliminarProv = new javax.swing.JButton();
        btn_buscarProv = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegistroProveedor.setBackground(new java.awt.Color(255, 204, 102));
        panelRegistroProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE PROVEEDOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        panelRegistroProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Nombres:");
        panelRegistroProveedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Apellidos:");
        panelRegistroProveedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Empresa");
        panelRegistroProveedor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Ruc:");
        panelRegistroProveedor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Telefono:");
        panelRegistroProveedor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Celular:");
        panelRegistroProveedor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txt_nombreProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreProvActionPerformed(evt);
            }
        });
        panelRegistroProveedor.add(txt_nombreProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 230, -1));
        panelRegistroProveedor.add(txt_apellidoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 230, -1));
        panelRegistroProveedor.add(txt_empresaProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 230, -1));
        panelRegistroProveedor.add(txt_rucProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 230, -1));
        panelRegistroProveedor.add(txt_telefonoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 230, -1));
        panelRegistroProveedor.add(txt_celularProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 230, -1));
        panelRegistroProveedor.add(txt_direccionProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 230, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Direccion:");
        panelRegistroProveedor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Correo:");
        panelRegistroProveedor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        panelRegistroProveedor.add(txt_correoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 230, -1));

        btn_nuevoProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btnnuevo.png"))); // NOI18N
        btn_nuevoProv.setText("Nuevo");
        panelRegistroProveedor.add(btn_nuevoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        btn_guardarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btnguardar.png"))); // NOI18N
        btn_guardarProv.setText("Guardar");
        btn_guardarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarProvActionPerformed(evt);
            }
        });
        panelRegistroProveedor.add(btn_guardarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        btn_actualizarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btneditar.png"))); // NOI18N
        btn_actualizarProv.setText("Actualizar");
        panelRegistroProveedor.add(btn_actualizarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        getContentPane().add(panelRegistroProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 340));

        panelConsultaProv.setBackground(new java.awt.Color(255, 204, 102));
        panelConsultaProv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTA DE PROVEEDOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        panelConsultaProv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Busqueda:");
        panelConsultaProv.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txt_busquedaProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busquedaProvActionPerformed(evt);
            }
        });
        panelConsultaProv.add(txt_busquedaProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, 20));

        btn_buscEliminarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btneliminar.png"))); // NOI18N
        btn_buscEliminarProv.setText("Eliminar");
        btn_buscEliminarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscEliminarProvActionPerformed(evt);
            }
        });
        panelConsultaProv.add(btn_buscEliminarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        btn_buscarProv.setText("Busqueda");
        btn_buscarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarProvActionPerformed(evt);
            }
        });
        panelConsultaProv.add(btn_buscarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        getContentPane().add(panelConsultaProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 480, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreProvActionPerformed

    private void btn_buscEliminarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscEliminarProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscEliminarProvActionPerformed

    private void btn_guardarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarProvActionPerformed

    private void txt_busquedaProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busquedaProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busquedaProvActionPerformed

    private void btn_buscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarProvActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarProv;
    private javax.swing.JButton btn_buscEliminarProv;
    private javax.swing.JButton btn_buscarProv;
    private javax.swing.JButton btn_guardarProv;
    private javax.swing.JButton btn_nuevoProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelConsultaProv;
    private javax.swing.JPanel panelRegistroProveedor;
    private javax.swing.JTextField txt_apellidoProv;
    private javax.swing.JTextField txt_busquedaProv;
    private javax.swing.JTextField txt_celularProv;
    private javax.swing.JTextField txt_correoProv;
    private javax.swing.JTextField txt_direccionProv;
    private javax.swing.JTextField txt_empresaProv;
    private javax.swing.JTextField txt_nombreProv;
    private javax.swing.JTextField txt_rucProv;
    private javax.swing.JTextField txt_telefonoProv;
    // End of variables declaration//GEN-END:variables
}
