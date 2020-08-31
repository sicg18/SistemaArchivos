package controlador;

import java.util.concurrent.Callable;

public class Lector implements Callable<Double> {

	/*
	 * Clase que hará la función de sumArray
	 */

	private double result;
	private double[] numbers;

	public Lector() {
	}

	public Lector(String[] lista) {

	}

	private double sum(double array[]) {
		double sum = 0;

		for (double num : array) {
			sum += num;
		}

		try {
			Thread.sleep((long) (Math.random() * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return sum;
	}

	@Override
	public Double call() throws Exception {
		System.out.println("sumando....");
		return sum(numbers);
	}

	public double getResult() {
		return result;
	}

}
