package Introdução;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idadeA, idadeM, idadeD, iAno, iMes, iDia, modA, modM;
		
		System.out.println("Quer saber sua idade? ");
		System.out.println("\nDigite sua idade em dias: ");
		idadeD=ler.nextInt();
		
		iAno=idadeD/365;
		iMes=idadeD/30;
		iDia=idadeD;
		modA=(idadeD%365)/30;
		modM=(idadeD%365)%30;
		
		System.out.println("\nVocê tem "+iAno+" anos, "+modA+" meses e "+modM+" dias.");
	
		

	}

}
