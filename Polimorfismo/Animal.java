package Polimorfismo;

public abstract class Animal {

	private String cor;
	private double peso;
	
	public abstract void EmitirSom();//apenas para sobreposição com o override
	
	public void locomover() {
		System.out.println("Correndo...");
	}
}
