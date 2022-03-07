package IntroducaoPOO;

public class Patinete {

	String cor, material;
	double rodas;
	int rolamento,bateria;
	boolean freio;
	
	public Patinete() {
		this.cor="Preto";
		this.material="Metal";
		this.rolamento=5;
		this.rodas=180.0;
		this.freio=false;
		this.bateria=7;
	}
	public void ligar() {
		if(this.bateria>10)
			System.out.println("Ligando patinete..."+"\nPatinete ligado");
		else
			System.out.println("Bateria baixa, conecte o carregador");
	}
	public void velocidade() {
		if(this.rolamento>=5)
			System.out.println("Patinete de alta velocidade!");
		else
			System.out.println("Patinete de velocidade media");
	}
	public void estado() {
		System.out.println("Cor: "+this.cor);
		System.out.println("Material: "+this.material);
		System.out.println("Rolamento: "+this.rolamento);
		System.out.println("Rodas: "+this.rodas);
		System.out.println("Freio: "+this.freio);
		System.out.println(" ");
	}
	public void frenagem() {
		if(this.freio==true)
			System.out.println("Patinete seguro!");
		else
			System.out.println("Patinete sem segurança!");
	}
		
}
