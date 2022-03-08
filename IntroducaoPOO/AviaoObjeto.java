package IntroducaoPOO;

public class AviaoObjeto {

	public static void main(String[] args) {
		
		Aviao a1 = new Aviao();
		Aviao a2 = new Aviao();
		Aviao a3 = new Aviao();
		
	
		
		a1.decolagem();
		a1.estado();
		a1.partida();
		a1.decolar();
		a1.aterrissar();
		a1.aterrissagem();
		System.out.println(" ");
		a2.combustivel=30;
		a2.companhia="Tam";
		a2.cor="Azul";
		a2.estado();
		a2.partida();
		a2.decolar();
		a2.aterrissagem();
		System.out.println(" ");
		a3.turbinas=true;
		a3.destino="Paris";
		a3.cor="Amarelo";
		a3.estado();
		a3.decolar();
		a3.aterrissagem();
		System.out.println("");
		System.out.println(a1.getCombustivel());
		
		
	}
}
