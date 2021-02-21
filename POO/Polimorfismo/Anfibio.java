package com.silva;

public class Anfibio extends Animal {
	
private String corPelo;
	
	

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	@Override
	public void locomover() {
		System.out.println("Ratejando\n");
	}

	@Override
	public void alimentar() {
		System.out.println("Qualqeur coisa\n");
		
	}

	@Override
	public void emitriSom() {
		System.out.println("Cucuru\n");
		
	}


}
