package questMoto;

public class Moto {
	public static void main(String[] args) {
		Codmoto moto = new Codmoto("Bros", "preta e branco", "XYZ4610", 2018);
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Placa: "+ moto.getplaca());
		System.out.println("Ano da moto: "+ moto.getAno());
	}
}
