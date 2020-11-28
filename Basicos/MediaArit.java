/*

 19.Faça um programa que calcule o mostre a média aritmética de N notas. 
 */
package DoWhile;

import java.util.Scanner;

public class MediaArit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o numero de notas :");
		
		int notas= sc.nextInt();
				
	    double soma = 0;
	    double media ;
	    double  nota ;
	    
	    for (int i = 0 ; i <notas ; i++) {
	    	System.out.println("Entre com a "+(i+1)+ " nota");
	    	nota=sc.nextDouble();
	    	
	    	soma = soma+nota;
	    }
	    
	    media = soma/notas;
	    System.out.println("A soma eh :"+soma);
	    System.out.println("A media eh :"+media);
	    

	}

}
