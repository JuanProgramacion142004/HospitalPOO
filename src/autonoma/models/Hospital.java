package autonoma.models;

import autonoma.excepciones.FestividadException;
import autonoma.excepciones.PresupuestoNegativoException;
import java.time.LocalDate;

public class Hospital {

    // ATRIBUTOS
    private String nombre;
    private String direccion;
    private String telefono;
    private String logo;
    private String estado; // Activo o En quiebra
    private LocalDate fechaFundacion;
    private double presupuesto;
    private double metaVentasAnual;
    private double ventasAnuales;
    private Gerente gerente;

    // CONSTRUCTOR
    public Hospital(String nombre, String direccion, String telefono, String logo, String estado, LocalDate fechaFundacion, double presupuesto, double metaVentasAnual) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.estado = "ACTIVO";
        this.fechaFundacion = fechaFundacion;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.ventasAnuales = 0; // Inicializamos las ventas anuales en 0
    }

    
    // MÉTODOS DE ACCESO

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


    // MÉTODOS

    public void registrarPatrocinio(double monto) {
        this.presupuesto += monto;
        if (this.presupuesto >= 0) {
            this.estado = "ACTIVO";
            System.out.println("El hospital ha subsanado su deuda y ahora está activo");
        }
    }

    public void descontarPresupuesto(double monto) throws PresupuestoNegativoException {
        presupuesto -= monto;
        if (presupuesto < 0) {
            throw new PresupuestoNegativoException("El hospital ha entrado en quiebra. Presupuesto negativo: " + presupuesto);
        }
    }

    // Método para registrar ventas
    public void registrarVenta(double monto) throws FestividadException {
        ventasAnuales += monto;

        // Verificar si las ventas superan la meta de ventas anual
        if (ventasAnuales > metaVentasAnual) {
            throw new FestividadException("¡Se ha superado la meta anual! Evento de festividad activado.");
        }
    }

    // Método para aumentar el presupuesto en un 10% debido a la festividad
    public void aumentarPresupuestoPorFestividad() {
        presupuesto += presupuesto * 0.10;
        System.out.println("El presupuesto ha sido incrementado en un 10% debido a la celebración.");
    }

    // Obtener las ventas anuales
    public double getVentasAnuales() {
        return ventasAnuales;
    }

    // Obtener la meta de ventas anual
    public double getMetaVentasAnual() {
        return metaVentasAnual;
    }
}


