package Heranca;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo cav1 = new Cavalo();
		Preguica pre1 = new Preguica();
		
		c1.setNome("Cachorro Pastor Alemão");
		c1.setIdade(4);
		c1.setMovimento("Correr");
		c1.emitirSom();
		c1.estado();
		System.out.println("O movimento é "+c1.getMovimento());
		System.out.println("");
		cav1.setNome("Cavalo Ardennes");
		cav1.setIdade(7);
		cav1.setMovimento("Correr");
		cav1.emitirSom();
		cav1.estado();
		System.out.println("O movimento é "+cav1.getMovimento());
		System.out.println("");
		pre1.setNome("Preguiça-anã-de-três-dedos");
		pre1.setIdade(8);
		pre1.setMovimento("Escalar Arvores");
		pre1.emitirSom();
		pre1.estado();
		System.out.println("O movimento é "+pre1.getMovimento());
	}

}
