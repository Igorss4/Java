package IntroducaoPOO;

public class ProdutoEletronicoObjeto {

	public static void main(String[] args) {
		
		ProdutoEletronico pE1 = new ProdutoEletronico();
		ProdutoEletronico pE2 = new ProdutoEletronico();
		ProdutoEletronico pE3 = new ProdutoEletronico();
		
		pE1.cor="Branco";
		pE1.funcional=true;
		pE1.ligado=true;
		pE1.marca="LG";
		pE1.tipo="Celular";
		pE1.voltagem=5;
		pE1.estado();
		pE1.avaliar();
		pE1.usar();
		System.out.println(" ");
		pE2.cor="Azul";
		pE2.ligado=true;
		pE2.marca="Motorola";
		pE2.tipo="Tablet";
		pE2.voltagem=7;
		pE2.estado();
		pE2.avaliar();
		pE2.usar();
		System.out.println(" ");
		pE3.estado();
		pE3.avaliar();
		pE3.usar();
	}
}
