package IntroducaoPOO;

public class PatineteObjeto {

	public static void main(String[] args) {
		
		Patinete p1 = new Patinete();
		Patinete p2 = new Patinete();
		Patinete p3 = new Patinete();
		
		p1.bateria=100;
		p1.cor="Dourado";
		p1.freio=true;
		p1.material="Aluminio";
		p1.rodas=155.0;
		p1.rolamento=9;
		
		p2.bateria=54;
		p2.cor="Azul";
		p2.freio=true;
		p2.material="Ferro";
		p2.rodas=170.0;
		p2.rolamento=3;
		
		p3.freio=false;
		p3.rolamento=6;
		
			p1.estado();
			p1.ligar();
			p1.frenagem();
			p1.velocidade();

			p2.estado();
			p2.ligar();
			p2.frenagem();
			p2.velocidade();
			

			p3.estado();
			p3.ligar();
			p3.frenagem();
			p3.velocidade();

	}

}
