/*
 Crie um programa java que faça o calculo da área de figuras geométricas ( quadrado, retangulo, triangulo, etc. ). 
 Este projecto deve criar uma interface para o calculo da area da figura geométrica e deve ter varias classes que façam 
 o calculo da area e que implementem a interface. O programa deve ter um menu que mostre as figuras ( quadrado, retangulo,
  triangulo, losango e fim ). De acordo com a opção, o programa de instanciar um objecto da classe correspondente e chamar o 
  metodo que calcula a area, passando os parametros que forem necessarios e que devem ser informados pelo teclado.
 
 */

package jp.silva.com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Rectangulo r = new Rectangulo (2,5);
		
		Quadrado q = new Quadrado (5);
		
		Triangulo t= new Triangulo (2, 8, 12);
		
	//	calcularArea(r);
		
			
			System.out.println("Area do retangulo : "+r.calcularArea());
			System.out.println("Area do quadrado : "+q.calcularArea());
			
			System.out.println("Area do triangulo : "+t.calcularArea());

	}
	/*
	public static void calcularArea(Calculavel calculavel) {
		
		calculavel.calcularArea();
	}*/

}
