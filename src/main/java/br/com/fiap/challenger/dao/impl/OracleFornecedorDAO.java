package br.com.fiap.challenger.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fiap.challenger.bean.Fornecedor;
import br.com.fiap.challenger.dao.FornecedorDAO;
import br.com.fiap.challenger.exception.DBException;
import br.com.fiap.challenger.singleton.ConnectionManager;

public class OracleFornecedorDAO implements FornecedorDAO {
	PreparedStatement stmt = null;
	private Connection conexao;

	@Override
	public void cadastrar(Fornecedor fornecedor) throws DBException {
		// TODO Auto-generated method stub
		
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO T_FORNECEDOR (cd_fornecedor, nm_fornecedor, nr_cnpj, ds_categoria_producao, ds_endereco, nr_telefone, nr_nivel_susten, ds_descricao ) VALUES (SQ_T_FORNECEDOR.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, fornecedor.getNm_fornecedor());
			stmt.setString(2, fornecedor.getNr_cnpj());
			stmt.setString(3, fornecedor.getDs_categoria_producao());			
			stmt.setString(4, fornecedor.getDs_endereco());
			stmt.setString(5, fornecedor.getNr_telefone());
			stmt.setInt(6, fornecedor.getNr_nivel_susten());
			stmt.setString(7, fornecedor.getDs_descricao());
		
				
			

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao cadastradar.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	}

