import error.JuegoNoCompatible;

import java.util.ArrayList;

public class PlayStation implements Iconsola {
    public ArrayList<videojuego> juegosInstaladosPs5 = new ArrayList<>();

    @Override
    public void switchOn() {

    }

    @Override
    public void switchOff() {

    }

    @Override
    public void installGame(videojuego game) {
        if (game.consola.contains(Consolas.PS5)) {
            System.out.println("INSTALANDO " + game.titulo + " PORFAVOR ESPERE");
            juegosInstaladosPs5.add(game);
        } else {
            throw new JuegoNoCompatible();
        }
    }

    @Override
    public void playGame() {

    }

    @Override
    public String getPlataforma() {
        return "PS5";
    }


    public void juegosInstalados() {
        for (videojuego game : juegosInstaladosPs5) {
            System.out.println(game.titulo);
        }
    }

}
