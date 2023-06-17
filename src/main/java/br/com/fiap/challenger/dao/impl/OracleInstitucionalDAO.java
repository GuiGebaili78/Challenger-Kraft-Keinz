package br.com.fiap.challenger.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


import br.com.fiap.challenger.bean.Institucional;
import br.com.fiap.challenger.dao.InstitucionalDAO;
import br.com.fiap.challenger.exception.DBException;
import br.com.fiap.challenger.singleton.ConnectionManager;

public class OracleInstitucionalDAO implements InstitucionalDAO {
	PreparedStatement stmt = null;
	private Connection conexao;
	
	
	public void cadastrar(Institucional institucional) throws DBException {
		// TODO Auto-generated method stub
	
	
	try {
		conexao = ConnectionManager.getInstance().getConnection();
		String sql = "INSERT INTO T_INSTITUCIONAL (cd_institucional, nm_destinatario, nm_produto, ds_categoria, nr_quantidade, dt_data, ds_descricao, t_fabrica_cd_fabrica ) VALUES (SQ_T_INSTITUCIONAL.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
		stmt = conexao.prepareStatement(sql);
		stmt.setString(1, institucional.getNm_destinatario());
		stmt.setString(2, institucional.getNm_produto());
		stmt.setString(3, institucional.getDs_categoria());			
		stmt.setInt(4, institucional.getNr_quantidade());
		stmt.setDate(5, institucional.getDt_data());
		stmt.setString(6, institucional.getDs_descricao());
		stmt.setInt(7, institucional.getT_fabrica_cd_fabrica());
	
			
		

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
	public void atualizar(Institucional institucional) throws DBException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remover(int codigo) throws DBException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Institucional buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Institucional> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}

	