package aula05_banco;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		c1.abrirConta("CC", "Malcolm");
		
		Conta c2 = new Conta();
		
		c2.abrirConta("Usuário 02", "CP");
		
		c1.depositar(100);
		c2.depositar(500);
		c2.sacar(100);
		
		c1.sacar(150);
		c1.fecharConta();
		
		c1.statusAtual();
		c2.statusAtual();

	}

}
