package jp.silva.com;

public class Rectangulo extends Figura implements Calculavel{

	public Rectangulo(int Largura, int comprimento) {
		super(Largura, comprimento);
	
	}

	@Override
	public double calcularArea() {
		return this.getLargura()*this.getComprimento();

	}

}
