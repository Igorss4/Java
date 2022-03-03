package Condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int x1, x2, x3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros");
		System.out.println("Digite o primeiro numero: ");
		x1=ler.nextInt();
		x2=ler.nextInt();
		x3=ler.nextInt();
		
		if(x1>=x2 && x1>=x3)
			System.out.println("O maior numero é "+x1);
		else if(x2>=x1 && x2>=x3)
			System.out.println("O maior numero é "+x2);
		else if(x3>=x1 && x3>=x2)
			System.out.println("O maior numero é "+x3);
		System.out.println("!FIM DO PROGRAMA!");
		
		
		
			
		
		
		
		
	}
}
