package IntroducaoPOO;

public class ProdutoEletronico {

	String tipo, cor, marca, status;
	int voltagem;
	boolean ligado, funcional;
	
	//METODO CONSTRUTOR
	
			public ProdutoEletronico() {
				this.cor="Preto";
				this.tipo="Televisao";
				this.marca="Samsung";
				this.voltagem=110;
				this.ligado=false;
				this.funcional=false;
				this.status="Desligado";
			}
			
			//Método
			
			public void ligar() {
				this.ligado=true;
			}
			public void desligar() {
				this.ligado=false;
			}
			public void avaliar() {
				if(this.funcional==false) {
					System.out.println("O aparelho está quebrado!");
					this.ligado=false;	}
				else
					System.out.println("Aparelho em bom estado!");
				}
			public void usar() {
				if(this.ligado==true) {
					System.out.println("Aparelho pronto!");
					this.status="Em uso"; 
					System.out.println("Status: "+this.status);}
				else
					System.out.println("Aparelho desligado!");
			}
			public void estado() 	{
				System.out.println("Tipo: "+this.tipo);
				System.out.println("Marca: "+this.marca);
				System.out.println("Cor: "+this.cor);
				System.out.println("Voltagem: "+this.voltagem+"v");
				System.out.println("Ligado: "+this.ligado);
				System.out.println("Funcional: "+this.funcional);
			}
}
