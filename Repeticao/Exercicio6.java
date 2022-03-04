package Repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int numero, media=0, x=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero=ler.nextInt();
		
		do {
			
			if(numero%3==0) {
				media=(numero+media); 
				x++;
			}
			System.out.println("Digite um numero: ");
			numero=ler.nextInt();
		}
			while(numero!=0);
		System.out.println("A média dos numeros multiplus de 3 é "+media/x);
		}
				
	}

