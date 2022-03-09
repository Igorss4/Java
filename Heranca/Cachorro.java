package Heranca;

public class Cachorro extends Animal{

	private String movimento;

	@Override
	public void emitirSom(){
		System.out.println("Latindo...");
	}
	
	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
}
