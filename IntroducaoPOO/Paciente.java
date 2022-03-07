package IntroducaoPOO;

public class Paciente {

	String nome, situacao;
	int fila, idade, nPrioridade;
	boolean convenio;
	
	public Paciente() {
		this.nome="Diego";
		this.situacao="Dor de cabeça";
		this.fila=22;
		this.idade=35;
		this.convenio=false;
	}
	
	public void nfila() {
		if(this.convenio==true && this.fila>=10)
			System.out.println("Seu numero da fila pelo convenio é "+(this.fila-7));
		else
			System.out.println("Seu numero da fila é "+this.fila);
	}
	public void prioridade() {
		if(this.nPrioridade>3) {
			System.out.println("Prioridade de atendimento!");
			this.fila=1;
			System.out.println("Seu numero da fila é "+this.fila);	
			System.out.println(" ");	}
	}
	public void estado() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Diagnostico: "+this.situacao);
		System.out.println("Convenio: "+this.convenio);
				 }
}
