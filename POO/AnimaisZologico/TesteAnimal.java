/*
 Um animal contem nome, compriemento , numero de patas(padrao eh 4),cor ambiente e velocidade em m/s.
 Um Peixe eh um animal , tem 0 patas , seu ambiente eo h mar (padrao), cor cinzenta (padrao). Alem disso tem como 
 caracteristicas barbatanas e cauda. 
 
  Um mamifero eh um animal e o seu ambiente padrao eh terra.
  Um urso eh um mamifero e o seu ambiente preferido eh o mel.
  
  
  Crie as classes Animal, Peixe e Mamifero.
  
  Para a classe animal coloque os atributos:
  	Nome, comprimento , patas . cor , ambiente , velocidade
  Para a classe Peixe, codifique o atributo carateristicas.
  
  Para a classe Mamifero ,coloque o atributo alimento.
  Por ultmimo , crie uma classe teste de forma a ter um jardim zoologico com os seguintes animais :
  Camelo , tubarao , urso-do-canada.
 */

package com.joaop;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando os animais
		Animal camelo = new Animal();
		
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		//camelo.setPatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarao");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		tubarao.setPatas(0);
		tubarao.setAmbiente("Mar");
		tubarao.setCor("Cinzenta");
		tubarao.setCaracteristicas("Barbatanas e cauda");
		
		
		
		Mamifero urso_do_canada= new Mamifero();
		urso_do_canada.setNome("Urso do Canada");
		urso_do_canada.setCor("Vermelha");
		urso_do_canada.setComprimento(180);
		urso_do_canada.setAmbiente("Terra");
		urso_do_canada.setVelocidade(0.5);
		urso_do_canada.setAlimento("Mel");
		
		
		// Arrary de animal
		
		Animal[] animais = new Animal[3];
		
		animais[0]= camelo; 
		animais[1] = tubarao; 
		animais[2] = urso_do_canada; 
		
		System.out.println("---------------------------");
		
		for (Animal animal: animais) {
			
			System.out.println(animal);
			
			System.out.println("---------------------------");
		}
		
	}

}
