/*

Determine as raízes de uma equação de 2º grau: ax2 + bx + c = 0 (recordar que o discriminante Δ = b2 – 4ac, e que a raiz r = (–b  √Δ)/2a).
 */
package Exercicios;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {


        double a, b,c;
        double x1,x2;
        double delta;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insirindo variveis da equacao do 2 grau ");

        System.out.println("Insira o valor de a \n");
        a=sc.nextDouble();
        System.out.println("Insira o valor de b \n");
        b=sc.nextDouble();
        System.out.println("Insira o valor de c \n");
        c=sc.nextDouble();
        System.out.println("");

        System.out.println("Calculando as raizes da equacao \n");

        if (a!=0){
            delta = ((b*b)+ (-4)*(a)*(c));

            if (delta ==0){
                x1=-b/2*a;
                x2=-b/2*a;
                System.out.println("A equacao tem duas raizes iguais: "+x1);
                System.out.println("Quando delta = 0 , x1=x2");
            }
            else{
                if (delta>0){
                    x1=-(b+Math.sqrt(delta))/2*a;
                    x2=-(b-Math.sqrt(delta))/2*a;

                    System.out.println("Valor de X1 " +x1);
                    System.out.println(" Valor de X2 "+x2);
                }
            else if (delta<0){

                    System.out.println("Impossivel calcular raizes da equacao  \n" +
                            "Delta tem que ser maior que zero");

            }
            }
        }

                else {

                    System.out.println("Impossivel calcular a equacao raizes da equacao \n");
                }
            }

}








