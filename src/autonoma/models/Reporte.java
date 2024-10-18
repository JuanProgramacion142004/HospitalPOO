package autonoma.models;

/**
 *
 * @author Juan David Arcila
 * @fecha 10/16/2024
 * @version 1.0.0
 */
public class Reporte {

    // ATRIBUTOS
    private String tipoReporte; // Nomina, Ventas, Pacientes, etc.
    private String contenido;

    // METODOS DE ACCESO
    public String getTipoReporte() {
        return tipoReporte;
    }

    public String getContenido() {
        return contenido;
    }

    // CONSTRUCTOR
    public Reporte(String tipoReporte, String contenido) {
        this.tipoReporte = tipoReporte;
        this.contenido = contenido;
    }

    // METODOS
    public void generarReporte() {
        System.out.println("Generando reporte de: " + tipoReporte);
        System.out.println("Contenido: " + contenido);
    }
}
