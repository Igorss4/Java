package Repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int n=0, nI=0, nP=0;
		Scanner ler= new Scanner(System.in);
		
		
		for(int x=1;x<=10;x++) {
		System.out.println("Digite um numero: ");
		n=ler.nextInt();
		
			if(n%2==0) {
				nP++;	}
		
			else { 
				nI++;	}	
			}
		System.out.println("A quantidade de numeros pares é "+nP+" e a quantidade de impares é "+nI);
	}
}
