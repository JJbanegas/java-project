
package vista;

/**
 *
 * @author joelj
 */
public interface ILotes {
    public static String AGREGAR_LOTE = "agregar datos de lotes";
    public static String MODIFICAR_LOTE = "modificar lotes";
    public static String BORRAR_LOTE = "borrar lotes";
    public static String MOSTRAR_MODIFICAR = "mostrar vista lotes modificar";
    public static String MOSTRAR_AGREGAR = "mostrar vista lotes agregar";
        
    public void ejecutar();
    public void setControlador(controlador.Controlador control);
}
