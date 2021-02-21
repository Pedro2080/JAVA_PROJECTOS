package com.silva;

public class Canguru extends Mamifero {
	
	private int numeroPatas;
	
	
	
	
	public Canguru() {
		//super();
		//this.numeroPatas = numeroPatas;
		System.out.println("Caracteristicas do Canguro :\n");
		this.setNumeroPatas(4);
		this.setMembros(2);
		this.setPeso(25.0);
		this.setCorPel("Vermelho");
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}


	@Override
	
	public void locomover() {
		
		System.out.println("Saltando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Grama e raizes");
		
	}

	@Override
	public void emitriSom() {
		System.out.println("Som de canguro");
		
	}
	
	
}
