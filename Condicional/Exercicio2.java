package Condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int x1, x2, x3, c1, c2, c3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros");
		System.out.println("Digite o primeiro numero: ");
		x1=ler.nextInt();
		x2=ler.nextInt();
		x3=ler.nextInt();
		
		if(x1>=x2 && x1>=x3) {
			c3=x1;
			if(x2>=x3) {
				c1=x3;
				c2=x2; 
			System.out.println("A ordem crescente dos numeros é "+c1+", "+c2+" e "+c3); }
			else {
				c1=x2;
				c2=x3;
				System.out.println("A ordem crescente dos numeros é "+c1+", "+c2+" e "+c3); }
		} 
		else if(x2>=x1 && x2>=x3) {
			c3=x2;
			if(x1>=x3) {
				c1=x3;
				c2=x1; 
			System.out.println("A ordem crescente dos numeros é "+c1+", "+c2+" e "+c3); }
			else {
				c1=x1;
				c2=x3;
				System.out.println("A ordem crescente dos numeros é "+c1+", "+c2+" e "+c3); }
		} 
		else if(x3>=x1 && x3>=x2) {
			c3=x3;
			if(x1>=x2) {
				c1=x2;
				c2=x1; 
				System.out.println("A ordem crescente dos numeros é "+c1+", "+c2+" e "+c3); }
			else {
				c1=x1;
				c2=x2;
				System.out.println("A ordem crescente dos numeros é "+c1+", "+c2+" e "+c3); }
		} 
			
		
		System.out.println("!FIM DO PROGRAMA!");
	}
}
