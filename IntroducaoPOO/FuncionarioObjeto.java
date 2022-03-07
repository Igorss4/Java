package IntroducaoPOO;

public class FuncionarioObjeto {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		f1.nome="Bob";
		f1.cargo="Devs Junior";
		f1.tEmpresa=16;
		f1.nEfetividade=8;
		f1.softskills=true;
		
		f2.nome="Mariana";
		f2.cargo="Devs Pleno";
		f2.tEmpresa=22;
		f2.nEfetividade=4;
		f2.softskills=true;
		
		f1.estado();
		f1.promocao();
		f1.softskill();
		f2.estado();
		f2.treinamento();
		f3.estado();
		f3.softskill();
		
		
		
		
	}
}
