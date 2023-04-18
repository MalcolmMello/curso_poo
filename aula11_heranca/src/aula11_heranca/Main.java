package aula11_heranca;

public class Main {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		
		v1.setNome("Visitante 1");
		v1.setIdade(18);
		v1.setSexo("M");
		
		Professor p1 = new Professor();
		
		p1.setNome("Professor 1");
		p1.setIdade(28);
		p1.setSexo("F");
		p1.setEspecialidade("Programação");
		p1.setSalario(3500.50f);
		
		Aluno a1 = new Aluno();
		
		a1.setNome("Aluno 1");
		a1.setIdade(17);
		a1.setSexo("F");
		a1.setMatricula(1);
		a1.setCurso("Desenvolvimento");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		
		b1.setNome("Aluno 2");
		b1.setIdade(20);
		b1.setSexo("M");
		b1.setMatricula(1);
		b1.setCurso("Desenvolvimento");
		b1.pagarMensalidade();
		
		Tecnico t1 = new Tecnico();
		
		t1.setNome("Aluno 3");
		t1.setIdade(20);
		t1.setSexo("M");
		t1.setMatricula(1);
		t1.setCurso("Desenvolvimento");
		t1.pagarMensalidade();
	}

}
