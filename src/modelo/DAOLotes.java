
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author joelj
 */
public class DAOLotes {
    
    private Lote lote;
    private Conexion con;

    public DAOLotes(Conexion con){
        this.con=con;
    }
    public void agregar(Lote s){
        try{
            String sql = "INSERT INTO lote SET area='"+s.getArea()+"', precio='"+s.getPrecio()+"', descripcion='"+s.getDescripcion()+"', estado = '"+s.getEstado()+"'";                    
            con.getConsulta().execute(sql);
            System.out.println("se guardo los datos correctamente");
        }
        catch(SQLException e){
            System.out.println("error al agregar "+e);
        }
    }
    
    public ArrayList leerDatos(){
        try{
            String sql="SELECT lote.id, lote.area, lote.precio, lote.descripcion, lote.estado FROM lote";
            ResultSet res = con.getConsulta().executeQuery(sql);
            ArrayList lista = new ArrayList();
            while(res.next()){
                Object[] fila = new Object[5];
                fila[0] = res.getInt("id");
                fila[1] = res.getString("area");
                fila[2] = res.getString("precio");
                fila[3] = res.getString("descripcion");
                fila[4] = res.getString("estado");

                lista.add(fila);
            }
            return lista;
        }
        catch(SQLException e){
            System.out.println("error al leer la BD"+e);
        }
        return null;
    }
    
    public void Modificar(Lote s){
        try{
            String sql = "UPDATE lote SET area='"+s.getArea()+"', precio='"+s.getPrecio()+"', descripcion='"+s.getDescripcion()+"', estado = '"+s.getEstado()+"' WHERE lote.id = '"+s.getId()+"'";
            con.getConsulta().execute(sql);          
            
            System.out.println("se guardo los datos correctamente");
        }
        catch(SQLException e){
            System.out.println("error al modificar "+e);
        }
    }
    
    public Lote GetLoteById(int id)
    {
        Lote retorno = new Lote();
        try{
            String sql = "SELECT "
                    + "lote.id, "
                    + "lote.area, "
                    + "lote.precio, "
                    + "lote.descripcion, "
                    + "lote.estado "
                    + "FROM lote "
                    + "WHERE lote.id = '"+id+"'";
            ResultSet resc = con.getConsulta().executeQuery(sql);
            while(resc.next())
            {
                retorno = new Lote(
                    resc.getInt("id"),
                    resc.getFloat("area"),
                    resc.getFloat("precio"),
                    resc.getString("descripcion"),
                    resc.getString("estado")
                );
            }
            return retorno;
        }
        catch(SQLException e){
            System.out.println("error al buscar lote "+e);
            return null;
        }
    }
    
    public void Eliminar(int id)
    {
        try{
            String sql = "DELETE FROM lote WHERE lote.id = '"+id+"'";
            con.getConsulta().execute(sql);
                        
            System.out.println("el lote se eliminó correctamente");
            
        }
        catch(SQLException e){
            System.out.println("error al borrar "+e);
        }
    }
}
