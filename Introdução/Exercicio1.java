package Introdução;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idadeA, idadeM, idadeD, iAno, iMes, iDia;
		System.out.println("Quer saber sua idade em dias?");
		System.out.println("\nDigite sua idade em anos: ");
		idadeA=ler.nextInt();
		System.out.println("\nEm meses: ");
		idadeM=ler.nextInt();
		System.out.println("\nE dias: ");
		idadeD=ler.nextInt();
		
		iAno=idadeA*365;
		iMes=idadeM*30;
		iDia=idadeD+iAno+iMes;
		
		System.out.println("\nSua idade em dias é: "+iDia);
		
	}

}
