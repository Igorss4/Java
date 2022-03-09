package Heranca;

public class Cavalo extends Animal{

	private String movimento;
	
	
	@Override
	public void emitirSom(){
		System.out.println("Relinchando...");
	}
	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
}
