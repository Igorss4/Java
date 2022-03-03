package Condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double x, y;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		x=ler.nextDouble();
		
		if(x==0) {
			System.out.println("Seu numero é 0"); }
		
		else if((x%2)==0)
		{
			y =Math.sqrt(x);
			System.out.println("O numero é par");
			System.out.println("A raiz quadrada é "+y);
			
		}
		else 
		{
			y = (x*x);
			System.out.println("O numero é impar");
			System.out.println("O numero elevado ao quadrado é "+y);
		}
		
		
		}
	}

