package com.joaop;

public class Peixe extends Animal {
	
	private String caracteristicas;
	
	public Peixe() {
		super();
		// Informacoes padrao do peixe
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.caracteristicas="Barbatanas e cauda";
		
	}
	
	// Metodos getters e setters
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s=super.toString();
		s +="\nCaracteristicas"+caracteristicas;
		return s;
	}
	
	
	
	

}
