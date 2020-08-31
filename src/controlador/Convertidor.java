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
	 * Clase encargada del manejo del pool de hilos, y de dividir los bloques de registros
	 */
	
	 private static final int tamano_bloque = 10000;

	    private ExecutorService pool;
	    
	    public Convertidor() {
	        pool = Executors.newFixedThreadPool(50);
	    }

	    public Double dividirRegistro(String lista[]){

	        int chunks = (int) Math.floor(lista.length /tamano_bloque);

	        List<Future<Double>> listaConfirmacion = new ArrayList<>();

	        for(int c = 0; c<chunks; c++){
	           Lector lector = new Lector(Arrays.copyOfRange(lista,c*tamano_bloque, (c + 1)*tamano_bloque ));
	           Future<Double> futuro = pool.submit(lector);
	            listaConfirmacion.add(futuro);
	        }

	        for(Future<Double> futuro: listaConfirmacion){
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
