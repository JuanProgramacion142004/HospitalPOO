package autonoma.models;

import autonoma.excepciones.PresupuestoNegativoException;
import autonoma.models.*;
import java.time.LocalDate;

/**
 *
 * @author Juan David Arcila
 * @fecha 10/15/2024
 * @version 1.1.0
 */
public class Hospital {

//    ATRIBUTOS
    private String nombre;
    private String direccion;
    private String telefono;
    private String logo;
    private String estado; // Activo o En quiebra
    private LocalDate fechaFundacion;
    private double presupuesto;
    private double metaVentasAnual;
    private Gerente gerente;
    
//    METODOS DE ACCESO

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getMetaVentasAnual() {
        return metaVentasAnual;
    }

    public void setMetaVentasAnual(double metaVentasAnual) {
        this.metaVentasAnual = metaVentasAnual;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    
    
//    METODOS 

    public Hospital(String nombre, String direccion, String telefono, String logo, String estado, LocalDate fechaFundacion, double presupuesto, double metaVentasAnual) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.estado = "ACTIVO";
        this.fechaFundacion = fechaFundacion;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
    }
    
    public void registrarPatrocinio(double monto) {
        this.presupuesto += monto;
        if(this.presupuesto >= 0){
            this.estado = "ACTIVO";
            System.out.println("El hospital ha subsanado su deuda y ahora esta activo");
        }
    } 
        public void descontarPresupuesto(double monto) throws PresupuestoNegativoException {
        presupuesto -= monto;
        if (presupuesto < 0) {
            throw new PresupuestoNegativoException("El hospital ha entrado en quiebra. Presupuesto negativo: " + presupuesto);
        }
    }
            // Verificar si las ventas superan la meta anual
        if (ventasAnuales > metaVentasAnual) {
            // Lanza la excepción si se supera la meta
            throw new FestividadException("¡Se ha superado la meta anual! Evento de festividad activado.");
        }
    }

    public void aumentarPresupuestoPorFestividad() {
        // Aumentar el presupuesto en un 10%
        presupuesto += presupuesto * 0.10;
        System.out.println("Presupuesto incrementado en un 10% por la celebración.");
    }
    

}
