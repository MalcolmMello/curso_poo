package aula11_heranca;

public class Tecnico extends Aluno {
	private int registroProfissional;
	
	public void praticar() {
		System.out.println("Estou praticando!");
		
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
}
