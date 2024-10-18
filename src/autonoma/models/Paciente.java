package autonoma.models;

import java.util.ArrayList;

/**
 *
 * @author Juan David Arcila
 * @fecha 10/16/2024
 * @version 1.0.0
 */
public class Paciente extends Persona {

// ATRIBUTOS
    private String correoElectronico;
    private String telefono;
    private String estado; // Saludable o Crítico
    private ArrayList<Enfermedad> enfermedades;

// METODOS DE ACCESO
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

// METODOS
    public Paciente(String nombre, String numeroDocumento, int edad, String correoElectronico, String telefono) {
        super(nombre, numeroDocumento, edad);
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.estado = "Saludable";
        this.enfermedades = new ArrayList<>();
    }

    public void curarEnfermedad(Medicamento medicamento, Enfermedad enfermedad) {
        if (enfermedades.contains(enfermedad)) {
            enfermedades.remove(enfermedad);
            System.out.println("La enfermedad " + enfermedad.getNombre() + " ha sido curada con " + medicamento.getNombre());
            // Aquí se puede agregar el medicamento a una lista de medicamentos tomados por el paciente
        } else {
            System.out.println("El paciente no tiene la enfermedad " + enfermedad.getNombre() + ".");
        }

        // Actualizar estado del paciente
        if (enfermedades.isEmpty()) {
            estado = "Saludable";
        } else {
            estado = "Crítico";
        }
    }

// METODOS ABSTRACTOS
    @Override
    public String obtenerTipoPersona() {
        return "PACIENTE";
    }
}
