package Heranca;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo cav1 = new Cavalo();
		Preguica pre1 = new Preguica();
		
		c1.setNome("Cachorro Pastor Alem�o");
		c1.setIdade(4);
		c1.setSom("au-au");
		c1.setMovimento("Correr");
		c1.estado();
		System.out.println("O movimento � "+c1.getMovimento());
		System.out.println("");
		cav1.setNome("Cavalo Ardennes");
		cav1.setIdade(7);
		cav1.setSom("Hiin in in");
		cav1.setMovimento("Correr");
		cav1.estado();
		System.out.println("O movimento � "+cav1.getMovimento());
		System.out.println("");
		pre1.setNome("Pregui�a-an�-de-tr�s-dedos");
		pre1.setIdade(8);
		pre1.setSom("Aaannh");
		pre1.setMovimento("Escalar Arvores");
		pre1.estado();
		System.out.println("O movimento � "+pre1.getMovimento());
	}

}
