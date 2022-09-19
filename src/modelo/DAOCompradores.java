
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author joelj
 */
public class DAOCompradores {
    
    private Comprador comprador;
    private Conexion con;

    public DAOCompradores(Conexion con){
        this.con=con;
    }
    public void agregar(Comprador s){
        try{
            String sql = "INSERT INTO lote SET area='"+s.getDni()+"', precio='"+s.getNobre()+"', descripcion='"+s.getLote().getId()+"'";                    
            con.getConsulta().execute(sql);
            System.out.println("se guardo los datos correctamente");
        }
        catch(SQLException e){
            System.out.println("error al agregar "+e);
        }
    }
    
    public ArrayList leerDatos(){
        try{
            String sql="SELECT comprador.id, comprador.dni, comprador.nombre, comprador.lote_id, lote.area, lote.precio, lote.descripcion, lote.estado"
                    + "LEFT JOIN lote ON lote.id = comprador.id_lote"
                    + "FROM comprador";
            ResultSet res = con.getConsulta().executeQuery(sql);
            ArrayList lista = new ArrayList();
            while(res.next()){
                Object[] fila = new Object[5];
                fila[0] = res.getInt("id");
                fila[1] = res.getInt("dni");
                fila[2] = res.getInt("nombre");
                fila[3] = res.getInt("lote_id");
                fila[4] = res.getString("area");
                fila[5] = res.getString("precio");
                fila[6] = res.getString("descripcion");
                fila[7] = res.getString("estado");

                lista.add(fila);
            }
            return lista;
        }
        catch(SQLException e){
            System.out.println("error al leer la BD"+e);
        }
        return null;
    }
    
    public void Modificar(Comprador s){
        try{
            String sql = "UPDATE comprador SET dni='"+s.getDni()+"', precio='"+s.getNobre()+"', id_lote = '"+s.getLote().getId()+"' WHERE lote.id = '"+s.getId()+"'";
            con.getConsulta().execute(sql);          
            
            System.out.println("se guardo los datos correctamente");
        }
        catch(SQLException e){
            System.out.println("error al modificar "+e);
        }
    }
    
    /*public Lote GetCompradorById(int id)
    {
        Lote retorno = new Lote();
        try{
            String sql = "SELECT "
                    + "comprador.id, "
                    + "comprador.dni, "
                    + "comprador.nombre,"
                    + "comprador.id_lote,"
                    + "FROM comprador "
                    + "WHERE comprador.id = '"+id+"'";
            ResultSet resc = con.getConsulta().executeQuery(sql);
            while(resc.next())
            {
                retorno = new Comprador(
                    resc.getInt("id"),
                    resc.getString("dni"),                    
                    resc.getInt("id_lote"),                      
                    resc.getString("nombre")
                );
            }
            return retorno;
        }
        catch(SQLException e){
            System.out.println("error al buscar lote "+e);
            return null;
        }
    }*/
    
    public void Eliminar(int id)
    {
        try{
            String sql = "DELETE FROM comprador WHERE comprador.id = '"+id+"'";
            con.getConsulta().execute(sql);
                        
            System.out.println("el lote se eliminó correctamente");
            
        }
        catch(SQLException e){
            System.out.println("error al borrar "+e);
        }
    }
}
