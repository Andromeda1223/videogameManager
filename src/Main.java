//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        videojuegoFisico test1 = new videojuegoFisico("Test1", Consolas.PS5, 60, Generos.AVENTURA);


        videojuegoDigital test2 = new videojuegoDigital("Test2", Consolas.XBOX, 60, Generos.AVENTURA);


        PlayStation testConsola = new PlayStation();
        testConsola.installGame(test1);
        testConsola.juegosInstalados();
    }

    ;
}




