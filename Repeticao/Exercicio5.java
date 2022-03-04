package Repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int n, somaN=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero para somar: ");
		n=ler.nextInt();
		
		do {
			somaN=(n+somaN);
			System.out.println("Digite um numero para somar: ");
			n=ler.nextInt();
		}while(n!=0);
			System.out.println("A soma dos numeros digitados é: "+somaN);
			System.out.println("FIM DO PROGRAMA");
		
	}
}
