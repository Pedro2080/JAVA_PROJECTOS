package com.silva;

public class Peixe extends Animal {

	@Override
	public void locomover() {
		System.out.println("Nadando\n");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substancias\n");
		
	}

	@Override
	public void emitriSom() {
		System.out.println("Peixe na emite som\n");
		
	}

}
