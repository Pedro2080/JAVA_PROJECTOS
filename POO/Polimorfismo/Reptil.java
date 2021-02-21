package com.silva;

public class Reptil extends Animal {
	
	private String corEscama;
	
	

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		
		System.out.println("Rastejando\n");
		
		
	}

	@Override
	public void alimentar() {
		
		System.out.println("Comendo vejetais\n");
		
		
	}

	@Override
	public void emitriSom() {
		
		System.out.println("Som de reptil\n");
		
		
	}

}
