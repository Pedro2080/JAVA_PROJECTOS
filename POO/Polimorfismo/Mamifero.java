package com.silva;

public class Mamifero extends Animal {
	
	private String corPel;


	public String getCorPel() {
		return corPel;
	}

	public void setCorPel(String corPel) {
		this.corPel = corPel;
	}

	@Override
	public void locomover() {
		
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
		
	}

	@Override
	public void emitriSom() {
		System.out.println("Som de mamifero");
		
	}

}
