package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.Cliente;

public class ClienteDAO {

	Connection conn;
	PreparedStatement stm;

	public void cadastrarCliente(Cliente objclientedto) {
		String sql = "INSERT INTO cliente (nome_cliente,cpf,endereco) values (?,?,?)";

		try (Connection conn = new Conectar().conectaBD();PreparedStatement stm = conn.prepareStatement(sql);) {

			stm.setString(1, objclientedto.getNomeCliente());
			stm.setString(2, objclientedto.getCpfCliente());
			stm.setString(3, objclientedto.getEnderecoCliente());


			stm.execute();
			stm.close();

		} catch (SQLException e) {
			
			System.out.println("erro de conexão");
		}

	}
}
