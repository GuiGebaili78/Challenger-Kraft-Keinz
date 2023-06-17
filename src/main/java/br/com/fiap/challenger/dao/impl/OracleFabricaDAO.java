package br.com.fiap.challenger.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.challenger.dao.FabricaDAO;
import br.com.fiap.challenger.bean.Fabrica;
import br.com.fiap.challenger.exception.DBException;
import br.com.fiap.challenger.singleton.ConnectionManager;

public class OracleFabricaDAO implements FabricaDAO {
	
	private Connection conexao;
	
	@Override
	public void cadastrar(Fabrica fabrica) throws DBException {
		PreparedStatement stmt = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO T_FABRICA (cd_fabrica, nm_fabrica, nr_cnpj, ds_produtos, ds_continente, ds_pais, ds_estado, ds_cidade, ds_endereco, nr_nivel_risco, ds_descricao ) VALUES (SQ_T_FABRICA.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, fabrica.getNm_fabrica());
			stmt.setString(2, fabrica.getNr_cnpj());
			stmt.setString(3, fabrica.getDs_produtos());			
			stmt.setString(4, fabrica.getDs_continente());
			stmt.setString(5, fabrica.getDs_pais());
			stmt.setString(6, fabrica.getDs_estado());
			stmt.setString(7, fabrica.getDs_cidade());
			stmt.setString(8, fabrica.getDs_endereco());
			stmt.setInt(9, fabrica.getNr_nivel_risco());	
			stmt.setString(10, fabrica.getDs_descricao());	
			

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

	@Override
	public void atualizar(Fabrica fabrica) throws DBException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int codigo) throws DBException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Fabrica buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fabrica> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}

			
		

	

	