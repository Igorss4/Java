package IntroducaoPOO;

public class Aviao {

	//Atributos
	
		String cor, companhia, destino;
		int combustivel, passageiros, numero;
		boolean rodas, turbinas;
		
		
		
		//METODO CONSTRUTOR
		
		public Aviao() {
			this.cor="Branco";
			this.companhia="VoeBem";
			this.combustivel=92;
			this.passageiros=531;
			this.rodas=false;
			this.turbinas=false;
			this.destino="Acapulco";
			this.numero=15336;
		}
		
		//Método
		
		public void decolar() {
			if(this.turbinas==true && this.rodas==true) {
				System.out.println("Iniciando decolagem, mantenham em seus acentos e travem os cintos!");
				this.rodas=false; }
			else if(this.turbinas==true && this.rodas==false)
				System.out.println("Para a decolagem, libere as rodas!");
			else if(this.turbinas==false && this.rodas==true)
					System.out.println("Para a decolagem, ligue as turbinas!");
			else 
				System.out.println("Para a decolagem, ligue as turbinas e libere as rodas!");
			
			}
		public void partida() {
			if(this.combustivel<=30)
				System.out.println("!Nivel critico de combustivel, solicitar abastecimento!");
			else
				System.out.println("Partida iniciada");
			
		}
		public void aterrissagem() {
			if(this.turbinas==true && this.rodas==true) 
				System.out.println("Desligue as turbinas para iniciar a aterrissagem!");
			else if(this.turbinas==true && this.rodas==false)
				System.out.println("Para a aterrissagem, desligue as turbinas e libere as rodas!");
			else if(this.turbinas==false && this.rodas==true)
					System.out.println("Prendam os cintos e aguardem a aterrissagem!");
			else 
				System.out.println("Para aterrissar, libere as rodas!");
			
			}
		public void estado() {
			System.out.println("Conpanhia prestadora: "+this.companhia);
			System.out.println("Avião de numeração: "+this.numero);
			System.out.println("Cor: "+this.cor);
			System.out.println("Quantidade de passageiros: "+this.passageiros);
			System.out.println("Com destino a "+this.destino);
			System.out.println("Nivel de combustivel: "+this.combustivel+"%");
			System.out.println("Turbinas: "+this.turbinas);
			System.out.println("Rodas: "+this.rodas);
		}
		public void aterrissar() {
			this.rodas=true;
			this.turbinas=false;
		}
		public void decolagem() {
			this.rodas=true;
			this.turbinas=true;
		}
		
		}
		

