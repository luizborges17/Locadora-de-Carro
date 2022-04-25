package DTO;

public class Cliente {
	
	String nomeCliente;
	String cpfCliente;
	String enderecoCliente;
	
	public Cliente(String nomeCliente, String cpfCliente, String enderecoCliente) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	

}
