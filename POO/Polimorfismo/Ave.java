package com.silva;

public class Ave extends Animal {
	
	private  String corPena;
	
	

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void locomover() {
		System.out.println("Voando\n");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas n");
		
	}

	@Override
	public void emitriSom() {
		System.out.println("Som de ave\n");
		
	}
	
	public void fazerNinho () {
		
		System.out.println("Construiu um ninho\n");
	}
	
	

}
