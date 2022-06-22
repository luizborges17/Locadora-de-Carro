package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import DTO.Funcionario;

public class FuncionarioDAO {

	Connection conn;
	PreparedStatement stm;

	public void cadastrarFuncionario(Funcionario objfunc) {
		String sql = "INSERT INTO funcionario (nome_func,func,salario) values (?,?,?)";

		try (Connection conn = new Conectar().conectaBD();PreparedStatement stm = conn.prepareStatement(sql);) {

			stm.setString(1, objfunc.getNome_func());
			stm.setString(2, objfunc.getFunc());
			stm.setString(3, objfunc.getSalario());


			stm.execute();
			stm.close();

		} catch (SQLException e) {
			
			System.out.println("erro de conexão");
		}

	}
}
