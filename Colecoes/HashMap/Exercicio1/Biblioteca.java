package com.pjs_Exerc21;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private String Biblioteca;
	
	private List<Livro> livros =new ArrayList();

	public String getBiblioteca() {
		return Biblioteca;
	}

	public void setBiblioteca(String biblioteca) {
		Biblioteca = biblioteca;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	public void adicionarLivros(Livro livro1) {
		this.livros.add(livro1);
	}
	
	public void mostrarlivros() {
		
		if (this.livros.size()==0) {
			System.out.println("Nao ha livros na Biblioteca");
		}
		for (Livro livro:livros) {
			System.out.println(livro);
		}
	}

	public void adicionarLivros(List<Livro>novoslivros) {
		// TODO Auto-generated method stub
		
	}
	
	

}
