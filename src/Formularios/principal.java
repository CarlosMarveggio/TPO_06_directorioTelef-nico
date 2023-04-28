package Formularios;

/**
 *
 * @author SE31452
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuDirectorio = new javax.swing.JMenu();
        mnuEscritorioAgregar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();
        mnuEscritorioSalir = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Directorio telefónico");
        setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        mnuDirectorio.setText("Directorio");
        mnuDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDirectorioActionPerformed(evt);
            }
        });

        mnuEscritorioAgregar.setText("Agregar");
        mnuEscritorioAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEscritorioAgregarActionPerformed(evt);
            }
        });
        mnuDirectorio.add(mnuEscritorioAgregar);

        jMenuBar1.add(mnuDirectorio);

        mnuSalir.setText("Salir");

        mnuEscritorioSalir.setText("Salir del sistema");
        mnuEscritorioSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEscritorioSalirActionPerformed(evt);
            }
        });
        mnuSalir.add(mnuEscritorioSalir);

        jMenuBar1.add(mnuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDirectorioActionPerformed
        // TODO add your handling code here:
                
    }//GEN-LAST:event_mnuDirectorioActionPerformed

    private void mnuEscritorioAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEscritorioAgregarActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormAgregarClientes agrCl = new FormAgregarClientes();
        agrCl.setVisible(true);
        escritorio.add(agrCl);
        escritorio.moveToFront(agrCl);
    }//GEN-LAST:event_mnuEscritorioAgregarActionPerformed

    private void mnuEscritorioSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEscritorioSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuEscritorioSalirActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu mnuDirectorio;
    private javax.swing.JMenuItem mnuEscritorioAgregar;
    private javax.swing.JMenuItem mnuEscritorioSalir;
    private javax.swing.JMenu mnuSalir;
    // End of variables declaration//GEN-END:variables
}
