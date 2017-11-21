/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ui;

import com.demo.controller.controllerCliente;
import com.demo.dominio.Cliente;

/**
 *
 * @author Jona
 */
public class frmIntCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmIntCliente
     */
    public frmIntCliente() {
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

        panelRegistroCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_guardarClien = new javax.swing.JButton();
        btn_nuevoclien = new javax.swing.JButton();
        txt_apellidoClien = new javax.swing.JTextField();
        txt_correoClien = new javax.swing.JTextField();
        txt_identificacionClien = new javax.swing.JTextField();
        txt_nombreClien = new javax.swing.JTextField();
        btn_actualizarClien = new javax.swing.JButton();
        btn_eliminarClien = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_busquedaClien = new javax.swing.JTextField();
        btn_busquedaClien = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegistroCliente.setBackground(new java.awt.Color(255, 204, 102));
        panelRegistroCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N
        panelRegistroCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Nombres:");
        panelRegistroCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Apellidos:");
        panelRegistroCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Correo:");
        panelRegistroCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Identificacion:");
        panelRegistroCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        btn_guardarClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btnguardar.png"))); // NOI18N
        btn_guardarClien.setText("Guardar");
        btn_guardarClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarClienActionPerformed(evt);
            }
        });
        panelRegistroCliente.add(btn_guardarClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        btn_nuevoclien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btnnuevo.png"))); // NOI18N
        btn_nuevoclien.setText("Nuevo");
        btn_nuevoclien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoclienActionPerformed(evt);
            }
        });
        panelRegistroCliente.add(btn_nuevoclien, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        txt_apellidoClien.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_apellidoClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoClienActionPerformed(evt);
            }
        });
        panelRegistroCliente.add(txt_apellidoClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 230, -1));

        txt_correoClien.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_correoClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoClienActionPerformed(evt);
            }
        });
        panelRegistroCliente.add(txt_correoClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 230, -1));

        txt_identificacionClien.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_identificacionClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identificacionClienActionPerformed(evt);
            }
        });
        panelRegistroCliente.add(txt_identificacionClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 230, -1));

        txt_nombreClien.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_nombreClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreClienActionPerformed(evt);
            }
        });
        panelRegistroCliente.add(txt_nombreClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 230, -1));

        btn_actualizarClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btneditar.png"))); // NOI18N
        btn_actualizarClien.setText("Actualizar");
        btn_actualizarClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarClienActionPerformed(evt);
            }
        });
        panelRegistroCliente.add(btn_actualizarClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        btn_eliminarClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btneliminar.png"))); // NOI18N
        btn_eliminarClien.setText("Eliminar");
        panelRegistroCliente.add(btn_eliminarClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, -1));

        getContentPane().add(panelRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 150));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Busqueda:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txt_busquedaClien.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_busquedaClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busquedaClienActionPerformed(evt);
            }
        });
        jPanel1.add(txt_busquedaClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 230, -1));

        btn_busquedaClien.setText("Busqueda");
        jPanel1.add(btn_busquedaClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombres", "Apellidos", "Correo", "Identificacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 680, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 730, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarClienActionPerformed
        // TODO add your handling code here:
        controllerCliente clienteCont = new controllerCliente();
        Cliente cliente = new Cliente();
        cliente.setNombre(txt_nombreClien.getText());
        cliente.setApellido(txt_apellidoClien.getText());
        cliente.setCorreo(txt_correoClien.getText());
        cliente.setIdentificacion(txt_identificacionClien.getText());
        clienteCont.registrar(cliente);
    }//GEN-LAST:event_btn_guardarClienActionPerformed

    private void txt_apellidoClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoClienActionPerformed

    private void txt_correoClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoClienActionPerformed

    private void txt_identificacionClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identificacionClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identificacionClienActionPerformed

    private void txt_nombreClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreClienActionPerformed

    private void btn_nuevoclienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoclienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevoclienActionPerformed

    private void btn_actualizarClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarClienActionPerformed

    private void txt_busquedaClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busquedaClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busquedaClienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarClien;
    private javax.swing.JButton btn_busquedaClien;
    private javax.swing.JButton btn_eliminarClien;
    private javax.swing.JButton btn_guardarClien;
    private javax.swing.JButton btn_nuevoclien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelRegistroCliente;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_apellidoClien;
    private javax.swing.JTextField txt_busquedaClien;
    private javax.swing.JTextField txt_correoClien;
    private javax.swing.JTextField txt_identificacionClien;
    private javax.swing.JTextField txt_nombreClien;
    // End of variables declaration//GEN-END:variables
}
