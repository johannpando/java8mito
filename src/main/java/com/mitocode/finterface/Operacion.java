package com.mitocode.finterface;

/**
 * Solo se puede definir un método.**
 * ** Sí se puede definir un método de la clase object como equals o toString
 */
@FunctionalInterface
public interface Operacion {

	double calcular(double n1, double n2);

	// Se permiten definir métodos default
	default boolean isTrue() {
		return true;
	}
	
	default boolean isFalse() {
		return false;
	}

	//Se permite definir Métodos de la clase Object (respetar firma)
	boolean equals(Object o1);
	String toString();
}
