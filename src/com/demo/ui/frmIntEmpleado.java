/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ui;

import com.demo.design.JTableDesign;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Jona
 */
public class frmIntEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmIntEmpleado
     */
    private String columnas[] = {"Auto", "Color", "Tipo"};
    private Object celdas[][] = {{"Kia","Rojo", "C"},
    {"Toyota","Azul","C"},
    {"Lexus","Negro","B"},
    {"BMW","Verde","B"},
    {"Pagani", "Dorado", "A"},
    {"Ferrari", "Rojo", "A"}};
    
    public frmIntEmpleado() {
        initComponents();        
        setSize(750, 550);
        // diseño de jtable
        tabla = new JTable(celdas,columnas);
        JTableDesign design = new JTableDesign();
        tabla.setDefaultRenderer(Object.class, design);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pRegistroEmpleado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_nuevoEmp = new javax.swing.JButton();
        btn_guardarEmp = new javax.swing.JButton();
        btn_editarEmp = new javax.swing.JButton();
        btn_eliminarEmp = new javax.swing.JButton();
        txt_nombreEmp = new javax.swing.JTextField();
        txt_correoEmp = new javax.swing.JTextField();
        txt_apellidoEmp = new javax.swing.JTextField();
        txt_telefonoEmp = new javax.swing.JTextField();
        txt_rolEmp = new javax.swing.JTextField();
        txt_identificacionEmp = new javax.swing.JTextField();
        txt_direccionEmp = new javax.swing.JTextField();
        txt_usernameEmp = new javax.swing.JTextField();
        txt_contrasenaEmp = new javax.swing.JTextField();
        comboBox_activoEmp = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Empleado");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pRegistroEmpleado.setBackground(new java.awt.Color(255, 204, 102));
        pRegistroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N
        pRegistroEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        pRegistroEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Nombres:");
        pRegistroEmpleado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Apellidos:");
        pRegistroEmpleado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Identificación");
        pRegistroEmpleado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 67, -1, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Correo:");
        pRegistroEmpleado.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Dirección:");
        pRegistroEmpleado.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Teléfono:");
        pRegistroEmpleado.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Rol:");
        pRegistroEmpleado.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Username:");
        pRegistroEmpleado.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Contraseña:");
        pRegistroEmpleado.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Estado:");
        pRegistroEmpleado.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        btn_nuevoEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btnnuevo.png"))); // NOI18N
        btn_nuevoEmp.setText("Nuevo");
        pRegistroEmpleado.add(btn_nuevoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        btn_guardarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btnguardar.png"))); // NOI18N
        btn_guardarEmp.setText("Guardar");
        pRegistroEmpleado.add(btn_guardarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        btn_editarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btneditar.png"))); // NOI18N
        btn_editarEmp.setText("Actualizar");
        btn_editarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarEmpActionPerformed(evt);
            }
        });
        pRegistroEmpleado.add(btn_editarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        btn_eliminarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btneliminar.png"))); // NOI18N
        btn_eliminarEmp.setText("Eliminar");
        pRegistroEmpleado.add(btn_eliminarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, -1));

        txt_nombreEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_nombreEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreEmpActionPerformed(evt);
            }
        });
        pRegistroEmpleado.add(txt_nombreEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 230, -1));

        txt_correoEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pRegistroEmpleado.add(txt_correoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 230, -1));

        txt_apellidoEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pRegistroEmpleado.add(txt_apellidoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 230, -1));

        txt_telefonoEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pRegistroEmpleado.add(txt_telefonoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 230, -1));

        txt_rolEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pRegistroEmpleado.add(txt_rolEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 230, -1));

        txt_identificacionEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pRegistroEmpleado.add(txt_identificacionEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 230, -1));

        txt_direccionEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pRegistroEmpleado.add(txt_direccionEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 230, -1));

        txt_usernameEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pRegistroEmpleado.add(txt_usernameEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 230, -1));

        txt_contrasenaEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_contrasenaEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contrasenaEmpActionPerformed(evt);
            }
        });
        pRegistroEmpleado.add(txt_contrasenaEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 230, -1));

        comboBox_activoEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        comboBox_activoEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pRegistroEmpleado.add(comboBox_activoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 230, -1));

        getContentPane().add(pRegistroEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 230));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificación", "Nombres", "Rol", "Estado"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 790, 160));

        txtBuscar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 200, -1));

        btnBuscar.setText("Busqueda");
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 810, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editarEmpActionPerformed

    private void txt_nombreEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreEmpActionPerformed

    private void txt_contrasenaEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contrasenaEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contrasenaEmpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btn_editarEmp;
    private javax.swing.JButton btn_eliminarEmp;
    private javax.swing.JButton btn_guardarEmp;
    private javax.swing.JButton btn_nuevoEmp;
    private javax.swing.JComboBox<String> comboBox_activoEmp;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pRegistroEmpleado;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txt_apellidoEmp;
    private javax.swing.JTextField txt_contrasenaEmp;
    private javax.swing.JTextField txt_correoEmp;
    private javax.swing.JTextField txt_direccionEmp;
    private javax.swing.JTextField txt_identificacionEmp;
    private javax.swing.JTextField txt_nombreEmp;
    private javax.swing.JTextField txt_rolEmp;
    private javax.swing.JTextField txt_telefonoEmp;
    private javax.swing.JTextField txt_usernameEmp;
    // End of variables declaration//GEN-END:variables
}
