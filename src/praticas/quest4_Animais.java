package questAnimais;

public class quest4_Animais {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		
		animal1.setEspécie("Leão");
		animal1.setQuantMembros("5");
		
		animal2.setEspécie("Gato");
		animal2.setQuantMembros("5");
		
		animal3.setEspécie("Macaco");
		animal3.setQuantMembros("5");
		
		System.out.println("Nome do primeiro animal: " + animal1.espécie + ", quantidade de membros do primeiro animal: " + animal1.quantMembros);
		System.out.println("Nome do segundo animal: " + animal2.espécie + ", quantidade de membros do segundo animal: " + animal2.quantMembros);
		System.out.println("Nome do terceiro animal: " + animal3.espécie + ", quantidade de membros do terceiro animal: " + animal3.quantMembros);
		
	}
}
