package Introdução;

import java.util.Scanner;

public class Exercicio7 {
	
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			double  A, B, C, D, E, F, X, Y, ex1, ex2, ey1, ey2, n1, n2;
			
			System.out.println("Digite 6 valores para realizar a equação: ");
			A=ler.nextDouble();
			B=ler.nextDouble();
			C=ler.nextDouble();
			D=ler.nextDouble();
			E=ler.nextDouble();
			F=ler.nextDouble();
			
			ex1 = (C*E)-(B*F);
			ex2 = (A*E)-(B*D);
			ey1 = (A*F)-(C*D);
			ey2 = (A*E)-(B*D);
			X = ex1/ex2;
			Y = ey1/ey2;
			n1 = (A*X)+(B*Y);
			n2 = (D*X)+(E*Y);
			
			System.out.println("O valor de x é "+X+" e o valor de y é "+Y+" o valor da equação é "+n1+" e "+n2);
			}
}
