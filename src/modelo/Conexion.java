
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;


public class Conexion {
    private String servidor="localhost:3306";
    private String usuario="dba";
    private String clave="gestion525";
    private String basededatos="rec2parciabanegasl";
    private Connection conexion;
    private Statement consulta;

    public Conexion(){}

    public int conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://"+servidor+"/"+basededatos;
            conexion = DriverManager.getConnection(url, usuario, clave);
            consulta = conexion.createStatement();
            System.out.println("conectado a la BD");
            return 1;
        }
        catch(ClassNotFoundException e){
            System.out.println("no se encuentra el driver ");
        }
        catch(SQLException e){
            System.out.println("no se encuentra la BD");
        }
        return 0;
    }

    public String getBasededatos() {
        return basededatos;
    }

    public void setBasededatos(String basededatos) {
        this.basededatos = basededatos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Statement getConsulta() {
        return consulta;
    }

    public void setConsulta(Statement consulta) {
        this.consulta = consulta;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
