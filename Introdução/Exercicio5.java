package Introdução;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int nota1, nota2, nota3, mediaP1, mediaP2, mediaP3, mediaFinal;
		
		System.out.println("Qual a média ponderada do Belchior?");
		System.out.println("Digite a primeira nota: ");
		nota1=ler.nextInt();
		System.out.println("Digite a segunda nota: ");
		nota2=ler.nextInt();
		System.out.println("Digite a terceira nota: ");
		nota3=ler.nextInt();
		
		mediaP1 = nota1*2;
		mediaP2 = nota2*3;
		mediaP3 = nota3*5;
		mediaFinal = (mediaP1+mediaP2+mediaP3)/(2+3+5);
		
		System.out.println("A média ponderada de Belchior é "+mediaFinal+".");

		

	}

}
