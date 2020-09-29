package com.mitocode.defaultMethod;

public interface PersonaB {

	default void hablar(){
		System.out.println("Saludos Coders - PersonaB");
	}
}
