package com.mitocode.default-method;

public interface PersonaB {

	default void hablar(){
		System.out.println("Saludos Coders - PersonaB");
	}

	default void leer() {
		System.out.println("Leer...");
	}
}
