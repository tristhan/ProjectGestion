/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ui;

import com.demo.controller.controllerArticulo;
import com.demo.controller.controllerProveedor;
import com.demo.design.validacion;
import com.demo.dominio.Articulo;
import com.demo.dominio.Proveedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jona
 */
public class frmIntArticulo extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmIntArticulo
     */
    private controllerArticulo ctrlArticulo;
    private controllerProveedor ctrlProveedor;
    private Articulo articulo;
    private validacion validacion;
    private boolean estado = false;
    
    int x,y;

    public frmIntArticulo() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        textaDescripcion.setLineWrap(true);
        textaDescripcion.setWrapStyleWord(true);
        txtId.setVisible(false);
        btnActualizar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnBorrar.setEnabled(false);

        desabilitar();
        buscarAll();
        llenarcboProveedor();
        ocultar_columnas();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        cboEstado = new javax.swing.JComboBox<>();
        cboProveedor = new javax.swing.JComboBox();
        txtPrecioCompra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textaDescripcion = new javax.swing.JTextArea();
        txtId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscarArticulo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Artículos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setMinimumSize(new java.awt.Dimension(769, 213));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Código Físico:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Descripción:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Stock:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Precio De Venta:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Precio De Compra:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Estado:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Proveedor:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 180, -1));

        txtCodigo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 180, -1));

        txtStock.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtStock.setToolTipText("10.45");
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        jPanel2.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 140, -1));

        txtPrecioVenta.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtPrecioVenta.setToolTipText("10.45");
        jPanel2.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 140, -1));

        cboEstado.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jPanel2.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, -1));

        cboProveedor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cboProveedor.setToolTipText("");
        jPanel2.add(cboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 180, -1));

        txtPrecioCompra.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtPrecioCompra.setToolTipText("10.45");
        txtPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCompraActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 140, -1));

        textaDescripcion.setColumns(20);
        textaDescripcion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textaDescripcion.setRows(5);
        jScrollPane1.setViewportView(textaDescripcion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 490, 50));
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 20, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 620, 210));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btnnuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 10, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btnguardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 10, -1, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btneditar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 10, -1, -1));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btneliminar.png"))); // NOI18N
        btnBorrar.setText("Eliminar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 10, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Search_32px.png"))); // NOI18N
        btnBuscar.setToolTipText("Búscar todo los articulos");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Search_32px_2.png"))); // NOI18N
        btnBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Search_32px_2.png"))); // NOI18N
        btnBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Search_32px_2.png"))); // NOI18N
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 40, 30));

        txtBuscarArticulo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel1.add(txtBuscarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 140, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Búscar:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 14, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 620, 40));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de articulos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Id Proveedor", "Nombre", "Código Físico", "Descripción", "Stock", "Precio De Venta", "Precio De Compra", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 600, 140));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 620, 170));

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gestión de artículos");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 3, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 30));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Multiply_321px.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Multiply_32px.png"))); // NOI18N
        btnCerrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Multiply_32px.png"))); // NOI18N
        btnCerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Multiply_32px.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCompraActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int cbo = (cboEstado.getSelectedIndex());
        if (cbo == 0) {
            estado = true;
        } else {
            estado = false;
        }

        ctrlArticulo = new controllerArticulo();
        articulo = new Articulo();
        Proveedor pro=(Proveedor)cboProveedor.getSelectedItem();
        articulo.setProveedor(pro);
        articulo.setProveedor(pro);
        articulo.setNombre(txtNombre.getText());
        articulo.setCodigo_fisico(txtCodigo.getText());
        articulo.setDescripcion(textaDescripcion.getText());
        articulo.setStock(Integer.parseInt(txtStock.getText()));
        articulo.setPrecio_venta(Double.parseDouble(txtPrecioVenta.getText()));
        articulo.setPrecio_compra(Double.parseDouble(txtPrecioCompra.getText()));
        articulo.setEstado(estado);

        if (ctrlArticulo.registrar(articulo)) {
            JOptionPane.showConfirmDialog(null, "Artículo " + txtNombre.getText() + " ha sido grabado con exito", "Confirmación", 2);
            limpiar();
            desabilitar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitar();
        llenarcboProveedor();
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnBorrar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int cbo = (cboEstado.getSelectedIndex());
        if (cbo == 0) {
            estado = true;
        } else {
            estado = false;
        }
        
        articulo = new Articulo();
        articulo.setProveedor((Proveedor)cboProveedor.getSelectedItem());
        articulo.setNombre(txtNombre.getText());
        articulo.setCodigo_fisico(txtCodigo.getText());
        articulo.setDescripcion(textaDescripcion.getText());
        articulo.setStock(Integer.parseInt(txtStock.getText()));
        articulo.setPrecio_venta(Double.parseDouble(txtPrecioVenta.getText()));
        articulo.setPrecio_compra(Double.parseDouble(txtPrecioCompra.getText()));
        articulo.setEstado(estado);
        articulo.setId_articulo(Integer.parseInt(txtId.getText()));
        
        if (ctrlArticulo.actualizar(articulo)) {
            JOptionPane.showConfirmDialog(null, "Artículo " + txtNombre.getText() + " ha sido actualizado con exito", "Confirmación", 2);
            buscarAll();
            limpiar();
            desabilitar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int cbo = (cboEstado.getSelectedIndex());
        if (cbo == 0) {
            estado = true;
        } else {
            estado = false;
        }

        articulo = new Articulo();
        articulo.setEstado(estado);
        articulo.setId_articulo(Integer.parseInt(txtId.getText()));

        if (ctrlArticulo.eliminar(articulo)) {
            JOptionPane.showConfirmDialog(null, "Artículo  " + txtNombre.getText() + " ha sido desabilitado", "Confirmación", 2);
            buscarAll();
            limpiar();
            desabilitar();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        habilitar();
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnBorrar.setEnabled(true);

        int fila = tabla.rowAtPoint(evt.getPoint());
        txtId.setText(tabla.getValueAt(fila, 0).toString());
        cboProveedor.setSelectedItem(tabla.getValueAt(fila, 1).toString());
        txtNombre.setText(tabla.getValueAt(fila, 2).toString());
        txtCodigo.setText(tabla.getValueAt(fila, 3).toString());
        textaDescripcion.setText(tabla.getValueAt(fila, 4).toString());
        txtStock.setText(tabla.getValueAt(fila, 5).toString());
        txtPrecioVenta.setText(tabla.getValueAt(fila, 6).toString());
        txtPrecioCompra.setText(tabla.getValueAt(fila, 7).toString());
        cboEstado.setSelectedItem(tabla.getValueAt(fila, 8).toString());
        
    }//GEN-LAST:event_tablaMouseClicked

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    void llenarcboProveedor() {
        ctrlProveedor = new controllerProveedor();
        List<Proveedor> proveedors = (ArrayList<Proveedor>) ctrlProveedor.verProveedoresAll();
        DefaultComboBoxModel<Proveedor> boxModel = new DefaultComboBoxModel<>();
        for (Proveedor pro : proveedors) {
            boxModel.addElement(pro);
        }
        cboProveedor.setModel(boxModel);
    }

    void desabilitar() {
        cboProveedor.setEnabled(false);
        txtNombre.setEnabled(false);
        txtCodigo.setEnabled(false);
        textaDescripcion.setEnabled(false);
        txtStock.setEnabled(false);
        txtPrecioVenta.setEnabled(false);
        txtPrecioCompra.setEnabled(false);
        cboEstado.setEnabled(false);
        
        btnActualizar.setEnabled(false);
        btnBorrar.setEnabled(false);
    }

    void habilitar() {
        cboProveedor.setEnabled(true);
        txtNombre.setEnabled(true);
        txtCodigo.setEnabled(true);
        textaDescripcion.setEnabled(true);
        txtStock.setEnabled(true);
        txtPrecioVenta.setEnabled(true);
        txtPrecioCompra.setEnabled(true);
        cboEstado.setEnabled(true);
    }

    void limpiar() {
        txtNombre.setText("");
        txtCodigo.setText("");
        textaDescripcion.setText("");
        txtStock.setText("");
        txtPrecioVenta.setText("");
        txtPrecioCompra.setText("");
    }

    void buscarAll() {
        limpiarTabla();
        ctrlArticulo = new controllerArticulo();
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        List<Articulo> lista = ctrlArticulo.verArticulosAll();
        
        for (Articulo articulo : lista) {
            Object[] row = new Object[9];
            row[0] = articulo.getId_articulo();
            row[1] = articulo.getProveedor().getId_proveedor();
            row[2] = articulo.getNombre();
            row[3] = articulo.getCodigo_fisico();
            row[4] = articulo.getDescripcion();
            row[5] = articulo.getStock();
            row[6] = articulo.getPrecio_venta();
            row[7] = articulo.getPrecio_compra();
            row[8] = articulo.isEstado();
            modelo.addRow(row);
        }
        tabla.setModel(modelo);
    }
    
    void limpiarTabla() {
        DefaultTableModel model1 = (DefaultTableModel) tabla.getModel();
        model1.setRowCount(0);
    }

    public void ocultar_columnas() {
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);

        tabla.getColumnModel().getColumn(1).setMaxWidth(0);
        tabla.getColumnModel().getColumn(1).setMinWidth(0);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(0);

        tabla.getColumnModel().getColumn(4).setMaxWidth(0);
        tabla.getColumnModel().getColumn(4).setMinWidth(0);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(0);
        
        tabla.getColumnModel().getColumn(8).setMaxWidth(0);
        tabla.getColumnModel().getColumn(8).setMinWidth(0);
        tabla.getColumnModel().getColumn(8).setPreferredWidth(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox cboProveedor;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea textaDescripcion;
    private javax.swing.JTextField txtBuscarArticulo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
