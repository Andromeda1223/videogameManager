import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//Arrays generos
        List<Generos> generosTest1 = Arrays.asList(Generos.FPS, Generos.PLATAFORMA);
//Arrays consolas
        List<Consolas> consolasTest1 = Arrays.asList(Consolas.PS5, Consolas.SWITCH);

//Inicializar juegos
        videojuegoFisico test1 = new videojuegoFisico("Test1", consolasTest1, 60, generosTest1);


//Inicializar consolas

        PlayStation testConsola = new PlayStation();
        Xbox testConsola2 = new Xbox();

//Pruebas y tests
        System.out.println(test1);


    }

    ;
}




