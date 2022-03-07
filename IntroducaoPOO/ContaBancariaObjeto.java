package IntroducaoPOO;

public class ContaBancariaObjeto {

	public static void main(String[] args) {
		
		ContaBancaria cb1 = new ContaBancaria();
		ContaBancaria cb2 = new ContaBancaria();
		
		cb1.nome="Paulo Henrique";
		cb1.vCorrente=600.40;
		cb1.negativado=false;
		
		cb2.nome="Patricia Guilhermina";
		cb2.vCorrente=0.22;
		cb2.negativado=true;

		cb1.estado();
		cb1.emprestimo();
		cb1.transferencia();
		cb2.estado();
		cb2.emprestimo();
		cb2.transferencia();
	}

}
