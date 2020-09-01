package controlador;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		File directorioActual = new File("");
		String ayudante = directorioActual.getAbsolutePath() + "\\src\\recursos\\datita.csv";
		try {
			ArrayList<String> lista = (ArrayList<String>) Files.readAllLines(Paths.get(ayudante));
			lista.remove(0);
			String[] miArray = new String[lista.size()];
			miArray = lista.toArray(miArray);
			Convertidor c = new Convertidor();
			long t1 = System.nanoTime();
			c.dividirRegistro(miArray);
			long t = System.nanoTime() - t1;
			System.out.println("t(ms) = " + t / 1000000 + " ms");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
