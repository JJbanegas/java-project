package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import modelo.Comprador;
import modelo.Conexion;
import modelo.DAOCompradores;
import modelo.DAOLotes;
import modelo.Lote;
import vista.VListadoCompradores;
import vista.VListadoLotes;
import vista.VPantallaCompradores;
import vista.VPantallaLotes;
import vista.VPrincipal;

public class Controlador implements ActionListener{

    private Conexion con;
    private VPrincipal vPrincipal;
    private VListadoLotes vListadoLotes;
    private VListadoCompradores vListadoCompradores;
    private VPantallaLotes vPantallaLotes;
    private VPantallaCompradores vPantallaCompradores;
    private DAOLotes lotes;
    private DAOCompradores compradores;
    
    public Controlador(Conexion con) {
               
        this.con = con;
        this.vPrincipal = new VPrincipal();
        this.vListadoLotes = new VListadoLotes(null,true);
        this.vListadoCompradores = new VListadoCompradores(null,true);
        
        this.vPantallaCompradores = new VPantallaCompradores(null,true);
        this.vPantallaLotes = new VPantallaLotes(null,true);
        this.lotes = new DAOLotes(this.con); 
        this.compradores = new DAOCompradores(this.con);
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand().equals(vPrincipal.MOSTRAR_LOTES)){
            vListadoLotes.setControlador(this);
            vListadoLotes.cargarDatos(lotes.leerDatos());
            vListadoLotes.ejecutar();
        }
        
        if(e.getActionCommand().equals(vListadoLotes.MOSTRAR_MODIFICAR))
        {
            vPantallaLotes.setEstadoVentana("M");
            Lote soc = new Lote();
            soc = lotes.GetLoteById(vListadoLotes.getId());
            vPantallaLotes.cargarDatos(soc.getArea(),soc.getPrecio(),soc.getDescripcion(),soc.getEstado());
            vPantallaLotes.setControlador(this);
            vPantallaLotes.ejecutar();
            vListadoLotes.cargarDatos(lotes.leerDatos());
           
        }
        
        if(e.getActionCommand().equals(vListadoLotes.MOSTRAR_AGREGAR))
        {
            vPantallaLotes.setEstadoVentana("A");
            vPantallaLotes.limpiarDatos();
            vPantallaLotes.setControlador(this);
            vPantallaLotes.ejecutar();
            vListadoLotes.cargarDatos(lotes.leerDatos());
        }
         
        if(e.getActionCommand().equals(vListadoLotes.BORRAR_LOTE))
        {
            lotes.Eliminar(vListadoLotes.getId());
            vListadoLotes.cargarDatos(lotes.leerDatos());
        }

        if(e.getActionCommand().equals(vPantallaLotes.AGREGAR_LOTE)){
            lotes.agregar(new Lote(0, vPantallaLotes.getArea(),vPantallaLotes.getPrecio(),vPantallaLotes.getDescripcion(),vPantallaLotes.getEstado()));
        }
        
        if(e.getActionCommand().equals(vPantallaLotes.MODIFICAR_LOTE)){
            lotes.Modificar(new Lote(vListadoLotes.getId() ,vPantallaLotes.getArea(),vPantallaLotes.getPrecio(),vPantallaLotes.getDescripcion(),vPantallaLotes.getEstado()));
        }
        
        if(e.getActionCommand().equals(vPrincipal.MOSTRAR_COMPRADORES)){
            vListadoCompradores.setControlador(this);
            vListadoCompradores.cargarDatos(compradores.leerDatos());
            vListadoCompradores.ejecutar();
        }
        
        if(e.getActionCommand().equals(vListadoCompradores.MOSTRAR_MODIFICAR_COMPRADOR))
        {
            vPantallaCompradores.setEstadoVentana("M");
            Lote soc = new Lote();
            soc = lotes.GetLoteById(vListadoCompradores.getId());
            //vPantallaCompradores.cargarDatos(soc.getArea(),soc.getPrecio(),soc.getDescripcion(),soc.getEstado());
            vPantallaCompradores.setControlador(this);
            vPantallaCompradores.ejecutar();
            vListadoCompradores.cargarDatos(compradores.leerDatos());
           
        }
        
        if(e.getActionCommand().equals(VListadoCompradores.MOSTRAR_AGREGAR_COMPRADOR))
        {
            vPantallaLotes.setEstadoVentana("A");
            vPantallaLotes.limpiarDatos();
            vPantallaLotes.setControlador(this);
            vPantallaLotes.ejecutar();
            vListadoLotes.cargarDatos(lotes.leerDatos());
        }
         
        if(e.getActionCommand().equals(vListadoLotes.BORRAR_LOTE))
        {
            lotes.Eliminar(vListadoLotes.getId());
            vListadoLotes.cargarDatos(lotes.leerDatos());
        }

        if(e.getActionCommand().equals(vPantallaLotes.AGREGAR_LOTE)){
            lotes.agregar(new Lote(0, vPantallaLotes.getArea(),vPantallaLotes.getPrecio(),vPantallaLotes.getDescripcion(),vPantallaLotes.getEstado()));
        }
        
        if(e.getActionCommand().equals(vPantallaLotes.MODIFICAR_LOTE)){
            lotes.Modificar(new Lote(vListadoLotes.getId() ,vPantallaLotes.getArea(),vPantallaLotes.getPrecio(),vPantallaLotes.getDescripcion(),vPantallaLotes.getEstado()));
        }
        
        
    }
    
    public void ejecutar(){
        vPrincipal.setControlador(this);
        vPrincipal.ejecutar();
    }   
}
