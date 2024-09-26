import error.JuegoNoCompatible;

import java.io.*;
import java.util.ArrayList;

public class Xbox implements Iconsola {
    public ArrayList<videojuego> juegosInstaladosXbox = new ArrayList<>();

    public static final String SEPARATOR = ";";

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


    public void escribirCSV() throws IOException {
        BufferedReader br = null;
        String sFichero = "C:/Users/josmedsol/IdeaProjects/videogameManager-main/Xbox.csv";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));

            // Escribimos 10 filas
            for (int i = 0; i < juegosInstaladosXbox.size(); i++) {
                bw.append(juegosInstaladosXbox.get(i).toString());
                bw.append('\n');
                bw.flush();
            }
            // Hay que cerrar el fichero
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
        try {

            br = new BufferedReader(new FileReader(sFichero));
            String line = br.readLine();
            while (null != line) {
                String[] fields = line.split(SEPARATOR);


                line = br.readLine();
            }

        } catch (Exception e) {

        } finally {
            if (null != br) {
                br.close();
            }
        }
    }
}
