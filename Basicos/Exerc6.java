package Exercicios;

/*

Determine o número de dígitos de um número informado.
 */

import java.util.Scanner;

public class Exerc6 {

    public static void main(String[] args) {

         int contador = 0;

        Scanner sc = new Scanner( System.in);

        System.out.printf("Digite um uma string \n  ");

        String nome = sc.nextLine();

        System.out.println("A string digitada eh"+nome);


        System.out.println("A string tem "+nome.length()+ " caracteres");
/*
        for (int i = 0 ; i <nome.length() ; i++){

            if (Character.isLetter(nome.charAt(i))){

                contador++;


            }
             else if (Character.isDigit(nome.charAt(i))){
                 contador++;
            }

            System.out.println(contador);
        }


    }*/
}}
