package excepciones2;

public class MiError extends RuntimeException {
    public MiError() {
        super("Ya me ha fallado");
    }
}