/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author joelj
 */
public class Comprador {
    int id;
    String dni;
    String nombre;
    int id_lote;
    Lote lote;
    
    public Comprador(){
        
    }
    
    public Comprador(int id, String dni, String nombre, Lote lote){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.lote = lote;
    }

    public Comprador(int id, String dni, int id_lote ,String nombre){
        this.id = id;;
        this.dni = dni;
        this.nombre = nombre;
        this.id_lote = id_lote;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setIdLote(int id_lote)
    {
        this.id_lote = id_lote;
    }
    
    public int getIdLote()
    {
        return this.id_lote;
    }
    
    public void setLote(Lote lote){
        this.lote = lote;
    }

    public String getDni(){
        return this.dni;
    }
    
    public String getNobre(){
        return this.nombre;
    }
    
    public Lote getLote(){
        return this.lote;
    }
    
    public int getId(){
        return this.id;
    }
}
