public abstract class PlayStation implements Iconsola{

    @Override
    public void switchOn() {

    }

    @Override
    public void switchOff() {

    }

    @Override
    public void installGame(videojuego game) {
        if (game.consola.equals("PS5")) {
            System.out.println("INSTALANDO JUEGO");
        }
    }

    @Override
    public void playGame() {

    }

    @Override
    public String getPlataforma() {
        return "PS5";
    }
}
