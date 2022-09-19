
package vista;

import controlador.Controlador;

/**
 *
 * @author joelj
 */
public class VPrincipal extends javax.swing.JFrame implements IPantalla{


    public VPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        itmProductos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu4.setText("Lotes");

        itmProductos.setText("Listado Lotes");
        jMenu4.add(itmProductos);

        jMenuBar2.add(jMenu4);

        jMenu1.setText("Compradores");

        jMenuItem1.setText("Listado Compradores");
        jMenu1.add(jMenuItem1);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmProductos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables


    @Override
    public void ejecutar() {
        this.setVisible(true);
    }

    @Override
    public void setControlador(Controlador control) {
        itmProductos.addActionListener(control);
        itmProductos.setActionCommand(MOSTRAR_LOTES);
        
        jMenuItem1.addActionListener(control);
        jMenuItem1.setActionCommand(MOSTRAR_COMPRADORES);
    }
}
