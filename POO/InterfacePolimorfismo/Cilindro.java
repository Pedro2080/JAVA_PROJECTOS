package com.pedro;

public class Cilindro extends Figura3D implements DimensaoSuperficial {
	
	private double altura; 
	private double raio;
	
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		
	double areaBase=(raio*raio)*3.14;
	double areaLateral = (raio*raio)*2*3.14;
	double areaTotal= (2*areaBase) +areaLateral;
		return 0;
	}
	@Override
	public double calcularVolume() {
		
		return (raio*raio)*altura*3.14;
	}
	
	

}
