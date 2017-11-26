/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ui;

import com.demo.controller.controllerProveedor;
import com.demo.dominio.Proveedor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jona
 */
public class frmIntProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmIntProveedor
     */
    private controllerProveedor ctrlProveedor;
    private Proveedor proveedor;

    public frmIntProveedor() {
        initComponents();

        buscarAll();
        ocultar_columnas();
        desabilitar();

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
        cboEstado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btn_eliminarProv = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        panelConsultaProv = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_busquedaProv = new javax.swing.JTextField();
        btn_buscarProv = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegistroProveedor.setBackground(new java.awt.Color(255, 204, 102));
        panelRegistroProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N
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
        panelRegistroProveedor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Celular:");
        panelRegistroProveedor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        txt_nombreProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_nombreProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreProvActionPerformed(evt);
            }
        });
        panelRegistroProveedor.add(txt_nombreProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 230, -1));

        txt_apellidoProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        panelRegistroProveedor.add(txt_apellidoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 230, -1));

        txt_empresaProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        panelRegistroProveedor.add(txt_empresaProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 230, -1));

        txt_rucProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        panelRegistroProveedor.add(txt_rucProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 230, -1));

        txt_telefonoProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        panelRegistroProveedor.add(txt_telefonoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 230, -1));

        txt_celularProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        panelRegistroProveedor.add(txt_celularProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 230, -1));

        txt_direccionProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        panelRegistroProveedor.add(txt_direccionProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 230, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Direccion:");
        panelRegistroProveedor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Activo");
        panelRegistroProveedor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txt_correoProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        panelRegistroProveedor.add(txt_correoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 230, -1));

        btn_nuevoProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btnnuevo.png"))); // NOI18N
        btn_nuevoProv.setText("Nuevo");
        btn_nuevoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoProvActionPerformed(evt);
            }
        });
        panelRegistroProveedor.add(btn_nuevoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        btn_guardarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btnguardar.png"))); // NOI18N
        btn_guardarProv.setText("Guardar");
        btn_guardarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarProvActionPerformed(evt);
            }
        });
        panelRegistroProveedor.add(btn_guardarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        btn_actualizarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btneditar.png"))); // NOI18N
        btn_actualizarProv.setText("Actualizar");
        btn_actualizarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarProvActionPerformed(evt);
            }
        });
        panelRegistroProveedor.add(btn_actualizarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        cboEstado.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        panelRegistroProveedor.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 230, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Correo:");
        panelRegistroProveedor.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        btn_eliminarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btneliminar.png"))); // NOI18N
        btn_eliminarProv.setText("Eliminar");
        btn_eliminarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarProvActionPerformed(evt);
            }
        });
        panelRegistroProveedor.add(btn_eliminarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));
        panelRegistroProveedor.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 30, -1));

        getContentPane().add(panelRegistroProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 210));

        panelConsultaProv.setBackground(new java.awt.Color(255, 204, 102));
        panelConsultaProv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N
        panelConsultaProv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Búscar:");
        panelConsultaProv.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txt_busquedaProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_busquedaProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busquedaProvActionPerformed(evt);
            }
        });
        panelConsultaProv.add(txt_busquedaProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 35, 190, -1));

        btn_buscarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Search_32px.png"))); // NOI18N
        btn_buscarProv.setBorderPainted(false);
        btn_buscarProv.setContentAreaFilled(false);
        btn_buscarProv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Search_32px_2.png"))); // NOI18N
        btn_buscarProv.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Search_32px_2.png"))); // NOI18N
        btn_buscarProv.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Search_32px_2.png"))); // NOI18N
        btn_buscarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarProvActionPerformed(evt);
            }
        });
        panelConsultaProv.add(btn_buscarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 50, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombres", "Apellidos", "Empresa", "Ruc", "Celular", "Teléfono", "Dirección", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        panelConsultaProv.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 740, 160));

        getContentPane().add(panelConsultaProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 760, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreProvActionPerformed

    private void btn_eliminarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarProvActionPerformed
        proveedor = new Proveedor();
        proveedor.setNombre(txt_nombreProv.getText());
        proveedor.setId_proveedor(Integer.parseInt(txtId.getText()));
        
        if(ctrlProveedor.eliminar(proveedor)){
            JOptionPane.showConfirmDialog(null, "Proveedor grabado con exito ", "Confirmación", 2);
            limpiar();
            desabilitar();
        }
    }//GEN-LAST:event_btn_eliminarProvActionPerformed

    private void btn_guardarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarProvActionPerformed
        proveedor = new Proveedor();
        proveedor.setNombre(txt_nombreProv.getText());
        proveedor.setApellido(txt_apellidoProv.getText());
        proveedor.setEmpresa(txt_empresaProv.getText());
        proveedor.setRuc(txt_rucProv.getText());
        proveedor.setTelefono(txt_telefonoProv.getText());
        proveedor.setCelular((txt_celularProv.getText()));
        proveedor.setDireccion(txt_direccionProv.getText());
        proveedor.setCorreo(txt_correoProv.getText());
        
        if(ctrlProveedor.registrar(proveedor)){
            JOptionPane.showConfirmDialog(null, "Proveedor grabado con exito ", "Confirmación", 2);
            limpiar();
            desabilitar();
            buscarAll();
        }
    }//GEN-LAST:event_btn_guardarProvActionPerformed

    private void txt_busquedaProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busquedaProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busquedaProvActionPerformed

    private void btn_buscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarProvActionPerformed
        buscarAll();
    }//GEN-LAST:event_btn_buscarProvActionPerformed

    private void btn_nuevoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoProvActionPerformed
        habilitar();
        btn_actualizarProv.setEnabled(false);
        btn_eliminarProv.setEnabled(false);
        limpiar();
    }//GEN-LAST:event_btn_nuevoProvActionPerformed

    private void btn_actualizarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarProvActionPerformed
        proveedor = new Proveedor();
        proveedor.setNombre(txt_nombreProv.getText());
        proveedor.setApellido(txt_apellidoProv.getText());
        proveedor.setEmpresa(txt_empresaProv.getText());
        proveedor.setRuc(txt_rucProv.getText());
        proveedor.setTelefono(txt_telefonoProv.getText());
        proveedor.setCelular((txt_celularProv.getText()));
        proveedor.setDireccion(txt_direccionProv.getText());
        proveedor.setCorreo(txt_correoProv.getText());
        proveedor.setId_proveedor(Integer.parseInt(txtId.getText()));
        
        if(ctrlProveedor.actualizar(proveedor)){
            JOptionPane.showConfirmDialog(null, "Proveedor grabado con exito ", "Confirmación", 2);
            limpiar();
            desabilitar();
            buscarAll();
        }
    }//GEN-LAST:event_btn_actualizarProvActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        habilitar();
        btn_guardarProv.setEnabled(false);
        btn_actualizarProv.setEnabled(true);
        btn_eliminarProv.setEnabled(true);

        int fila = tabla.rowAtPoint(evt.getPoint());
        txtId.setText(tabla.getValueAt(fila, 0).toString());
        txt_nombreProv.setText(tabla.getValueAt(fila, 1).toString());
        txt_apellidoProv.setText(tabla.getValueAt(fila, 2).toString());
        txt_empresaProv.setText(tabla.getValueAt(fila, 3).toString());
        txt_rucProv.setText(tabla.getValueAt(fila, 4).toString());
        txt_telefonoProv.setText(tabla.getValueAt(fila, 5).toString());
        txt_celularProv.setText(tabla.getValueAt(fila, 6).toString());
        txt_direccionProv.setText(tabla.getValueAt(fila, 7).toString());
        txt_correoProv.setText(tabla.getValueAt(fila, 8).toString());
    }//GEN-LAST:event_tablaMouseClicked

    void habilitar() {
        btn_actualizarProv.setEnabled(true);
        btn_buscarProv.setEnabled(true);
        btn_eliminarProv.setEnabled(true);
        btn_guardarProv.setEnabled(true);

        txt_apellidoProv.setEnabled(true);
        txt_busquedaProv.setEnabled(true);
        txt_celularProv.setEnabled(true);
        txt_correoProv.setEnabled(true);
        txt_direccionProv.setEnabled(true);
        txt_empresaProv.setEnabled(true);
        txt_nombreProv.setEnabled(true);
        txt_rucProv.setEnabled(true);
        txt_telefonoProv.setEnabled(true);
        cboEstado.setEnabled(true);
    }

    void desabilitar() {
        btn_actualizarProv.setEnabled(false);
        btn_eliminarProv.setEnabled(false);
        btn_guardarProv.setEnabled(false);

        txt_apellidoProv.setEnabled(false);
        txt_busquedaProv.setEnabled(false);
        txt_celularProv.setEnabled(false);
        txt_correoProv.setEnabled(false);
        txt_direccionProv.setEnabled(false);
        txt_empresaProv.setEnabled(false);
        txt_nombreProv.setEnabled(false);
        txt_rucProv.setEnabled(false);
        txt_telefonoProv.setEnabled(false);
        cboEstado.setEnabled(false);
    }

    void limpiar() {
        txt_apellidoProv.setText("");
        txt_busquedaProv.setText("");
        txt_celularProv.setText("");
        txt_correoProv.setText("");
        txt_direccionProv.setText("");
        txt_empresaProv.setText("");
        txt_nombreProv.setText("");
        txt_rucProv.setText("");
        txt_telefonoProv.setText("");
    }

    void limpiarTabla() {
        DefaultTableModel model1 = (DefaultTableModel) tabla.getModel();
        model1.setRowCount(0);
    }

    void buscarAll() {
        limpiarTabla();
        ctrlProveedor = new controllerProveedor();
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        List<Proveedor> lista = ctrlProveedor.verProveedoresAll();

        for (Proveedor proveedor : lista) {
            Object[] row = new Object[9];
            row[0] = proveedor.getId_proveedor();
            row[1] = proveedor.getNombre();
            row[2] = proveedor.getApellido();
            row[3] = proveedor.getEmpresa();
            row[4] = proveedor.getRuc();
            row[5] = proveedor.getTelefono();
            row[6] = proveedor.getCelular();
            row[7] = proveedor.getDireccion();
            row[8] = proveedor.getCorreo();
            modelo.addRow(row);
        }
        tabla.setModel(modelo);
    }

    public void ocultar_columnas() {
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);

        tabla.getColumnModel().getColumn(7).setMaxWidth(0);
        tabla.getColumnModel().getColumn(7).setMinWidth(0);
        tabla.getColumnModel().getColumn(7).setPreferredWidth(0);

        tabla.getColumnModel().getColumn(4).setMaxWidth(0);
        tabla.getColumnModel().getColumn(4).setMinWidth(0);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(0);

        tabla.getColumnModel().getColumn(8).setMaxWidth(0);
        tabla.getColumnModel().getColumn(8).setMinWidth(0);
        tabla.getColumnModel().getColumn(8).setPreferredWidth(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarProv;
    private javax.swing.JButton btn_buscarProv;
    private javax.swing.JButton btn_eliminarProv;
    private javax.swing.JButton btn_guardarProv;
    private javax.swing.JButton btn_nuevoProv;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelConsultaProv;
    private javax.swing.JPanel panelRegistroProveedor;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtId;
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
