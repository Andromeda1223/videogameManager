import error.JuegoNoCompatible;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class PlayStation implements Iconsola {
    public ArrayList<videojuego> juegosInstaladosPs5 = new ArrayList<>();
    public static final String SEPARATOR = ";";
    public static final String QUOTE = "\"";
    String sFichero = "C:/Users/josmedsol/IdeaProjects/videogameManager-main/PlayStation.csv";

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


        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));

            // Escribimos
            for (int i = 0; i < juegosInstaladosPs5.size(); i++) {
                bw.append(juegosInstaladosPs5.get(i).toString());
                bw.append('\n');
                bw.flush();
            }
            // Hay que cerrar el fichero
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public void leerCSV() throws IOException {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(sFichero));
            String line = br.readLine();

            while (null != line) {
                String[] datos = line.split(SEPARATOR);


                //Debug


                for (int i = 0; i < datos.length; i++) {
                    System.out.println(datos[i]);
                }

                line = br.readLine();
            }

        } catch (Exception ioe) {
            ioe.printStackTrace();
        } finally {
            if (null != br) {
                br.close();
            }
        }
    }
}
