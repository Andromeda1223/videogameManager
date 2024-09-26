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
//Arrays consolas
        List<Consolas> consolasTest1 = Arrays.asList(Consolas.PS5, Consolas.SWITCH);

//Inicializar juegos
        videojuegoFisico test1 = new videojuegoFisico("Test1", consolasTest1, 60, generosTest1);
        videojuegoDigital test2 = new videojuegoDigital("Test2", consolasTest1, 60, generosTest1);

//Inicializar consolas

        PlayStation testConsola = new PlayStation();
        Xbox testConsola2 = new Xbox();

//Pruebas y tests

        testConsola.installGame(test1);
        //testConsola.escribirCSV();
        testConsola.installGame(test2);
        testConsola.escribirCSV();
        System.out.println(testConsola.juegosInstaladosPs5.toString());


        //Prueba csv



    }
}




