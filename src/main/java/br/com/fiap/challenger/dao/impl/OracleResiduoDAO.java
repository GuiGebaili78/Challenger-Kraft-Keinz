package br.com.fiap.challenger.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


import br.com.fiap.challenger.bean.Residuo;

import br.com.fiap.challenger.dao.ResiduoDAO;
import br.com.fiap.challenger.exception.DBException;
import br.com.fiap.challenger.singleton.ConnectionManager;

public class OracleResiduoDAO implements ResiduoDAO {
	PreparedStatement stmt = null;
	private Connection conexao;

	public void cadastrar(Residuo residuo) throws DBException {
		// TODO Auto-generated method stub

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO T_RESIDUO (cd_residuo, ds_categoria, ds_carecteristica, nr_lote, dt_data, nr_quantidade, ds_descricao, t_produto_cd_produto) VALUES (SQ_T_RESIDUO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, residuo.getDs_categoria());
			stmt.setString(2, residuo.getDs_carecteristica());
			stmt.setInt(3, residuo.getNr_lote());
			stmt.setDate(4, residuo.getData());
			stmt.setDouble(5, residuo.getNr_quantidade());
			stmt.setString(6, residuo.getDs_descricao());
			stmt.setInt(7, residuo.getT_produtos_cd_produto());
		

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
	public void atualizar(Residuo residuo) throws DBException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int codigo) throws DBException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Residuo buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Residuo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
