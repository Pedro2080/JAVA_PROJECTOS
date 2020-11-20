package jp.silva.com;

public abstract class Figura implements Calculavel {
	private int largura ;
	private int comprimento;
	
	
	
	public Figura (int Largura, int comprimento) {
		this.comprimento= comprimento;
		this.largura = Largura;
		
	}



	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	

}
