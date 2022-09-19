
package parcial_2k4_banegasjoel;

import controlador.Controlador;
import modelo.Conexion;

/**
 *
 * @author joelj
 */
public class Rec2ParcialBanegas {

    public static void main(String[] args) {
        Conexion con = new Conexion();
        if(con.conectar()>0){
            Controlador control = new Controlador(con);
                control.ejecutar();
        }
    }
    
}
