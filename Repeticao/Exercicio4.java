package Repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int idade=0, sexo=0, opcoes=0, pessoaCalma=0, mulherNervosa=0, homemAgressivo=0, outroCalmo=0, pessoaNervosaMaior=0, pessoaCalmaMenor=0, pessoas=0;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade=ler.nextInt();
		System.out.println("Informe o sexo:\n1-Feminino\n2-Masculino\n3-Outros");
		sexo=ler.nextInt();
		System.out.println("Nos diga sua situação:\n1-Calma/e/o\n2-Nervosa/e/o\n3-Agressiva/e/o");
		opcoes=ler.nextInt();
		
		while(pessoas<=150) {
			if(opcoes==1) {
				pessoaCalma++;
			}
			if(sexo==1 && opcoes==2) {
				mulherNervosa++;
			}
			if(sexo==2 && opcoes==3) {
				homemAgressivo++;
			}
			if(sexo==3 && opcoes==1) {
				outroCalmo++;
			}
			if(idade>40 && opcoes==2) {
				pessoaNervosaMaior++;
			}
			if(idade<18 && opcoes==1) {
				pessoaCalmaMenor++;
			}
			pessoas++;
			System.out.println("Digite sua idade: ");
			idade=ler.nextInt();
			System.out.println("Informe o sexo:\n1-Feminino\n2-Masculino\n3-Outros");
			sexo=ler.nextInt();
			System.out.println("Nos diga sua situação:\n1-Calma/e/o\n2-Nervosa/e/o\n3-Agressiva/e/o");
			opcoes=ler.nextInt();
			
		}
			
		System.out.println("O numero de pessoas calmas é "+pessoaCalma);
		System.out.println("O numero de mulheres nervosas é "+mulherNervosa);
		System.out.println("O numero de homens agressivos é "+homemAgressivo);
		System.out.println("O numero de outros calmos é "+outroCalmo);
		System.out.println("O numero de pessoas nervosas com mais de 40 anos é "+pessoaNervosaMaior);
		System.out.println("O numero de pessoas calmas com menos de 18 anos é "+pessoaCalmaMenor);
	
	}
}
