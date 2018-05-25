package View;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {



    public Menu() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btn_VentaMenu = new javax.swing.JButton();
        btn_VendedoresMenu = new javax.swing.JButton();
        btn_InformacionMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_VentaMenu.setText("Venta");
        btn_VentaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VentaMenuMouseClicked(evt);
            }
        });
        btn_VentaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VentaMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_VentaMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        btn_VendedoresMenu.setText("Vendedores");
        btn_VendedoresMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VendedoresMenuMouseClicked(evt);
            }
        });
        getContentPane().add(btn_VendedoresMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 120, -1));

        btn_InformacionMenu.setText("Informacion");
        btn_InformacionMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_InformacionMenuMouseClicked(evt);
            }
        });
        btn_InformacionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InformacionMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_InformacionMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 120, -1));

        jButton1.setText("Productos ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento para pasar a la ventana Venta
    private void btn_VentaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VentaMenuMouseClicked
        Venta venta = new Venta();
        venta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VentaMenuMouseClicked

    //Evento para pasar a la ventana Vendedor
    private void btn_VendedoresMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendedoresMenuMouseClicked
        Vendedor vendedor = new Vendedor();
        vendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VendedoresMenuMouseClicked

    //Evento para pasar a la ventana Informacion
    private void btn_InformacionMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InformacionMenuMouseClicked
        try {
            Informacion infomacion = new Informacion();
            infomacion.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No puede acceder a esta opcion, primero se necesta una venta.", "Error", 0);
        };
    }//GEN-LAST:event_btn_InformacionMenuMouseClicked

    private void btn_InformacionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InformacionMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_InformacionMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        RegistrarProducto registrarproducto = new RegistrarProducto();
        registrarproducto.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1MouseClicked

    private void btn_VentaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VentaMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_VentaMenuActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_InformacionMenu;
    private javax.swing.JButton btn_VendedoresMenu;
    private javax.swing.JButton btn_VentaMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
