import java.util.ArrayList;

public class videojuegoDigital extends videojuego {
 private double descuento = 5;

    public videojuegoDigital(String titulo, String consola, double precio, Generos genero) {
        super(titulo, consola, precio, genero);
    }


    @Override
    public double calcularPrecio() {
        return precio - descuento;
    }
}
