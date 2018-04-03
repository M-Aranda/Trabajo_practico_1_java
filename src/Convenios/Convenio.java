
package Convenios;

public class Convenio {
    
    private String nombre;
    private int porcentaje;
    
    public Convenio(){}

    public Convenio(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return nombre+"-->"+porcentaje+"%";
    }
    
    
    
    
    
    
}
