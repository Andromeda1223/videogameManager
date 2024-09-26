import java.util.ArrayList;
import java.util.List;

public class videojuegoFisico extends videojuego {
private double gastos = 5;

    public videojuegoFisico(String titulo, List<Consolas> consola, double precio, List<Generos> genero) {
        super(titulo, consola, precio, genero);
        calcularPrecio();
    }


    @Override
    public double calcularPrecio() {
        return SetPrecio(precio+gastos);
    }
}
