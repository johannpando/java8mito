package com.mitocode.defaultMethod;

public interface PersonaA {

	void caminar();
	
	default void hablar(){
		System.out.println("Saludos Coders - PersonaA");
	}
	
}
