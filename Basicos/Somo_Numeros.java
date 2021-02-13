package jp.silva.com;

import java.util.Scanner;

public class Somo_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner (System.in);
	
	int a , b; 
	System.out.println("Digite o valor de a \n");
	
	a=sc.nextInt();
	System.out.println("Digite o valor de b \n");
	b=sc.nextInt();

	soma(a,b);

	}
	
	
	static void soma(int n, int m ) {
		
		
		int z = n+m ;
		
		System.out.println("A soma dos numeros eh :"+z);
		
		
	}

}
