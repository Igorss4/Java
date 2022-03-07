package IntroducaoPOO;

public class Funcionario {

	String nome, cargo;
	int tEmpresa, nEfetividade;
	boolean softskills;
	
	public Funcionario() {
		this.nome="Caio";
		this.cargo="Devs Junior";
		this.tEmpresa=1;
		this.nEfetividade=7;
		this.softskills=false;
	}
		
		public void promocao() {
			if(this.tEmpresa>=13 && this.nEfetividade>=7 && this.softskills==true)
				System.out.println("O funcionario é apto para uma promoção!");
			else if (this.nEfetividade>=7 && this.softskills==true)
				System.out.println("O funcionario entrou na lista de espera para promoção!");
			else
				System.out.println("O funcionario nao é apto para uma promoção!");
		}
		public void treinamento() {
			if(this.nEfetividade<=5)
				System.out.println("O funcionario precisa de treinamento");
			
	}
		public void softskill() {
			if(this.softskills==false)
				System.out.println("O funcionario precisa rever as softskills");
		}
		public void treino() {
			this.softskills=true;
		}
		public void estado() {
			System.out.println("Nome: "+this.nome);
			System.out.println("Cargo: "+this.cargo);
			System.out.println("Tempo de empresa: "+this.tEmpresa);
			System.out.println("Nota de Efetividade: "+this.nEfetividade);
			System.out.println("SoftSkills: "+this.softskills);
			System.out.println(" ");
		}
}
