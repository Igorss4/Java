package IntroducaoPOO;

public class ContaBancaria {
	
	String nome;
	double vCorrente;
	boolean negativado;
	
	public ContaBancaria() {
		this.nome="Pedro Alvares";
		this.vCorrente=1652.22;
		this.negativado=true;
		
	}
	public void emprestimo() {
		if(this.negativado==true)
			System.out.println("Nao é possivel liberar emprestimo");
		else
			System.out.println("Emprestimo confirmado");
	}
	public void transferencia() {
		if(this.vCorrente>1.0)
			System.out.println("Sua conta esta habilitada para transferencias");
		else
			System.out.println("Saldo insuficiente para transferencias");
		}
	public void estado() {
		System.out.println(" ");
		System.out.println("Nome: "+this.nome);
		System.out.println("Valor em conta corrente: "+this.vCorrente);
		System.out.println("Negativado: "+this.negativado);
		System.out.println(" ");
}
}
