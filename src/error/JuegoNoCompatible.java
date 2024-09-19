package error;

public class JuegoNoCompatible extends RuntimeException {
    public JuegoNoCompatible(String message) {
        super(message);
    }

    public JuegoNoCompatible() {

    }
}
