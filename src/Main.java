//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    videojuegoFisico test1 = new videojuegoFisico("Test1","PS5",60,Generos.AVENTURA);
    System.out.println(test1.toString());
    System.out.println("Precio juego 1 " + test1.calcularPrecio());
    videojuegoDigital test2 = new videojuegoDigital("Test2","Xbox",60,Generos.AVENTURA);
    System.out.println( test2.toString());
        System.out.println("Precio juego 2 "+ test2.calcularPrecio());

    }

}