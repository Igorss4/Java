package Condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		x=ler.nextInt();
		
		if(x<10) {
			System.out.println("Voce é criança"); }
		else if(x>=10 && x<=14) {
			System.out.println("Voce é infantil"); }
		else if(x>=15 && x<=17) {
			System.out.println("Voce é juvenil"); }
		else if(x>=18 && x>25) {
			System.out.println("Voce é adulto"); }
	}
}
