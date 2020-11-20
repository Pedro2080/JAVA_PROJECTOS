package jp.silva.com;

public class Triangulo extends Figura {
	
	private int hipotesuza;
	public Triangulo(int catetoOposto, int catetoAdjacent,int hipotenuza) {
		super(catetoOposto,catetoAdjacent);
		this.hipotesuza = hipotenuza;
		
	}
	public int getHipotesuza() {
		return hipotesuza;
	}
	public void setHipotesuza(int hipotesuza) {
		this.hipotesuza = hipotesuza;
	}
	
	
	@Override
	public double calcularArea() {
		
		return (this.getLargura()*this.getComprimento())/2;
	}
	}
	
	
	
	

