package IntroducaoPOO;

public class PacienteObjeto {

	public static void main(String[] args) {
		
		Paciente pa1 = new Paciente();
		Paciente pa2 = new Paciente();
		
		pa1.nome="Pedro Cabral";
		pa1.idade=32;
		pa1.situacao="Dor de cabeça e febre";
		pa1.fila=35;
		pa1.nPrioridade=4;
		pa1.convenio=false;
		
		pa2.nome="Paula Brito";
		pa2.idade=44;
		pa2.situacao="Garganta inflamada e dor nos olhos";
		pa2.fila=13;
		pa2.nPrioridade=2;
		pa2.convenio=true;
		
		pa1.estado();
		pa1.prioridade();
		pa2.estado();
		pa2.nfila();
	}
}
