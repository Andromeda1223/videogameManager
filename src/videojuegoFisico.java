import java.util.ArrayList;

public class videojuegoFisico extends videojuego {
private double gastos = 5;

    public videojuegoFisico(String titulo, String consola, double precio, Generos genero) {
        super(titulo, consola, precio, genero);
    }


    @Override
    public double calcularPrecio() {
        return precio + gastos;
    }
}
