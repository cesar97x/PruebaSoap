/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.evaastudillobrauliosrv.vista;



/**
 *
 * @author Fernanda
 */
public class VentanaPrincipal extends javax.swing.JFrame {
private CrearLibro crearp;

   

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        /*
        controladorMedico = new ControladorMedico();
        controladorPaciente = new ControladorPaciente();
        controladorCitaMedica = new ControladorCitaMedica();
        controladorCitaMedicaDetallada = new ControladorCitaMedicaDetallada();
        controladorMedicina = new ControladorMedicina();
        controladorReceta = new ControladorReceta();
        controladorFactura = new ControladorFactura();
        
        
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        cambiarIdioma();
        */

    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        crearCliente = new javax.swing.JMenuItem();
        crearCliente1 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBar.setBorder(null);
        menuBar.setForeground(new java.awt.Color(153, 102, 255));

        menuCliente.setMnemonic('f');
        menuCliente.setText("CLIENTE");

        crearCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        crearCliente.setMnemonic('o');
        crearCliente.setText("CREAR");
        crearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearClienteActionPerformed(evt);
            }
        });
        menuCliente.add(crearCliente);

        crearCliente1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        crearCliente1.setMnemonic('o');
        crearCliente1.setText("LISTAR");
        crearCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCliente1ActionPerformed(evt);
            }
        });
        menuCliente.add(crearCliente1);

        menuBar.add(menuCliente);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void crearClienteActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if (crearp == null || !crearp.isVisible()) {
            crearp = new CrearLibro();
            crearp.setVisible(true);
            desktopPane.add(crearp);
            //VentanaCrearPaciente.cambiarIdioma(localizacion);
        }
       
    }                                            

    private void crearCliente1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenuItem crearCliente;
    private javax.swing.JMenuItem crearCliente1;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCliente;
    // End of variables declaration                   

}
