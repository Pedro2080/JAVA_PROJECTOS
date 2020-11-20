package com.pjs_Exerc21;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Biblioteca biblioteca =new Biblioteca ();
		
		biblioteca.mostrarlivros();
		
		Livro livro1 = new Livro ("Curso de Java", "Joao Kiakumbo");
		Livro livro2 = new Livro("Curso de Angular ", "Joao Pedro");
		biblioteca.adicionarLivros(livro1);
		biblioteca.adicionarLivros(livro2);
		biblioteca.mostrarlivros();
		
		System.out.println();
		
		List<Livro> novoslivros = new ArrayList<>();
		
		Livro livro3 = new Livro ("Curso de HTML", "Joao Kiakumbo");
		Livro livro4 = new Livro("Curso de PHP ", "Joao Pedro");
		novoslivros.add(livro3);
		novoslivros.add(livro4);
		
		
		biblioteca.adicionarLivros(novoslivros);
		biblioteca.mostrarlivros();
		
		
		
	
		
		
		
		
		

	}

}
