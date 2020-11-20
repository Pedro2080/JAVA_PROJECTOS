package com.joaopdrodasilva;

public class MiniCalculadora {

    public static void main(String[] args) {

        System.out.println ("***** Tabuada de multiplicacao ***** ");

        for (int i=2; i<=12 ; i++){

            System.out.println("************* ");
            for (int j=1 ; j<=12 ;j++){
                System.out.println (i+ " x "+j+" = "+(j*i));
            }
        }
    }
}
