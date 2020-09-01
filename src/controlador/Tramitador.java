package controlador;

import java.util.concurrent.Callable;

public class Tramitador implements Callable<Double> {

	/*
	 * Clase que hará la función de sumArray
	 */

	private String[] registros;

	public Tramitador() {
	}

	public Tramitador(String[] registros) {
		this.registros = registros;
	}

	private double leerArchivos(String lista[]) {
		try {
			for (String registro : lista) {
				RegistroPostgres rp = new RegistroPostgres();
				String[] campos = registro.split(",");
				int id = rp.insertarCategoria(campos[3]);
				rp.insertarTienda(Integer.parseInt(campos[5]), campos[6]);
				rp.insertarProducto(campos[0], campos[1], id); 
				rp.insertarProductoTienda(campos[0], Integer.parseInt(campos[5]), Double.parseDouble(campos[2]));
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
