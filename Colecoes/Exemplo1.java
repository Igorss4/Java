package Colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exemplo1 {

	public static void main(String[] args) {
		
		String aula1 ="Bloco1";
		String aula2 ="Bloco2";
		String aula3 ="Bloco3";
		
		ArrayList<String>aula = new ArrayList<>();
		
		System.out.println(aula);
		
		aula.add(aula1);//inseri o conteudo da variavel na ArrayList
		aula.add(aula2);//inseri o conteudo da variavel na ArrayList
		aula.add(aula3);//inseri o conteudo da variavel na ArrayList
		aula.add("hakunamatata");//inseri um texto na ArrayList
		aula.add("Feira de Empregabilidade");//inseri um texto na ArrayList
		
		String x=aula.get(0);
		aula.add("variavel");
		aula.set(3,"Entrevistas");
		
		System.out.println("A primeira aula é: "+aula.get(3));
		System.out.println(aula);
		Collections.sort(aula);
		
		int b=5*4-2;
		aula.add("variavel");
		System.out.println(aula.contains("variavel"));
		
		System.out.println(aula);
		
	}
}
