package quest1;

public class conta {
	private String nome;
	private String cpf;
	private double saldo;
	
	conta(String nome, String cpf, double saldo){
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getcpf(){
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	public double getsaldo() {
		return saldo;
	}
	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}
	public void depositar(double valor) {
		if(valor > 0) {
			saldo = valor + saldo;
			System.out.println("O depósito de: " + valor + " foi realizado com sucesso!");
		}else {
			System.out.println("O valor de depósito não é o suficiente!");
		}
	}
	public void sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("O saque de: "+ valor + " foi realizado com sucesso!");
		}else {
			System.out.println("O usuário não tem saldo suficiente ou valor inválido!");
		}
	}
}
