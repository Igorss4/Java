package Colecoes;

import java.util.ArrayList;

public class Estoque {


	public static void main(String[] args) {
		EstoqueBack e1=new EstoqueBack("Cilindro Pneumático", 15);
		EstoqueBack e2=new EstoqueBack("Conexão Hidráulica 2'polegadas", 26);
		EstoqueBack e3=new EstoqueBack("O'ring Diametros diversos", 87);
		EstoqueBack e4=new EstoqueBack("Disjuntor C300amperes", 30);
		
		ArrayList<EstoqueBack>produto = new ArrayList<>();
		
		System.out.println(produto);
		produto.add(e1);
		produto.add(e2);
		produto.add(e3);
		System.out.println(produto);
		produto.remove(e2);
		
		System.out.println();
		System.out.println(produto);
		
		produto.set(0, e4);
		produto.add(e2);
		System.out.println(produto);
	}
}
