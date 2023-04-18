package aula12_polimorfismo;

public class Cachorro extends Mamifero {
	
	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando rabo");
	}
}
