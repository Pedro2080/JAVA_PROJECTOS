package Exercicios;

import java.util.Scanner;

/*
11. Calcule a raiz quadrada aproximada de um número inteiro informado pelo usuário,
respeitando o erro máximo também informado pelo usuário. Não utilize funções predefinidas.
 */
public class Exerc11 {

    public static void main(String[] args) {

       /* Scanner sc = new Scanner (System.in);
        int base, elevado, resultado;

        System.out.println("Digite a base da potenciacao: ");
        base = sc.nextInt();

        System.out.println("Digite a potencia: ");
        elevado = sc.nextInt();

        resultado = base;
        for (int cont = 1; cont <= elevado; cont++)
        {
            resultado = resultado * base;
        }

        System.out.println("O resultado eh: " + resultado);*/

        System.out.println(raizQuadrada(32));

        //System.out.println( Math.sqrt(12));

    }

    public static double raizQuadrada(int radicando) {

        int indice = 0;
        int num = 0;
        double resultado;
        if (radicando == 0) {

            return 0;

        }
        if (radicando < 0) {
            return 0;
        }
        if (radicando == 1) {
            return 1;

        }

        for (int i=0 ;i<radicando ;i++){

            if (radicando<(i*i)){

                indice=i-1;
                num=indice*indice;
                break;

            }
            if (radicando ==(i*i)){
                indice=i;
                return  indice;
            }
        }
        resultado=(double)(radicando+num)/(2*indice);
        return  resultado;
    }

}
