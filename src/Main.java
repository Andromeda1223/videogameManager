import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Generos> generosTest1 = Arrays.asList(Generos.FPS, Generos.PLATAFORMA);

        videojuegoFisico test1 = new videojuegoFisico("Test1", Consolas.PS5, 60, generosTest1);


        System.out.println(test1);

        PlayStation testConsola = new PlayStation();
        testConsola.installGame(test1);
        testConsola.juegosInstalados();
    }

    ;
}




