/*

14.Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */
package DoWhile;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int contadorImpar =0;
		int contadorPar = 0;
		int somaPar =0;
		int somaImpar = 0;
		int num;
		
		
		for (int i = 1 ; i <=10 ; i ++) {
			
			System.out.println("Digite o "+i+" numero \n");
			
			 num=sc.nextInt();	
			 if (num % 2 ==0) {
				 contadorPar++;
				 somaPar=somaPar+num;
				 
				 
				
			 }
			 if (num % 2 == 1) {
				 
				 contadorImpar++;
				 somaImpar= somaImpar+num;
			 }
		}
		
		System.out.println("Foram digitados "+contadorPar+ "numeros pares \n");
		System.out.println("Foram digitalizados "+contadorImpar+ " numeros impares \n");
		System.out.println("A soma de todos os numeros pares eh : \n"+somaPar );
		System.out.println("A soma de todos os numeros imppares eh : "+somaImpar );
		

	}

}
