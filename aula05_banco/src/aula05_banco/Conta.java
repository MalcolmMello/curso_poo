package aula05_banco;

import java.util.Random;

public class Conta {
	private Random gerador;
	
	public int numConta;
	protected String tipo;
	public String dono;
	public float saldo;
	public boolean aberto;
	
	
	public Conta() {
		setSaldo(0);
		setAberto(false);
	}
	
	private int generateInt() {
		return this.gerador.nextInt(0, 5000);
	}
	
	public void abrirConta(String tipo, String dono) {
		this.gerador = new Random();
		
		setNumConta(generateInt());
		
		setTipo(tipo);
		setDono(dono);
		setAberto(true);
		
		if(tipo == "CC") {
			setSaldo(50);
		} else if(tipo == "CP") {
			setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if(getSaldo() <= 0) {
			System.out.println("Você não pode fechar a conta estando em débito.");
			return;
		} else if(getSaldo()  >= 0) {
			System.out.println("Saque todo o seu dinheiro primeiro.");
			return;
		} else {
			setAberto(false);
			System.out.println("Sua conta foi fechada.");
			return;
		}
		
	}
	
	public void depositar(float dinheiro) {
		if(isAberto() == true) {
			this.saldo += dinheiro;
			getSaldo();
			return;
		} else {
			System.out.println("Sua conta foi fechada!");
			return;
		}
	}
	
	public void sacar(float dinheiro) {
		if(isAberto() == false) {
			System.out.println("Sua conta foi fechada!");
			return;
		}
		
		if(getSaldo() - dinheiro >= 0) {
			this.saldo -= dinheiro;
			
			return;
		} else {
			System.out.println("Saldo insuficiente!");
			return;
		}
		
	}
	
	public void pagarMensal() {
		float valor = 0;
		
		if(getTipo() == "CC") {
			valor = 12;
		} else if(getTipo() == "CP") {
			valor = 20;
		}
		
		if(isAberto() == true) {
			if(getSaldo() - valor >= 0) {
				this.saldo -= valor;
			} else {
				System.out.println("Saldo insuficiente");
				return;
			}
		} else {
			System.out.println("Sua conta foi fechada!");
			return;
		}
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getSaldo() {
		return this.saldo;
	}
	
	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public void statusAtual() {
		System.out.println("Conta: " + getNumConta());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Dono: " + getDono());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Status: " + isAberto() + "\n");
	}
}
