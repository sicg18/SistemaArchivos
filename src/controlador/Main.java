package controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import com.opencsv.CSVReader;
public class Main {

	/**private static String[] getArray() {
		BufferedReader bufferLectura = null;
		String[] campos = null;
		try {
			// Abrir el .csv en buffer de lectura
			bufferLectura = new BufferedReader(new FileReader(
					"C:\\Users\\Sara Castaño\\Documents\\GitHub\\SistemaArchivos\\src\\recursos\\data.csv"));
			// Leer una linea del archivo
			String linea = bufferLectura.readLine();
			while (linea != null) {
				// Sepapar la linea leída con el separador definido previamente
				campos = linea.split(",");
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
		return campos;
	}
	**/
/**	private static String[] getArray() {
        BufferedReader bufferLectura = null;
        String[]campos=new String[10000];
        try {
            bufferLectura = new BufferedReader(new FileReader("C:\\Users\\Sara Castaño\\Documents\\GitHub\\SistemaArchivos\\src\\recursos\\data.csv"));
            String linea = bufferLectura.readLine();
            int i = 0;
            while (linea != null) {
                campos[i] = linea;
                i=i+1;
                linea = bufferLectura.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return campos;
    }
 * @throws SQLException 
	
	**/
	public static void main(String[] args){
		Conexion conexion = new Conexion();
  String query = "INSERT INTO categoria (nombrecategoria) VALUES ('categoria2')";
  		conexion.ejecutar(query);
		           
	}

}
