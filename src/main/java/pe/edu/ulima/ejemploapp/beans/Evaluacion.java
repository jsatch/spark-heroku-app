
package pe.edu.ulima.ejemploapp.beans;

public class Evaluacion {
    private String nombre;
    private String ciclo;

    public Evaluacion() {
    }

    public Evaluacion(String nombre, String ciclo) {
        this.nombre = nombre;
        this.ciclo = ciclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
    
    
}
