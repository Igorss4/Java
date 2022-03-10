package Erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		
		int n;
		
		try {
			System.out.println("Digite um numero: ");
			n=ler.nextInt();
			System.out.println(30/n);
		}catch(ArithmeticException erro) {
			System.out.println("Não é possivel dividir por ZERO!!!  "+erro);
		}catch (InputMismatchException erro) {
			System.out.println("Só pode digitar vaores inteiros!!!  "+erro);
		}
		
		System.out.println("FIM DO PROGRAMA");
		
	}
}
