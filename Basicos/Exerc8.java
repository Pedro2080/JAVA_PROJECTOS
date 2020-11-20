/*

Calcule a série de Fibonacci para um número inteiro não negativo informado pelo usuário.
A série de Fibonacci inicia com os números F0 = 0 e F1 = 1, e cada número posterior
equivale à soma dos dois números anteriores (Fn = Fn-1 + Fn-2). Por exemplo, caso o usuário
informe o número 9, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
 */

package Exercicios;

public class Exerc8 {
    public static void main(String[] args) {
/*
        int primeiro = 0;
        int segundo = 1;
        int proximo =0; // Variavel auxiliar

        System.out.print(primeiro+ " ");
        System.out.print(segundo+ " ");

        while (proximo <=30){
            proximo = primeiro +segundo;

            primeiro= segundo;
            segundo = proximo;

            System.out.print(proximo+ " ");

        }*/
/*
        serie(1);


    }

    public static  int serie( int x) {
        if (x <= 0) {
            System.out.println("Nao existe");
            //return new int [0];
        }
        int f1 = 0;
        int f2 = 1;
        int[] fibonaci = new int[x + 1];
        fibonaci[0] = f1;
        fibonaci[1] = f2;
        for (int i = 2; i < fibonaci.length; i++) {
            fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];


       // return  fibonaci;

        for (i = 0; i < fibonaci.length; i++) {
            if (i == fibonaci.length - 1) {

                System.out.println(fibonaci[i]);
                break;
            }
            System.out.println(
                    +fibonaci[i] + ",");
        }

*/



/*
            public static  void imprimirSerie(int x){

            for (int i = 0; i < fibonaci.length; i++) {
                if (i == fibonaci.length - 1) {

                    System.out.println(fibonaci[i]);
                    break;
                }
                System.out.println(
                        +fibonaci[i] + ",");


            }}}
        }
*/
        imprimirSerie2(4);

    }

    public static int [] serie(int x) {
        if (x <= 0) {
            return new int [0];
        }
        int f1 = 0;
        int f2 = 1;
        int[] fibonaci = new int[x + 1];

        fibonaci[0] = f1;
        fibonaci[1] = f2;

        for (int i = 2; i < fibonaci.length; i++) {
            fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];
        }
        return fibonaci;
    }

    public static void imprimirSerie(int [] fibonaci) {
        if(fibonaci.length ==0)
            System.out.println("Nao existe");

        for (int i = 0; i < fibonaci.length; i++) {
            if (i == fibonaci.length-1 ) {
                System.out.println(fibonaci[i]);
                break;
            }
            System.out.print(fibonaci[i] + " , ");
        }

    }

    public static void imprimirSerie2(int n) {
        int f1 =0;
        int f2 =1;
        if(n<1) {
            System.out.println("Nao existe");
            return;
        }
        System.out.print(f1+ " , " +f2 + " , ");
        for (int i = 2; i <n+1; i++) {
            int temp = f1;
            f1=f2;
            f2= f1+temp;
            if (i == n ) {
                System.out.print(f2);
                break;
            }
            System.out.print(f2 + " , ");
        }

    }

}



