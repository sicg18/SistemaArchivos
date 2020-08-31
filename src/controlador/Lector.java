package controlador;

import java.util.concurrent.Callable;

public class Lector implements Callable<Double> {

	/*
	 * Clase que hará la función de sumArray
	 */

	private String[] registros;

	public Lector() {
	}

	public Lector(String[] registros) {
		this.registros = registros;

	}

	private double leerArchivos(String lista[]) {
		try {
			for (String registro : lista) {
				RegistroPostgres rp = new RegistroPostgres();
				String[] campos = registro.split(",");
				rp.insertarProducto("", "", 0); // Para probar más tarde :).
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0.0;
	}

	@Override
	public Double call() throws Exception {
		return leerArchivos(registros);
	}

}
