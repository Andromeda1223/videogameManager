import java.util.ArrayList;
import java.util.List;

public class videojuegoDigital extends videojuego {
 private double descuento = 5;

    public videojuegoDigital(String titulo, List<Consolas> consola, double precio, List<Generos> genero) {
        super(titulo, consola, precio, genero);
    }


    @Override
    public double calcularPrecio() {
        return precio - descuento;
    }
}
