package controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Convertidor {

	/**
	 * Clase encargada del manejo del pool de hilos, y de dividir los bloques de
	 * registros
	 */

	private int tamano_bloque = 1;

	private ExecutorService pool;

	private int residuo = 0;

	private String[] lista;

	public Convertidor(int tamano_bloque, int hilos, String[] lista) {
		residuo = (int) Math.floor(lista.length % tamano_bloque);
		if (residuo != 0) {
			pool = Executors.newFixedThreadPool(hilos + 1);
		} else {
			pool = Executors.newFixedThreadPool(hilos);
		}
		this.tamano_bloque = tamano_bloque;
		this.lista = lista;
	}

	public Double dividirRegistro() {
		int chunks = (int) Math.floor(lista.length / tamano_bloque);
		List<Future<Double>> listaConfirmacion = new ArrayList<>();
		for (int c = 0; c <= chunks; c++) {
			Tramitador lector = null;
			if (c == chunks) {
				lector = new Tramitador(Arrays.copyOfRange(lista, (c) * tamano_bloque, ((c) * tamano_bloque) + residuo));
			} else {
				lector = new Tramitador(Arrays.copyOfRange(lista, c * tamano_bloque, (c + 1) * tamano_bloque));
			}
			Future<Double> futuro = pool.submit(lector);
			listaConfirmacion.add(futuro);
		}
		for (Future<Double> futuro : listaConfirmacion) {
			try {
				futuro.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		return 0.0;
	}
}
