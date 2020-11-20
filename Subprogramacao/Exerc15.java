package Exercicios;

/*


15. Faça um método que calcule a média de um aluno de acordo com o critério definido neste curso. Além disso, faça um outro método que informe o status do aluno de acordo com a tabela a seguir:
Nota acima de 6 → “Aprovado”
Nota entre 4 e 6 → Conceito “Verificação Suplementar”
Nota abaixo de 4 → Conceito “Reprovado”
 */
public class Exerc15 {

    public static void main(String[] args) {

      /*  double nota1;
        double nota2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota \n");
        nota1= sc.nextDouble();
        System.out.println("A nota digita eh:\n"+nota1);

        System.out.println("Digite a segunda nota \n");
        nota2= sc.nextDouble();
        System.out.println("A nota digita eh:\n"+nota2);
        double soma =nota1+nota2;
        double media= soma/2;

        System.out.println("A media eh :"+media);
        if (media>6){

            System.out.println("Aprovado\n");
        }
        else if (media >=4 && media <=6){
            System.out.println("Verificação Suplementar \n");

        }
        else {

            System.out.println("Reprovado");
        }*/


      /*Exerc15 s1 = new Exerc15();
      
      double t=s1.soma(5,6);
        System.out.println(t);
        d*/


       /* double mediu=media(2.5,2.5);
        System.out.println(mediu);*/

        status(media(12,6,20,10,30,5));





    }

    public static double media (double ...notas) {
        double soma = 0;
        for (int i =0 ; i<notas.length ; i++)
            soma +=notas[i];

        return soma/notas.length;
    }

     public static  void status(  double media) {


         System.out.println("A media eh :"+media);
         if (media>6){

             System.out.println("Aprovado\n");
         }
         else if (media >=4 && media <=6){
             System.out.println("Verificação Suplementar \n");

         }
         else {

             System.out.println("Reprovado");
         }


     }



}
