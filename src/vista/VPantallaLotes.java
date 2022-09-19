
package vista;

import controlador.Controlador;
import java.awt.Frame;

/**
 *
 * @author joelj
 */
public class VPantallaLotes extends javax.swing.JDialog implements ILotes{

    String estadoVentana;
    
    public VPantallaLotes(Frame parent, boolean modal) {
        super(parent,modal);
        initComponents();
    }
    
    public String getEstadoVentana(){
        return this.estadoVentana;
    }
    
    public void setEstadoVentana(String estadoVentana){
        this.estadoVentana = estadoVentana;
    }
    
    public void cargarDatos(float area, float precio, String descripcion ,String estado)
    {
        switch(String.valueOf(area))
        {
            case "500": cbxArea.setSelectedIndex(0);
                break;
            case "900":cbxArea.setSelectedIndex(1);
                break;
            case "1200":cbxArea.setSelectedIndex(2);
                break;
        }
        switch(String.valueOf(precio))
        {
            case "1900": cbxPrecio.setSelectedIndex(0);
                break;
            case "2450": cbxPrecio.setSelectedIndex(0);
                break;
            case "2800": cbxPrecio.setSelectedIndex(0);
                break;
        }
        txtDescripcion.setText(String.valueOf(descripcion));
        if("Vendido".equals(estado))
        {
            cbxEstado.setSelectedIndex(0);
        }
        else
        {
            cbxEstado.setSelectedIndex(1);
        }
        
    }
    
    public void limpiarDatos()
    {
        cbxArea.setSelectedIndex(0);
        cbxPrecio.setSelectedIndex(0);
        txtDescripcion.setText(String.valueOf(""));
        cbxEstado.setSelectedIndex(0);
    }
    
    public float getArea(){
        return Float.valueOf(String.valueOf(cbxArea.getSelectedItem()));
    }
    
    public float getPrecio(){
        return Float.valueOf(String.valueOf(cbxPrecio.getSelectedItem()));
    }
    
    public String getDescripcion(){
        return txtDescripcion.getText();
    }
    
    public String getEstado(){
        return String.valueOf(cbxEstado.getSelectedItem());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDescripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        cbxEstado = new javax.swing.JComboBox<>();
        cbxArea = new javax.swing.JComboBox<>();
        cbxPrecio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Area");

        jLabel2.setText("Precio");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Estado");

        btnAceptar.setText("Aceptar");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendido", "Alquilado" }));

        cbxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500", "800", "1200" }));

        cbxPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "2450", "2800" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(81, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcion)
                            .addComponent(cbxEstado, 0, 227, Short.MAX_VALUE)
                            .addComponent(cbxArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPrecio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar)
                            .addComponent(btnSalir))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(149, 149, 149))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxArea;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ejecutar() {
        this.setVisible(true);
    }

    @Override
    public void setControlador(Controlador control) {
        if(estadoVentana.equals("A")){
            btnAceptar.addActionListener(control);
            btnAceptar.setActionCommand(AGREGAR_LOTE);
        }
        else{                  
            btnAceptar.addActionListener(control);
            btnAceptar.setActionCommand(MODIFICAR_LOTE);
        }
    }
}
