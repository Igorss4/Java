package Condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double x, y;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		x=ler.nextDouble();
		
		if(x==0) {
			System.out.println("Seu numero � 0"); }
		
		else if((x%2)==0)
		{
			y =Math.sqrt(x);
			System.out.println("O numero � par");
			System.out.println("A raiz quadrada � "+y);
			
		}
		else 
		{
			y = (x*x);
			System.out.println("O numero � impar");
			System.out.println("O numero elevado ao quadrado � "+y);
		}
		
		
		}
	}

