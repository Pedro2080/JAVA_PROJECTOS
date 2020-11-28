package For;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int n;
		int fat = 1;
		
		System.out.println("Qual o numero deseja clacular o factorial \n");
		n=scan.nextInt();
		
		if (n>= 0) {
			for (int i = 1; i <= n ; i++) {
				fat=fat*i;
			}
			System.out.println("O factorial de "+n+"eh:\n"+fat);
			
			
		}
		else {
			System.out.println("Informe um numero maior que zro !");
		}

	}

}
