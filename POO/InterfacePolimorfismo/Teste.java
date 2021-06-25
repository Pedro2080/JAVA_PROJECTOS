package com.pedro;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quadrado q = new Quadrado();
		
		q.setLado(5);
		q.setNome("Quadrado");
		
		
		Circulo c= new Circulo();
		c.setRaio(5);
		c.setNome("Circulo");

		Triangulo t= new Triangulo();
		
		t.setAltura(5);
		t.setBase(5);
		
		t.setNome("Triangulo");

		
		Cubo cu=new Cubo();
		cu.setLado(5);
		cu.setNome("Cubo");
		
		Cilindro ci=new Cilindro();
		ci.setAltura(5);
		ci.setRaio(5);
		
		ci.setNome("Cilindro");
		
		Piramide pi= new Piramide();
		pi.setAltura(5);
		pi.setApotema(5);
		pi.setArestabase(1);
		pi.setNumeroPolignoBase(4);
		pi.setBase(q);
		
		pi.setNome("Piramide");
		
		
		
		FiguraGeometrica [] figuras=new FiguraGeometrica [6];
		
		figuras[0] = q;
		figuras[1] = c;
		figuras[2] = t;
		figuras[3] = cu;
		figuras[4] = ci;
		figuras[5] = pi;
		
		for (FiguraGeometrica figura: figuras ) {
			
			System.out.println("------------");
			System.out.println(figura.getNome());
			
			if (figura instanceof Figura2D) {
				Figura2D f2d=(Figura2D) figura;
				System.out.println(f2d.calcularArea());
			}
			
			if (figura instanceof Figura3D) {
				Figura3D f3d=(Figura3D) figura;
				System.out.println(f3d.calcularArea());
				
				System.out.println(f3d.calcularVolume());
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
