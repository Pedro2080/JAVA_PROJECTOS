package com.silva;

public class TesteAnimal {

	public static void main(String[] args) {
		
		
		Mamifero  mami =new Mamifero ();
		Reptil rep= new Reptil();
		Peixe pei= new Peixe();
		Ave ave= new Ave();
		Anfibio anf= new Anfibio ();
		
		mami.setPeso(25.5);
		mami.setCorPel("Azul \n");
		
		System.out.println("Caracteristicas do Mamifero:");
		System.out.println("Peso: "+mami.getPeso()+"kg");
		System.out.println("Cor da pel:"+mami.getCorPel());
		
		System.out.println("Chamando o metodo alimentar:");
		mami.alimentar();
		System.out.println("Chamando o metodo emitirSom:");
		mami.emitriSom();

		System.out.println("Chamando o metodo locomover:");
		mami.locomover();
		
		System.out.println("------------------------");
		Canguru canguru = new Canguru();
		System.out.println("Numero de patas: "+canguru.getNumeroPatas());
		System.out.println("Cor da pel: "+canguru.getCorPel());
		System.out.println("Peso: "+canguru.getPeso()+" kg");
		System.out.println("Membros: "+canguru.getMembros()+"\n");
					
		System.out.println("Chamando o metodo alimentar:");				
		canguru.alimentar();
		System.out.println("Chamando o metodo emitirSom:");
		canguru.emitriSom();
		System.out.println("Chamando o metodo locomover:");
		canguru.locomover();
					
		System.out.println("------------------------");
		
		Cobra cobra =new Cobra();
		
		System.out.println("Caracteristicas da cobra:\n");
		
		System.out.println("Chamando o metodo alimentar:");
		cobra.alimentar();
		System.out.println("Chamando o metodo emitirSom:");
		cobra.emitriSom();
		System.out.println("Chamando o metodo locomover:");
		cobra.locomover();
		
		System.out.println("------------------------");
		
		
		
		Arara arara =new Arara();
		
		System.out.println("Caracteristicas da cobra:\n");
		
		System.out.println("Chamando o metodo alimentar:");
		arara.alimentar();
		System.out.println("Chamando o metodo emitirSom:");
		arara.emitriSom();
		System.out.println("Chamando o metodo locomover:");
		arara.locomover();
		
		System.out.println("------------------------");
		
		Sapo sapo =new Sapo();
		
		System.out.println("Caracteristicas da cobra:\n");
		
		System.out.println("Chamando o metodo alimentar:");
		sapo.alimentar();
		System.out.println("Chamando o metodo emitirSom:");
		sapo.emitriSom();
		System.out.println("Chamando o metodo locomover:");
		sapo.locomover();
		
		System.out.println("------------------------");
		
		
			Cachorro cacho =new  Cachorro();
		
		System.out.println("Caracteristicas da cobra:\n");
		
		System.out.println("Chamando o metodo alimentar:");
		cacho.alimentar();
		System.out.println("Chamando o metodo emitirSom:");
		cacho.emitriSom();
		System.out.println("Chamando o metodo locomover:");
		cacho.locomover();
		
		System.out.println("------------------------");
		
		
		Tubarao tub =new  Tubarao();
		
		System.out.println("Caracteristicas do Tubarao:\n");
		
		System.out.println("Chamando o metodo alimentar:");
		tub.alimentar();
		System.out.println("Chamando o metodo emitirSom:");
		tub.emitriSom();
		System.out.println("Chamando o metodo locomover:");
		tub.locomover();
		
		System.out.println("------------------------");
		
		
	
	

	}

}
