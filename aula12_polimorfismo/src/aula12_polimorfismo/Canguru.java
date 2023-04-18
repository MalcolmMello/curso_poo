package aula12_polimorfismo;

public class Canguru extends Mamifero {
	public void usarBolsa() {
		
	}
	
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
}
