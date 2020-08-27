package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.opencsv.CSVReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader bufferLectura = null;
		try {
			// Abrir el .csv en buffer de lectura
			bufferLectura = new BufferedReader(new FileReader(
					"C:\\Users\\Sara Castaño\\Documents\\GitHub\\SistemaArchivos\\src\\recursos\\data.csv"));
			// Leer una linea del archivo
			String linea = bufferLectura.readLine();
			while (linea != null) {
				// Sepapar la linea leída con el separador definido previamente
				String[] campos = linea.split(",");
				for (int i = 0; i < campos.length; i++) {
					System.out.println(campos[i]);
				}
				// Volver a leer otra línea del fichero
				linea = bufferLectura.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Cierro el buffer de lectura
			if (bufferLectura != null) {
				try {
					bufferLectura.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
