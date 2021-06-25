/* 
 1-
Escreva uma classe FiguraGeometrica com atributos nome e cor. 
Escreva uma classe Figura2D e uma classe Figura3D. Ambas classes Figura2D e Figura3D 
são subclasses da classe FiguraGeometrica. Crie ainda as classes Circulo, Quadrado e
Triangulo que estendem a classe Figura2D e crie também as classes Cubo e Cilindro e 
Piramide que estendem a classe Figura3D.

2-

Escreva a interface DimensaoSuperficial que contém o método calcularArea. 
Escreva a interface DimensaoVolumetrica que contém o método calcularVolume.
Aplique a interface DimensaoSuperficial em todas as subclasses de Figura2D e Figura3D
e aplique a interface DimensaoVolumetrica nas subclasses de Figura3D, implementando
seus métodos de acordo com as regras de cada figura geométrica (crie os atributos
necessários).
 
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
