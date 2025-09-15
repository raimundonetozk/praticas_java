package questMoto;

public class Codmoto{
	String modelo;
	String cor;
	String placa;
	int ano;
	
	Codmoto(){
		
	}
	Codmoto(String modelo, String cor, String placa, int ano){
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getplaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
