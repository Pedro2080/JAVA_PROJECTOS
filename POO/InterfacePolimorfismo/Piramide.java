package com.pedro;

public class Piramide extends Figura3D  implements DimensaoSuperficial {
	
	private double altura; 
	private double arestabase;
	private double apotema;
	private int numeroPolignoBase;
	public int getNumeroPolignoBase() {
		return numeroPolignoBase;
	}
	public void setNumeroPolignoBase(int numeroPolignoBase) {
		this.numeroPolignoBase = numeroPolignoBase;
	}
	private Figura2D base;
	
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getArestabase() {
		return arestabase;
	}
	public void setArestabase(double arestabase) {
		this.arestabase = arestabase;
	}
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	public Figura2D getBase() {
		return base;
	}
	public void setBase(Figura2D base) {
		this.base = base;
	}
	@Override
	public double calcularArea() {
		if(base !=null) {
		return (numeroPolignoBase*(arestabase*apotema)/2)+base.calcularArea();
		}
		return 0;
		
		
	}
	@Override
	public double calcularVolume() {
		if(base !=null) {
		return (base.calcularArea()*altura)/3;
		}
		return 0;
	}
	

}
