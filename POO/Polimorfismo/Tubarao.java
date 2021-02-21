package com.silva;

public class Tubarao extends Peixe {
	
@Override
	
	public void locomover() {
		
		System.out.println("Nadando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Peixe e carne");
		
	}

	@Override
	public void emitriSom() {
		System.out.println("Som de peixe");
		
	}
	

}
