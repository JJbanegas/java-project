package vista;

/**
 *
 * @author joelj
 */
public interface IPantalla {
    
    public static String MOSTRAR_LOTES = "mostrar lotes";
    public static String MOSTRAR_COMPRADORES = "mostrar compradores";
    public static String MOSTRAR_CUOTAS = "mostrar cuotas";

    
    public void ejecutar();
    public void setControlador(controlador.Controlador control);
}
