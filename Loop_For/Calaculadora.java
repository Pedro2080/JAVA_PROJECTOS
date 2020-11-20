import java.util.Scanner;

public class Calaculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a ;
		float b;
		int opcao;
		float soma, sub, mult, div;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primeiro valor \n ");
		a=sc.nextFloat();
		System.out.println("Digite o segundo  valor \n ");
		b=sc.nextFloat();
		System.out.print("Escolhe uma das operacoes: \n"
				+ " 1 : ***** Adicao ***** \n"
				+ " 2 : ***** Subtracao *****\n"
				+ " 3 : ***** Multiplicacao ***** \n"
				+ " 4:  ***** Divisao ***** \n "
				);
		opcao = sc.nextInt();
		
		switch (opcao) {
		
		case 1 : 
		soma = a+b;
		System.out.print("A soma de: \n " +a+ " + "+b+" eh = "+soma );
		break;
		case 2:
		sub = a-b;
		System.out.print("A Subtracao de: \n "+a+ " - "+b+" eh = "+sub );
		break;

		case 3 : 
			mult = a*b;
			System.out.print("A Multiplicacao de:  \n"+a+ " * "+b+" eh = "+mult );
		break;

		case 4 :
			div= a/b;
			System.out.print("A Divisao  de: \n "+a+ " / "+b+" eh = "+div );
		break;
		
		default :
			System.out.println(" Nao escolheu nehuma opcao  ");
		}

	}

}
/*
float a ;
float b;
String opcao;
float soma, sub, mult, div;

Scanner sc = new Scanner (System.in);
System.out.println("Digite o primeiro valor \n ");
a=sc.nextFloat();
System.out.println("Digite o segundo  valor \n ");
b=sc.nextFloat();
System.out.print("Escolhe uma das operacoes: \n"
		+ "  ***** Adicao ***** \n"
		+ "  ***** Subtracao *****\n"
		+ "  ***** Multiplicacao ***** \n"
		+ "  ***** Divisao ***** \n "
		);
opcao = sc.nextLine();

switch (opcao) {

case "Adicao" : 
soma = a+b;
System.out.print("A soma de: \n " +a+ " + "+b+" eh = "+soma );
break;
case "Subtracao":
sub = a-b;
System.out.print("A Subtracao de: \n "+a+ " - "+b+" eh = "+sub );
break;

case "Multiplicacao" : 
	mult = a*b;
	System.out.print("A Multiplicacao de:  \n"+a+ " * "+b+" eh = "+mult );
break;

case "Divisao" :
	div= a/b;
	System.out.print("A Divisao  de: \n "+a+ " / "+b+" eh = "+div );
break;

default :
	System.out.println(" Nao escolheu nehuma opcao  ");
}

*/