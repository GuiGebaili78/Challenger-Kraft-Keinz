package br.com.fiap.challenger.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.challenger.bean.Produto;
import br.com.fiap.challenger.dao.ProdutoDAO;
import br.com.fiap.challenger.exception.DBException;
import br.com.fiap.challenger.singleton.ConnectionManager;

public class OracleProdutoDAO implements ProdutoDAO {
	PreparedStatement stmt = null;
	private Connection conexao;

	public void cadastrar(Produto produto) throws DBException {
		// TODO Auto-generated method stub

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO T_PRODUTO (cd_produto, nm_produto, dt_validade, dt_fabrica, nr_lote, ds_ingredientes, ds_categoria, ds_embalagem, ds_descricao, t_fabrica_cd_fabrica ) VALUES (SQ_T_PRODUTO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, produto.getNm_produto());
			stmt.setDate(2, produto.getDt_validade());
			stmt.setDate(3, produto.getDt_fabrica());
			stmt.setInt(4, produto.getNr_lote());
			stmt.setString(5, produto.getDs_ingrediente());
			stmt.setString(6, produto.getDs_categoria());
			stmt.setString(7, produto.getDs_embalagem());
			stmt.setString(8, produto.getDs_descricao());
			stmt.setInt(9, produto.getT_fabrica_cd_fabrica());

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
	public void atualizar(Produto produtos) throws DBException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int codigo) throws DBException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produto buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
