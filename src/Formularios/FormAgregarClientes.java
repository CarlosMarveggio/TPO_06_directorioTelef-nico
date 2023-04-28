package Formularios;

/**
 *
 * @author SE31452
 */
public class FormAgregarClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormAgregarClientes
     */
    public FormAgregarClientes() {
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

        lblAgrTitulo = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnAgrNuevo = new javax.swing.JButton();
        btnAgrSalir = new javax.swing.JButton();
        lblAgrDni = new javax.swing.JLabel();
        lblAgrApellido = new javax.swing.JLabel();
        lblAgrNombre = new javax.swing.JLabel();
        lblAgrCiudad = new javax.swing.JLabel();
        lblAgrTelefono = new javax.swing.JLabel();
        txtAgrDni = new javax.swing.JTextField();
        txtAgrApellido = new javax.swing.JTextField();
        txtAgrNombre = new javax.swing.JTextField();
        txtAgrCiudad = new javax.swing.JTextField();
        txtAgrTelefono = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Cliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblAgrTitulo.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        lblAgrTitulo.setForeground(new java.awt.Color(102, 102, 255));
        lblAgrTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgrTitulo.setText("Agregar Cliente");
        lblAgrTitulo.setToolTipText("");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnAgrNuevo.setText("Nuevo");
        btnAgrNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrNuevoActionPerformed(evt);
            }
        });

        btnAgrSalir.setText("Salir");
        btnAgrSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrSalirActionPerformed(evt);
            }
        });

        lblAgrDni.setText("DNI");
        lblAgrDni.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblAgrApellido.setText("Apellido");

        lblAgrNombre.setText("Nombre");

        lblAgrCiudad.setText("Ciudad");

        lblAgrTelefono.setText("Teléfono");

        txtAgrDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgrDniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgrNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgrSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgrTelefono)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAgrDni, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAgrApellido)
                                    .addComponent(lblAgrNombre)
                                    .addComponent(lblAgrCiudad))
                                .addGap(1, 1, 1)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAgrDni)
                            .addComponent(txtAgrApellido)
                            .addComponent(txtAgrNombre)
                            .addComponent(txtAgrCiudad)
                            .addComponent(txtAgrTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAgrTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblAgrTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgrDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgrDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgrApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgrApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgrNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgrNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgrCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgrCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgrTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgrTelefono))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnAgrNuevo)
                    .addComponent(btnAgrSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgrNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgrNuevoActionPerformed

    private void btnAgrSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnAgrSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtAgrDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgrDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgrDniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrNuevo;
    private javax.swing.JButton btnAgrSalir;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel lblAgrApellido;
    private javax.swing.JLabel lblAgrCiudad;
    private javax.swing.JLabel lblAgrDni;
    private javax.swing.JLabel lblAgrNombre;
    private javax.swing.JLabel lblAgrTelefono;
    private javax.swing.JLabel lblAgrTitulo;
    private javax.swing.JTextField txtAgrApellido;
    private javax.swing.JTextField txtAgrCiudad;
    private javax.swing.JTextField txtAgrDni;
    private javax.swing.JTextField txtAgrNombre;
    private javax.swing.JTextField txtAgrTelefono;
    // End of variables declaration//GEN-END:variables
}