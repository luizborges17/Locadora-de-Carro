package DTO;

public class Carro {
	
	String placa;
	String nomeCarro;
	String preco;
	
	public Carro(String placa, String nomeCarro, String preco) {
		this.nomeCarro = nomeCarro;
		this.placa = placa;
		this.preco = preco;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNomeCarro() {
		return nomeCarro;
	}
	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	

}
