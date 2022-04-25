package com.example.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import DTO.Carro;
import DTO.Cliente;
import DTO.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloController {
// Elementos tela  Cliente
    @FXML
    private AnchorPane geral;

    @FXML
    private TextField txtCliente;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtEndereco;
    
// Elementos da tela Carro
    @FXML
    private AnchorPane geral1;

    @FXML
    private TextField txtNomecarro;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtPreco;
 // Elementos da tela func
    @FXML
    private AnchorPane geral2;

    @FXML
    private TextField txtFunc;

    @FXML
    private TextField txtFuncao;

    @FXML
    private TextField txtSalario;


// Botões cliente cliente
    @FXML
    void btnCliente(ActionEvent event) throws IOException {
        
    	FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Hello.fxml"));
        Scene scene = new Scene((Parent) fxmlLoader.load(), 600, 300);
        Stage stage = new Stage();
        stage.setTitle("Locadora de Carro");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }
    
    @FXML
    void btnCadastrar(ActionEvent event) {
    	
    	String nomeCliente = this.txtCliente.getText();
    	String cpfCliente = this.txtCpf.getText();
    	String enderecoCliente = this.txtEndereco.getText();
    	
    	Cliente objclientedto = new Cliente(nomeCliente, cpfCliente, enderecoCliente);
    	
    	objclientedto.setNomeCliente(nomeCliente);
    	objclientedto.setCpfCliente(cpfCliente);
    	objclientedto.setEnderecoCliente(enderecoCliente);
    	
    	System.out.println("\n\nO cpf do cliente e: " + objclientedto.getCpfCliente());
    	System.out.println("O nome do cliente e: " + objclientedto.getNomeCliente());
    	System.out.println("O endereço do cliente e: " + objclientedto.getEnderecoCliente());
    	
    	ArrayList<String> Cliente = new ArrayList<String>();
    	Cliente.add(objclientedto.getNomeCliente());
    	Cliente.add(objclientedto.getCpfCliente());
    	Cliente.add(objclientedto.getEnderecoCliente());
    	
    	System.out.println("\n" + Cliente);

    }
    
// Botões carro
    
    @FXML
    void btnCarro(ActionEvent event) throws IOException {
        
    	FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Carro.fxml"));
        Scene scene = new Scene((Parent) fxmlLoader.load(), 600, 300);
        Stage stage = new Stage();
        stage.setTitle("Locadora de Carro");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }
    
    @FXML
    void btnCadastrarcarro(ActionEvent event) {
    	String nomeCarro = this.txtNomecarro.getText();
    	String placa = this.txtPlaca.getText();
    	String preco = this.txtPreco.getText();
    	
    	Carro objcarro = new Carro(placa, nomeCarro, preco);
    	
    	objcarro.setNomeCarro(nomeCarro);
    	objcarro.setPlaca(placa);
    	objcarro.setPreco(preco);
    	
    	System.out.println("\n\nO modelo do carro e: "+ objcarro.getNomeCarro());
    	System.out.println("A placa do carro e: " + objcarro.getPlaca());
    	System.out.println("O preco do carro e: " + objcarro.getPreco());
    	
    	ArrayList<String> Carro = new ArrayList<String>();
    	
    	Carro.add(objcarro.getPlaca());
    	Carro.add(objcarro.getNomeCarro());
    	Carro.add(objcarro.getPreco());
    	
    	System.out.println("\n"+Carro);

    }

    // Botões Func

    @FXML
    void btnFunc(ActionEvent event) throws IOException {
        
    	FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Func.fxml"));
        Scene scene = new Scene((Parent) fxmlLoader.load(), 600, 300);
        Stage stage = new Stage();
        stage.setTitle("Locadora de Carro");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }
    
    @FXML
    void btnCadastrarfunc(ActionEvent event) {
    	
    	String nomeFunc = this.txtFunc.getText();
    	String func = this.txtFuncao.getText();
    	String salario = this.txtSalario.getText();
    	
    	Funcionario objfunc = new Funcionario(nomeFunc, func, salario);
    	
    	objfunc.setFunc(func);
    	objfunc.setNome_func(nomeFunc);
    	objfunc.setSalario(salario);
    	
    	ArrayList<String> Funcionario = new ArrayList<String>();
    	
    	Funcionario.add(objfunc.getNome_func());
    	Funcionario.add(objfunc.getFunc());
    	Funcionario.add(objfunc.getSalario());
    	
    	
    	System.out.println("\nA função determinada é: " + objfunc.getFunc());
    	System.out.println("O nome do funcionário é: " + objfunc.getNome_func());
    	System.out.println("O salário do funcionário é: " + objfunc.getSalario());
    	
    	System.out.println("\n" + Funcionario);
    }
    

}
