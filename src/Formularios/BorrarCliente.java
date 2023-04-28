package Formularios;

import tel.Cliente;

/**
 *
 * @author SE31452
 */
public class BorrarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form BorrarCliente
     */
    public BorrarCliente() {
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

        lblBorrarClienteTitulo = new javax.swing.JLabel();
        lblBorrarTelefono = new javax.swing.JLabel();
        lblBorrarDni = new javax.swing.JLabel();
        lblBorrarApellido = new javax.swing.JLabel();
        lblBorrarNombre = new javax.swing.JLabel();
        lblBorrarCiudad = new javax.swing.JLabel();
        lblBorrarDirecion = new javax.swing.JLabel();
        txtBorrarTelefono = new javax.swing.JTextField();
        txtBorrarDni = new javax.swing.JTextField();
        txtBorrarApellido = new javax.swing.JTextField();
        txtBorrarNombre = new javax.swing.JTextField();
        txtBorrarCiudad = new javax.swing.JTextField();
        txtBorrarDireccion = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnBorrarSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        lblBorrarClienteTitulo.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        lblBorrarClienteTitulo.setForeground(new java.awt.Color(102, 102, 255));
        lblBorrarClienteTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrarClienteTitulo.setText("Borrar Cliente");
        lblBorrarClienteTitulo.setToolTipText("");

        lblBorrarTelefono.setText("Teléfono");

        lblBorrarDni.setText("DNI");

        lblBorrarApellido.setText("Apellido");

        lblBorrarNombre.setText("Nombre");

        lblBorrarCiudad.setText("Ciudad");

        lblBorrarDirecion.setText("Dirección");

        txtBorrarDni.setEditable(false);

        txtBorrarApellido.setEditable(false);

        txtBorrarNombre.setEditable(false);

        txtBorrarCiudad.setEditable(false);

        txtBorrarDireccion.setEditable(false);

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnBorrarSalir.setText("Salir");
        btnBorrarSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblBorrarClienteTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBorrarTelefono)
                            .addComponent(lblBorrarDni)
                            .addComponent(lblBorrarApellido)
                            .addComponent(lblBorrarNombre)
                            .addComponent(lblBorrarCiudad)
                            .addComponent(lblBorrarDirecion))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBorrarTelefono)
                            .addComponent(txtBorrarDni)
                            .addComponent(txtBorrarApellido)
                            .addComponent(txtBorrarNombre)
                            .addComponent(txtBorrarCiudad)
                            .addComponent(txtBorrarDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnBorrarSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBorrarClienteTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBorrarTelefono)
                    .addComponent(txtBorrarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBorrarDni)
                    .addComponent(txtBorrarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBorrarApellido)
                    .addComponent(txtBorrarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBorrarNombre)
                    .addComponent(txtBorrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBorrarCiudad)
                    .addComponent(txtBorrarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBorrarDirecion)
                    .addComponent(txtBorrarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(btnBorrarSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnBorrarSalirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        String telefono = txtBorrarTelefono.getText();
        Cliente buscado = principal.miDirectorio.buscarCliente(telefono);
        txtBorrarApellido.setText(buscado.getApellido());
        txtBorrarCiudad.setText(buscado.getCiudad());
        txtBorrarDireccion.setText(buscado.getDireccion());
        txtBorrarDni.setText(buscado.getDni()+"");
        txtBorrarNombre.setText(buscado.getNombre());
        principal.miDirectorio.borrarCliente(telefono);
        limpiar();
    }//GEN-LAST:event_btnBorrarActionPerformed
    public void limpiar(){
    
        txtBorrarApellido.setText("");
        txtBorrarCiudad.setText("");
        txtBorrarDireccion.setText("");
        txtBorrarDni.setText("");
        txtBorrarNombre.setText("");
        txtBorrarTelefono.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarSalir;
    private javax.swing.JLabel lblBorrarApellido;
    private javax.swing.JLabel lblBorrarCiudad;
    private javax.swing.JLabel lblBorrarClienteTitulo;
    private javax.swing.JLabel lblBorrarDirecion;
    private javax.swing.JLabel lblBorrarDni;
    private javax.swing.JLabel lblBorrarNombre;
    private javax.swing.JLabel lblBorrarTelefono;
    private javax.swing.JTextField txtBorrarApellido;
    private javax.swing.JTextField txtBorrarCiudad;
    private javax.swing.JTextField txtBorrarDireccion;
    private javax.swing.JTextField txtBorrarDni;
    private javax.swing.JTextField txtBorrarNombre;
    private javax.swing.JTextField txtBorrarTelefono;
    // End of variables declaration//GEN-END:variables
}
