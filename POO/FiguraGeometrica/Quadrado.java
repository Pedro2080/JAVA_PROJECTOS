package jp.silva.com;

public class Quadrado extends Figura {

	public Quadrado(int largura) {
		super(largura , largura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularArea() {
		
		return this.getLargura()*this.getComprimento();
	}

}
