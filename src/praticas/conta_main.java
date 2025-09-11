package quest1;

public class conta_main {

	public static void main(String[] args) {
		conta user = new conta("raimundo", "*********", 100);
		
		System.out.println("Usuário: " + user.getnome());
		System.out.println("cpf: " + user.getcpf());
		System.out.println("valor de saldo: " + user.getsaldo());
		
		user.depositar(100);
		user.sacar(100);
	}
}
