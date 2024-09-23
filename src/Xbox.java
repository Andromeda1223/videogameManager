import error.JuegoNoCompatible;

import java.util.ArrayList;

public class Xbox implements Iconsola{
    public ArrayList<videojuego> juegosInstaladosXbox = new ArrayList<>();


    @Override
    public void switchOn() {

    }

    @Override
    public void switchOff() {

    }

    @Override
    public void installGame(videojuego game) {
        if (game.consola.contains(Consolas.XBOX)) {
            System.out.println("INSTALANDO " + game.titulo + " PORFAVOR ESPERE");
            juegosInstaladosXbox.add(game);
        } else {
            throw new JuegoNoCompatible();
        }
    }


    @Override
    public void playGame() {

    }

    @Override
    public String getPlataforma() {
        return "Xbox";
    }
}
