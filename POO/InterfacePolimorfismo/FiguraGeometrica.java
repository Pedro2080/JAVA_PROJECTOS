/* 
 1-
Escreva uma classe FiguraGeometrica com atributos nome e cor. 
Escreva uma classe Figura2D e uma classe Figura3D. Ambas classes Figura2D e Figura3D 
s�o subclasses da classe FiguraGeometrica. Crie ainda as classes Circulo, Quadrado e
Triangulo que estendem a classe Figura2D e crie tamb�m as classes Cubo e Cilindro e 
Piramide que estendem a classe Figura3D.

2-

Escreva a interface DimensaoSuperficial que cont�m o m�todo calcularArea. 
Escreva a interface DimensaoVolumetrica que cont�m o m�todo calcularVolume.
Aplique a interface DimensaoSuperficial em todas as subclasses de Figura2D e Figura3D
e aplique a interface DimensaoVolumetrica nas subclasses de Figura3D, implementando
seus m�todos de acordo com as regras de cada figura geom�trica (crie os atributos
necess�rios).

3- 

Crie pelo menos uma inst�ncia de cada classe e adicione em um array do tipo FiguraGeometrica. 
Itere esse array, imprimindo na tela a area e o volume (quando aplic�vel).
 
 */

package com.pedro;

public abstract class FiguraGeometrica {
	
	private String nome;
	private String cor;
	
	// Metodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	

}