package IntroducaoPOO;

import java.util.Scanner;

public class Cliente {

	//Atributos
	
	String nome, email, endereco, sexo, feedback;
	int contato, nEndereco, idade;
	boolean cadastro, satisfacao;
	
	Scanner ler=new Scanner(System.in);
	
	//METODO CONSTRUTOR
	
	public Cliente() {
		this.nome="Pedro";
		this.idade=19;
		this.sexo="Masculino";
		this.cadastro=false;
		this.satisfacao=false;
		
	}
	
	//Método
	
	public void cadastrar() {
		if(this.cadastro==true) {
			System.out.println("Insira as informações de cadastro");
			System.out.println("Digite seu endereço: ");
			endereco=ler.next();
			System.out.println("Digite o numero do endereço: ");
			nEndereco=ler.nextInt();
			System.out.println("Digite um numero de contato: ");
			contato=ler.nextInt();
			System.out.println("Digite seu email: ");
			email=ler.next();		}
		else
			System.out.println("O cliente nao quer cadastro.");
	}
	public void feedback() {
		if(this.satisfacao==true) {
			System.out.println("Para enviar o feedback, nos encaminhe um email para feedback@empresa.com.br");
			}
		else
			System.out.println(" ");
		}
	public void estado() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Sexo: "+this.sexo);
		if(this.cadastro==true) {
			System.out.println("Endereço: rua Joao Carvalho, n566");
			System.out.println("Contato: 912345678");
			System.out.println("Email: cliente@email.com"); 
		
		/*	System.out.println("Endereço: "+this.endereco+" numero "+this.nEndereco);
			System.out.println("Contato:  "+this.contato);
			System.out.println("Email: "+this.email); */		} 
		else
			System.out.println("Sem dados cadastrais");
		if(this.satisfacao==true) {
			System.out.println("O email foi enviado, agradecemos o feedback");
			}
		else
			System.out.println(" ");
		
			
		}
	
	}
	
	

