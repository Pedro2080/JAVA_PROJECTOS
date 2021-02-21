package com.silva;

public class Sapo extends Anfibio{
	
public void locomover() {
		
		System.out.println("Saltando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Grama e raizes e bichos de mar");
		
	}

	@Override
	public void emitriSom() {
		System.out.println("Som de sapo");
		
	}

}
