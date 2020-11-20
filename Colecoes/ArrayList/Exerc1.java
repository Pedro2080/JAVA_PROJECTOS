package ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exerc1 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList <>();

        // Adicionando elementos
        nomes.add("Joao");
        nomes.add("Pedro");
        nomes.add("Da");
        nomes.add("Silva");  // Adicionando Silva na quarta posicao
        nomes.add("Jorge");
        nomes.add("Paulo");
        nomes.add("Simao");
        nomes.add("Maria");
        nomes.add("Paula");
        nomes.add(5,"Marta");// Adicionando Silva na sexta posicao
        nomes.set(0,"Jacob"); // Mudando elemento no ArrayList na posicao Zero ,eliminado o Joao

        System.out.println("ArrayList Original: \n");
        System.out.println("Elementos do ArrayList:");
        System.out.println("--------------------");

        for (String nome:nomes) {
            System.out.println(nome);
        }
        System.out.println("ArrayList Original: \n");
        System.out.println("Elementos do ArrayList:");
        System.out.println("--------------------");

        for (String nome:nomes) {
            System.out.println(nome);
        }
		/*
		for (int i=0 ; i <nomes.size(); i++) {
			for (int j=i ; j<nomes.size() ; j++ ) {

				System.out.println(nomes[j][i]);
			}
		}*/

        System.out.println("Tamanho original do ArrayList: "+nomes.size()+" elementos");
        System.out.println("Mostrando o elemento da 3 posicao "
                + "antes da remocao de elementos: "+nomes.get(3));

        System.out.println("--------------------");


        // Removendo elementos do ArrayList

        String nome1=nomes.remove(4); // Elemento Jorge foi removido
        //String nome2=nomes.remove("Simao"); // Elemento simao foi removido

        System.out.println("O elemento "+nome1+" foi removido com sucesso");
        System.out.println("Tamanho do ArrayList depois da remocao de elementos: "+nomes.size()+" elementos");

        // Mostrando os elementos do Arraylist Depois de remover os elementos


        for (String name:nomes) {
            System.out.println(name);
        }


        System.out.println("\n Mostrando o elemento da 3 posicao "
                + "depois da remocao de elementos: "+nomes.get(3)+"\n");

        /****************************************************************************************/
        // Verificando se o elemento existe no ArrayList

        System.out.println(nomes.contains("Maria")); // Retorna true
        System.out.println(nomes.contains("Docas")); // Retorna false, elemento nao existe


        System.out.println("-------------------------");

        boolean resp= nomes.contains("Paulo");
        if (resp)
            System.out.println("O elemento esta contido no ArrayList ");

        else
            System.out.println("O elemento nao esta contido no ArrayList");

        // Mostrar se  ArrayList existe

        System.out.println(nomes.containsAll(nomes));


        // Ordenando o ArrayList de ordem Alfabetica crescente

        Collections.sort(nomes);
        for (String name :nomes) {
            System.out.println(name);
        }
        System.out.println("----------------------\n");
        // Ordenando o ArrayList de ordem Alfabetica decrescente

        Collections.sort(nomes,Collections.reverseOrder());

        for (int i= 0 ; i <nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        /*
		for (String nom:nomes) {
			System.out.println(nom);
		}*/

        // Juntando dois ArrayList
        Collection<String> numeros = new ArrayList<>();

        numeros.add("Ruth");
        numeros.add("Debora");
        numeros.add("Rebeca");


        nomes.addAll(numeros);

        System.out.println(nomes);

        // Saber a posicao em que se encontra um elemento

        System.out.println("O elemeto "+nomes.indexOf("Rebeca"));

		/*System.out.println(nomes.isEmpty());
		System.out.println(nomes.contains("Ana"));
		System.out.println(nomes.size());
		System.out.println(nomes.indexOf("Pedro")); //  mostrta a posicao de Pedro */

        nomes.trimToSize();
        System.out.println(nomes.size());
    }
}
