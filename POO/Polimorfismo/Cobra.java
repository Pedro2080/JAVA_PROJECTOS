package com.silva;

public class Cobra extends Reptil {
	
	
	
	@Override
	
	public void locomover() {
		
		System.out.println("Rastejando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Aves");
		
	}
	
	@Override
	public void emitriSom() {
		System.out.println("Som de cobra");
		
	}
}
