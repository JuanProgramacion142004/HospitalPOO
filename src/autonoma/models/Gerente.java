package autonoma.models;

/**
 *
 * @author Juan David Arcila
 * @fecha 10/15/2024
 * @version 1.0.0
 */
public class Gerente {

//    ATRIBUTOS
    private String nombre;
    private String numeroDocumento;
    private String carrera;
    private int edad;
    
//    METODOS DE ACCESO

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnumeroDocumento() {
        return numeroDocumento;
    }

    public void setnumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
//    METODOS

    public Gerente(String nombre, String numeroDocumento, String carrera, int edad) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.carrera = carrera;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gerente{" + "nombre=" + nombre + ", numeroDocumento=" + numeroDocumento + ", carrera=" + carrera + ", edad=" + edad + '}';
    }
    
    
    
}
