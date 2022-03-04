package Repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int i=0, menor=0, maior=0;
		Scanner ler = new Scanner(System.in);
		
		
		
		while(i!=-99) {
			 if(i<=21) {
				 menor++;
			 }
			 if(i>=50) {
				 maior++;
			 }
			 System.out.println("Digite sua idade: ");
			 i=ler.nextInt();
		}
		System.out.println("São "+menor+" pessoas com menos de 21 anos e "+maior+" pessoas com mais de 50 anos");
		System.out.println("FIM DO PROGRAMA");
	}
}
