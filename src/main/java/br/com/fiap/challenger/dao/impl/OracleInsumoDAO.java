package br.com.fiap.challenger.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.challenger.bean.Insumo;

import br.com.fiap.challenger.dao.InsumoDAO;
import br.com.fiap.challenger.exception.DBException;
import br.com.fiap.challenger.singleton.ConnectionManager;

public class OracleInsumoDAO implements InsumoDAO {
	PreparedStatement stmt = null;
	private Connection conexao;

	public void cadastrar(Insumo insumo) throws DBException {
		// TODO Auto-generated method stub

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO T_INSUMO (cd_insumo, nm_insumo, ds_produto, ds_categoria, ds_subcategoria, ds_origem, ds_unid_medida, qtd_consumo, qtd_residuo, dt_data, ds_descricao, t_fornecedor_cd_fornecedor, t_fabrica_cd_fabrica ) VALUES (SQ_T_INSUMO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, insumo.getNm_insumo());
			stmt.setString(2, insumo.getDs_produto());
			stmt.setString(3, insumo.getDs_categoria());
			stmt.setString(4, insumo.getDs_subcategoria());
			stmt.setString(5, insumo.getDs_origem());
			stmt.setInt(6, insumo.getDs_unid_medida());
			stmt.setDouble(7, insumo.getQtd_consumo());
			stmt.setDouble(8, insumo.getQtd_residuo());
			stmt.setDate(9, insumo.getDt_data());
			stmt.setString(10, insumo.getDs_descricao());
			stmt.setInt(11, insumo.getT_fornecedor_cd_fornecedor());
			stmt.setInt(12, insumo.getT_fabrica_cd_fabrica());

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
	public void atualizar(Insumo insumos) throws DBException {
		// TODO Auto-generated method stub

	}

	@Override
	public void remover(int codigo) throws DBException {
		// TODO Auto-generated method stub

	}

	@Override
	public Insumo buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Insumo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
