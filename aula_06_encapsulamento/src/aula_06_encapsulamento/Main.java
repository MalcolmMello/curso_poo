package aula_06_encapsulamento;

public class Main {
	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.maisVolume();
		c.play();
		c.ligarMudo();
		c.abrirMenu();
	}
}
