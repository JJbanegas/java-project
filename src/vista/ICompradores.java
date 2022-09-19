/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vista;

/**
 *
 * @author joelj
 */
public interface ICompradores {
    public static String AGREGAR_COMPRADOR = "agregar datos de COMPRADOR";
    public static String MODIFICAR_COMPRADOR = "modificar COMPRADOR";
    public static String BORRAR_COMPRADOR = "borrar COMPRADOR";
    public static String MOSTRAR_MODIFICAR_COMPRADOR = "mostrar vista COMPRADOR modificar";
    public static String MOSTRAR_AGREGAR_COMPRADOR = "mostrar vista COMPRADOR agregar";
        
    public void ejecutar();
    public void setControlador(controlador.Controlador control);
}
