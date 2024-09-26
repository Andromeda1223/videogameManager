import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    //Constantes
    public static final String SEPARATOR = ";";
    public static final String QUOTE = "\"";

    public static void main(String[] args) throws IOException {


        //Arrays generos
        List<Generos> generosTest1 = Arrays.asList(Generos.FPS, Generos.PLATAFORMA);
        List<Generos> generosTest2 = Arrays.asList(Generos.FPS, Generos.AVENTURA);
        List<Generos> generosTest3 = Arrays.asList(Generos.TERROR, Generos.AVENTURA);
        //Arrays consolas
        List<Consolas> consolasTest1 = Arrays.asList(Consolas.PS5, Consolas.SWITCH);
        List<Consolas> consolasTest2 = Arrays.asList(Consolas.PS5);
        List<Consolas> consolasTest3 = Arrays.asList(Consolas.XBOX);

        //Inicializar juegos
        videojuegoFisico test1 = new videojuegoFisico("The last of us", consolasTest1, 60, generosTest1);
        videojuegoDigital test2 = new videojuegoDigital("De last sofas", consolasTest2, 60, generosTest2);
        videojuegoFisico test3 = new videojuegoFisico("Test3", consolasTest3, 60, generosTest3);

        //Inicializar consolas

        PlayStation testConsola = new PlayStation();
        Xbox testConsola2 = new Xbox();

        //Pruebas y tests

        //testConsola.escribirCSV();
        testConsola.installGame(test1);
        testConsola.installGame(test2);


        testConsola.escribirCSV();

        testConsola.leerCSV();



        //Prueba csv


    }
}




