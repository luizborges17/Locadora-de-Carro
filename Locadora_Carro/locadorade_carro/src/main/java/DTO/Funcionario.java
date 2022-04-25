package DTO;

public class Funcionario {

	String nome_func;
	String func;
	String salario;
	
	public Funcionario(String nome_func, String func, String salario) {
		this.nome_func = nome_func;
		this.func = func;
		this.salario = salario;
	}
	public String getNome_func() {
		return nome_func;
	}
	public void setNome_func(String nome_func) {
		this.nome_func = nome_func;
	}
	public String getFunc() {
		return func;
	}
	public void setFunc(String func) {
		this.func = func;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
}
