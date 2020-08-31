package controlador;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Convertidor {

	/**
	 * Clase encargada del manejo del pool de hilos, y de dividir los bloques de registros
	 */
	
	  /** private static final int tamano_bloque = 10000;

	    private ExecutorService pool;
	    public Registros() {
	        pool = Executors.newFixedThreadPool(50);
	    }

	    public void dividirRegistro(double nums[]){

	        int chunks = (int) Math.floor(nums.length /tamano_bloque);

	        double sum = 0;

	        List<Future<Double>> summers = new ArrayList<>();

	        for(int c = 0; c<chunks; c++){
	            SumArray summer = new SumArray(Arrays.copyOfRange(nums,c*tamano_bloque, (c + 1)*tamano_bloque ));
	            Future<Double> futuro = pool.submit(summer);
	            summers.add(futuro);
	        }

	        for(Future<Double> futuro: summers){
	            try {
	                sum +=futuro.get();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            } catch (ExecutionException e) {
	                e.printStackTrace();
	            }
	        }

	        return sum;
	    }
	    **/
	
}
