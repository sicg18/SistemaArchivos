package controlador;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File directorioActual = new File("");
		String ayudante = directorioActual.getAbsolutePath() + "\\src\\recursos\\Csv_Libreria\\data.csv";
		try {
			ArrayList<String> lista = (ArrayList<String>) Files.readAllLines(Paths.get(ayudante));
			lista.remove(0);
			String[] miArray = new String[lista.size()];
			miArray = lista.toArray(miArray);

			/** 
			 * Campos para modificar el tamaño del bloque y de los hilos a continuación:
			 */	
			int tamano_bloque = 100;
			int hilos = 100;
			
			Convertidor c = new Convertidor(tamano_bloque, hilos, miArray);
			long t1 = System.nanoTime();
			c.dividirRegistro();
			long t = System.nanoTime() - t1;
			System.out.println("t(ms) = " + t / 1000000 + " ms");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
