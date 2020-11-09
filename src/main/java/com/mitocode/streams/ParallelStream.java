package com.mitocode.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Hay que tener cuidado con el uso de ParallelStream sobre todo en contenedores
 * J2EE https://dzone.com/articles/whats-wrong-java-8-part-iii
 * https://www.overops.com/blog/benchmark-how-java-8-lambdas-and-streams-can-make-your-code-5-times-slower/
 */
public class ParallelStream {

	private List<Integer> numeros;

	public void llenar() {

		numeros = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}
	}

	public void probarStream() {
		numeros.stream().forEach(System.out::println);
	}

	public void probarParalelo() {
		numeros.parallelStream().forEach(System.out::println);
	}

	public static void main(String[] args) {
		ParallelStream app = new ParallelStream();

		app.llenar();
		//app.probarStream();
		app.probarParalelo();

	}

}
