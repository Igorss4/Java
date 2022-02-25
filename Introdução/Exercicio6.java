package Introdução;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x1, x2, y1, y2;
		double D, x3,y3;
		
		System.out.println("Escreva o valor de x1");
		x1=ler.nextInt();
		System.out.println("Escreva o valor de x2");
		x2=ler.nextInt();
		System.out.println("Escreva o valor de y1");
		y1=ler.nextInt();
		System.out.println("Escreva o valor de y2");
		y2=ler.nextInt();
		
		x3=x1-x2;
		y3=y1-y2;
		
		D =Math.sqrt((x3*x3)+(y3*y3));
	
		
		System.out.println("O resultado é "+D);
				
	}

}
