import java.util.ArrayList;
import java.util.Objects;

public abstract class videojuego {
    public String titulo;
    public String consola;
    public double precio;
    public Generos genero;

public void SetTitulo(String titulo) {
    this.titulo = titulo;
}
public void SetConsola(String consola) {
    this.consola = consola;
}
public void SetPrecio(double precio) {
    this.precio = precio;
}
public void SetGeneros(Generos generos) {
    this.genero = genero;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        videojuego that = (videojuego) o;
        return precio == that.precio && Objects.equals(titulo, that.titulo) && Objects.equals(consola, that.consola);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, consola, precio);
    }

    public abstract double calcularPrecio();
public videojuego(String titulo, String consola, double precio, Generos genero) {
    this.titulo = titulo;
    this.consola = consola;
    this.precio = precio;
    this.genero = genero;

}

    @Override
    public String toString() {
        return "videojuego "+"\n" +
                "------" + "\n"+
                " titulo= " + titulo + "\n" +
                " consola= " + consola +"\n"+
                " precio= " + precio +"\n"+
                " genero= " + genero
                 ;
    }
}
