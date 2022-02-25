package Introdução;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int tDuracao, tHora, tMin, tSeg, modH, modM;
		
		System.out.println("Qual o tempo de duração do evento?");
		System.out.println("\nDigite o tempo em segundos: ");
		tDuracao=ler.nextInt();
		
		tHora=tDuracao/3600;
		tMin=(tDuracao%3600)/60;
		tSeg=(tDuracao%3600)%60;
		
		System.out.println("\nO tempo do evento é de "+tHora+" horas, "+tMin+" minutos e "+tSeg+" segundos.");
		

	}

}
