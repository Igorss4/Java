package IntroducaoPOO;

import java.util.Scanner;

public class ClienteObjeto {

	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		c1.cadastro=true;
		c1.satisfacao=true;
		c2.nome="Marta";
		c2.idade=35;
		c2.sexo="Feminino";
		c2.satisfacao=true;
		c3.nome="Soul";
		c3.idade=22;
		c3.sexo="Indefinido";
		c3.cadastro=true;
		c3.endereco="rua Mauricio de Souza, n971";
		c3.contato=987654321;
		c3.email="soul@email.com";
		
		c1.feedback();
		c1.estado();
		System.out.println(" ");
		c2.estado();
		System.out.println(" ");
		c3.estado();
		
		
		
		
	}
}
