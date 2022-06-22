package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.Carro;

public class CarroDAO {
	Connection conn;
	PreparedStatement stm;

	public void cadastrarCarro(Carro objcarro) {
		String sql = "INSERT INTO carro (nome,placa,preco) values (?,?,?)";

		try (Connection conn = new Conectar().conectaBD();PreparedStatement stm = conn.prepareStatement(sql);) {

			stm.setString(1, objcarro.getNomeCarro());
			stm.setString(2, objcarro.getPlaca());
			stm.setString(3, objcarro.getPreco());


			stm.execute();
			stm.close();

		} catch (SQLException e) {
			
			System.out.println("erro de conexão");
		}

	}
}
