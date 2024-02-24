/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.doo.vista;

import org.doo.controlador.Controlador;
import org.doo.controlador.ClienteControlador;
import org.doo.controlador.ProductoControlador;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author franc
 */
public class FormCliente extends javax.swing.JDialog implements InterfazVistaAbm {

    private ClienteControlador controlador;
    private final DefaultTableModel modeloTbl;

    public FormCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modeloTbl = (DefaultTableModel) this.tblClientes.getModel();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        tabAMBClientes = new javax.swing.JTabbedPane();
        jPanelCrearCliente = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        createDniCliente = new javax.swing.JTextField();
        createNombreCliente = new javax.swing.JTextField();
        createApellidoCliente = new javax.swing.JTextField();
        createTelefonoCliente = new javax.swing.JTextField();
        createDomicilioCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buttonCrearCliente = new javax.swing.JButton();
        jPanelEditarCliente = new javax.swing.JPanel();
        buttonEditarCliente = new javax.swing.JButton();
        editDniCliente = new javax.swing.JTextField();
        editNombreCliente = new javax.swing.JTextField();
        editApellidoCliente = new javax.swing.JTextField();
        editDomicilioCliente = new javax.swing.JTextField();
        editTelefonoCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelEliminarCliente = new javax.swing.JPanel();
        buttonEliminarCliente = new javax.swing.JButton();
        deleteCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nombre", "Apellido", "DNI", "Teléfono", "Domicilio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        jLabel6.setText("DNI:");

        jLabel7.setText("Nombre:");

        jLabel8.setText("Apellido:");

        jLabel9.setText("Teléfono:");

        jLabel10.setText("Domicilio:");

        buttonCrearCliente.setText("Crear Cliente");
        buttonCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCrearClienteLayout = new javax.swing.GroupLayout(jPanelCrearCliente);
        jPanelCrearCliente.setLayout(jPanelCrearClienteLayout);
        jPanelCrearClienteLayout.setHorizontalGroup(
            jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(createNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createTelefonoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(createDomicilioCliente))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
        );
        jPanelCrearClienteLayout.setVerticalGroup(
            jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearClienteLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8))
                    .addGroup(jPanelCrearClienteLayout.createSequentialGroup()
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(createNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createDomicilioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(createApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(createDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tabAMBClientes.addTab("Crear Cliente", jPanelCrearCliente);

        buttonEditarCliente.setText("Editar Cliente");
        buttonEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("DNI:");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("Domicilio:");

        javax.swing.GroupLayout jPanelEditarClienteLayout = new javax.swing.GroupLayout(jPanelEditarCliente);
        jPanelEditarCliente.setLayout(jPanelEditarClienteLayout);
        jPanelEditarClienteLayout.setHorizontalGroup(
            jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarClienteLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditarClienteLayout.createSequentialGroup()
                        .addGap(0, 198, Short.MAX_VALUE)
                        .addComponent(buttonEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))
                    .addGroup(jPanelEditarClienteLayout.createSequentialGroup()
                        .addGroup(jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editDniCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(editNombreCliente)
                            .addComponent(editApellidoCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editTelefonoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(editDomicilioCliente))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelEditarClienteLayout.setVerticalGroup(
            jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarClienteLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditarClienteLayout.createSequentialGroup()
                        .addGroup(jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanelEditarClienteLayout.createSequentialGroup()
                        .addGroup(jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editDomicilioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(jPanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(buttonEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tabAMBClientes.addTab("Editar Cliente", jPanelEditarCliente);

        buttonEliminarCliente.setText("Eliminar Cliente");
        buttonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarClienteActionPerformed(evt);
            }
        });

        jLabel11.setText("DNI:");

        javax.swing.GroupLayout jPanelEliminarClienteLayout = new javax.swing.GroupLayout(jPanelEliminarCliente);
        jPanelEliminarCliente.setLayout(jPanelEliminarClienteLayout);
        jPanelEliminarClienteLayout.setHorizontalGroup(
            jPanelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliminarClienteLayout.createSequentialGroup()
                .addGroup(jPanelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEliminarClienteLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEliminarClienteLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(buttonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanelEliminarClienteLayout.setVerticalGroup(
            jPanelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEliminarClienteLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanelEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(47, 47, 47)
                .addComponent(buttonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        tabAMBClientes.addTab("Eliminar Cliente", jPanelEliminarCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabAMBClientes)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tabAMBClientes))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarClienteActionPerformed
        String dniCliente = editDniCliente.getText().trim();
        String nombreCliente = editNombreCliente.getText();
        String apellidoCliente = editApellidoCliente.getText();
        String direccionCliente = editDomicilioCliente.getText();
        String telefonoCliente = editTelefonoCliente.getText();
        
        if(dniCliente.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "El DNI es obligatorio!", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (nombreCliente.trim().isEmpty() && apellidoCliente.trim().isEmpty() && direccionCliente.trim().isEmpty() && telefonoCliente.trim().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Debes ingresar por lo menos un valor a editar!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if(controlador.chequearCliente(dniCliente)){
                if(controlador.updateCliente(dniCliente, nombreCliente, apellidoCliente, direccionCliente, telefonoCliente)){
                    controlador.cargarTodos(modeloTbl);
                    JOptionPane.showMessageDialog(this, "Cliente actualizado!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Hubo un error al actualizar el cliente!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "No existe un usuario con ese DNI!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonEditarClienteActionPerformed

    private void buttonCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearClienteActionPerformed
        String dniCliente = createDniCliente.getText().trim();
        String nombreCliente = createNombreCliente.getText();
        String apellidoCliente = createApellidoCliente.getText();
        String direccionCliente = createDomicilioCliente.getText();
        String telefonoCliente = createTelefonoCliente.getText();
        
        if (dniCliente.trim().isEmpty() || nombreCliente.trim().isEmpty() || apellidoCliente.trim().isEmpty() || direccionCliente.trim().isEmpty() || telefonoCliente.trim().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if(!controlador.chequearCliente(dniCliente)){
                if(controlador.createCliente(dniCliente, nombreCliente, apellidoCliente, direccionCliente, telefonoCliente)){
                    controlador.cargarTodos(modeloTbl);
                    JOptionPane.showMessageDialog(this, "Cliente creado!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Hubo un error al crear el cliente!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Este DNI ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonCrearClienteActionPerformed

    private void buttonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarClienteActionPerformed
        String dniCliente = deleteCliente.getText().trim();
        if (dniCliente.isEmpty()){
            JOptionPane.showMessageDialog(this, "Debes ingresar un DNI!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if(controlador.chequearCliente(dniCliente)){
                int a = JOptionPane.showConfirmDialog(this, "¿Estás seguro? Se eliminarán los pedidos asociados a este cliente.", "Confirmación", JOptionPane.YES_NO_OPTION);
                if(a==JOptionPane.YES_OPTION){  
                       if(controlador.deleteCliente(dniCliente)){
                        controlador.cargarTodos(modeloTbl);
                        JOptionPane.showMessageDialog(this, "Cliente eliminado!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this, "Hubo un error al eliminar el cliente!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this, "Este cliente no existe.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonEliminarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormCliente dialog = new FormCliente(new javax.swing.JFrame(), true);
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

    @Override
    public void setControlador(Controlador c) {
        this.controlador = (ClienteControlador) c;
        this.controlador.cargarTodos(modeloTbl);
    }

    @Override
    public void iniciaVista() {
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void imprimeMensaje(Exception... e) {

    }

    @Override
    public void limpiaVista() {

    }

    @Override
    public void ocultarVista() {

    }

    @Override
    public void actualizaTabla() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCrearCliente;
    private javax.swing.JButton buttonEditarCliente;
    private javax.swing.JButton buttonEliminarCliente;
    private javax.swing.JTextField createApellidoCliente;
    private javax.swing.JTextField createDniCliente;
    private javax.swing.JTextField createDomicilioCliente;
    private javax.swing.JTextField createNombreCliente;
    private javax.swing.JTextField createTelefonoCliente;
    private javax.swing.JTextField deleteCliente;
    private javax.swing.JTextField editApellidoCliente;
    private javax.swing.JTextField editDniCliente;
    private javax.swing.JTextField editDomicilioCliente;
    private javax.swing.JTextField editNombreCliente;
    private javax.swing.JTextField editTelefonoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCrearCliente;
    private javax.swing.JPanel jPanelEditarCliente;
    private javax.swing.JPanel jPanelEliminarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabAMBClientes;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
