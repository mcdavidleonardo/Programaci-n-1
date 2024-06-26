package presentacion;

public class MenuPrincipalUI extends javax.swing.JFrame {

    private LoginUI login;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipalUI() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuLogin = new javax.swing.JMenu();
        mnuIngresar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenu();
        mnuPlatos = new javax.swing.JMenu();
        mnuPedidos = new javax.swing.JMenu();
        mnuMesas = new javax.swing.JMenu();
        mnuFacturacion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Comida Rápida");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        mnuLogin.setText("Login");

        mnuIngresar.setText("Ingresar");
        mnuIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIngresarActionPerformed(evt);
            }
        });
        mnuLogin.add(mnuIngresar);

        mnuSalir.setText("Salir");
        mnuLogin.add(mnuSalir);

        jMenuBar1.add(mnuLogin);

        mnuUsuarios.setText("Usuarios");
        mnuUsuarios.setEnabled(false);
        jMenuBar1.add(mnuUsuarios);

        mnuPlatos.setText("Platos");
        mnuPlatos.setEnabled(false);
        jMenuBar1.add(mnuPlatos);

        mnuPedidos.setText("Pedidos");
        mnuPedidos.setEnabled(false);
        jMenuBar1.add(mnuPedidos);

        mnuMesas.setText("Mesas");
        mnuMesas.setEnabled(false);
        jMenuBar1.add(mnuMesas);

        mnuFacturacion.setText("Facturación");
        mnuFacturacion.setEnabled(false);
        jMenuBar1.add(mnuFacturacion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIngresarActionPerformed
        // TODO add your handling code here:
        if(login == null || login.isClosed()){
            login = new LoginUI();
            escritorio.add(login);
            login.setVisible(true);
        }else{
            try{
                login.setSelected(true);
            }catch(java.beans.PropertyVetoException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_mnuIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuFacturacion;
    private javax.swing.JMenuItem mnuIngresar;
    private javax.swing.JMenu mnuLogin;
    private javax.swing.JMenu mnuMesas;
    private javax.swing.JMenu mnuPedidos;
    private javax.swing.JMenu mnuPlatos;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenu mnuUsuarios;
    // End of variables declaration//GEN-END:variables
}
