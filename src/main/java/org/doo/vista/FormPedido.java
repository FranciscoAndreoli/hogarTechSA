/* @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? Boolean.class : super.getColumnClass(columnIndex);
            }*/
package org.doo.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.doo.dto.PedidoDto;
import org.doo.dto.ProductoDto;
import org.doo.dto.DetallePedidoDto;
import org.doo.dto.LoginDto;
import org.doo.dto.ClienteDto;
import java.util.List;
import java.util.ArrayList;
import org.doo.controlador.Controlador;
import org.doo.controlador.PedidoControlador;
import org.doo.model.IDetallePedido;
import org.doo.model.Producto;
import org.doo.services.EnumEnvoltorioRegalo;
import org.doo.services.EnumGarantiaExtendida;
import org.doo.services.SessionManager;
import org.doo.model.GarantiaExtendidaDecorator;
import org.doo.model.EnvoltorioRegaloDecorator;
public class FormPedido extends javax.swing.JDialog implements InterfazVistaAbm {

    private PedidoControlador controlador;
    private final DefaultTableModel modeloTblProductos;
    private final DefaultTableModel modeloTblPedidos;
    private final LoginDto empleadoActual = SessionManager.getEmpleadoActual();
    
    public FormPedido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modeloTblProductos = (DefaultTableModel) this.tblProductos.getModel();
        modeloTblPedidos = (DefaultTableModel) this.tblPedidos.getModel();
  
        getInfoEmpleado(empleadoActual);
    }
    
    public void getInfoEmpleado(LoginDto empleadoActual) {
        String nombreEmpleado;
        nombreEmpleado = String.format("%s %s ", empleadoActual.getNombre(), empleadoActual.getApellido());
        int test = empleadoActual.getID();
        String ID = Integer.toString(empleadoActual.getID());
        String legajoEmpleado = String.format(ID);
        labelEmpleadoNombre.setText(nombreEmpleado);
        labelEmpleadoLegajo.setText(legajoEmpleado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelCrearPedido = new javax.swing.JPanel();
        buttonCrearPedido = new javax.swing.JButton();
        textFecha = new javax.swing.JFormattedTextField();
        textDniCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelEmpleadoNombre = new javax.swing.JLabel();
        labelEmpleadoLegajo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanelBuscarPedido = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        searchPedido = new javax.swing.JTextField();
        buttonBuscarPedido = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        searchNombreProducto = new javax.swing.JTextField();
        buttonBuscarProducto = new javax.swing.JButton();
        jPanelBorrarPedido = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        deletePedido = new javax.swing.JTextField();
        buttonBorrarPedido = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonActualizarProductos = new javax.swing.JButton();
        buttonActualizarPedidos = new javax.swing.JButton();

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { Boolean.FALSE, null, null, null, null, null, null, null,  Boolean.FALSE,  Boolean.FALSE},
                { Boolean.FALSE, null, null, null, null, null, null, null,  Boolean.FALSE,  Boolean.FALSE},
                { Boolean.FALSE, null, null, null, null, null, null, null,  Boolean.FALSE,  Boolean.FALSE},
                { Boolean.FALSE, null, null, null, null, null, null, null,  Boolean.FALSE,  Boolean.FALSE}
            },
            new String [] {
                "✓", "Cantidad", "ID", "Nombre", "Marca", "Modelo", "Precio", "Stock", "Garantía Extendida (12)", "Envoltorio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, false, true, true
            };

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

            /*@Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 8 ? Boolean.class : super.getColumnClass(columnIndex);
            }
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 9 ? Boolean.class : super.getColumnClass(columnIndex);
            }*/


        });
        tblProductos.getTableHeader().setReorderingAllowed(false);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setResizable(false);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblProductos.getColumnModel().getColumn(2).setPreferredWidth(18);
            tblProductos.getColumnModel().getColumn(9).setResizable(false);
            tblProductos.getColumnModel().getColumn(9).setPreferredWidth(10);
        }

        jScrollPane1.setViewportView(jScrollPane2);

        buttonCrearPedido.setText("Crear Pedido");
        buttonCrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearPedidoActionPerformed(evt);
            }
        });

        textFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/mm/yyyy"))));

        jLabel6.setText("DNI Cliente: ");

        jLabel7.setText("Fecha (dd/mm/yyyy):");

        jLabel8.setText("Empleado:");

        labelEmpleadoNombre.setText("j");

        labelEmpleadoLegajo.setText("t");

        jLabel9.setText("Legajo:");

        javax.swing.GroupLayout jPanelCrearPedidoLayout = new javax.swing.GroupLayout(jPanelCrearPedido);
        jPanelCrearPedido.setLayout(jPanelCrearPedidoLayout);
        jPanelCrearPedidoLayout.setHorizontalGroup(
            jPanelCrearPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearPedidoLayout.createSequentialGroup()
                .addGroup(jPanelCrearPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrearPedidoLayout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(buttonCrearPedido))
                    .addGroup(jPanelCrearPedidoLayout.createSequentialGroup()
                        .addGroup(jPanelCrearPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCrearPedidoLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearPedidoLayout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addGroup(jPanelCrearPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanelCrearPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(textDniCliente)
                            .addComponent(labelEmpleadoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(labelEmpleadoLegajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jPanelCrearPedidoLayout.setVerticalGroup(
            jPanelCrearPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearPedidoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelCrearPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelEmpleadoNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCrearPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmpleadoLegajo)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(buttonCrearPedido)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Crear Pedido", jPanelCrearPedido);

        jLabel3.setText("DNI Cliente:");

        buttonBuscarPedido.setText("Buscar");
        buttonBuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscarPedidoLayout = new javax.swing.GroupLayout(jPanelBuscarPedido);
        jPanelBuscarPedido.setLayout(jPanelBuscarPedidoLayout);
        jPanelBuscarPedidoLayout.setHorizontalGroup(
            jPanelBuscarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarPedidoLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addGroup(jPanelBuscarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(436, Short.MAX_VALUE))
        );
        jPanelBuscarPedidoLayout.setVerticalGroup(
            jPanelBuscarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarPedidoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanelBuscarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(buttonBuscarPedido)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar Pedido", jPanelBuscarPedido);

        jLabel4.setText("Nombre:");

        buttonBuscarProducto.setText("Buscar");
        buttonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(buttonBuscarProducto)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar Producto", jPanel1);

        jLabel5.setText("ID Pedido:");

        buttonBorrarPedido.setText("Borrar");
        buttonBorrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBorrarPedidoLayout = new javax.swing.GroupLayout(jPanelBorrarPedido);
        jPanelBorrarPedido.setLayout(jPanelBorrarPedidoLayout);
        jPanelBorrarPedidoLayout.setHorizontalGroup(
            jPanelBorrarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBorrarPedidoLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBorrarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBorrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jPanelBorrarPedidoLayout.setVerticalGroup(
            jPanelBorrarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBorrarPedidoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanelBorrarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletePedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(buttonBorrarPedido)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Pedido", jPanelBorrarPedido);

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "DNI", "Fecha", "Legajo Empleado", "Estado", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedidos.getTableHeader().setReorderingAllowed(false);
        tblPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPedidosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblPedidos);
        if (tblPedidos.getColumnModel().getColumnCount() > 0) {
            tblPedidos.getColumnModel().getColumn(0).setPreferredWidth(18);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Productos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Pedidos");

        buttonActualizarProductos.setText("Listar Productos");
        buttonActualizarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarProductosActionPerformed(evt);
            }
        });

        buttonActualizarPedidos.setText("Listar Pedidos");
        buttonActualizarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonActualizarProductos)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(buttonActualizarPedidos)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(buttonActualizarPedidos))
                    .addComponent(buttonActualizarProductos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProductosMouseClicked

    private void tblPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPedidosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPedidosMouseClicked

    private void buttonBuscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarPedidoActionPerformed
        String dniCliente = searchPedido.getText();
        if(!dniCliente.isEmpty()){
            List<PedidoDto> listPedidoDto = controlador.buscarPedidos(dniCliente);
            if(!listPedidoDto.isEmpty()){
                controlador.cargarListadoPedidos(modeloTblPedidos, listPedidoDto);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Debes ingresar un valor!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonBuscarPedidoActionPerformed

    private void buttonActualizarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarProductosActionPerformed
        controlador.cargarProductos(modeloTblProductos);
    }//GEN-LAST:event_buttonActualizarProductosActionPerformed

    private void buttonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarProductoActionPerformed
        String nombreProducto = searchNombreProducto.getText();
        if(!nombreProducto.isEmpty()){
            List<Producto> listProducto = controlador.buscarProducto(nombreProducto);
            if(!listProducto.isEmpty()){
                controlador.cargarListadoProductos(modeloTblProductos, listProducto);
            }else{
                JOptionPane.showMessageDialog(this, "El producto ingresado no existe!", "Error", JOptionPane.ERROR_MESSAGE);
                controlador.cargarProductos(modeloTblProductos);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Debes ingresar un valor!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonBuscarProductoActionPerformed

    private void buttonActualizarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarPedidosActionPerformed
        controlador.cargarPedidos(modeloTblPedidos);
    }//GEN-LAST:event_buttonActualizarPedidosActionPerformed

    private void buttonBorrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarPedidoActionPerformed
        try {
            int idPedido = Integer.parseInt(deletePedido.getText());
            if(idPedido > 0){
                if(controlador.borrar(idPedido)){
                     controlador.cargarPedidos(modeloTblPedidos);
                    JOptionPane.showMessageDialog(this, "Pedido Borrado!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "No encontramos un pedido con ese ID!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Debes ingresar un número positivo!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debes ingresar un número entero!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonBorrarPedidoActionPerformed

    private void buttonCrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearPedidoActionPerformed
        DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();
        String dniCliente = textDniCliente.getText();
        String fecha = textFecha.getText();

        if (validarFecha(fecha) && validarDni(dniCliente)) {
            ClienteDto cliente = controlador.traerCliente(Integer.parseInt(dniCliente));
            if (validarCliente(cliente) && validarProductosSeleccionados(modeloTabla)) {
                List<IDetallePedido> detallePedidoList = getTableData(modeloTabla);
                if (crearPedido(cliente.getId(), dniCliente, fecha, detallePedidoList)) {
                    JOptionPane.showMessageDialog(this, "Pedido Creado!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    actualizarStockYTablas(detallePedidoList);
                } else {
                    mostrarError("El pedido no ha sido creado!");
                }
            }
        }
    }//GEN-LAST:event_buttonCrearPedidoActionPerformed

    private boolean validarFecha(String fecha) {
        if (fecha.isEmpty()) {
            mostrarError("Debes ingresar una fecha");
            return false;
        }
        return true;
    }

    private boolean validarDni(String dniCliente) {
        int dni = validarEntero(dniCliente);
        if (dniCliente.isEmpty() || dni == -1) {
            mostrarError("El DNI no es válido!");
            return false;
        }
        return true;
    }

    private boolean validarCliente(ClienteDto cliente) {
        if (cliente == null) {
            mostrarError("El cliente ingresado no existe");
            return false;
        }
        return true;
    }

    private boolean validarProductosSeleccionados(DefaultTableModel modeloTabla) {
        if (modeloTabla.getRowCount() == 0) {
            mostrarError("Debes seleccionar uno o más productos!");
            return false;
        }
        return true;
    }

    private void actualizarStockYTablas(List<IDetallePedido> detallePedidoList) {
        if (controlador.editarStockProducto(detallePedidoList)) {
            controlador.cargarProductos(modeloTblProductos);
            controlador.cargarPedidos(modeloTblPedidos);
        } else {
            mostrarError("El pedido ha sido creado pero ha habido un error al actualizar stocks!");
        }
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public List<IDetallePedido> getTableData(DefaultTableModel modeloTabla) {
        List<IDetallePedido> detallePedidoList = new ArrayList<>();
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            Boolean isChecked = (Boolean) modeloTabla.getValueAt(i, 0);

            if (Boolean.TRUE.equals(isChecked)) {
                Object cantidadObjeto = modeloTabla.getValueAt(i, 1);
                int cantidad = (cantidadObjeto != null) ? validarEntero(cantidadObjeto.toString()) : -1;
                Integer idProducto = (Integer) modeloTabla.getValueAt(i, 2);
                String nombreProducto = (String) modeloTabla.getValueAt(i, 3);
                Float precioUnitario = (Float) modeloTabla.getValueAt(i, 6);
                Integer stock = (Integer) modeloTabla.getValueAt(i, 7);
                Boolean isGarantiaChecked = (Boolean) modeloTabla.getValueAt(i, 8);
                Boolean isEnvoltorioChecked = (Boolean) modeloTabla.getValueAt(i, 9);

                if (cantidad >= 1 && cantidad <= stock) {
                    IDetallePedido detallePedido = controlador.crearDetallePedido(idProducto, nombreProducto, cantidad, precioUnitario, isGarantiaChecked, isEnvoltorioChecked);
                    detallePedidoList.add(detallePedido);
                }
            }
        }
        return detallePedidoList;
    }


    public boolean crearPedido(int id, String dniCliente, String fecha, List<IDetallePedido> detallePedidoList){

        PedidoDto pedidoDto = new PedidoDto();
        pedidoDto.setIdCliente(id);
        pedidoDto.setDni(dniCliente);
        pedidoDto.setFecha(fecha);
        pedidoDto.setLegajoEmpleado(this.empleadoActual.getID());
        pedidoDto.setStatus("CREADO");
        pedidoDto.setImporte(getImportePedido(detallePedidoList));
                    
        return controlador.crearPedido(pedidoDto, detallePedidoList);
    }
    
    public float getImportePedido( List<IDetallePedido> detallePedidoList){
        float importeFinal = 0;
        for (IDetallePedido pedido : detallePedidoList){
            importeFinal += pedido.getPrecioTotal();
        }  
        return importeFinal;
    }
    
    public int validarEntero(String texto){
        try {
            int valor = Integer.parseInt(texto);
            return valor; 
        } catch (NumberFormatException e) {
            return -1; 
    }
    }
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
            java.util.logging.Logger.getLogger(FormPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPedido dialog = new FormPedido(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActualizarPedidos;
    private javax.swing.JButton buttonActualizarProductos;
    private javax.swing.JButton buttonBorrarPedido;
    private javax.swing.JButton buttonBuscarPedido;
    private javax.swing.JButton buttonBuscarProducto;
    private javax.swing.JButton buttonCrearPedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField deletePedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBorrarPedido;
    private javax.swing.JPanel jPanelBuscarPedido;
    private javax.swing.JPanel jPanelCrearPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelEmpleadoLegajo;
    private javax.swing.JLabel labelEmpleadoNombre;
    private javax.swing.JTextField searchNombreProducto;
    private javax.swing.JTextField searchPedido;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField textDniCliente;
    private javax.swing.JFormattedTextField textFecha;
    // End of variables declaration//GEN-END:variables
    public void actualizaTabla() {
        controlador.cargarProductos(modeloTblProductos);
    }

    public void setControlador(Controlador c) {
        this.controlador = (PedidoControlador) c;
        this.controlador.cargarProductos(modeloTblProductos);
        this.controlador.cargarPedidos(modeloTblPedidos);
    }

    public void iniciaVista() {
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void imprimeMensaje(Exception... e) {
        if (e.length > 0) {
            JOptionPane.showMessageDialog(this, "Error: " + e[0].getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Operación ejecutada con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void limpiaVista() {
        
    }

    @Override
    public void ocultarVista() {

    }


    public javax.swing.JTable getTblPedidos() {
        return tblProductos;
    }


}
