package Introdução;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double vFabr, vCons, vDist, vImpo;
		
		System.out.println("Para saber o valor do carro para o consumidor, digite o valor de fabrica: ");
		vFabr=ler.nextDouble();
		
		vDist = vFabr*0.28;
		vImpo = vFabr*0.45;
		vCons = (vFabr+vImpo+vDist);
		
		System.out.println("O valor do carro para Consumidor é de "+vCons+" sendo o valor do imposto de "+vImpo+" e o valor do Distribuidor de "+vDist);

	}

}
