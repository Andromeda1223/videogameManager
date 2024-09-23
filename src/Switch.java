import error.JuegoNoCompatible;

import java.util.ArrayList;

public class Switch implements Iconsola{
    public ArrayList<videojuego> juegosInstaladosSwitch = new ArrayList<>();



    @Override
    public void switchOn() {

    }

    @Override
    public void switchOff() {

    }

    @Override
    public void installGame(videojuego game) {
        if (game.consola == Consolas.PS5) {
            System.out.println("INSTALANDO " + game.titulo + " PORFAVOR ESPERE");
            juegosInstaladosSwitch.add(game);
        } else {
            throw new JuegoNoCompatible();
        }
    }

    @Override
    public void playGame() {

    }

    @Override
    public String getPlataforma() {
        return "Switch";
    }
}
