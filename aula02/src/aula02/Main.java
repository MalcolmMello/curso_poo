package aula02;

public class Main {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.modelo = "BIC Cristal";
		c1.cor = "azul";
		// c1.ponta = 0.5f;
		c1.carga = 80;
		
		// c1.tampada = false;
		c1.tampar();
		c1.destampar();
		
		c1.status();
	}

}
