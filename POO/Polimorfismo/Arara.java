package com.silva;

public class Arara extends Ave{
	
public void locomover() {
		
		System.out.println("Voanda");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Grama e raizes");
		
	}

	@Override
	public void emitriSom() {
		System.out.println("Som de ave");
		
	}

}
