
package modelo;

/**
 *
 * @author joelj
 */
public class Lote {
    int id;
    float area;
    float precio;
    String descripcion;
    String estado;
    
    public Lote(){
        
    }
    
    public Lote(int id, float area, float precio, String descripcion, String estado){
        this.id = id;
        this.area = area;
        this.precio = precio;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    
    public void setArea(float area){
        this.area = area;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public float getArea(){
        return this.area;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public int getId(){
        return this.id;
    }
}
