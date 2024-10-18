package autonoma.excepciones;

public class EnfermedadNoExisteException extends Exception {
    public EnfermedadNoExisteException(String mensaje) {
        super(mensaje);
    }
}