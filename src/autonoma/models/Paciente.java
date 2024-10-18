  package autonoma.models;

import java.util.ArrayList;
import java.util.List;
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
    private List<Medicamento> medicinas;

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

    public void curarEnfermedad(String nombreEnfermedad, Medicamento medicamento) throws EnfermedadNoExistenteException, MedicamentoRecetadoException {
        Enfermedad enfermedadCurada = null;

        // Buscar la enfermedad en la lista
        for (Enfermedad e : enfermedades) {
            if (e.getNombre().equalsIgnoreCase(nombreEnfermedad)) {
                enfermedadCurada = e;
                break;
            }
        }
     // si la enfermedad no existe
      if (enfermedadCurada == null) {
            throw new EnfermedadNoExistenteException("El paciente no tiene registrada la enfermedad: " + nombreEnfermedad);
        }
     // se verifica si el medicamento ya ha sido recetado
      for (Medicamento med : medicinas) {
            if (med.getNombre().equalsIgnoreCase(medicamento.getNombre())) {
                throw new MedicamentoRecetadoException("El medicamento " + medicamento.getNombre() + " ya fue recetado.");
            }
        }
       // Curar la enfermedad
        enfermedades.remove(enfermedadCurada);
        medicinas.add(medicamento);
        System.out.println("Enfermedad " + nombreEnfermedad + " curada con el medicamento " + medicamento.getNombre());

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
