package HerancaExemplos;

public class Gen {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno a1 = new Aluno();
		Professor prof1 = new Professor();
		
		p1.setNome("Nath");
		a1.setNome("Nanda");
		prof1.setNome("Anderson");
		
		System.out.println("O nome da pessoa é "+p1.getNome());
		System.out.println("O nome da aluna é "+a1.getNome());
		System.out.println("O nome do professor é "+prof1.getNome());
		
	}
}
