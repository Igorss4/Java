package Repeticao;

public class Exercicio1 {

	public static void main(String[] args) {
		int n;
		
		for(n=1000;n<=1999;n++) {
			if(n%11==5) {
				System.out.println("O numero � "+n+" com resto de "+n%11);
			}
		}
					
	}
}
