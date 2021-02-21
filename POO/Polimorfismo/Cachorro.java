package com.silva;

public class Cachorro extends Mamifero {
	
	
public void locomover() {
		
		System.out.println("Correndo");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Carne");
		
	}

	@Override
	public void emitriSom() {
		System.out.println("HUHUHU HUHUHUHUHUH");
		
	}
	

}
