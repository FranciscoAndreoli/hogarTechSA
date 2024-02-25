/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.doo.vista;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.doo.controlador.Controlador;
import org.doo.controlador.ProductoControlador;
public class FormProducto extends javax.swing.JDialog implements InterfazVistaAbm {

    private ProductoControlador controlador;
    private final DefaultTableModel modeloTbl;


    public FormProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.modeloTbl = (DefaultTableModel) this.tblProductos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        tabAMBClientes = new javax.swing.JTabbedPane();
        jPanelCrearCliente = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        createPrecioProducto = new javax.swing.JTextField();
        createNombreProducto = new javax.swing.JTextField();
        createDimensionProducto = new javax.swing.JTextField();
        createMarcaProducto = new javax.swing.JTextField();
        createModeloProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buttonCrearProducto = new javax.swing.JButton();
        createColorProducto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        createOrigenProducto = new javax.swing.JTextField();
        createPesoProducto = new javax.swing.JTextField();
        createCapacidadProducto = new javax.swing.JTextField();
        createDescripcionProducto = new javax.swing.JTextField();
        createGarantiaProducto = new javax.swing.JTextField();
        createEficienciaProducto = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        createStockProducto = new javax.swing.JTextField();
        jPanelEliminarCliente = new javax.swing.JPanel();
        buttonEliminarProducto = new javax.swing.JButton();
        deleteProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio", "Marca", "Modelo", "Color", "Dimensión", "Origen", "Peso", "Capacidad", "Eficiencia", "Descripción", "Garantía", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jLabel6.setText("Marca:");

        jLabel7.setText("Nombre:");

        jLabel8.setText("Precio:");

        jLabel9.setText("Modelo:");

        jLabel10.setText("Color:");

        buttonCrearProducto.setText("Crear Producto");
        buttonCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearProductoActionPerformed(evt);
            }
        });

        jLabel12.setText("Dimensión:");

        jLabel13.setText("Origen:");

        jLabel14.setText("Peso:");

        jLabel15.setText("Capacidad:");

        jLabel16.setText("Eficiencia:");

        jLabel17.setText("Descripción:");

        jLabel18.setText("Garantía (Meses):");

        createEficienciaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        createEficienciaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEficienciaProductoActionPerformed(evt);
            }
        });

        jLabel19.setText("Stock:");

        javax.swing.GroupLayout jPanelCrearClienteLayout = new javax.swing.GroupLayout(jPanelCrearCliente);
        jPanelCrearCliente.setLayout(jPanelCrearClienteLayout);
        jPanelCrearClienteLayout.setHorizontalGroup(
            jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(createMarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(createPrecioProducto))
                                .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(createNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                                .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createDimensionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createModeloProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createColorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(createPesoProducto))
                            .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(createOrigenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(createEficienciaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createCapacidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                                .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createGarantiaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(buttonCrearProducto)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanelCrearClienteLayout.setVerticalGroup(
            jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearClienteLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(createNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(createPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(createMarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createModeloProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(createColorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createDimensionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createOrigenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel19)
                            .addComponent(createStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(createPesoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(createCapacidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(createEficienciaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(createDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createGarantiaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGap(18, 18, 18)
                .addComponent(buttonCrearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabAMBClientes.addTab("Crear Producto", jPanelCrearCliente);

        buttonEliminarProducto.setText("Eliminar Producto");
        buttonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarProductoActionPerformed(evt);
            }
        });

        jLabel11.setText("ID:");

        javax.swing.GroupLayout jPanelEliminarClienteLayout = new javax.swing.GroupLayout(jPanelEliminarCliente);
        jPanelEliminarCliente.setLayout(jPanelEliminarClienteLayout);
        jPanelEliminarClienteLayout.setHorizontalGroup(
            jPanelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliminarClienteLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addGroup(jPanelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEliminarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jPanelEliminarClienteLayout.setVerticalGroup(
            jPanelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEliminarClienteLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPanelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(46, 46, 46)
                .addComponent(buttonEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        tabAMBClientes.addTab("Eliminar Producto", jPanelEliminarCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(tabAMBClientes)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabAMBClientes)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        /*String nombre = this.getTxtNombre().getText();
        String precio = this.getTxtPrecio().getText();
        String color = this.getTxtColor().getText();
        String marca = this.getTxtMarca().getText();
        String modelo = this.getTxtModelo().getText();
        String stock = this.getTxtStock().getText();
                
        if (!nombre.equals("") && !precio.equals("") && !color.equals("") && !marca.equals("") && !modelo.equals("") && !stock.equals("")) {
            boolean resultado = controlador.guardar(nombre.toUpperCase(), Double.valueOf(precio), color, marca, modelo, Integer.valueOf(stock));
            if (resultado) {
                actualizaTabla();
            }
            limpiaVista();
        } else {
            imprimeMensaje(new Exception("Todos los campos son obligatorios"));
        }*/
    }


    private void buttonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarProductoActionPerformed
       int ID = Integer.parseInt(deleteProducto.getText().trim());
       if(ID > 0){
           if(controlador.borrar(ID)){
               JOptionPane.showMessageDialog(this, "Producto borrado con éxito!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
               controlador.cargarTodos(modeloTbl);
           }
       }else{
           JOptionPane.showMessageDialog(this, "Inserta un ID válido!", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_buttonEliminarProductoActionPerformed

    private void buttonCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearProductoActionPerformed
        String nombreProducto = createNombreProducto.getText();
        String precioProducto = createPrecioProducto.getText().trim();
        String stockProducto = createStockProducto.getText().trim();
        String dimensionProducto = createDimensionProducto.getText().trim();
        String modeloProducto = createModeloProducto.getText();
        String marcaProducto = createMarcaProducto.getText();
        String colorProducto = createColorProducto.getText();
        String origenProducto = createOrigenProducto.getText();
        String pesoProducto = createPesoProducto.getText();
        String capacidadProducto = createCapacidadProducto.getText();
        String eficienciaProducto = createEficienciaProducto.getSelectedItem().toString();
        String descripcionProducto = createDescripcionProducto.getText();
        String garantiaProducto = createGarantiaProducto.getText();
        
        if (!chequearCamposVacios(nombreProducto, precioProducto, stockProducto)){
            return;
        }else{
            
            float precio = parseStringToNumber(precioProducto);
            int stock = validarStock(stockProducto);
            int garantia = 0;
            if(!garantiaProducto.isEmpty()){
                garantia = validarGarantia(garantiaProducto);
            }
            
            if(precio > 0.00 && stock > 0 && garantia >= 0 ){
                if(!controlador.chequearProductoDuplicado(nombreProducto, marcaProducto, modeloProducto, stock, precio)){
                    if(controlador.createProducto(nombreProducto, precio, stock, marcaProducto, modeloProducto,
                                              colorProducto, dimensionProducto, origenProducto, pesoProducto, capacidadProducto,
                                              eficienciaProducto,descripcionProducto, garantia )){
                    
                    controlador.cargarTodos(modeloTbl);
                    JOptionPane.showMessageDialog(this, "Producto creado!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
                    }else{
                        JOptionPane.showMessageDialog(this, "Hubo un error al crear el producto!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                        JOptionPane.showMessageDialog(this, "Este producto ya existe!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
            }else{
                JOptionPane.showMessageDialog(this, "El precio, stock  o garantía ingresados no tiene un formato válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonCrearProductoActionPerformed

    private boolean chequearCamposVacios(String nombre, String precio, String stock){
        if(nombre.isEmpty() || precio.isEmpty() || stock.isEmpty()){
            JOptionPane.showMessageDialog(this, "'Nombre', 'Precio' y 'Stock' son campos obligatorios!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else { return true; }
    }
    
    
    private float parseStringToNumber(String precio) {
    try {
        return Integer.parseInt(precio);
    } catch (NumberFormatException e) {
        try {
            return Float.parseFloat(precio.replace(',', '.'));
        } catch (NumberFormatException ex) {
            return -1;
        }
    }
   }
    
    private int validarStock(String stockProducto){
        try {
            int stock = Integer.parseInt(stockProducto);
            if (stock > 0) {
                return stock;
            } else { return -1; }
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    private int validarGarantia(String garantiaProducto){
    try {
        int garantia = Integer.parseInt(garantiaProducto);
        if (garantia > 0) {
            return garantia;
        } else { return 0; }
    } catch (NumberFormatException e) {
         return -1;
    }
}

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
            java.util.logging.Logger.getLogger(FormProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormProducto dialog = new FormProducto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonCrearProducto;
    private javax.swing.JButton buttonEliminarProducto;
    private javax.swing.JTextField createCapacidadProducto;
    private javax.swing.JTextField createColorProducto;
    private javax.swing.JTextField createDescripcionProducto;
    private javax.swing.JTextField createDimensionProducto;
    private javax.swing.JComboBox<String> createEficienciaProducto;
    private javax.swing.JTextField createGarantiaProducto;
    private javax.swing.JTextField createMarcaProducto;
    private javax.swing.JTextField createModeloProducto;
    private javax.swing.JTextField createNombreProducto;
    private javax.swing.JTextField createOrigenProducto;
    private javax.swing.JTextField createPesoProducto;
    private javax.swing.JTextField createPrecioProducto;
    private javax.swing.JTextField createStockProducto;
    private javax.swing.JTextField deleteProducto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCrearCliente;
    private javax.swing.JPanel jPanelEliminarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabAMBClientes;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizaTabla() {
        controlador.cargarTodos(modeloTbl);
        //this.lblTotalFilasTabla.setText("Total filas: " + this.modeloTbl.getRowCount());
    }

    @Override
    public void setControlador(Controlador c) {
        this.controlador = (ProductoControlador) c;
        this.controlador.cargarTodos(modeloTbl);
        //  this.lblTotalFilasTabla.setText("Total filas: " + this.modeloTbl.getRowCount());
    }

    @Override
    public void iniciaVista() {
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void imprimeMensaje(Exception... e) {
        if (e.length > 0) {
            JOptionPane.showMessageDialog(this, "Error: " + e[0].getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Operación ejecutada con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void limpiaVista() {
        /*this.txtId.setValue(null);
        this.txtNombre.setText("");
        this.txtModelo.setText("");
        this.txtColor.setText("");
        this.txtPrecio.setText("");
        this.txtMarca.setText("");
        this.txtStock.setText("");*/
    }

    @Override
    public void ocultarVista() {

    }

    @Override
    public void verificarInputTxt(KeyEvent e) {
        InterfazVistaAbm.super.verificarInputTxt(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public javax.swing.JTable getTblProductos() {
        return tblProductos;
    }
}
