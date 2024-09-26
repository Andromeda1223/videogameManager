import error.JuegoNoCompatible;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class PlayStation implements Iconsola {
    public ArrayList<videojuego> juegosInstaladosPs5 = new ArrayList<>();
    public static final String SEPARATOR = ";";
    public static final String QUOTE = "\"";

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

    public void escribirCSV() throws IOException {
        BufferedReader br = null;
        String sFichero = "C:/Users/josmedsol/IdeaProjects/videogameManager-main/PlayStation.csv";
        br = new BufferedReader(new FileReader(sFichero));
        String line = br.readLine();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));

            // Escribimos 10 filas
           bw.append(juegosInstaladosPs5.toString().strip());

            bw.append('\n');
            bw.flush();
           /* bw.write(test1.toString());
            bw.write(test2.toString());
*/
            // Hay que cerrar el fichero
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
        try {


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
