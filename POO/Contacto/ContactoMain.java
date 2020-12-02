package ProgramacaoObjectos;

public class ContactoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Contacto  sc = new Contacto();
		
		sc.nome = "Joao";
		sc.endereco = "A.Grunwaldzka";
		sc.email ="joaopedro2080@hotmail.com";
		
		
		
		sc.telefones = new String [5];
		sc.telefones [0] = " 556557";
		sc.telefones [1] = " 656558";
		sc.telefones [2] = " 756559";
		
		System.out.println("Dados ");
		System.out.println("Nome: "+sc.nome);
		System.out.println("Endereco: "+sc.endereco);
		System.out.println("Email:"+sc.email);
		
		System.out.println("Telefones:");
		System.out.println(sc.telefones[0]);
		System.out.println(sc.telefones[1]);
		System.out.println(sc.telefones[2]);
		

	}

}
