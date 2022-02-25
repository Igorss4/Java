package Introdução;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int vA,vB,vC,vR,vS,vD,vR2,vS2,vD2;
		
		System.out.println("Para calcular a expressão, determine o valor de A, B e C.");
		System.out.println("\nQual o valor de A?");
		vA=ler.nextInt();
		System.out.println("\nQual o valor de B?");
		vB=ler.nextInt();
		System.out.println("\nQual o valor de C?");
		vC=ler.nextInt();
		
		vR=(vA+vB);
		vS=(vB+vC);
		vR2=vR*vR;
		vS2=vS*vS;
		vD=(vR2+vS2)/2;
		
		System.out.println("\nO valor de R é "+vR2+", o valor de S é "+vS2+" e o valor de D é "+vD+".");
		
	}
}
