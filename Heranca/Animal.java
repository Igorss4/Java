package Heranca;

public abstract class Animal {

	private String nome, som;
	private int idade;
	
	public abstract void emitirSom();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void estado() {
		System.out.println("O nome � "+this.nome);
		System.out.println("A idade � "+this.idade+" anos");
	}
	
			
}
